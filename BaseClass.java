/**
Base Class
**/
package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void driverConfig()
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	
	public static void launchURL(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void buttonClick(WebElement element)
	{
	element.click();	
	}
	
	public static void sendValue(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	public static void sendValueTabkey(WebElement element)
	{
		element.sendKeys(Keys.TAB);
	}
	
	public static String getAttribute(WebElement element, String string)
	{
		String text=element.getAttribute("value");
		System.out.println(text);
		return text;
	}
	public static void clear(WebElement element)
	{
		element.clear();
	}
	
	public static String getDetail(String bookName,String sheetName,int rowNumber,int columnNumber) throws IOException 
	{
		File f=new File("C:\\Users\\raje4\\Desktop\\Raje\\"+bookName+".xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sheet=book.getSheet(sheetName);
		
		Row r=sheet.getRow(rowNumber);
		Cell cel= r.getCell(columnNumber);
		int celltype= cel.getCellType();
		
		String value =" ";
		
		if(celltype==1)
		{
			value=cel.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(cel))
		{
			Date d=cel.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yyyy");
			value=sim.format(d);
		}
		else 
		{
			double d= cel.getNumericCellValue();
			long l=(long) d;
			value=String.valueOf(l);
		}
		
		return value;
	}
	
	public static void ScreenShot(String imgName) throws IOException
	{
		TakesScreenshot tss=(TakesScreenshot)driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\raje4\\eclipse-workspace\\MavenPrograms\\screenshot\\"+imgName+".png");
		FileUtils.copyFile(source, destination);
	}
	
	public static void brokenLink() {
		
		String str=driver.getTitle();
		if(str.equals("404 Not Found"))
		System.out.println("The Link is a Broken Link");

	}
}
