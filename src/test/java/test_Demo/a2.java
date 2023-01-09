package test_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a2 {
	WebDriver driver;
	@BeforeMethod
		public void setup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
		
		}
	@Test(priority=3)
	public void testN() {
		System.out.println("N");
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test");
	//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");

	}
	@Test(priority=-1)
	public void testV() {
		System.out.println("V");
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test");
	//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
		 
	}
}
