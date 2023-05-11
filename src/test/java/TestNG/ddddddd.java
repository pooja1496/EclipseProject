package TestNG;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class ddddddd {
	  
		public static void main(String[]args)
		{

			ChromeOptions options=new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        options.addArguments("disable-infobars");
	        options.addArguments("--disable-popup-blocking");
	        options.addArguments("--disable-notifications");
	        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
	        

	        WebDriver driver=new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm"); 
	       
	        
	        WebElement wE=driver.findElement(By.cssSelector("div iframe[id='iframeResult']"));
	        
	        driver.switchTo().frame(wE);
	        System.out.println(wE);
	        
	       driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
	       
	      // driver.switchTo().alert().accept();
	       driver.switchTo().alert().dismiss();
	       
		}
		
	}


