package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfandElse2;

public class DirectLocators extends BaseTestWithIfandElse2 {
	

	@BeforeTest
	public void openFacebook(){
		openApplication();
			
		
}
	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("Moon@gmail.com");
		driver.findElement(By.name("login")).click();
		
	}
	
	public void LinkAndPartialLinkTest() {
		//link text start with <a herf
		//<Espanol>
		//if link is too long
		//if link is compound
		//if link is dynamic
		
		driver.findElement(By.linkText("Espanol")).click();
		
	}
	@Test
	public void partialLinkTest() {
		//link text start with <a herf
		//<Espanol>
		//if link is too long
		//if link is compound - 
			//space is between
			//special character
			//number in between
			//under score in between
		//if link is dynamic
		driver.findElement(By.partialLinkText("Contact Uploading")).click();
	
	}
	
	@Test
	public void classAttributeTest() {
		WebElement text=driver.findElement(By.className("_8eso"));
		System.out.println("What is the text: "+text.getText());
	}
	
@AfterTest
public void closeFacebook(){
	//closeApplication();
	
	
}

}


