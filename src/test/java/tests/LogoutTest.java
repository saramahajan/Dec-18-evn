package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LogoutPage;

public class LogoutTest extends BaseTest {
	WebDriver driver;
	LogoutPage lop;
	@Test(priority=2)
	public void Logout() {

		lop=new LogoutPage(driver);
		lop.Logout();
	
		}
	
}

