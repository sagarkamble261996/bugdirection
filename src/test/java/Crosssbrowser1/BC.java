package Crosssbrowser1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BC {
	WebDriver driver;
	@Parameters("BrowserName")
@BeforeMethod
public void setup(String BrowserName) {
	if(BrowserName.equalsIgnoreCase("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(BrowserName.equalsIgnoreCase("Edge")){
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}
	driver.get("");
	driver.manage().window().maximize();
	
}
@AfterMethod
public void get() {
	driver.close();
}


}
