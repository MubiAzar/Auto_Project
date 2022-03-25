package com.Pom_CollectionOfElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	
	public WebDriver driver;

	@FindBy(id = "cgv")
	private WebElement box;
	
	@FindBy(xpath = "//button[normalize-space()='Proceed to checkout']")
	private WebElement checkout;

	public Shipping_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getBox() {
		return box;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	
	
}
