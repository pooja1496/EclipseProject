package DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
	public static WebDriver driver=null;
	public static WebDriver getdriver() {
		if (driver==null) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("disbale-infobars");
			
			driver=new ChromeDriver(options);
			driver.manage().window().maximize();
		}
		return driver;
	}

}
