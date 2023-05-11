package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Alertclass {
	@Test
	public void handlealert() throws InterruptedException {
		
		By confirmalertbox=By.cssSelector("div.elementor-widget-container button[name=\"confirmalertbox\"]");
		By promptalertbox= By.cssSelector("div.elementor-widget-container button[name=\"promptalertbox1234\"]");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("-disable infobars");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		WebElement altbtn= driver.findElement(confirmalertbox);
		altbtn.click();
		Thread.sleep(5000);
		
		Alert alt= driver.switchTo().alert();
		//alt.accept();
		alt.dismiss();
		Thread.sleep(5000);

		
		WebElement altbtn1= driver.findElement(promptalertbox);
		altbtn1.click();
		
		Alert alt1= driver.switchTo().alert();
		//alt1.accept();
		//alt.dismiss();
		
		String text= driver.switchTo().alert().getText();
		System.out.println(text);
		
		String text1=alt1.getText();
		System.out.println("ALERT MESSAGE " +text1);
		
		
		
		
		
		
		
	}

}


//https://www.hyrtutorials.com/p/frames-practice.html