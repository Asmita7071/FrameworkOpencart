package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC01_RegistrationTest {

	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		System.out.println("Driver initialized successfully: " + driver);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://practice.expandtesting.com/");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void closeWindow()
	{
		driver.quit(); 
	}
	 
	@Test
	public void account_Registration()
	{
		HomePage hp = new HomePage(driver);
		hp.clickDemo();
		hp.clickExamples();	
		hp.clickRegister();
		
		AccountRegistrationPage accregpage = new AccountRegistrationPage(driver);
		accregpage.setUserName("Asmita");
		
		accregpage.setUserPassword("xyz");
		
		accregpage.setUserConPassword("xyz");
		
		
		
	}
}
