package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BTESWebsite {
    public static void main(String[] args) throws InterruptedException {
        By login= By.cssSelector("div.usermenu a[href=\"https://online.btes.co.in/login/index.php\"]");
        By username= By.cssSelector("div.form-group input[id='username']");
        By password= By.cssSelector("div.form-group input[id='password']");
        By LOGIN= By.cssSelector("button[id='loginbtn']");
        By SDET= By.cssSelector("div [id=\"course-info-container-10-3\"] a[href='https://online.btes.co.in/course/view.php?id=10']");




        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        //options.setExperimentalOption("credentials_enable_service", false);
        //options.setExperimentalOption("profile.password_manager_enabled", false);


        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://online.btes.co.in/");



        WebElement login_button=driver.findElement(login);
        login_button.click();
        WebElement username_text=driver.findElement(username);
        username_text.sendKeys("pooja123");
        WebElement password_text=driver.findElement(password);
        password_text.sendKeys("1&Onlyone@123");
        WebElement LOGIN_button=driver.findElement(LOGIN);
        LOGIN_button.click();                                         // -- login page

        Thread.sleep(Duration.ofSeconds(5));
        WebElement SDET_button=driver.findElement(SDET);
        SDET_button.click();                                         // -- home page


    }
}



/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BTESWebsite {
    public static void main(String[] args) throws InterruptedException {
        By login= By.cssSelector("div.usermenu a[href='https://online.btes.co.in/login/index.php']");
        By username= By.cssSelector("div.form-group input[id='username']");
        By password= By.cssSelector("div.form-group input[id='password']");
        By LOGIN= By.cssSelector("button[id='loginbtn']");
        By SDET= By.cssSelector("div [id=\"course-info-container-10-3\"] a[href='https://online.btes.co.in/course/view.php?id=10']");

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
      //options.setExperimentalOption("credentials_enable_service", false);
        //options.setExperimentalOption("profile.password_manager_enabled", false);


        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://online.btes.co.in/");



        WebElement login1=driver.findElement(login);
        login1.click();
        WebElement username_text=driver.findElement(username);
        username_text.sendKeys("pooja123");
        WebElement password_text=driver.findElement(password);
        password_text.sendKeys("1&Onlyone@123");
        WebElement LOGIN_button=driver.findElement(LOGIN);
        LOGIN_button.click();                                         // -- login page

        Thread.sleep(Duration.ofSeconds(5));
        WebElement SDET_button=driver.findElement(SDET);
        SDET_button.click();                                         // -- home page


    }
}*/

