package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.KiteHomePage;

public class KiteHomeTest extends KiteLoginTest{
	public WebDriver driver;
	KiteHomePage hp;
	
	@Test
	public void dashBoard() {
		
		hp=new KiteHomePage(driver);
		
		
	}
	

}
