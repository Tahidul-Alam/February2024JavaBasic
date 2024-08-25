package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import facebookBase.BaseTestWithIfandElse2;

public class DynamicXpath extends BaseTestWithIfandElse2{

	@BeforeTest
	public void openFacebook() {
		openApplication();
		

	}
	@Test
	public void userNameTest() {
		driver.findElement(By.xpath("//*[contains(@class,'input')]")).sendKeys("gg23");
		
	}
	
	@Test
	public void passTest() {
		driver.findElement(By.xpath("//*[contains(@class,'55rl_6luy_9npi')]")).sendKeys("234232");

	}
	
	@Test
	public void dynamicxpathFormula() {
		driver.findElement(By.xpath("//button[starts-with (@id,'u_0_5_')]")).click();
	}
		
	public void containFuntion() {
		driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
		}
	
	@AfterTest
	public void closeFacebook(){
		//closeApplication();
		
}
}


