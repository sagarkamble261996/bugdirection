package Crosssbrowser1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LT extends BC{
@Test
public void verifylogin() {
	driver.findElement(By.xpath("//input[@name='email']\")).sendKeys(\"bugspotter"));
	driver.findElement(By.xpath("//input[@name='Pass']\")).sendKeys(\"12345"));
	driver.findElement(By.xpath("//button[@name='login']")).click();

	
	 
}
}
