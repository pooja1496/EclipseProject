package TestNG;


import org.testng.annotations.*;

public class Annotations {
	
	
	@BeforeMethod
	public void calculator() {
		System.out.println("Result of calculator_Before Method \n");
	}
	
	@Test
	public void addition() {
		System.out.println("Result of addition in Annotation class");
	}
	@Test
	public void division() {
		System.out.println("Result of division");
	}
	@Test
	public void xyz() {
		System.out.println("Result of xyz");
	}
	
	@Test
	public void reminder() {
		System.out.println("Result of reminder");
	}
	@Test
	public void percentage() {
		System.out.println("Result of percentage");
	}
	@AfterMethod
	public void calculator_1() {
		System.out.println("Result of calculator in after class of annotation");
	}
	

}
