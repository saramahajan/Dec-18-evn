package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.KiteLoginPage;

public class KiteLoginTest extends KiteBase {
public static WebDriver driver;
 KiteLoginPage lp;
	
	
	@Test
	public void Login() throws InterruptedException {
		
		lp=new KiteLoginPage(driver);
		lp.Login(user, pass, pin);
	
		
	}
	
	@AfterSuite
	public void teardown() {
	//	driver.close();
	}
}
