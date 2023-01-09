package TestNg;

import org.testng.annotations.Test;

public class a5 {
@Test(groups= {"sanity"})
public void Test1() {
	System.out.println("sanity");
		
}
@Test(groups= {"sanity"})
public void Test2() {
	System.out.println("sanity");
}
@Test(groups= {"regression"})
public void Test3() {
	System.out.println("regression");
}
@Test(groups= {"regression"})
public void Test4() {
	System.out.println("regression");
}	
}
