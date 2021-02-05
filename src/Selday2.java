import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selday2 {
      public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\intel\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		//get title
		String browsertitle = driver.getTitle();
	     System.out.println(browsertitle);
      String browserurl = driver.getCurrentUrl();
      System.out.println(browserurl);
      WebElement loginid = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
      loginid.sendKeys("96774429");
      WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
      password.sendKeys("ram22",Keys.ENTER);
      
      }    










}
			