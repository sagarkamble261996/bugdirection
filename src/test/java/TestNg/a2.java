package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a2 {
@BeforeSuite
public void BS() {
	System.out.println("before suite");
}
@BeforeClass
public void BC() {
	System.out.println("before class");
}
@BeforeTest
public void BT() {
	System.out.println("before test");
}
@BeforeMethod
public void BM() {
System.out.println("Before method -Browser open");
}
@Test
public void Test1() {
	System.out.println("Test1");
}
@Test
public void Test2() {
System.out.println("Test2");
	
}
@Test
public void Test3() {
System.out.println("Test3");
}
@AfterMethod
public void AM() {
	System.out.println("After Method -Browser close");
}
@AfterTest
public void AT() {
	System.out.println("After Test");
}
@AfterClass
public void AC(){
	System.out.println("After Class");
}
@AfterSuite
public void AS() {
	System.out.println("After Suite");
}

}
