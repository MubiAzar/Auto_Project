package com.Pom_CollectionOfElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement plus_Btn;
	
	@FindBy(name = "Submit")
	private WebElement addcrt_Btn;

	public Product_Page(WebDriver driver2) {
		
	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getPlus_Btn() {
		return plus_Btn;
	}

	public WebElement getAddcrt_Btn() {
		return addcrt_Btn;
	}
	

}
