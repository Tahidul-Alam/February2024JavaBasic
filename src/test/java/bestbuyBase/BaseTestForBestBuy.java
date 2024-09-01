package bestbuyBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BaseTestForBestBuy {

	public WebDriver driver;
	
	String browser="Chrome";
@Test

		public void openApplication () {
			driver= new ChromeDriver();
			driver.get("https://www.bestbuy.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			//driver.close();
			
				
			}
	}

