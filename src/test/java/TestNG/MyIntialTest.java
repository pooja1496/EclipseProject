package TestNG;



import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import DataProvider.UtilsExcel;

public class MyIntialTest {
	
	
	UtilsExcel xlutils=new UtilsExcel();
	WebDriver driver;

	/*
	 * @BeforeClass public void beforeClass() { ChromeOptions options = new
	 * ChromeOptions(); options.addArguments("-remote-allow-origins=*");
	 * options.addArguments("disable-infobars");
	 * options.setExperimentalOption("excludeSwitches", new String[] {
	 * "enable-automation" });
	 * 
	 * driver = new ChromeDriver(options); driver.manage().window().maximize();
	 * driver.get("https://www.saucedemo.com/"); }
	 */

	@Test(dataProvider = "LoginData")
	public void logintest(String username, String password) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-remote-allow-origins=*");
		options.addArguments("disable-infobars");
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		
		/*
		 * WebElement txtEmail = driver.findElement(By.id("user-name"));
		 * txtEmail.clear(); txtEmail.sendKeys(username);
		 * 
		 * WebElement txtpassword = driver.findElement(By.id("password"));
		 * txtpassword.clear(); txtpassword.sendKeys(password);
		 * 
		 * WebElement button = driver.findElement(By.id("login-button"));
		 * button.click();
		 */
		
		By email=By.cssSelector("div input[id=user-name]");
		By pswd=By.cssSelector("div input[id=password]");
		By login=By.cssSelector("div input[id=login-button]");
		
		WebElement txtEmail = driver.findElement(email);
		txtEmail.clear();
		txtEmail.sendKeys(username);
		
		WebElement txtpassword = driver.findElement(pswd);
		txtEmail.clear();
		txtEmail.sendKeys(password);
		
		WebElement button = driver.findElement(login);
		button.click();
		
		 

		String exp_title = "Swag Labs";
		String act_title = driver.getTitle();

//		if (exp.equals("Valid")) {
//			if (exp_title.equals(act_title)) {
//				driver.findElement(By.id("logout_sidebar_link"));
//				Assert.assertTrue(true);
//			} else {
//				Assert.assertTrue(false);
//			}
//		} else if (exp.equals("Invalid")) {
//			if (exp_title.equals(act_title)) {
//				driver.findElement(By.id("logout_sidebar_link"));
//			} else {
//				Assert.assertTrue(true);
//			}
//		}
	}

	@DataProvider(name = "LoginData")
	
	public Object[][] getTestCases() throws IOException {
		
		return xlutils.getdetails();
		/*
		 * String path = "E:\\\\Excel\\\\Book1.xlsx"; testUtility xlutil = new
		 * testUtility(path);
		 * 
		 * int totalrows = xlutil.getRowCount("Sheet1"); int totalcols =
		 * xlutil.getCellCount("Sheet1", 1);
		 * 
		 * String loginData[][] = new String[totalrows][totalcols]; for (int i = 1; i
		 * <totalrows; i++) { for (int j = 0; j < totalcols; j++) { loginData[i - 1][0]
		 * =xlutil.getCellData("Sheet1", i, j); } } return loginData;
		 * 
		 */
	}

	/*@AfterClass
	public void afterClass() {
		driver.close();
		System.out.println(" After Class which will execute at end:");
	}*/
}
