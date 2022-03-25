package com.Pom_CollectionOfElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank_Page {
	
	public  WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement bank;

	public Bank_Page(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getBank() {
		return bank;
	}

}
