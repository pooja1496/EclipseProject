package TestNG;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class Demo_Btes {
public static WebDriver driver;
	
	
    @Test
    @Parameters({"loginName","Password"})
	public void OpenWebsite(String username1, String password1)
	{ 
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("disable-infobars");
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
		 WebDriver driver = new ChromeDriver(options);
	     driver.manage().window().maximize();
	     driver.get("https://online.btes.co.in/login/index.php");
		System.out.println("Print methodtriologyBefore");
		
    	 By username = By.cssSelector("div.form-group input[id='username']");
         By password = By.cssSelector("div.form-group input[id='password']");
      //   By login = By.cssSelector("button[id='loginbtn']");
      //   By SDET = By.cssSelector("div [id=\"course-info-container-10-3\"] a[href='https://online.btes.co.in/course/view.php?id=10']");
    	
    	
         //login credentials
         WebElement loginElement = driver.findElement(username);
         //loginName.clear();
         System.out.println("Enter the email");
         loginElement.sendKeys("username1");

         WebElement passwordElement = driver.findElement(password);
         //Password.clear();
         System.out.println("Enterthe password");
         passwordElement.sendKeys("password1");

    /*     WebElement loginBtn=driver.findElement(login);
         loginBtn.click();
         System.out.println(driver.getCurrentUrl());
         
         try {
             Thread.sleep(Duration.ofSeconds(5));
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         WebElement sdetBtn=driver.findElement(SDET);
         sdetBtn.click();
         System.out.println(driver.getCurrentUrl());
      */   
          String title=driver.getTitle(); 
          Assert.assertEquals(title, "Login");
		  Assert.assertTrue(true);
        
	}
    

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method...\n"  );
		
	} 

}
