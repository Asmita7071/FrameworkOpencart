package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
@FindBy(xpath="//a[@id='examples-dropdown']")
WebElement demos;

@FindBy(xpath="//a[text()='Examples']")
WebElement examples;

@FindBy(xpath="//a[text()='Try it out']")
WebElement register;

public void clickDemo()
{
	demos.click();
}

public void clickExamples()
{
	examples.click();
}

public void clickRegister()
{
	register.click();
}


}
