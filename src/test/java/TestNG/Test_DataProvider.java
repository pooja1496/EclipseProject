package TestNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProvider.DataReader;
import DataProvider.DriverManager;
import DataProvider.HomePage;
import DataProvider.LoginPage;

public class Test_DataProvider {
	DataReader rd=new DataReader();

	@Test (dataProvider="container")
	public void test(String username , String password) throws InterruptedException {
	LoginPage lp=new LoginPage();
	HomePage hp=new HomePage();
	
	lp.openURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Thread.sleep(5000);
	lp.Enterusername(username);
	lp.Enterpassword(password);
	hp=lp.Clicklogin();
	Thread.sleep(1000);
	
	System.out.println("Finish");
	
	}
	@DataProvider(name="container")
	public Object[] [] gettest() throws IOException {
		return rd.getdetails();
		
	}
	}



