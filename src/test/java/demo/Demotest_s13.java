package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Demotest_s13 {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

//Emailid -bugspotter
WebElement emeilid=driver.findElement(By.xpath("//input[@id='email']"));

Actions act=new Actions(driver);
//Shift+bugspotter+shift
act.keyDown(emeilid,Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();

//Ctrl+a

act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

//ctrl+c

act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

//Click

driver.findElement(By.xpath("//input[@name='pass']"));

//ctrl+v

act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

//screenshot fullWebpage

String bg=RandomString.make(5);

TakesScreenshot ts=(TakesScreenshot) driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File destn=new File("C:\\Users\\sagar\\eclipse-workspace\\batch_16\\Screenshot\\"+bg+".png");
FileUtils.copyFile(src, destn);

// Capture Screenshot of Element- facebook logo 

WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
File Src1=logo.getScreenshotAs(OutputType.FILE);
File destn1=new File("C:\\Users\\sagar\\eclipse-workspace\\batch_16\\Screenshot\\logo.png");
FileUtils.copyFile(Src1, destn1);
	}

}
