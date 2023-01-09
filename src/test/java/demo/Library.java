package demo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.utility.RandomString;

public class Library {

	public static void scrollToElement(WebDriver Driver,WebElement Element) {
		JavascriptExecutor js=(JavascriptExecutor)Driver;
		js.executeScript("arguments[0].scrollIntoView()",Element);
		
	


	}
}
