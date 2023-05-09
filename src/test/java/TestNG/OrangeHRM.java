package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRM {
	
	By username=By.cssSelector("div.oxd-input-group input[name='username']");
	 By password=By.cssSelector("div.oxd-input-group input[name='password']");
	 By login=By.cssSelector("div.oxd-form-actions button");
	public static WebDriver driver;
	@Test
	public void openURL() throws InterruptedException{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		options.addArguments("disable-infobars");
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
	
	
		 
		 WebElement user_name=driver.findElement(username);
		 user_name.sendKeys("Admin");
		 WebElement login_password=driver.findElement(password);
		 login_password.sendKeys("admin123");
		 
		 WebElement login_button=driver.findElement(login);
		 login_button.click();
		 
		 Alert alert=driver.switchTo().alert();
		 alert.dismiss();
		
		
        
		}
	

}
