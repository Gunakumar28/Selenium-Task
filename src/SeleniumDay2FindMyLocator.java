import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay2FindMyLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\intel\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		//get title
		String browsertitle = driver.getTitle();
		System.out.println(browsertitle);
       //get URL
		String browserurl = driver.getCurrentUrl();
		System.out.println(browserurl);
	    //locater
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("guna");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("guna1223");
	}
	
	
	
	}


