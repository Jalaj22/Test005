package naveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSingletonWebdriver {

	private static TestSingletonWebdriver stwd = null;
	public static WebDriver driver;
	
	private TestSingletonWebdriver(){
		
	}
	
	public static TestSingletonWebdriver createInstance(){
		if(stwd==null){
			stwd = new TestSingletonWebdriver();
		}
		
		return stwd;
	}
	
	
	public static WebDriver createDriver(){
		System.setProperty("webdriver.chrome.driver","E:\\JAR\\SeleniumJAR\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		return driver;
	}
}
