package pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
	public WebDriver driver;
	
	@FindBy(xpath="//div[@id='wrapper']/div/a[@id='welcome']")
	private WebElement Welcome;
	
	@FindBy(css="#welcome-menu>ul>li:nth-child(3)>a")
	private WebElement LogoutB;
	
	public LogoutPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Logout() {
		System.out.println("We Are LogOut");
//		WebDriverWait WW=new WebDriverWait(driver,Duration.ofSeconds(20));
//		WW.until(ExpectedConditions.elementToBeClickable(Welcome));
	
		Welcome.click();
		LogoutB.click();
	
	}
}
