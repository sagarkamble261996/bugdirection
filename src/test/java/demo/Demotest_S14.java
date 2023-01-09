package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest_S14 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.manage().window().maximize();
		
	// Alert	
		
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
	
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	// Alert Handle
	
	Alert alt=driver.switchTo().alert();
	
	System.out.println(alt.getText());
	
	//Click on Cancel
	//alt.dismiss();
	
	alt.accept();
	
	Thread.sleep(2000);
	
	System.out.println(alt.getText());
	
	alt.accept();
	
	
		
	}

}
