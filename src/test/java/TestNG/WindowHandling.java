package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WindowHandling {
	public static String parentWindowId;
	
	@Test
	public void test() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		options.addArguments("disable-infobars");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("newTabBtn")).click();
		driver.findElement(By.id("newTabsBtn")).click();  // open duplicate window
		
		parentWindowId=driver.getWindowHandle();
		Set<String> WindowIds= driver.getWindowHandles();
		System.out.println("parent id : " +parentWindowId);
			for (String windowid : WindowIds) {
				driver.switchTo().window(windowid);
				System.out.println(driver.getWindowHandle());
				if(driver.getTitle().contains("Basic Controls")) {
					break; 
				}
			}
			driver.switchTo().window(parentWindowId);
			Thread.sleep(5000);
			driver.quit();
		
	}

}
