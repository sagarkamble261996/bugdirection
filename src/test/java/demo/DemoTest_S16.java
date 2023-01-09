package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest_S16 {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sagar/Downloads/frame.html");
driver.manage().window().maximize();

//iframe switch
//driver.switchTo().frame(1);//index pass iframe

//switch to iframe by using name/id
//driver.switchTo().frame("Selenium");

WebElement seleniumd=driver.findElement(By.xpath("//iframe[@name='Selenium']"));
//WebElement iframe switch
driver.switchTo().frame(seleniumd);


Thread.sleep(1000);

driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();

//iframe-mainpage 
driver.switchTo().defaultContent();

driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']")).click();

driver.navigate().back();

//switch iframe -maven
driver.switchTo().frame(0);

JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,600)","");

//main page-2nd iframe
driver.switchTo().defaultContent();

driver.switchTo().frame(1);

driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();

 
	}

}
