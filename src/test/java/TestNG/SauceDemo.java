package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemo {
	public static WebDriver driver;
	/*@Test(dataProvider="create")
	public void test (String username, String password) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		options.addArguments("disable-infobars");
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		//driver.close();
	}
	@DataProvider(name="create")
	public Object[][] dataset1(){
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},		
		};
	}*/
	
	//----------------------------------------------------------------------------------------------------
	@Test
	public void test() {
		
		  ChromeOptions options=new ChromeOptions();
		  options.addArguments("--remote-allow-origins=*");
		  options.addArguments("disbale infobars");
		  options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		  driver=new ChromeDriver(options);
		  driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com/");
		 
		
	       /*ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        driver = new ChromeDriver(options);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.manage().window().maximize();
	        driver.get("https://www.saucedemo.com/");*/
	}
	
	
	
	
	
	
	
}
