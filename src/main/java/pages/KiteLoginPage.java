package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	public static WebDriver driver;
	//firstPage
	@FindBy(id="userid")
	private WebElement user;
	@FindBy(id="password")
	private WebElement pass; 
	@FindBy(xpath="//*[@type='submit']")
	private WebElement login;
	
	//Second Page
	@FindBy(id="pin")
	private WebElement pin;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement continu;
	
	
	
	public KiteLoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void Login(String u,String p,String P) {
	
		user.sendKeys(u);
		pass.sendKeys(p);
		login.click();
		
		pin.sendKeys(P);
		continu.click();
	}
}
