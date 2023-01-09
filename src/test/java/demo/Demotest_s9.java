package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest_s9 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
// Scroll Using Pixel		
JavascriptExecutor js=(JavascriptExecutor) driver;
      
js.executeScript("window.scrollBy(0,500)", "");

Thread.sleep(5000);

js.executeScript("window.scrollBy(0,-500)", "");

//Scroll by Element
WebElement element=driver.findElement(By.xpath("//li[text()='English (UK)']"));
js.executeScript("arguments[0].scrollIntoView()",element);

	}

}
