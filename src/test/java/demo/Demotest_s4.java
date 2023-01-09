package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest_s4 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();

ChromeDriver driver=new ChromeDriver();

driver.get("https://demo.guru99.com/test/newtours/register.php");

driver.manage().window().maximize();
		
		// anything on webpage -web element
		
WebElement txt_firstname=driver.findElement(By.name("firstName"));
txt_firstname.sendKeys("sagar");

WebElement txt_lastname=driver.findElement(By.name("lastName"));
txt_lastname.sendKeys("kamble");

WebElement txt_phone=driver.findElement(By.name("phone"));
txt_phone.sendKeys("7038857263");

WebElement txt_emailid=driver.findElement(By.id("userName"));
txt_emailid.sendKeys("sagarkamble261996@gmail.com");

WebElement address=driver.findElement(By.name("address1"));
address.sendKeys("At Post Murud");	

WebElement txt_city=driver.findElement(By.name("city"));
txt_city.sendKeys("Murud");

WebElement txt_state=driver.findElement(By.name("state"));
txt_state.sendKeys("Maharashtra");

WebElement txt_postalcode=driver.findElement(By.name("postalCode"));
txt_postalcode.sendKeys("413510");

WebElement txt_username=driver.findElement(By.id("email"));
txt_username.sendKeys("sagarkamble261996@gmail.com");

WebElement txt_password=driver.findElement(By.name("password"));
txt_password.sendKeys("123456");

WebElement txt_confirmpassword=driver.findElement(By.name("confirmPassword"));
txt_confirmpassword.sendKeys("123456");

WebElement submit=driver.findElement(By.name("submit"));
submit.click();
	}

}
