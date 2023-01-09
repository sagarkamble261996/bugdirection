package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest_s6 {

	public static void main(String[] args) {
 WebDriverManager.chromedriver().setup();
 ChromeDriver driver=new ChromeDriver();
 
 driver.get("https://www.facebook.com/");
 
 driver.manage().window().maximize();
 
 //Xpath Attribute
 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sagarkamble261996@gmail.com");
 
 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
 
 //xPath by contains
 WebElement loginbtn=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
 loginbtn.click();
 
 //XPath by text
 WebElement Fp=driver.findElement(By.xpath("//a[text()='forgotten password?']"));
 Fp.click();
 
 }

}
