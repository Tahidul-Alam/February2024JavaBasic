package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import facebookBase.BaseTestWithIfandElse2;

public class ContainXpath extends BaseTestWithIfandElse2{

	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}
	
	@Test
	public void containMethod() {
		//text always stays in between ><
		driver.findElement(By.xpath("//a[contains(text(),'Español')]")).click();
		
	}
	@Test
	public void partialContainTextMethod() {
		WebElement connectFriend=driver.findElement(By.xpath("//h2[contains(text(),'Connect with')]"));
		System.out.println("Your text is "+connectFriend.getText());
	}
	
	@AfterTest
	public void closeFacebook(){
		//closeApplication();
		
}
}


