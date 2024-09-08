package pomWithPageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pf_LoginTest extends Pf_BaseTest {
	
	Pf_LoginPage lp;
	
	@BeforeMethod
	public void openFacebook() {
		openApplication();
		
	}
	@Test
	public void validLoginTest() {
		lp=new Pf_LoginPage(driver);
		lp.userName("Talam5");
		lp.password("bangladesh");
		lp.loginButton();
		
		
	}
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
		
	}

}
