mpackage Crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomRepo.LoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin1 {
	WebDriver driver;
@BeforeMethod
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
}
@Test
public void verifyloginValid() {
LoginPom login=PageFactory.initElements(driver,LoginPom.class);
     //enter the value emailid
login.getTxt_email().sendKeys("test");	 
 
	//enter the value pass
login.getTxt_pass().sendKeys("12345");
	//enter the value loginbutton
login.getBtn_login().click();
	
}
@Test
public void verifyloginInvalid() {
LoginPom login=PageFactory.initElements(driver,LoginPom.class);
     //enter the value emailid
login.getTxt_email().sendKeys("test");	 
 
	//enter the value pass
login.getTxt_pass().sendKeys("12345");
	//enter the value loginbutton
login.getBtn_login().click();
	
}
@AfterMethod
public void Teardown() {
	driver.close();
}

}
