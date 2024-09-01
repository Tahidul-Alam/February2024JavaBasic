package dynamicCoding;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfandElse2;

public class DynamicLoginTest extends BaseTestWithIfandElse2 {

	@Test
	public void validloginTest() {
		loginTest("23e@bmail.com","sdfsdfsd"); }
	
	@Test
	public void invalidPasswordTest() {
		loginTest("23e@bmail.com","5444"); }
	
	@Test
	public void invalidUserNameTest() {
		loginTest("bmail.com","sdfsdfsd"); }
		
	
	@BeforeMethod
	public void openFacebook() {
		openApplication();
		
		
	}
		@AfterMethod
		public void closeFacebook() {
			closeApplication();
		
	}
	
	//helper method
	public void loginTest(String userName, String password) {
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	
}


}
	
	
