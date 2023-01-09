package test_Demo;

import org.testng.annotations.Test;

public class a4 {
	@Test(groups={"sanity"})
	public void Test1() {
		System.out.println("test 1");
	}
	@Test(groups={"sanity"})
	public void Test2() {
		System.out.println("test 2");
	}
	@Test(groups={"Regression"})
	public void Test3() {
		System.out.println("test 3");
	}
	@Test(groups={"sanity"})
	public void Test4() {
		System.out.println("test 4");
	}

}
