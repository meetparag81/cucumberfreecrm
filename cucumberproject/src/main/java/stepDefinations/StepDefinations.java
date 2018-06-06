package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class StepDefinations
{
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver","G:\\Javaprogramming\\Selenium\\Selenium Setup\\chromedriver\\for 65\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.freecrm.com");

	}
}
