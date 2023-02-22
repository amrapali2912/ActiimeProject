//21 Feb >> Assertion
//Assertion  is feature of TestNg that compare expected data with actual data 
//THere are two types of assertion 1.HardbArrest 2.Soft Assert
//Hard assert have static methods only (class_name.)
//If any one test case fail for maching actual data with expected data then all other test cases will not perform

//will craete on scenario in which we will check google title is match with actual data-goggle with expected data-suggle

package com.Actitime.test_script;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assert_21Feb {
	public void demoassertion() {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wwww.google.com");
		String expectedtile = "sogle";
		String Actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtile, Actualtitle); //if both data is same then only test script will get pass:1 otherwise it will fail:1
		//here first pass expectedtile = "sogle" testscript will get fail:1 & pass:0
		//then change expectedtile = "google" testscript will get pass:1 & fail:0
		driver.close();
	}	

}
