package com.Automation_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base_Class {
	
	public static WebDriver driver;
	
	public static String value;
	
	public static WebDriver browser_Configuration(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		return driver;

	}
	
	
	
	public static void getUrl(String url) {
		
		//driver.get("http://automationpractice.com/index.php");

		driver.get(url);
	}
	
	public static void implicitWait(int seconds, TimeUnit format) {
		
		driver.manage().timeouts().implicitlyWait(seconds, format);

	}
	
	public static void clickOnElement(WebElement element) {
		
		//signin.click();
		
		element.click();

	}
	
	public static void inputValueElement(WebElement element,String data) {

		//email.sendKeys("MubiAzar2@gmail.com");
		
		element.sendKeys(data);
		
		
	}
	
	public static void scrollBy(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",element);
		
		

	}
	
	public static void screenShots(String path) throws Throwable {
		// TODO Auto-generated method stub
		
		TakesScreenshot pic =(TakesScreenshot) driver;
		File scr = pic.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(scr, dest);

	}
	
	public static void close() {
		
		driver.close();
	}

	
	public static String input_Data(String path, int row_Index, int cell_Index) throws IOException {
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(row_Index);
		
		Cell c = r.getCell(cell_Index);
		
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			
			value = c.getStringCellValue();
			
			
			
		}
		
		else if (type.equals(CellType.NUMERIC)) {
			
			double numericValue = c.getNumericCellValue();
			
			int CellValue = (int) numericValue;
			
			 value = String.valueOf(CellValue);
			
		}
		
		return value;

		

	}
	

}
