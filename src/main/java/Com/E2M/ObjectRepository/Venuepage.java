package Com.E2M.ObjectRepository;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
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

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.GenericLibraries.ConsoleColors;
import Com.E2M.GenericLibraries.JavaScriptExecutorConcept;

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
	          
	          @FindBy(xpath="//a[text()='Add New']")
	          private WebElement AddNewusefulinfo; 
	          
	          @FindBy(xpath="//a[contains(text(),'Open Event for API Testing -Abhi')]")
	          private WebElement AddNewusefulinfo1;
	          
	          @FindBy(xpath="//input[@title='First Name']")
	          private WebElement Useful_Name;
	         
	          @FindBy(xpath="//input[@placeholder='Add tag']")
	          private WebElement Useful_tag;
	         
	          @FindBy(xpath="//body[@class='mceContentBody ']")
	          private WebElement Useful_Description;
	          
	          @FindBy(xpath="//input[@value='Import']")
	          private WebElement ImportusefulInfo;
 	          
	          @FindBy(xpath="//div[contains(@id,'ContentPlaceHolder')]//div//div//table//tbody//tr//td[1]//a[contains(text(),'')]")
	          private List<WebElement> Verifyusefulinfo;
	          
	          @FindBy(xpath="//ul[@class='menu-3rd-level clearfix']//li//a[text()='Disclaimer']")
	          private WebElement ClickonDisclaimer;
	         
	          @FindBy(xpath="//input[contains(@id,'ContentPlaceHolder1_radioButtonListIsUsedByEvent_0')]")
	          private WebElement ClickonRadioButton;
	          
	          @FindBy(xpath="//input[contains(@name,'txtDisclaimerLabel')]")
	          private WebElement Disclaimerlevel;
	          
	          @FindBy(xpath="//input[contains(@name,'txtAcceptanceLabel')]")
	          private WebElement acceptancelevel;
	          
	          @FindBy(xpath="//ul[@class='menu-3rd-level clearfix']//li//a[text()='Social Links']")
	          private WebElement ClickonSocialLink;  
	          
	          @FindBy(xpath="//input[contains(@id,'txtNewName')]")
	          private WebElement EnterSocialLinkname;
	          
	          @FindBy(xpath="//input[contains(@id,'txtNewURL')]")
	          private WebElement EnterSocialLinkUrl; 
	          
	          @FindBy(xpath="//input[contains(@id,'chkNewActive')]")
	          private WebElement clickonpublish; 
	          
	          @FindBy(xpath="//a[contains(@id,'lnkAdd')]")
	          private WebElement Addnewsociallink; 
	          
	          @FindBy(xpath="//div[contains(@id,'divRecord')]//tbody//tr//td//span[text()='Instagram']")
	          private WebElement verifysociallink;
	          
	          @FindBy(xpath="//ul[@class='menu-3rd-level clearfix']//li//a[text()='App Tutorial']")
	          private WebElement ClickonAppTutorial; 
	          
	          @FindBy(xpath="//a[contains(text(),'Tutorial Assets')]")
	          private WebElement ClickonAppTutorialAsset; 
	          
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
	      	 
	      	  @FindBy(xpath="//span[contains(text(),'Title already exists.')]")
	    	  private WebElement GettingError; 
	      	  
	      	  @FindBy(xpath="//div//p[text()='Tutorial saved successfully.']")
	    	  private WebElement verifyapptutprialmsg;
	
	      //Methods or Functions
	      public void ClickParticularEvent() throws Throwable   {
		        String Event=flib.getexcelData("Event", 1, 9).trim();
		        System.out.println(Event.trim());
  		        int Totalevent=ClickEvent.size();
		        System.out.println(Totalevent + " Events");		
		        boolean flag=false;
		         
 	            try {
  		          for(int i=0;i<ClickEvent.size();i++) {
  			            String alleventaname=ClickEvent.get(i).getText();
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
                     } else {
  		                System.out.println(Event + " Event not avalable");
  		                Reporter.log(Event + " Event not available ");
  		                 }
  		                Assert.assertEquals(flag, true);
  		                System.out.println("Sucessfully enter to the event");
 	             }catch (AssertionError e) {
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
           public void NewAddUsefulInfo() {
        	     AddNewusefulinfo.click();
	       }
           public void EnterUsefulInfo_Name(String name,String tag) throws Throwable {
        	            Useful_Name.sendKeys(name);
        	            Useful_tag.sendKeys(tag);
             JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("window.scrollBy(0,1000)");
        	 Thread.sleep(1000);
           }
           public void EnterUsefulInfo_Description() throws Throwable {
         	   WebElement iframe = driver.findElement(By.id("txtDescription_ifr"));
        	   driver.switchTo().frame(iframe);
         	   WebElement description1 = driver.findElement(By.cssSelector("body"));
        	   ((JavascriptExecutor)driver).executeScript("arguments[0].innerHTML = '<h1>proud to be an indian</h1>'", description1);
        	   driver.switchTo().defaultContent();
           } 
           public void EnterDisclaimer_Description() throws Throwable {
         	   WebElement iframe = driver.findElement(By.id("ContentPlaceHolder1_txtDisclaimerText_ifr"));
        	   driver.switchTo().frame(iframe);
         	   WebElement description2 = driver.findElement(By.cssSelector("body"));
        	   ((JavascriptExecutor)driver).executeScript("arguments[0].innerHTML = '<h1>I can be happiness with sunshine and nights blue as the sky</h1>'", description2);
        	   driver.switchTo().defaultContent();
           } 
 		   public void verifyusefulinfo() throws Throwable {
 			   String expected=flib.getexcelData("EventSetup", 1, 5);
         	   for(int i=0;i<=Verifyusefulinfo.size()-1;i++) {
        		  String actual=Verifyusefulinfo.get(i).getText();
        		  if(actual.contains(expected)){
        		  Assert.assertEquals(actual, expected); 
        		  System.out.println(ConsoleColors.ANSI_GREEN + "5. Find created usefulinfo : " + actual + ConsoleColors.ANSI_RESET); 
        		  Reporter.log("5. Find created usefulinfo : " + actual);  
        		  break;
      		     }
          	   }
           } 
           public void navigateDisclaimer() {
        	   ClickonDisclaimer.click();
           } 
           public void Clickonradionbutton() {
        	   ClickonRadioButton.click();
           }
           public void DisclaimerLevel(String level) {
        	   Disclaimerlevel.clear();
        	   Disclaimerlevel.sendKeys(level);
           }
           public void acceptancelevel(String acceptance) {
        	   acceptancelevel.clear();
        	   acceptancelevel.sendKeys(acceptance);
           } 
           public void NaviagtetoSociallink() {
        	   ClickonSocialLink.click();
           } 
           public void EnternameSociallink(String namesociallink) {
        	   EnterSocialLinkname.sendKeys(namesociallink);
           } 
           public void EnternameSociallinkurl(String namesociallinkurl) {
        	   EnterSocialLinkUrl.sendKeys(namesociallinkurl);
           }
           public void ClickonPublish() {
        	   clickonpublish.click();
           } 
           public void AddSocialLink() {
        	   Addnewsociallink.click();
        	 try { 
        	   String status=verifysociallink.getText();
         	   Assert.assertEquals(status, "Instagram");
        	   System.out.println(ConsoleColors.ANSI_GREEN + "4. SocialLink added Sucessfully" +ConsoleColors.ANSI_RESET);
        	   Reporter.log("SocialLink added Sucessfully",true);
             }catch (Exception e) {
               System.out.println("SocialLink not added Sucessfully");
               Reporter.log("SocialLink not added Sucessfully");
 		    }
           }
           public void ClickonAppTutoriallink() {
        	   ClickonAppTutorial.click();
           } 
           public void ClickonAppTutoriallinkAsset() throws Throwable {
        	   ClickonAppTutorialAsset.click();
        	   JavascriptExecutor jss = (JavascriptExecutor) driver;
               jss.executeScript("window.scrollBy(0,1000)");
          	   Thread.sleep(1000);
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
                 System.out.println("Address are found : " + countname);
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
                 } catch (Exception e) {
 			   }
               try {
            	 for(int i=0;i<=Managevenuepage.size()-1;i++) {
            	      Managevenuepage.get(0).click();
                  }
               } catch (Exception e) {
 				
             }
     	   }
           public void CheckLatitude() {
                 try {
            	   String lat=Latitude.getAttribute("value");
            	   System.out.println(ConsoleColors.ANSI_GREEN+ "3(a). Latitude : " + lat + ConsoleColors.ANSI_RESET);
            	   Reporter.log("Latitude : " +lat,true);
                   } catch (Exception e) {
            	   e.printStackTrace(); 
 			    }
 	       }
           public void CheckLongitude() {
            	 try {
              	   String lan=Longitude.getAttribute("value");
              	   System.out.println(ConsoleColors.ANSI_GREEN + "3(b). Longitude : " + lan + ConsoleColors.ANSI_RESET);
              	   Reporter.log("Longitude : " +lan,true);
                   } catch (Exception e) {
              	   e.printStackTrace(); 
   			    }
  	       }
           public void CheckZip_Post_Code() {
            	 try {
                    String pcode=Zip_Post_Code.getAttribute("value");
                	System.out.println(ConsoleColors.ANSI_GREEN + "3(c). Postal Code : " + pcode + ConsoleColors.ANSI_RESET);
                	Reporter.log("Postal Code : " +pcode,true);
                    } catch (Exception e) {
                	e.printStackTrace(); 
     			} 
 	       }
           public void CheckCity() {
            	 try {
                    String city=City.getAttribute("value");
                 	System.out.println(ConsoleColors.ANSI_GREEN + "3(d). City : " +city + ConsoleColors.ANSI_RESET);
                 	Reporter.log("City : " +city,true);
                    } catch (Exception e) {
                 	e.printStackTrace(); 
      		    } 
 	       }
           public void CheckCountry() {
            	 try {
                    String country=Country.getAttribute("value");
                  	System.out.println(ConsoleColors.ANSI_GREEN + "3(e). Country : " +country + ConsoleColors.ANSI_RESET);
                  	Reporter.log("Country : " +country,true);
                    } catch (Exception e) {
                  	e.printStackTrace(); 
       			} 
 	       }
           public void clickOnsave() {
        	   save.click();
        	   
        	   try {
        	   boolean flag=true;
        	   if(GettingError.getText().contains("Title already exists."))
        	   { 
        		   System.out.println("UseFulInfo : " + GettingError.getText() + " Getting Error : " + flag);
        		   System.out.println("5. Not saved UsefulInfo");
         	   }
        	   }catch (Exception e) {
        		    
        	   }
        	   
  	       }
           public void clickOnsave_Disclaimer() {
        	   save.click();
         	   Alert all=driver.switchTo().alert();
        	   all.accept();
        	   System.out.println(ConsoleColors.ANSI_GREEN + "2. Sucessfully created Disclaimer" +ConsoleColors.ANSI_RESET); 
        	   Reporter.log("Sucessfully created Disclaimer");
  	       }
           public void clickOnsave_AppTutorial() {
        	   save.click();
        	   String actualmsg=verifyapptutprialmsg.getText(); 
        	   System.out.println(ConsoleColors.ANSI_GREEN + "1. " +actualmsg + ConsoleColors.ANSI_RESET); 
          	   Reporter.log(actualmsg,true);
  	       }
     }
	
 
	
