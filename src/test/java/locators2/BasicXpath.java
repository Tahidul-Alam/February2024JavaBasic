package locators2;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bestbuyBase.BaseTestForBestBuy;

@Test
public class BasicXpath extends BaseTestForBestBuy {

	
	
	@BeforeTest
	public void openBestBuy() {
		openApplication();
		
			
		}
	
	@Test
	public void xPathFormula() {
		//tag[@attritubte='value']
		//input[@id='email']
		//input[@id='name']
		//tag[starts-with(@attribute,'value')]
		//button[starts-with (@id,'u_0_5_'])
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Tahidul");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("212333");
		driver.findElement(By.xpath("//button[@type='Sign In']")).click(); 
		}
		
		
	
	
	@AfterTest
	public void closeBestBuy(){
		//closeApplication();
		
}
}