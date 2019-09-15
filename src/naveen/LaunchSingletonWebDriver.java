package naveen;

import org.openqa.selenium.WebDriver;

public class LaunchSingletonWebDriver {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		TestSingletonWebdriver ts = TestSingletonWebdriver.createInstance();
		driver = ts.createDriver();
		
		driver.get("https://www.google.com");
	}

}
