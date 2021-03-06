package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import utilities.ReadPropertyClass;

public class BaseTest {

	public  static WebDriver driver;
	String url1;
	public static String user;
	public static String pass;
	@BeforeSuite
	public void inialization() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 

		 String path=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
			
		Properties  prop=new Properties();
		 
		FileInputStream fis =new FileInputStream(path);
		 
		
			prop.load(fis);
		
	
	
			driver.get(prop.getProperty("url"));
			
			user=prop.getProperty("username");
			pass=prop.getProperty("password");
		
		 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		//	driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		
			
			
	}

	
	
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}
