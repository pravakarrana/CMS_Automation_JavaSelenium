package Com.E2M.ObjectRepository;

import java.util.List;

import org.apache.poi.hssf.util.HSSFColor.AQUA;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

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
	 
	          @FindBy(xpath="//ul[@class='menu-3rd-level clearfix']//li//a[text()='Useful Info ']")
	          private WebElement clickonusefulinfo;
	          
	          @FindBy(xpath="//input[@value='Import']")
	          private WebElement ImportusefulInfo;
	          
	      	  @FindBy(xpath="//div[@class='menu-toggle-link clearfix']//a[@class='toggle-menu']")
	    	  private WebElement clickonmenu;
	      	  
	      	  @FindBy(xpath=".//a[contains(@class,'menu-item has-submneu')]")
	    	  private List<WebElement> clickonAgenda;
	    	
	      	  @FindBy(xpath="//div[@class='sub-menu event-menu']//ul[@class='sub-menu-ul']//li[@id='Upload']")
	    	  private WebElement clickonUpload;
	      	  
	      	  @FindBy(xpath="//a[contains(@id,'AllEvents')]")
	    	  private WebElement clickonAllEventpage;
	      	  
	      	  @FindBy(xpath="//div[contains(@id,'ContentPlaceHolder')]//div//table//tbody//tr//td//a[contains(text(),'')]")
	    	  private List<WebElement> Managevenuepage;
	      	 
	
	       //Methods or Functions
	       public void ClickParticularEvent() throws Throwable   {
		        String Event=flib.getexcelData("Event", 1, 9).trim();
		               System.out.println(Event.trim());
		               
 		        int Totalevent=ClickEvent.size();
		        System.out.println(Totalevent + " Events");		
		        boolean flag=false;
		
	              try {
  		               for(int i=0;i<ClickEvent.size();i++)
 		               {
  			             String alleventaname=ClickEvent.get(i).getText();
  			                    //System.out.println(alleventaname);
  			                    
    		                 if(alleventaname.contains(Event)) {
    				         String Expected=ClickEvent.get(i).getText();
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
           }
           public void navigateAddVenue() {
		         ClickAddVenue.click();
 	       }
           public void navigateUsefulInfo() {
            	 clickonusefulinfo.click();
 	       }
           public void navigateUsefulInfoImport() {
            	 ImportusefulInfo.click();
 	       }
           public void navigateTomenu() {
            	 clickonmenu.click();
 	       }
           public void ClickonAgenda() {
             	 for(int i=0;i<=clickonAgenda.size()-1;i++) {
            		 String text=clickonAgenda.get(i).getText();
             		 if(text.equals("AGENDA SETUP")) {
            			 clickonAgenda.get(i).click(); 
            		 }
            	 }
  	       }
           public void navigateToAllEventPage() {
            	 clickonAllEventpage.click();
 	       }
           public void ClickonUpload() {
            	 clickonUpload.click();
 	       }
           public void AddVenueName(String venue) throws Throwable {
            	 VanueName.sendKeys(venue);
            	 Thread.sleep(1000);
	       }
           public void AddAddress() throws InterruptedException  {
            	 VanueAddress.sendKeys("karunamayee");
              	 List<WebElement> elements = driver.findElements(By.className("pac-item"));
                 int countname=elements.size();
                 System.out.println(countname + " Address are found");
               for(int i=0;i<=elements.size()-1;i++) {
                 String location=elements.get(0).getText();
                 System.out.println(location);
                 elements.get(0).click();
                 break;
               } 
               Thread.sleep(3000);
           }
           public void ClickonEditManagevenuepage() {
               try {
            	 Alert alt=driver.switchTo().alert();
            	       alt.accept();
            	 }catch (Exception e) {
 			   }
               try {
            	 for(int i=0;i<=Managevenuepage.size()-1;i++) {
            	      Managevenuepage.get(0).click();
               }
                }catch (Exception e) {
 				
                }
     	   }
           public void CheckLatitude() {
                 try {
            	   String lat=Latitude.getAttribute("value");
            	   System.out.println("Latitude : " +lat);
                   } catch (Exception e) {
            	   e.printStackTrace(); 
 			    }
 	       }
           public void CheckLongitude() {
            	 try {
              	   String lan=Longitude.getAttribute("value");
              	   System.out.println("Longitude : " +lan);
                   } catch (Exception e) {
              	   e.printStackTrace(); 
   			    }
  	       }
           public void CheckZip_Post_Code() {
            	 try {
                    String pcode=Zip_Post_Code.getAttribute("value");
                	System.out.println("Postal Code : " +pcode);
                    } catch (Exception e) {
                	e.printStackTrace(); 
     			} 
 	       }
           public void CheckCity() {
            	 try {
                    String city=City.getAttribute("value");
                 	System.out.println("City : " +city);
                    } catch (Exception e) {
                 	e.printStackTrace(); 
      		    } 
 	       }
           public void CheckCountry() {
            	 try {
                    String country=Country.getAttribute("value");
                  	System.out.println("Country : " +country);
                    } catch (Exception e) {
                  	e.printStackTrace(); 
       			} 
 	       }
           public void clickOnsave() {
              	 save.click();
	         }
   	}
	
 
	
