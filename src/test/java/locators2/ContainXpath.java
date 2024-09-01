package locators2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bestbuyBase.BaseTestForBestBuy;

public class ContainXpath extends BaseTestForBestBuy {

	
		@BeforeTest
		public void openBestBuy() {
			openApplication();
			}

		
		@Test
		public void containMethod() {
			driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
			
			
		}
		
		@Test
		public void partialContainTextMethod() {
			WebElement laborDay=driver.findElement(By.xpath("//<p[contains(text(),'Labor Day')]"));
			System.out.println("Your text is "+laborDay.getText());
		}
		
		@AfterTest
		public void closeBestBuy(){
			//closeApplication();
			
	}
	}
