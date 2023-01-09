package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest_S12 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		driver.manage().window().maximize();
		
		//element-double click
		
		Actions act1=new Actions(driver);
		
		WebElement doubleclickele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act1.doubleClick(doubleclickele).build().perform();
		
		//Right Click
		
		WebElement Rightclickele=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement copy=driver.findElement(By.xpath("//span[text()='Copy']"));
		act1.contextClick(Rightclickele).click(copy).build().perform();
	}

}
