package com.Pom_CollectionOfElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {
	
	public WebDriver driver;

	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	private WebElement checkout;

	public Address_Page(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
}
