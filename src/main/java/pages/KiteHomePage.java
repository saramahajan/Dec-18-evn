package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	 public WebDriver driver;
	 
	 @FindBy(xpath="//a/span[text()='Dashboard']")
	 private WebElement dashboard;
	 
	 @FindBy(xpath="//div[@class='su-input-group su-has-icon search-input-field']/input")
	 private WebElement watchlist;
	 
	 
	 
	 public KiteHomePage(WebDriver driver2) {
		 
		 PageFactory.initElements(driver,this);
	}



	public void Home() {
		 dashboard.click();
		 watchlist.sendKeys("Tata Coffee");
	 }
	
	
	
	
	

}
