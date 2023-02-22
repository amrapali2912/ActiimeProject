package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
   
	
	@FindBy(xpath = "(//div[.='Add New'] )")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath = "input[@placeholder='Enter Customer Name'][2]")
	private WebElement newcustname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter CUstomer DEscription']")
	private WebElement custdesp;
	

	@FindBy(xpath = "(//div[@class='dropdownButton'])[15]")
	private WebElement dropdwnbtn;

	@FindBy(xpath = "(//div[.='Our company'])[11]")
	private WebElement ourcomp;
	

	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createbtn;
	
	//Go to source >>Generate greater and setter >>will return all return objects which we had make parivatly >> Encapsulation
	
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}



	public WebElement getNewcust() {
		return newcust;
	}



	public WebElement getNewcustname() {
		return newcustname;
	}



	public WebElement getCustdesp() {
		return custdesp;
	}



	public WebElement getDropdwnbtn() {
		return dropdwnbtn;
	}



	public WebElement getOurcomp() {
		return ourcomp;
	}



	public WebElement getCreatebtn() {
		return createbtn;
	}


	//Create one constructor

	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   //Busniess logic or ganeric method
		
		public void completetask(String Custname,String Description) {
//			addnewbtn.click();
//			newcust.click();
//		//	newcustname.sendKeys(null);
//			newcustname.sendKeys(Custname); //will not do hardcoding ...go to public void completetask() enter in paranthesis string  custname
//			custdesp.sendKeys(description); 
//		
			
			addnewbtn.click();
			newcust.click();
			newcustname.sendKeys(Custname);
			custdesp.sendKeys(Description);
			dropdwnbtn.click();
			ourcomp.click();
			createbtn.click();
			
		//go to create customer	
		
	}

	
}
