package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	public WebDriver driver;
	
	@FindBy(xpath="")
	private WebElement Welcome;
	
	@FindBy(xpath="")
	private WebElement LogoutB;
	
	public LogoutPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Logout() {
		Welcome.click();
		LogoutB.click();
	}
}
