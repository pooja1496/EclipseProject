package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	@Test
	
	public void testscript() {
	
	System.setProperty("webdriver.chrome.driver", "D://Selenium Jars & drivers//Drivers//chromedrivers//chromedriver.exe");
	 ChromeOptions options=new ChromeOptions();
     options.addArguments("--remote-allow-origins=*");
     options.addArguments("disable-infobars");
     options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});

     WebDriver driver=new ChromeDriver(options);
     driver.manage().window().maximize();
     driver.get("https://www.myntra.com/");
     String title=driver.getTitle();
     Assert.assertEquals(title,"myntratitle" );

}
}