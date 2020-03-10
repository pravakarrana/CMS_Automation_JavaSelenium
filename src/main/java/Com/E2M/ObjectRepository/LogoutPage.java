package Com.E2M.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
 
	@FindBy(xpath="//a[contains(@title,'Logout')]")
	private WebElement logout;
	
	@FindBy(xpath="//a[contains(@id,'Logout')]")
	private WebElement logoutall;
	
 
 	 
	public void clickOnlogout()   {
		logout.click();
	}
	public void clickOnlogoutall()   {
		logoutall.click();
	}
}
