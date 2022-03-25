package com.Automation_Project;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.collection_Of_Object.Page_Object_Manager;


public class Automation_Runner extends Base_Class {
	
	public static WebDriver driver = browser_Configuration("chrome"); //Null driver
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Automation_Runner.class);
	
	public static void main(String[] args) throws Throwable {
		
		//Property Configuration
		
		PropertyConfigurator.configure("log4j.properties");
		
	
		getUrl("http://automationpractice.com/index.php");
		
		log.info("Url Launched Succesfully");
				
		implicitWait(30, TimeUnit.SECONDS);
		
		clickOnElement(pom.get_Instance_Hp().getSignin());
		
		log.info("button cliked");
		
		String mail_Data = input_Data("C:\\Users\\HP\\eclipse-workspace\\Automation_Project\\Test Case.xlsx", 2, 5);
				
		inputValueElement(pom.get_Instance_Sp().getEmail(), mail_Data);
		
		inputValueElement(pom.get_Instance_Sp().getPassword(), input_Data("C:\\Users\\HP\\eclipse-workspace\\Automation_Project\\Test Case.xlsx", 7, 5));
		
		log.info("Data Driven done");
		
		clickOnElement(pom.get_Instance_Sp().getSub());
				
		clickOnElement(pom.get_Instance_Ip().getCato());
		
		clickOnElement(pom.get_Instance_Wp().getOrgdress());
		
		clickOnElement(pom.get_Instance_Pp().getPlus_Btn());
		
		clickOnElement(pom.get_Instance_Pp().getAddcrt_Btn());
		
		clickOnElement(pom.get_Instance_Pop().getCheckout());

		clickOnElement(pom.get_Instance_Op().getCheckout());

		clickOnElement(pom.get_Instance_Ap().getCheckout());
		
		clickOnElement(pom.get_Instance_Ship().getBox());
		
		clickOnElement(pom.get_Instance_Ship().getCheckout());
		
		clickOnElement(pom.get_Instance_Bp().getBank());
		
		clickOnElement(pom.get_Instance_Cp().getCheckout());
		
		scrollBy(pom.get_Instance_Rp().getTxt());
		
		log.warn("Will Take Screenshot");
		
		screenShots("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\Automation_Project\\\\ScreenShot\\\\1.png");
		
		log.info("ScreenShot Done");
	
		clickOnElement(pom.get_Instance_Rp().getBackto());
				
		scrollBy(pom.get_Instance_Hisp().getHistory());
	
		screenShots("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\Automation_Project\\\\ScreenShot\\\\2.png");
				
		close();
		
		log.info("Browser closed");
		
		
		
			
	}

}
