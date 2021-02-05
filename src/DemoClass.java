import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass {
	private void chromeLanch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	private void firefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\intel\\eclipse-workspace\\SeleniumDay1\\Driver\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.flipkart.com/?gclid=CjwKCAiAxKv_BRBdEiwAyd40N0GjeCh9sNQW1DdgyZ5yFMQCeIn2Hcu2aAdxqhBjUSFWdbcQIEgFZhoCjdsQAvD_BwE&ef_id=CjwKCAiAxKv_BRBdEiwAyd40N0GjeCh9sNQW1DdgyZ5yFMQCeIn2Hcu2aAdxqhBjUSFWdbcQIEgFZhoCjdsQAvD_BwE:G:s&s_kwcid=AL!739!3!461496331417!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_city_nc_goog");
		
	}
	
	public static void main(String[] args) {
		DemoClass dc=new DemoClass();
		dc.chromeLanch();
		dc.firefox();
		
	}
	
}

