package pageObjectModel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	LoginPage lp;
	
	@BeforeMethod
	public void openFacebook() {
		openApplication();
		
	}
	
	@Test
	public void validLoginTest() {
		System.out.println("Hello");
		lp = new LoginPage(driver);
		lp.userName("sdfasdf@bnail.com");
		lp.password("sdfsdf");
		lp.loginButton();
		
		
	}
	
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
		
	}
}
