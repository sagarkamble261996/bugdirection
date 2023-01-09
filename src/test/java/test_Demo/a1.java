package test_Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	@BeforeSuite
	public void bs() {
		System.out.println("BS");
	}
	@BeforeClass
	public void bc() {
		System.out.println("BC");
	}
	@BeforeTest
	public void bt() {
		System.out.println("BT");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("BM");
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	public void test2() {
		System.out.println("test2");
	}
	public void test3() {
		System.out.println("test3");
			
		}
	@AfterMethod
	public void AM() {
		System.out.println("AM");
	}
	@AfterTest 
	public void AT() {
		System.out.println("AT");
	}
	@AfterClass
	public void AC() {
		System.out.println("AC");
	}
	@AfterSuite
	public void AS() {
		System.out.println("AS");
	}

}
