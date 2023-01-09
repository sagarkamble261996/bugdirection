package demo;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest_s2 {

public static void main(String[] args) {

WebDriverManager.edgedriver().setup();

EdgeDriver driver=new EdgeDriver();

driver.get("https://www.facebook.com/");

driver.manage().window().maximize();

driver.close();
	}

}
