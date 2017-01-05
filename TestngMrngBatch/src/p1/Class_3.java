package p1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_3 {

	//Prioritizing the order of execution
//	@Test(priority = 10)
//	public void method_B() {
//
//		System.out.println("Method B executed");
//	}
//	
//	@Test(priority = 15)
//	public void method_A() {
//
//		System.out.println("Method A executed");
//	}
	
	//Ignoring a method
//	@Test(enabled = false)
//	public void method_B() {
//
//		System.out.println("Method B executed");
//	}
//	
//	@Test
//	public void method_A() {
//
//		System.out.println("Method A executed");
//	}
	
//	@BeforeTest
//	public void method_B() {
//
//		System.out.println("Method B executed");
//		
//		System.out.println("B Thread is::::: " + Thread.currentThread().getId());
//	}
//	
//	@BeforeTest
//	public void method_A() {
//
//		System.out.println("Method A executed");
//		
//		System.out.println(" A Thread is::::: " + Thread.currentThread().getId());
//	}
	
	@Test
	public void method_C() {
		
		int result = 10 / 0;
		
		System.out.println(result);

	}
	

}
