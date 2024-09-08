package synchronization;
	
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class BaseTest {

		public WebDriver driver;
		String browser="Chrome";
		
	
		
		public void openApplication() {
			
			if(browser.equalsIgnoreCase("Chrome")) {
				driver= new ChromeDriver();
				
			}else if(browser.equalsIgnoreCase("Edge")) {
			driver= new EdgeDriver();
		}
			else if (browser.equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
		}else {
			
			System.out.println("you put wrong browser name");
			
		
			
		
		}
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		
		public void closeApplication() {
			if(driver != null) {
				driver.quit();
				
			}
		}
		}

		
