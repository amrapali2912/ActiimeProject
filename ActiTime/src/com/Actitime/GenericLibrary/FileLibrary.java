//16 feb

//for retrived data from proprty file or excel -we created FileLibrary

package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary {          //Generic class --write once use multiple times
	//create TestData folder first
 // String path = "./TestData/commondatatwo.property";
 
	   public String readDataFromPropertyFile(String key) throws IOException {   //do parameterize constructor pass key 
	   FileInputStream fis = new FileInputStream("./TestData/commondatatwo.property");
	   Properties p = new Properties();
	   p.load(fis);
	String value = p.getProperty(key); //after this step add string key in construct pass that key here
	   return value;
   }
	   
	   public String readDataFromExcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException{
		   FileInputStream fis = new FileInputStream("./Testdata/Testdata.xlsx");
		   Workbook wb = WorkbookFactory.create(fis);
		   String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		   return value;
	   }
}
