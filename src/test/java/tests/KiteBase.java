package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.KiteHomePage;

public class KiteBase {
	
	public static WebDriver driver;
	public static String user;
	public static String pass;
	public static String pin;
		@BeforeSuite
	public void Init() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream(path);
		prop.load(fis);
		
		driver.get(prop.getProperty("kiteurl"));
		
		user=prop.getProperty("kiteuser");
		pass=prop.getProperty("kitepass");
		pin=prop.getProperty("Kitepin");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}
	@AfterSuite
	public void teardown() {
		driver.close();
	}
}
