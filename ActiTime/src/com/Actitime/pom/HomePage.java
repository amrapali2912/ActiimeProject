package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
          
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklnk;  //used encapsulation ...hide element here
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement lgoutlnk;

	
	public HomePage (WebDriver driver) {
	PageFactory.initElements(driver, this);	
	
	//after this go to source -generate greter	  //to get hide element 

	}
	public WebElement getTasklnk() {
		return tasklnk;
	}


	public WebElement getLgoutlnk() {
		return lgoutlnk;
	}
}

//go to base class