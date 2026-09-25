package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountRegistrationPage extends BasePage{

	//WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	
	@FindBy(css="#username")
	 WebElement firstname;

	 
	@FindBy(css="#password")
	WebElement password;
	
	@FindBy(css="#confirmPassword")
	WebElement conpassword;
	
	
	
	public void setUserName(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void setUserPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void setUserConPassword(String conpass)
	{
		conpassword.sendKeys(conpass);
	}
	

	
}
