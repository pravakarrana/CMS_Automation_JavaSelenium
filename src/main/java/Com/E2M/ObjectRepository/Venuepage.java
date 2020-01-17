package Com.E2M.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import Com.E2M.GenericLibraries.Baseclass_libraries;

public class Venuepage extends Baseclass_libraries {
	
	//WebElement Locators
	@FindBy(xpath="//div[contains(@id,'ContentPlaceHolder')]//table//tbody//tr//td//a")
	private List<WebElement> ClickEvent;
	
	@FindBy(xpath="//div[contains(@id,'ContentPlaceHolder')]//table//tbody//tr//td//a")
	private List<WebElement> ClickAddVenue;
	
	
	
	
	//Methods or Functions
	public void ClickParticularEvent() throws Throwable   {
		String Event=flib.getexcelData("Event", 1, 9);		
 		int Totalevent=ClickEvent.size();
		System.out.println(Totalevent);		
		boolean flag=false;
		
  		for(int i=0;i<=ClickEvent.size()-1;i++)
 		{
  			String alleventaname=ClickEvent.get(i).getText();
  			  
    			if(alleventaname.contains(Event)) {
    				String Expected=ClickEvent.get(i).getText();
    				System.out.println(Expected);
    				ClickEvent.get(i).click();
    				flag=true;
    			    break;  			  
     			}
 		}
    	if(flag==true) {
  		   Assert.assertEquals(flag, true);
  		   System.out.println(Event + " Event available");
  		   Reporter.log(Event + " Event available ");
       }else {
  		   System.out.println(Event + " Event not avalable");
  		   Reporter.log(Event + " Event not available ");
  	   }	
  		   Assert.assertEquals(flag, true);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  
 	}
	
 
	
