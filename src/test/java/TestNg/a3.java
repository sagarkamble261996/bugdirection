package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a3 {
WebDriver driver;
@BeforeMethod
public void setup() {
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	driver.manage().window().maximize();
}
@Test(priority=2)
public void testx() {
System.out.println("x");	
//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bugspotter");
//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
	
}
@Test(priority=-1)
public void testb() {
System.out.println("b");	
//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bugspotter");
//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
} 
@Test(priority=0)
public void testz() {
System.out.println("z");
//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bugspotter");
//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
}
@Test(priority=1,enabled=true)
public void testy() {
System.out.println("y");	
//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bugspotter");
//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
}
@AfterMethod
public void close() {
	driver.close();
}
}
	


