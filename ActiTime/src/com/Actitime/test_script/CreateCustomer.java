//16 feb 
//21 feb soft assert

package com.Actitime.test_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;

public class CreateCustomer extends Baseclass{
	
	FileLibrary flib=new FileLibrary();

	@Test
	public void  createcustomer() throws EncryptedDocumentException, IOException {
//		HomePage hp= new HomePage(driver);
//		hp.getTasklnk().click();
//		
//		
//		TaskPage tp= new TaskPage(driver); //create object of Task Page //non static method
//		String custname = flib.readDataFromExcel("sheet1", 1, 1);
//		String Descriptions = flib.readDataFromExcel("sheet1", 1, 2);
//		tp.completetask(custname, Descriptions);
		
		//for soft assert code
		
		HomePage hp= new HomePage(driver);
		hp.getTasklnk().click();
		
		
		TaskPage tp= new TaskPage(driver); //create object of Task Page //non static method
		String custname = flib.readDataFromExcel("sheet1", 1, 1);
		String Descriptions = flib.readDataFromExcel("sheet1", 1, 2);
		tp.completetask(custname, Descriptions);
		
		
	}
	
}
