package demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.streaming.DeferredSXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader {

	public static void main(String[] args) throws Exception {

String path="C:\\Users\\sagar\\eclipse-workspace\\batch_16\\Testdata\\Data.xlsx";
FileInputStream s=new FileInputStream(path);
 XSSFWorkbook g=new XSSFWorkbook(s);
 
 String f= g.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
 System.out.println(f);
 String f1= g.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
 System.out.println(f1);
 String f2=g.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
 System.out.println(f2);
 
 //browser open
 WebDriverManager.chromedriver().setup();
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 driver.manage().window().maximize();
 
 //Element -data
 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(f);
 
 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(f1);
 
 
	}
 
}
