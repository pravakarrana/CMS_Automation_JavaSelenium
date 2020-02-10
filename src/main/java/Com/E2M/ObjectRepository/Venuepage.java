package Com.E2M.ObjectRepository;

import java.util.List;

import org.apache.poi.hssf.util.HSSFColor.AQUA;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import Com.E2M.GenericLibraries.Baseclass_libraries;

          public class Venuepage extends Baseclass_libraries {
	
	          //WebElement Locators
	          @FindBy(xpath="//div[contains(@id,'ContentPlaceHolder')]//table//tbody//tr//td[3]//a")
	          private List<WebElement> ClickEvent;
	  
	          @FindBy(xpath="//div[@class='wrapper clearfix brdcun-wrap']//*[contains(text(),'Add Venue')]")
	          private WebElement ClickAddVenue;
	
	          @FindBy(xpath="//input[contains(@name,'VenueName')]")
	          private WebElement VanueName;
	          
	          @FindBy(xpath="//textarea[contains(@name,'txtAddress')]")
	          private WebElement VanueAddress;
	          
	          @FindBy(xpath="//input[contains(@name,'txtLatitude')]")
	          private WebElement Latitude ;
	          
	          @FindBy(xpath="//input[contains(@name,'txtLongitude')]")
	          private WebElement Longitude ;
	          
	          @FindBy(xpath="//input[contains(@name,'txtZipCode')]")
	          private WebElement Zip_Post_Code ;
	          
	          @FindBy(xpath="//input[contains(@name,'txtCity')]")
	          private WebElement City ;
	          
	          @FindBy(xpath="//select[contains(@name,'ddlCountry')]")
	          private WebElement Country ;
	          
	          @FindBy(xpath="//input[@value='Save']")
	          private WebElement save;
	          
	          @FindBy(xpath="//input[@value='Save']")
	          private WebElement EventInfopageValidation;
	 
	
	
	         //Methods or Functions
	         public void ClickParticularEvent() throws Throwable   {
		        String Event=flib.getexcelData("Event", 1, 9).trim();
		               System.out.println(Event.trim());
		               
 		        int Totalevent=ClickEvent.size();
		        System.out.println(Totalevent);		
		        boolean flag=false;
		
	              try {
  		               for(int i=0;i<ClickEvent.size();i++)
 		               {
  			             String alleventaname=ClickEvent.get(i).getText();
  			                    System.out.println(alleventaname);
  			                    
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
  		                 System.out.println("Sucessfully enter to the event");
	             } catch (AssertionError e) {
		              System.out.println("Particular event is not found.");
		              System.out.println("Please Check the event");
		              throw(e);
	             }
	              
//	               String urlpage=driver.getCurrentUrl();
//                   System.out.println(urlpage);
//                   
//                   String pagetitle=driver.getTitle();
//                   System.out.println(pagetitle); 
                   
                    
                   
             }
             public void navigateAddVenue() {
		         ClickAddVenue.click();
		         
	         }
             public void AddVenueName(String venue) {
            	 VanueName.sendKeys(venue);
	         }
             public void AddAddress()     {
            	 VanueAddress.sendKeys("karunamayee");
            	 
             	 List<WebElement> elements = driver.findElements(By.className("pac-item"));
                     int countname=elements.size();
                     System.out.println(countname);
             
                 for(int i=0;i<=elements.size()-1;i++) {
                 	 String location=elements.get(0).getText();
                 	 System.out.println(location);
                  	 elements.get(0).click();
                  	 break;
                 } 
             }
             public void CheckLatitude() {
            	 Latitude.click();
	         }
             public void CheckLongitude() {
            	 Longitude.click();
	         }
             public void CheckZip_Post_Code() {
            	 Zip_Post_Code.click();
	         }
             public void CheckCity() {
            	 City.click();
	         }
             public void CheckCountry() {
            	 Country.click();
	         }
             public void clickOnsave() {
            	 save.click();
	         }
	 
  
 	}
	
 
	
