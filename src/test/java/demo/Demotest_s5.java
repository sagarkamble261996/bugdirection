package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest_s5 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();

driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();

//identify webelement -id/name

WebElement firstname=driver.findElement(By.name("firstName"));
firstname.sendKeys("sagar");

WebElement lastname=driver.findElement(By.name("lastName"));
lastname.sendKeys("kamble");

WebElement phone=driver.findElement(By.name("phone"));
phone.sendKeys("7038857263");

WebElement email=driver.findElement(By.name("userName"));
email.sendKeys("abc@gmail.com");

// Absolute xpath
WebElement address=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
address.sendKeys("at post murud");

// Relative xpath - xpath Attribute
WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
city.sendKeys("murud");

WebElement state=driver.findElement(By.xpath("//input[@maxlength='40']"));
state.sendKeys("maharashtra");

// Relative xpath - xpath index=

driver.findElement(By.xpath("(//input[@maxlength='20'])[2]")).sendKeys("123456");



	}

}
