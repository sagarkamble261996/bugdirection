package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest_s7 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver c=new ChromeDriver();
c.get("https://demo.guru99.com/test/newtours/register.php");
c.manage().window().maximize();

WebElement d=c.findElement(By.xpath("//select{@name='country']"));

Select E=new Select(d);

//select By Index
E.selectByIndex(8);
//select By value
E.selectByValue("ANGOLA");
//select by visible text
E.selectByVisibleText("ALGERIA");

//no of count options

List<WebElement> h=E.getOptions();
System.out.println(h.size());  //264

for(int i=0;i<=h.size();i++){
	System.out.println(h.get(i).getText());
	
	if(h.get(i).getText().equals("BHUTAN")) {
		h.get(i).click();
		break;
	}
}

	}

}
