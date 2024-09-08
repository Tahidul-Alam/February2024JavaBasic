package synchronization;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitTest extends BaseTest {
	
	ExplicitWait ex;
	
	@BeforeTest
	public void openApp() {
		openApplication();
	}
	
	@Test
	public void loginTest() {
		ex = new ExplicitWait(driver);
		ex.userName("Talam5");
		ex.password("Bangladesh");
	}
	
	@AfterTest
	public void closeApp() {
		//closeApplication();
		
	}

}
