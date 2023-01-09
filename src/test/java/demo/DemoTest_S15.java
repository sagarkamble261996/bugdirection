package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest_S15 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/popup.php");
driver.manage().window().maximize();

//Parent Window id

String parentid=driver.getWindowHandle();
System.out.println("parent window id=="+parentid);

//Action click on Link
driver.findElement(By.xpath("//a[text()='Click Here']")).click();

//Parent&Child id
Set<String>Allid=driver.getWindowHandles();
System.out.println("Allid parent and child=="+Allid);

List<String> d=new ArrayList(Allid);

System.out.println(d.get(0));//parent id
System.out.println(d.get(1));//child id

driver.switchTo().window(d.get(1));//switch to child window

driver.findElement(By.xpath("//a[text()='Click Here']")).sendKeys("sagar@gmail.com");

driver.switchTo().window(d.get(0));//switch to parent window

//driver.close(); //Current window close
driver.quit();//current+All open window close 





	}

}
