package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfandElse2;

public class XpathLoop extends BaseTestWithIfandElse2{

	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}
	
	@Test
	public void xPathLoopTest() {
		//div[@id='pageFooter']/ul/li)[29]
		//div[@id='pageFooterChildren']/ul/li[5] < if no tag (div) then put *
		//*[@id='pageFooterChildren']/ul/li[5]
		
		driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[3]")).click();
	
	}
	
	@Test
	public void xPathIndexTest() {
	driver.findElement(By.xpath("//div[@id='pageFooterChildren']/ul/li[5]")).click();

	}
	
	
	@AfterTest
	public void closeFacebook(){
		//closeApplication();
		
}
}


