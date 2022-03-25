package com.Pom_CollectionOfElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Result_Page {
	
	public WebDriver driver;

	
	@FindBy(xpath = "//h1[text()='Order confirmation']")
	private WebElement txt;
	
	@FindBy(xpath = "//a[text()='Back to orders']")
	private WebElement backto;
	
	public Result_Page(WebDriver driver2) {

		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getTxt() {
		return txt;
	}
	
	public WebElement getBackto() {
		return backto;
	}
}
