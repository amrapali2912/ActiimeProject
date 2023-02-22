package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "usename")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;	
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgbtn;	



public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
//Initialization
public void Loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	
}
public WebElement getUntbx() {
	return untbx;
}


public WebElement getPwtbx() {
	return pwtbx;
}


public WebElement getLgbtn() {
	return lgbtn;
}

//Business LOgic

public void login(String username,String password ) {
	untbx.sendKeys(username);
	pwtbx.sendKeys(password);
    lgbtn.click();
	
}
}



