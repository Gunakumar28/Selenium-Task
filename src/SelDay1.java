import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelDay1 {
	private void facebook() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\intel\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	
	}
	private void gmail() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\intel\\eclipse-workspace\\SeleniumDay1\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
	}
	public static void main(String[] args) {
		SelDay1 c = new SelDay1();
		c.facebook();
		c.gmail();
		
	}
	
	
				
		
	}
	
		
	
	


			