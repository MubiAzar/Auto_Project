package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	
	public static void particular_Cell_Data() throws IOException {
		
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\Automation_Project\\Dummy Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(1);
		
		Cell c = r.getCell(1);
		
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			
			String value = c.getStringCellValue();
			
			System.out.println(value);
			
		}
		
		else if (type.equals(CellType.NUMERIC)) {
			
			double value = c.getNumericCellValue();
			
			int CellValue = (int) value;
			
			System.out.println(CellValue);
			
		}
		
		wb.close();

	}
	
	
	public static void all_Data() {
		// TODO Auto-generated method stub

	}
	
		
	public static void main(String[] args) throws Exception {
		
		
		particular_Cell_Data();
	}

}
