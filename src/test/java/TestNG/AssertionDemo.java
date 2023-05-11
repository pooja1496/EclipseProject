package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	public void testMethod() {
		
		//initialize chromedriver
		ChromeOptions options= new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		options.addArguments("disable-infobars");
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		//open URL
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://ultimateqa.com/automation");
		
		//SoftAssert softverify=new SoftAssert();
		
		//verify title using HARD ASSERTION
		System.out.println("Verifying Title ");
		String expectedtitle="Automation Practice - Ultimate QA";
		String expectedtitle1="The Demo Site - Unleashing the Power of Web3";
		String actualtitle=driver.getTitle();
	    Assert.assertEquals(actualtitle , expectedtitle);                                                    // METHOD-1
	    Assert.assertNotEquals(actualtitle , expectedtitle1,"Title verification with not equals method");    // METHOD-2
		
	
		By icon=By.cssSelector("div img[class='wp-image-216051']");
		WebElement uqicon=driver.findElement(icon);
		uqicon.click();   //---------------------------------------- click is not working
		System.out.println("ICON DISPLAYED ");
		Assert.assertTrue(uqicon.isDisplayed());                                                               //METHOD-3
		
		By searchicon=By.cssSelector("div [class='et_pb_menu__icon et_pb_menu__search-button']");
		WebElement searchbtn=driver.findElement(searchicon);
		//WebElement searchbtn=driver.findElement(By.className("et_pb_menu__icon et_pb_menu__search-button"));
		System.out.println("SEARCH BUTTON DISPLAYED ");
		Assert.assertTrue(searchbtn.isDisplayed());

		
		
		//driver.quit();
	}

}
