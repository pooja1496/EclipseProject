package TestNG;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_1 {
	@BeforeSuite
	public void beforSuite() 
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
    public void afterSuite()
    {
		System.out.println("After Suite");
	}
	
	
	
	@BeforeTest
	public void beforeTest() 
	{
		//beforeTest Annotation
	  System.out.println(" Before Test");	
	}
	
	@AfterTest
	public void afterTest() 
	{
		//afterTest Annotation
	  System.out.println(" After Test");	
	}
	
	
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class Method");
	}
	@Test
	public void add2() {
		System.out.println("Result of addition_2");
	}
	@Test
	public void add1() {
		System.out.println("Result of addition_1");
	}
	@Test
	public void add() {
		System.out.println("Result of addition");
	}
	
	@Test
	public void subtraction() {
		System.out.println("Result of subtraction");
	}
	@Test
	public void multiplication3() {
		System.out.println("Result of multiplication");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("After Class Method");
	}
	
	
	
	@BeforeMethod
	public void beforeMethod(Method method)
	{
		System.out.println("Before Method...");
		System.out.println("StartTest..."+method.getName());
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		System.out.println("After Method..."  );
		System.out.println("EndTest..."+result.getMethod().getMethodName()+"\n");
	}
	
	
	
	@Test
   public void test1()
   {
	   System.out.println("this is test1");
   }
	@Test
	public void test2()
	{
		System.out.println("This is test2");
	}

}
