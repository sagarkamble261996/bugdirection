package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest_s11 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();
		
//mouse hover
//Actions-mouse movement and keyboard action	
	Actions act=new Actions(driver);
     //Move+Click
WebElement selenium=driver.findElement(By.xpath("//a[text()='Selenium']"));
act.moveToElement(selenium).click().build().perform();

//Drag and Drop
WebElement d=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
WebElement e=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

act.dragAndDrop(d, e).build().perform();
	}

}
