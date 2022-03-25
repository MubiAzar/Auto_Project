package com.Pom_CollectionOfElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class History_Page {

	public WebDriver driver;
	
	@FindBy(xpath = "//h1[text()='Order history']")
	private WebElement history;

	public History_Page(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getHistory() {
		return history;
	}
	
}
