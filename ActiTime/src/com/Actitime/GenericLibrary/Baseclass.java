//16 feb --Project  started

package com.Actitime.GenericLibrary;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.pom.HomePage;
import com.Actitime.pom.LoginPage;

public class Baseclass {  //genetric class
	
	
	public static WebDriver driver; //write webdriver here to use golbally ..no need to craete in every method
	FileLibrary f = new FileLibrary();
	//generic lib -componat of framewok have generic class >> have methods //create once use mny timess 
    
	//create Baseclass
	//enter  @before >> will not get any annotation becoz testNg is not here
	//Right click on ActiTime >>built path>>add library>>Select TestNg
	
	@BeforeSuite                
	public void databaseconnection() {                //generic method
		Reporter.log("Database connected",true);
	}	
	public void databasedisconected() {
		Reporter.log("Database disconnected",true);
	}
	@BeforeClass
	public void launchBRowser() throws IOException {
	// WebDriver driver = new ChromeDriver();  //right click on jar>>selenium server>> build path 
	driver=new ChromeDriver();    //need to give webdriver globally
	driver.manage().window().maximize();
//	driver.get("https://demo.actitime.com/login.do"); //do url globally otherwise it will work only for @beforeClass only
 String Url = f.readDataFromPropertyFile("url");//f.reaDataFromPropertyFile("url")then  store url in URL String URL //globally have created object f
     driver.get(Url);
	Reporter.log("Browser launch succesfully",true);
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
		Reporter.log("Browser closed succesfully",true);	
	}
	
	@BeforeMethod
	public void LoginToActitime() throws IOException {   //non static method there is public void
		String UN = f.readDataFromPropertyFile("username");
		String PW = f.readDataFromPropertyFile("password");	
		
		LoginPage lp =new LoginPage(driver);		
		lp.login(UN,PW);
		
		//driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.id("username")).sendKeys("UN");
//		driver.findElement(By.name("pwd")).sendKeys("PW");
//		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("logged in sucessfully",true);
	}
	
	//after this selenium search close element on login ..but its not found so script gets fail 
	//to solve this give implicite wait or Thread.sleep(2000) in @aftermethod
	
	@AfterMethod
	public void LogoutToActitime() throws InterruptedException {
		Thread.sleep(2000);
		//driver.findElement(By.id("logoutLink")).click();
		
		HomePage hp= new HomePage(driver); //writing at the end  //to attach homepage with baseclass
		hp.getLgoutlnk().click(); //
		
		Reporter.log("logged out sucessfully",true);
	}
	
	//go to createCustomber
}
