package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest_s8 {

public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();

//AutoSuggestion

driver.findElement(By.xpath("//input[@name='q']")).sendKeys("maven");
Thread.sleep(3000);
List<WebElement>g=driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]//li"));
System.out.println(g.size());//10

for(int i=0;i<=g.size();i++) {
	String b= g.get(i).getText();
	System.out.println(b);
	if(b.equals("maven analytics")) {
		g.get(i).click();
		break;
	}
}

	}

}
