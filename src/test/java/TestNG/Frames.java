package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Frames {
	
	@Test
	public void testframe() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("-disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		Thread.sleep(2000);
		
		debuugg(driver);
		/*WebElement html_editor= driver.findElement(htmleditor);
		html_editor.click();*/
	}
	
	public void debuugg(WebDriver driver) {
		try {
			By study= By.cssSelector("div[class*=w3-info] [class='w3-btn w3-margin-bottom']");
//			WebElement click_study= driver.findElement(study);
//			click_study.click();
			
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='W3Schools HTML Tutorial']")));
			driver.findElement(study).click();	
			
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}
		
	}

}
