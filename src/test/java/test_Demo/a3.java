package test_Demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a3 {
	@BeforeMethod
	public void setup() {
		System.out.println("browser open");
	}
	@Test
	public void TestA() {
		System.out.println("test A");
		Assert.assertTrue(false);
	}
	@Test(invocationCount=2)
	public void TestB() {
		System.out.println("test B");
	}
	@Test(dependsOnMethods="TestA")
	public void TestC() {
		System.out.println("test C");
	}
	@AfterMethod
	public void teardown() {
		System.out.println("browser close");
	}

		
}
