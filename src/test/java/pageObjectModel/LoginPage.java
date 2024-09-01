package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
	public WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;	
		
	}
	
	public WebElement userName(String uName) {
		WebElement userNameinput=driver.findElement(By.id("email"));
		userNameinput.sendKeys(uName);
		return userNameinput;
		
	}
	
	public WebElement password(String enterPass) {
		WebElement userPass=driver.findElement(By.name("pass"));
		userPass.sendKeys(enterPass);	
		return userPass;
	
	}
	
	public WebElement loginButton() {
		WebElement button = driver.findElement(By.name("login"));
		button.click();
		return button;
		
	}
	
	
	public WebElement forgotPassword() {
		WebElement fPassword = driver.findElement(By.linkText("Forgot password?"));
		fPassword.click();
		return fPassword;
		
	}
	
	public String connectFriends() {
		String getText=driver.findElement(By.xpath("//h2[contains(text(),'Connect with')]")).getText();
		System.out.println(getText);
		String expectedText="";
		String actualText=getText;
		Assert.assertEquals(expectedText, actualText);
		return getText;
		
	}
	
}
