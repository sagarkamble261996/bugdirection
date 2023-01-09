package demo;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demotest_s1 {
	
public static void main(String[] args)throws Exception {
		
WebDriverManager.chromedriver().setup();

ChromeDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");

driver.manage().window().maximize();

Thread.sleep(3000); //3 sec

driver.navigate().to("https://mvnrepository.com/");
Thread.sleep(3000); //3 sec
driver.navigate().back();
Thread.sleep(3000); //3 sec
driver.navigate().forward();
Thread.sleep(3000); //3 sec
driver.navigate().refresh();

driver.close();

 
	}

}
