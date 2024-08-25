package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfandElse2;

public class BasicXpath extends BaseTestWithIfandElse2 {

	@BeforeTest
	public void openFacebook() {
		openApplication();
		
	}
	
	@Test
	public void xPathFormula() {
		//absolute xpath, relative xpath, dynamic xpath (if number in "id" then dynamic)
		//tag[@attritubte='value']
		//input[@id='email']
		//input[@id='name']
		//tag[starts-with(@attribute,'value')]
		//button[starts-with (@id,'u_0_5_'])
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rr4");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("111");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
	
	@Test
	public void linkXpath() {
		driver.findElement(By.xpath("//a[@title=\"Spanish\"]")).click();
		
		
	}
	
	@AfterTest
	public void closeFacebook(){
		//closeApplication();
		
}
}

