package Com.E2M.ObjectRepository;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.GenericLibraries.JavaScriptExecutorConcept;
import Com.E2M.GenericLibraries.WebDriverUtils;

public class ResponsiveLoginPage extends Baseclass_libraries{
	
	 @FindBy(xpath="//input[@id='txtUsername']")
     private WebElement ResponsiveLoginId; 
	 
	 @FindBy(xpath="//input[@name='password_']")
     private WebElement ResponsiveLoginpassword;  
	 
	 @FindBy(xpath="//div[@id='events-view']//a//div//h3[contains(text(),'')]")
     private List<WebElement> selectevent; 
	 
	 @FindBy(xpath="//input[@id='btnDisclaimers']")
     private WebElement selectDisclaimer; 
	 
	 @FindBy(xpath="//button[@id='open-button']")
     private WebElement selecticonbar;
	 
	 
	 public void OpenNewTabwith_Responsive() throws Throwable{
 			 Robot robot = new Robot();
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_T);
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyRelease(KeyEvent.VK_T);
			 
			 Set<String>set=driver.getWindowHandles();
			 Iterator<String>it=set.iterator();
			 String parentwindow=it.next();
			 String childtwindow=it.next();
			 
			 driver.switchTo().window(childtwindow);
			 driver.get("http://mck.e2m.live");
			 
			 WebDriverUtils.waitforpageToload(driver);
			 ResponsiveLoginId.sendKeys("pravakar.rana1@webspiders.com");
  			 ResponsiveLoginId.sendKeys(Keys.ENTER);
			 
			 ResponsiveLoginpassword.sendKeys("123456");
 			 ResponsiveLoginpassword.sendKeys(Keys.ENTER);
 	  }
	  public void selectResponsiveEvent() throws Throwable{
		   
		 List<WebElement>Selevent=driver.findElements(By.tagName("article"));
		  
		 for(int i=0;i<=Selevent.size()-1;i++){
			 String event=Selevent.get(i).getText();
 			 String particularevent=flib.getexcelData("Event", 1, 9);
 			 JavaScriptExecutorConcept.scrollIntoParticularElement();
 			 if(event.contains(particularevent)){
				 Selevent.get(i).click();
				 break;
			 }
 		 }
 	  }
	  public void SelectDisclaimer(){
		  JavaScriptExecutorConcept.scrollIntoView(selectDisclaimer);
		  selectDisclaimer.click();  
 	  }
	  public void SelectIconBar(){
		  selecticonbar.click();  
 	  }
	  public void SelectMenu(){
		  List<WebElement>Selmenu=driver.findElements(By.xpath("//div[@class='menu-group']//a"));
		  String menu = null;
		try {
			menu = flib.getexcelData("EventSetup", 1, 19);
			for(int i=0;i<=Selmenu.size()-1;i++) {
 				  if(Selmenu.get(i).getText().contains(menu)){
 					  System.out.println("Click on : " +Selmenu.get(i).getText());
  	  			      Selmenu.get(i).click();
 				  }
	 		}
		} catch (Throwable e) {
 		}
 	  }
	  public void CheckVisibleorNotIconList(){
		  List<WebElement>lst=driver.findElements(By.xpath("//div[contains(@class,'active animated fadeInUp')]//div//a//span"));
 		  for(WebElement as:lst){
			  System.out.println(as.getText());
		  }
	  }
	     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
