package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest_s3 {

	public static void main(String[] args) {
 WebDriverManager.chromedriver().setup();

ChromeDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");

driver.manage().window().maximize();
//Anything on webpage - webelement
WebElement txt_emailid=driver.findElement(By.id("email"));

txt_emailid.sendKeys("sagar@gmail.com");	

WebElement txt_password=driver.findElement(By.name("pass"));
txt_password.sendKeys("12345678");

WebElement btnlogin=driver.findElement(By.id("login"));

btnlogin.click();


	}

}
