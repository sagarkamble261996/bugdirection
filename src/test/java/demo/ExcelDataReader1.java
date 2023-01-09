package demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader1 {

	public static void main(String[] args) throws IOException {
String path="C:\\Users\\sagar\\eclipse-workspace\\batch_16\\TestData1\\Data1.xlsx";
FileInputStream s=new FileInputStream(path);
XSSFWorkbook g=new XSSFWorkbook(s);
String f= g.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
String f1= g.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
String f2= g.getSheet("sheet1").getRow(0).getCell(2).getStringCellValue();
String f3= g.getSheet("sheet1").getRow(0).getCell(3).getStringCellValue();
String f4= g.getSheet("sheet1").getRow(0).getCell(4).getStringCellValue();
String f5= g.getSheet("sheet1").getRow(0).getCell(5).getStringCellValue();
String f6= g.getSheet("sheet1").getRow(0).getCell(6).getStringCellValue();
String f7= g.getSheet("sheet1").getRow(0).getCell(7).getStringCellValue();
String f8= g.getSheet("sheet1").getRow(0).getCell(8).getStringCellValue();
String f9= g.getSheet("sheet1").getRow(0).getCell(9).getStringCellValue();
		 
System.out.println(f);
System.out.println(f1);
System.out.println(f2);
System.out.println(f3);
System.out.println(f4);
System.out.println(f5);
System.out.println(f6);
System.out.println(f7);
System.out.println(f8);
System.out.println(f9);

WebDriverManager.chromedriver().setup();

WebDriver driver=new ChromeDriver();

driver.get("https://demo.guru99.com/test/newtours/register.php");

driver.manage().window().maximize();  


driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(f);
driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(f1);
driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(f2);
driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(f3);
driver.findElement(By.xpath("//input[@name='city']")).sendKeys(f4);
driver.findElement(By.xpath("//input[@name='state']")).sendKeys(f5);
driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(f6);
driver.findElement(By.xpath("//input[@id='email']")).sendKeys(f7);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys(f8);
driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(f9);
		 
	}

}
