package Com.E2M.ObjectRepository;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.GenericLibraries.ConsoleColors;
import Com.E2M.GenericLibraries.JavaScriptExecutorConcept;
import Com.E2M.GenericLibraries.WebDriverUtils;
import bsh.Console;

    public class EventSetupPage extends Baseclass_libraries {
    	
      @FindBy(xpath="//div[@class='brand-logo-name']//span[text()='2020-2021 for Sanity']")
      private WebElement verifyeventname;
      
      @FindBy(xpath="//a[@class='toggle-menu']") 
      private WebElement clickonTogglemenu;
	
      @FindBy(xpath="//div[@class='sub-menu event-menu']//ul//li//a[contains(text(),'App Branding')]")
      private WebElement clickonappBranding;	 
     	
      @FindBy(xpath="//div[@class='sub-menu event-menu']//ul//li//a[contains(text(),'App Menu')]")
      private WebElement clickonappMenu; 
      
      @FindBy(xpath=".//section[contains(@class,'pushmenu-toggle')]//a[text()='Manage Menu Items']")
      private WebElement clickonManageMenuItem; 
      
      @FindBy(xpath="//select[contains(@name,'Categories')]")
      private WebElement CategorymanageMenu; 
      
      @FindBy(xpath=".//table[contains(@id,'gvMenu')]//tbody//tr//td[1]//a")
      private List<WebElement> CheckAgendamenu; 
      
      @FindBy(xpath=".//table[contains(@id,'gvMenu')]//tbody//tr//td[5]//input")
      private List<WebElement> CheckAgendamenuSelected;
      
      @FindBy(xpath="//div[@class='sub-menu event-menu']//ul//li//a[text()='Resources']")
      private WebElement clickonResourse; 
      
      @FindBy(xpath="//div[contains(@class,'new-clpshdr')]//span")
      private WebElement clickonAddnewResourse;  
      
      @FindBy(xpath="//div[@class='nwdrag-here']//a[contains(@id,'upfile')]")
      private WebElement clickonAddnewResoursefile;
      
      @FindBy(xpath="//select[contains(@name,'ddlResourceType')]")
      private WebElement SearchResourseType;
      
      @FindBy(xpath=".//table[contains(@id,'gvResources')]//tbody//tr[2]//td[2]//div//input[contains(@name,'txtResourcesTitle')]")
      private WebElement AllResourses; 
      
      @FindBy(xpath=".//table[contains(@id,'gvResources')]//tbody//tr[2]//td[2]//div//input[contains(@name,'txtResourcesTitle')]")
      private boolean AllResoursescheck; 
      
      @FindBy(xpath="//table[contains(@id,'gvResources')]//tbody//div[text()='No Records Found.']")
      private WebElement Norecordsfound;
      
      @FindBy(xpath="//select[contains(@name,'cmbSourceTpe')]")
      private WebElement ResourseType;  
      
      @FindBy(xpath="//input[contains(@id,'txtLinkResourceTitle')]")
      private WebElement ResourseTitle; 
      
      @FindBy(xpath="//input[contains(@id,'txtLinkResourcLink')]")
      private WebElement ResourseLink; 
      
      @FindBy(xpath="//input[@id='btnResourceLinkSave']")
      private WebElement SaveResourseLink;
      
	  @FindBy(xpath="//div[@id='divTopBarColor']")
      private WebElement clickonTopBar_color;
	  
	  @FindBy(xpath="//div[@id='divHeaderBarColor']")
      private WebElement clickonHeader_color;
	  
	  @FindBy(xpath="//div[@id='divFontColor']")
      private WebElement clickonFont_color;
	  
	  @FindBy(xpath="//div[@id='divIconColor']")
      private WebElement clickonSideNavigation_color;
	  
	  @FindBy(xpath="//input[contains(@name,'flUpPhoto')]")
      private WebElement eventlogo; 
	  
	  @FindBy(xpath="//img[contains(@id,'imgLogo')]")
      private boolean verifyeventlogo;
	  
	  @FindBy(xpath="//img[contains(@id,'imgLogo')]")
      private WebElement verifyeventlogo1;
	  
	  @FindBy(xpath="//input[contains(@name,'saveOnly')]")
      private WebElement save;  
	  
	  @FindBy(xpath="//input[contains(@name,'btnAdd')]") 
      private WebElement save_Splash;
	  
	  @FindBy(xpath="//div[@class='wrapper clearfix brdcun-wrap']//a[text()='App Splash / Welcome']")
      private WebElement addflash;  
	  
 	  @FindBy(xpath="//input[contains(@name,'txtTimeSpan')]")
      private WebElement splashtime; 

	  @FindBy(xpath="//a[@id='deleteIpadLandScape']//img[contains(@id,'imgDeleteIpadLandScape')]")
      private WebElement CheckIpadLandscapeimage;   
	  
	  @FindBy(xpath="//table[contains(@id,'rbtnscreen')]//tbody//tr//input")
      private List<WebElement> selecteventusessplash; 
	  
	  @FindBy(xpath="//a[@id='deleteIpadPotrait']//img[contains(@id,'imgDeleteIpadPotrait')]")
      private WebElement CheckIpadportatitimage; 
	  
	  @FindBy(xpath="//a[@id='deleteIPhone']//img[contains(@id,'imgDeleteIPhone')]")
      private WebElement CheckIhoneimage; 
	  
	  @FindBy(xpath="//a[@id='deleteIPhoneX']//img[contains(@id,'imgDeleteIPhoneX')]")
      private WebElement CheckIhoneimageX;
	  
	  @FindBy(xpath="//span[@class='ui-icon-loading']")
      private WebElement checkloading;
	  
	  @FindBy(xpath="//div[contains(@id,'ipadlandscape')]//p[@class='browse-here']//a[text()='+Click to add']")
      private WebElement importIpadlandscapeimage; 
	  
	  @FindBy(xpath="//div[contains(@id,'ipadpotrait')]//p[@class='browse-here']//a[text()='+Click to add']")
      private WebElement importIpadportaitimage; 
	  
	  @FindBy(xpath="//div[contains(@id,'iPhone')]//p[@class='browse-here']//a[text()='+Click to add']")
      private WebElement importIpadiphoneimage;
	  
	  @FindBy(xpath="//div[contains(@id,'iPhoneX')]//p[@class='browse-here']//a[text()='+Click to add']")
      private WebElement importIpadiphoneXimage;
	  
	  @FindBy(xpath="//div[@class='wrapper clearfix brdcun-wrap']//a[text()='Event Background']")
      private WebElement ClickonEventBackground; 
	  
	  @FindBy(xpath="//table[contains(@id,'rbtnscreen')]//tbody//tr//td//input")
      private List<WebElement> eventusesbackground;
	  
	  @FindBy(xpath="//table[contains(@id,'rdnType')]//tbody//tr//td//input")
      private List<WebElement> typeofbackground;  
	  
	  @FindBy(xpath="//div[@id='tabsection']//a")
      private List<WebElement> GalleryOrUploadimage; 
	  
	  @FindBy(xpath="//div[contains(@id,'ipadlandscape')]//a[contains(@id,'anchorFileUpload')]")
      private WebElement uploadeventbackground1; 
	  
	  @FindBy(xpath="//img[contains(@id,'imgDeleteIpadLandScape')]")
      private WebElement Deleteeventbackground;
	  
	  @FindBy(xpath="//div[contains(@id,'ipadpotrait')]//a[contains(text(),'+Click to add')]")
      private WebElement uploadeventbackground2;
	  
	  @FindBy(xpath="//div[contains(@id,'iPhone')]//a[contains(@id,'a2')]")
      private WebElement uploadeventbackground3;
	  
	  @FindBy(xpath="//div[contains(@id,'iPhoneX')]//a[contains(text(),'+Click to add')]")
      private WebElement uploadeventbackground4;
	  
	  @FindBy(xpath="//input[@value='Save']")
      private WebElement save_eventbackground;  
 	  
	  @FindBy(xpath="//div[contains(@id,'UpdatePanel1')]//li//span[contains(text(),'')]")
      private WebElement verifystatus;
	  
	  @FindBy(xpath="//div[@class='wrapper clearfix brdcun-wrap']//a[text()='Event Banner']")
      private WebElement ClickonEventBanner;   
	  
	  @FindBy(xpath="//div[contains(@id,'showdata')]//tbody//tr[@class='BgColorWhite']")
      private List<WebElement> countno_ofBanner;
	  
	  @FindBy(xpath="//input[@value='Add New']")
      private WebElement clickonAddNew;  
	  
	  @FindBy(xpath="//input[contains(@name,'Banner2') and @type='file']")
      private WebElement importbanner1; 
	  
	  @FindBy(xpath="//input[contains(@name,'Banner3') and @type='file']")
      private WebElement importbanner2; 
	  
	  @FindBy(xpath="//input[contains(@name,'Banner4') and @type='file']")
      private WebElement importbanner3; 
	  
	  @FindBy(xpath="//input[contains(@name,'Banner10') and @type='file']")
      private WebElement importbanner4; 
	  
	  @FindBy(xpath="//input[contains(@name,'Banner7') and @type='file']")
      private WebElement importbanner5; 
	  
	  @FindBy(xpath="//input[contains(@name,'Banner5') and @type='file']")
      private WebElement importbanner6; 
	  
	  @FindBy(xpath="//input[contains(@name,'Banner6') and @type='file']")
      private WebElement importbanner7;  
	  
	  @FindBy(xpath="//input[@value='Add Banner']")
      private WebElement AddBanner;//input[@id='txtUsername']
	  
	  
	  
	  
	  
	  public void VerifyEventname() {
		  String text=verifyeventname.getText();
		  boolean check=text.equals("2020-2021 for Sanity");
		  Assert.assertEquals(check, true);
      }
 	  public void navigateToggleMenu() {
 		  WebDriverWait wait=new WebDriverWait(driver, 20);
 		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='brand-logo-name']//span[text()='2020-2021 for Sanity']")));
		  clickonTogglemenu.click();
      }
 	  public void navigateAppBranding() {
		  clickonappBranding.click();
      }
   	  public void Logo_themecolor() throws Throwable {//"+Date+"
 		String  Top_barcolor =flib.getexcelData("EventSetup", 1, 8);
 		String  Headercolor =flib.getexcelData("EventSetup", 1, 9);
 		String  fontcolor =flib.getexcelData("EventSetup", 1, 10);
 		String  Sidenavigationcolor =flib.getexcelData("EventSetup", 1, 11);
	     ((JavascriptExecutor) driver).executeScript("document.getElementById('divTopBarColor').style.backgroundColor = '"+Top_barcolor+"'");
	     ((JavascriptExecutor) driver).executeScript("document.getElementById('divHeaderBarColor').style.backgroundColor = '"+Headercolor+"'");
	     ((JavascriptExecutor) driver).executeScript("document.getElementById('divFontColor').style.backgroundColor = '"+fontcolor+"'");
	     ((JavascriptExecutor) driver).executeScript("document.getElementById('divIconColor').style.backgroundColor = '"+Sidenavigationcolor+"'");
      }
 	 public void Eventlogo() throws InterruptedException, Throwable    {
 		 //boolean checkeventlogo=verifyeventlogo1.isDisplayed();
  		 try{
 		 if(verifyeventlogo){
 			 System.out.println(ConsoleColors.ANSI_GREEN + "Event Logo have already present" + ConsoleColors.ANSI_RESET);
  		}else{
  			WebDriverWait wait1=new WebDriverWait(driver, 20);
 	        wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[contains(@name,'flUpPhoto')]")));
  	    	
            Actions logoact=new Actions(driver);
   		    logoact.moveToElement(eventlogo).click().build().perform();	 
            Thread.sleep(2000);
 		      StringSelection logosl=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\GBBranding\\AppBranding\\logo\\safari_park");
 	          Toolkit logotk=Toolkit.getDefaultToolkit();
 	          Clipboard logock=logotk.getSystemClipboard();
 	          logock.setContents(logosl, null);
 	        
 	        Robot logorobot = null;
 	        try {
 	    	 logorobot=new Robot();
 	        }catch (AWTException  e) {
 			 e.printStackTrace();
 		    }  
 	        logorobot.delay(250);
 	        logorobot.keyPress(KeyEvent.VK_ENTER);
 	        logorobot.keyRelease(KeyEvent.VK_ENTER);
 	        logorobot.keyPress(KeyEvent.VK_CONTROL);
 	        logorobot.keyPress(KeyEvent.VK_V);
 	        logorobot.keyRelease(KeyEvent.VK_V);
 	        logorobot.keyRelease(KeyEvent.VK_CONTROL);
 	        logorobot.keyPress(KeyEvent.VK_ENTER);
 	        logorobot.delay(150);
 	        logorobot.keyRelease(KeyEvent.VK_ENTER);
  		 }
 		 }catch(Exception e){
  		 }finally {
   		   Thread.sleep(2000);
 	       save.click();
 	  	   Alert logo=driver.switchTo().alert();
 	 	   logo.accept();
		   System.out.println(ConsoleColors.ANSI_GREEN + "Event Logo added sucessfully" + ConsoleColors.ANSI_RESET);
   		 }
  	 } 
 	 public void saveEventlogo() {
 		save.click();
  		Alert logo=driver.switchTo().alert();
 		      logo.accept();
     } 
 	 public void Navigate_AddSplash() {
 		addflash.click(); 
     }
 	 public void SelectEventusessplash() throws Throwable{
    	   for(int i=0;i<=selecteventusessplash.size()-1;i++){
     		   String eventuses1=selecteventusessplash.get(i).getAttribute("value");
     	      //String backgroundtypeevent1=flib.getexcelData("EventSetup", 1, 15);
 	    	   if(eventuses1.equals("Yes")){
 	    	      selecteventusessplash.get(i).click();
     	    	  break;
    	       }else{
     	    	  Assert.assertEquals(eventuses1, "Yes");
    	      }
    	   }
    	   Thread.sleep(3000);
      }
 	  public void AddSplashTime(String time) throws Throwable {
  		   boolean loading=checkloading.isDisplayed();
  		   
  		   if(loading){
  		   WebDriverWait waitforelement=new WebDriverWait(driver, 20);
   	       waitforelement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='deleteIpadLandScape']//img[contains(@id,'imgDeleteIpadLandScape')]")));
   	        if(!loading){
   		     splashtime.clear();
 		     Thread.sleep(1000);
 		     splashtime.sendKeys(time);
 		     Thread.sleep(2000);
 	        }
  		   }else{
  			   
  		   }
  		 
 	   }
//   	   public void Deletesplashandverify() throws Throwable {
//   	      boolean checkimage=CheckIpadLandscapeimage.isDisplayed();
//		  if(checkimage){
// 	 		  System.out.println(ConsoleColors.ANSI_BLUE + "Ipad Landscape image 2732x2048 pixels is available" +ConsoleColors.ANSI_RESET);
//	          Actions deletesplash=new Actions(driver);
//			  deletesplash.moveToElement(CheckIpadLandscapeimage);
//			  JavascriptExecutor executor = (JavascriptExecutor)driver;
//			  executor.executeScript("arguments[0].click();", CheckIpadLandscapeimage);
//			  System.out.println(ConsoleColors.ANSI_Magenta + "Delete Ipad Landscape image 2732x2048 pixels is available" +ConsoleColors.ANSI_RESET);
//			  Thread.sleep(2000);
//          }else if(!checkimage){
//        	  System.out.println(ConsoleColors.ANSI_BLUE + "Not available iPad Landscape image 2732x2048 pixels==>Please add flash " +ConsoleColors.ANSI_RESET);
//	 		  Thread.sleep(2000);
//          }
// 	   } 
//       public void importipadlandscapeimage() throws Throwable {
//    	   boolean checkimage=CheckIpadLandscapeimage.isDisplayed();
//    	   try{
//    		   if(!checkimage){
//  			 JavascriptExecutor jss = (JavascriptExecutor) driver;
//             jss.executeScript("window.scrollBy(0,200)");
//        	 Thread.sleep(1000);
//         	
//        	Actions Addsplash=new Actions(driver);
//        	Addsplash.moveToElement(importIpadlandscapeimage).click().build().perform();	 
//            Thread.sleep(2000);
//            flib.uploadFileWithRobot("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\GBBranding\\AppBranding\\Splash_Welcome\\ipadlandscape");
//            System.out.println(ConsoleColors.ANSI_GREEN + "New Ipad Landscape image 2732x2048 pixels is available" +ConsoleColors.ANSI_RESET);
//           // Thread.sleep(2000);
//    		   }
//    		   JavascriptExecutor jsssaa = (JavascriptExecutor) driver;
//               jsssaa.executeScript("window.scrollBy(0,1000)");
//          	  Thread.sleep(1000);
//          	  save_Splash.sendKeys(Keys.ENTER);
//    	   }
//    	   
//    	   catch(Exception e){
//     	   }
//       }
 	    
 	   public void Deletesplashandverify() throws Throwable {
	      boolean checkimage=CheckIpadLandscapeimage.isDisplayed();
		  if(checkimage){
			  System.out.println(ConsoleColors.ANSI_BLUE + "Splash iPad Landscape image 2732x2048 pixels available" +ConsoleColors.ANSI_RESET);
	 		  Thread.sleep(2000);
         }else if(!checkimage){
			 System.out.println(ConsoleColors.ANSI_BLUE + "Splash Not available iPad Landscape image 2732x2048 pixels" +ConsoleColors.ANSI_RESET);
 			 JavascriptExecutor jss = (JavascriptExecutor) driver;
             jss.executeScript("window.scrollBy(0,200)");
     	     Thread.sleep(1000);
      	
     	     Actions Addsplash=new Actions(driver);
     	     Addsplash.moveToElement(importIpadlandscapeimage).click().build().perform();	 
             Thread.sleep(2000);
          flib.uploadFileWithRobot("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\GBBranding\\AppBranding\\Splash_Welcome\\ipadlandscape");
          System.out.println(ConsoleColors.ANSI_GREEN + "Splash New Ipad Landscape image 2732x2048 pixels is available" +ConsoleColors.ANSI_RESET);
          Thread.sleep(2000); 
         }
	   }
 	   
    
//   	   public void Deletesplashporttaitverify() throws Throwable {
//  	    	      boolean checkimage1=CheckIpadportatitimage.isDisplayed();
//  	 		      if(checkimage1){
//  	 			    System.out.println(ConsoleColors.ANSI_BLUE + "Ipad Portait image 2048x2732 pixels is available" +ConsoleColors.ANSI_RESET);
//  	   	            Actions deletesplashport=new Actions(driver);
//  	   	            deletesplashport.moveToElement(CheckIpadportatitimage);
//  	 			    JavascriptExecutor executor1 = (JavascriptExecutor)driver;
//  	 			    executor1.executeScript("arguments[0].click();", CheckIpadportatitimage);
//  	 			    Thread.sleep(2000);
//  	              }else if(!checkimage1){
//    	 			System.out.println(ConsoleColors.ANSI_BLUE + "Not Available Ipad Portait image 2048x2732 pixels" +ConsoleColors.ANSI_RESET);
//   	              }
//  	  	  } 
//   	      public void importipadportaitimage() throws Throwable {
//   	    	      boolean checkimage1=CheckIpadportatitimage.isDisplayed();
//   	    	      try{
//   	    	    	  if(!checkimage1){
//  	   			  JavascriptExecutor jsss = (JavascriptExecutor) driver;
//  	              jsss.executeScript("window.scrollBy(0,200)");
//  	         	  Thread.sleep(1000);
//  	          	
//  	         	    Actions Addsplash1=new Actions(driver);
//  	         	    Addsplash1.moveToElement(importIpadportaitimage).click().build().perform();	 
//  	                Thread.sleep(2000);
//  	                flib.uploadFileWithRobot("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\GBBranding\\AppBranding\\Splash_Welcome\\ipadportait");
//   	    	       }
//   	    	    	 JavascriptExecutor jsssaa = (JavascriptExecutor) driver;
//   	              jsssaa.executeScript("window.scrollBy(0,1000)");
//   	         	  Thread.sleep(1000);
//   	         	  save_Splash.sendKeys(Keys.ENTER);
//   	    	      }catch(Exception e){
//    	    }
//         }
 	   
 	   
 	  public void Deletesplashporttaitverify() throws Throwable {
	      boolean checkimage1=CheckIpadportatitimage.isDisplayed();
	      if(checkimage1){
	    	  System.out.println(ConsoleColors.ANSI_BLUE + "Splash Ipad Portait image 2048x2732 pixels availble" +ConsoleColors.ANSI_RESET);
	    	  Thread.sleep(1000);
         }else if(!checkimage1){
			System.out.println(ConsoleColors.ANSI_BLUE + "Splash Not Available Ipad Portait image 2048x2732 pixels" +ConsoleColors.ANSI_RESET);
			JavascriptExecutor jsss = (JavascriptExecutor) driver;
	        jsss.executeScript("window.scrollBy(0,200)");
	   	    Thread.sleep(1000);
	    	
	   	    Actions Addsplash1=new Actions(driver);
	   	    Addsplash1.moveToElement(importIpadportaitimage).click().build().perform();	 
	        Thread.sleep(2000);
	      flib.uploadFileWithRobot("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\GBBranding\\AppBranding\\Splash_Welcome\\ipadportait");
          System.out.println(ConsoleColors.ANSI_GREEN + "Splash New Ipad portait image 2048x2732 pixels is available" +ConsoleColors.ANSI_RESET);
	   	  Thread.sleep(1000);
          }
       } 
  		 
 	   
//   	     public void DeletesplashIphone() throws Throwable {
//   	    	    JavascriptExecutor jsssn = (JavascriptExecutor) driver;
//                jsssn.executeScript("window.scrollBy(0,600)");
//       	        Thread.sleep(1000);
//       	        
//	    	    boolean checkimage2=CheckIhoneimage.isDisplayed();
//	 		      if(checkimage2){
//	 			    System.out.println(ConsoleColors.ANSI_BLUE + "Ipad iPhone image 1440 x 2560 pixels is available" +ConsoleColors.ANSI_RESET);
//	   	            Actions deletesplashiphone=new Actions(driver);
//	   	            deletesplashiphone.moveToElement(CheckIhoneimage);
//	 			    JavascriptExecutor executor1 = (JavascriptExecutor)driver;
//	 			    executor1.executeScript("arguments[0].click();", CheckIhoneimage);
//	 			    Thread.sleep(2000);
//	              } else if(!checkimage2){
//		 			System.out.println(ConsoleColors.ANSI_BLUE + "Not available Ipad iPhone image 1440 x 2560 pixels" +ConsoleColors.ANSI_RESET);
// 	              }
//	  	  } 
//	      public void importihoneimage() throws Throwable {
//	    	    boolean checkimage2=CheckIhoneimage.isDisplayed();
// 	    	  try{
//	    		  if(!checkimage2){
//	   			  JavascriptExecutor jsssa = (JavascriptExecutor) driver;
//	              jsssa.executeScript("window.scrollBy(0,800)");
//	         	  Thread.sleep(1000);
//	          	
//	         	    Actions Addsplash2=new Actions(driver);
//	         	    Addsplash2.moveToElement(importIpadiphoneimage).click().build().perform();	 
//	                Thread.sleep(2000);
//	                //String iphoneimage=flib.getexcelData("EventSetup", 1, 12);
//	                flib.uploadFileWithRobot("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\GBBranding\\AppBranding\\Splash_Welcome\\iphone");
//	    		  }
//	    		  JavascriptExecutor jsssaa = (JavascriptExecutor) driver;
//	              jsssaa.executeScript("window.scrollBy(0,1000)");
//	         	  Thread.sleep(1000);
//	         	  save_Splash.sendKeys(Keys.ENTER);
//	    	  }catch(Exception e){
// 	    	  }
//          }
 	  
 	  
 	  
 	 public void DeletesplashIphone() throws Throwable {
	    JavascriptExecutor jsssn = (JavascriptExecutor) driver;
        jsssn.executeScript("window.scrollBy(0,600)");
        Thread.sleep(1000);
        
	    boolean checkimage2=CheckIhoneimage.isDisplayed();
	      if(checkimage2){
		    System.out.println(ConsoleColors.ANSI_BLUE + "Splash Ipad iPhone image 1440 x 2560 pixels is available" +ConsoleColors.ANSI_RESET);
	        Thread.sleep(1000); 
         }else if(!checkimage2){
			System.out.println(ConsoleColors.ANSI_BLUE + "Splash Not available Ipad iPhone image 1440 x 2560 pixels" +ConsoleColors.ANSI_RESET);
			JavascriptExecutor jsssa = (JavascriptExecutor) driver;
		    jsssa.executeScript("window.scrollBy(0,800)");
		  	Thread.sleep(1000);
		   	
		    Actions Addsplash2=new Actions(driver);
		  	Addsplash2.moveToElement(importIpadiphoneimage).click().build().perform();	 
		    Thread.sleep(2000);
		    //String iphoneimage=flib.getexcelData("EventSetup", 1, 12);
		   flib.uploadFileWithRobot("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\GBBranding\\AppBranding\\Splash_Welcome\\iphone");
	       System.out.println(ConsoleColors.ANSI_GREEN + "Splash New Ipad iPhone image 1440x2560 pixels is available" +ConsoleColors.ANSI_RESET);
	       Thread.sleep(1000);
         }
 } 
  		 
 	  
//	      public void DeletesplashIphoneX() throws Throwable {
//	    	  
//	    	  JavaScriptExecutorConcept.scrollIntoParticularElement();
//	    	  Thread.sleep(1000);
//	    	  
//	    	  boolean checkimage3=CheckIhoneimageX.isDisplayed();
// 		      if(checkimage3){
// 			    System.out.println(ConsoleColors.ANSI_BLUE + "Ipad iPhoneX image 1125x2436 pixels is available" +ConsoleColors.ANSI_RESET);
//   	            Actions deletesplashiphonex=new Actions(driver);
//   	            deletesplashiphonex.moveToElement(CheckIhoneimageX);
// 			    JavascriptExecutor executor11 = (JavascriptExecutor)driver;
// 			    executor11.executeScript("arguments[0].click();", CheckIhoneimageX);
// 			    Thread.sleep(2000);
//              } else if(!checkimage3){
//   			    System.out.println(ConsoleColors.ANSI_BLUE + "Notavailable Ipad iPhoneX image 1125x2436 pixels" +ConsoleColors.ANSI_RESET);
//              }
// 	  	  } 
//	      public void importihoneimageX() throws Throwable {
//	    	  boolean checkimage3=CheckIhoneimageX.isDisplayed();
// 	    	  try{
//	    		  if(!checkimage3){
//	    	  JavaScriptExecutorConcept.scrollIntoParticularElement();
//	    	  Thread.sleep(1000);
//          	
//         	    Actions Addsplash3=new Actions(driver);
//         	    Addsplash3.moveToElement(importIpadiphoneXimage).click().build().perform();	 
//                Thread.sleep(2000);
//                //String iphoneimage=flib.getexcelData("EventSetup", 1, 12);
//                flib.uploadFileWithRobot("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\GBBranding\\AppBranding\\Splash_Welcome\\iphoneX");
//	    	   }
//	    		  JavascriptExecutor jsssaa = (JavascriptExecutor) driver;
//	              jsssaa.executeScript("window.scrollBy(0,1000)");
//	         	  Thread.sleep(1000);
//	         	  save_Splash.sendKeys(Keys.ENTER);
//	    	  }catch(Exception e){
// 	    	  }
//          }
 	 
 	 
 	    public static boolean checkimage3;
 	    public void DeletesplashIphoneX() throws Throwable {
    	     JavaScriptExecutorConcept.scrollIntoParticularElement();
   	         Thread.sleep(1000);
   	  
   	      checkimage3=CheckIhoneimageX.isDisplayed();
	      if(checkimage3){
		    System.out.println(ConsoleColors.ANSI_BLUE + "Splash Ipad iPhoneX image 1125x2436 pixels is available" +ConsoleColors.ANSI_RESET);
		    Thread.sleep(1000);   
         }else if(!checkimage3){
			    System.out.println(ConsoleColors.ANSI_BLUE + "Splash Not available Ipad iPhoneX image 1125x2436 pixels" +ConsoleColors.ANSI_RESET);
			    JavaScriptExecutorConcept.scrollIntoParticularElement();
			   	Thread.sleep(1000);
			   	
			   Actions Addsplash3=new Actions(driver);
		       Addsplash3.moveToElement(importIpadiphoneXimage).click().build().perform();	 
		       Thread.sleep(2000);
		       //String iphoneimage=flib.getexcelData("EventSetup", 1, 12);
 		       flib.uploadFileWithRobot("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\GBBranding\\AppBranding\\Splash_Welcome\\iphoneX");
		       System.out.println(ConsoleColors.ANSI_GREEN + "Splash New Ipad iPhoneX image 1125x2436 pixels is available" +ConsoleColors.ANSI_RESET);
		       Thread.sleep(1000);
            }
  	    } 
   	    public void SaveSplash() throws Throwable{
   	    	boolean checkimage=CheckIpadLandscapeimage.isDisplayed();
   	    	boolean checkimage1=CheckIpadportatitimage.isDisplayed();
   	        boolean checkimage2=CheckIhoneimage.isDisplayed();
   	    	boolean checkimage4=CheckIhoneimageX.isDisplayed();
 	    	  JavascriptExecutor jsssaa = (JavascriptExecutor) driver;
              jsssaa.executeScript("window.scrollBy(0,1000)");
         	  Thread.sleep(1000);
         	  
         	  try{
                if(checkimage3){
                   save_Splash.sendKeys(Keys.ENTER);
                }else if(checkimage){
                   save_Splash.sendKeys(Keys.ENTER);
                   Thread.sleep(70000);
          	    }else if(checkimage1){
                   save_Splash.sendKeys(Keys.ENTER);
                   Thread.sleep(70000);
    	        }else if(checkimage2){
                   save_Splash.sendKeys(Keys.ENTER);
                   Thread.sleep(70000);
                }else if(checkimage4){
                   save_Splash.sendKeys(Keys.ENTER);
                   Thread.sleep(70000);
                }

          	 }catch(Exception e){
          		 
          	 }
         	 finally {
            	 WebElement element = driver.findElement(By.xpath("//span[text()='Images has been saved successfully.']"));
         	     String text=element.getText();
     		     System.out.println(ConsoleColors.ANSI_GREEN + "Event Splash : " + text +ConsoleColors.ANSI_RESET);
          	  }
	     }
   	     public void navigatetoEventbackground(){
   	    	ClickonEventBackground.click();
   	     }
    	 public void SelectEventusesbackground() throws Throwable{
	    	   for(int i=0;i<=eventusesbackground.size()-1;i++){
 	    		 String eventuses=eventusesbackground.get(i).getAttribute("value");
 	    	     String backgroundtypeevent=flib.getexcelData("EventSetup", 1, 15);
  	    	     if(eventuses.equals(backgroundtypeevent.trim())){
 	    		    eventusesbackground.get(i).click();
 	    	    	break;
	    	     }else{
 	    	    	 Assert.assertEquals(eventuses, backgroundtypeevent.trim());
	    	     }
	    	   } 
	     }
  	     public void clickonImageorColorRadioButton() throws Throwable{
   	    	   for(int i=0;i<=typeofbackground.size()-1;i++){
   	    		 String aaa=typeofbackground.get(i).getAttribute("value");
    	    	 String backgroundtype=flib.getexcelData("EventSetup", 1, 13);
    	    	 if(aaa.equals(backgroundtype)){
    	    		typeofbackground.get(i).click();
    	    	 }
   	    	   }
   	     }
 	     public void SelectGalleryorImageupload() throws Throwable{
	    	 for(int i=0;i<=GalleryOrUploadimage.size()-1;i++){
  	    		 String Selecttypeimage=GalleryOrUploadimage.get(i).getText();
    	    	 String imagesOrgallery=flib.getexcelData("EventSetup", 1, 14);
 	    		 if(Selecttypeimage.equals(imagesOrgallery)){
  	    			GalleryOrUploadimage.get(i).click();
   	    		 }
 	    	 }
	    	 Thread.sleep(3000);
	     }
 	     public void importEventbackground() throws Throwable{
 	    	 boolean checkeventbackground=Deleteeventbackground.isDisplayed();
 	    	 JavaScriptExecutorConcept.scrollIntoView(uploadeventbackground1);
 	         Thread.sleep(2000);
 	    	 try{
 	    		 if(checkeventbackground){
 	    		   System.out.println(ConsoleColors.ANSI_GREEN + "Back ground image already present" + ConsoleColors.ANSI_RESET); 
 	    		 }else if(!checkeventbackground){
 	    	        JavaScriptExecutorConcept.scrollIntoView(uploadeventbackground1);
 	    	        Thread.sleep(2000);
 	    	        uploadeventbackground1.click();
 	    	        String import1=flib.getexcelData("EventSetup", 1, 12);
 	    	        flib.uploadFileWithRobot(import1); 
 	    	        WebDriverWait wait1=new WebDriverWait(driver, 20);
 	    	        wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[contains(@id,'imgDeleteIpadLandScape')]")));
 	    	        Thread.sleep(2000);
 	    	 
 	    	        JavaScriptExecutorConcept.scrollIntoView(uploadeventbackground2);
	    	        Thread.sleep(1000);
	    	        uploadeventbackground2.click();
	    	        String import2=flib.getexcelData("EventSetup", 2, 12);
 	    	        flib.uploadFileWithRobot(import2); 
 	    	        WebDriverWait wait2=new WebDriverWait(driver, 20);
 	    	        wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[contains(@id,'imgDeleteIpadPotrait')]")));
 	    	        Thread.sleep(2000);
 	    	 
 	    	        JavaScriptExecutorConcept.scrollIntoView(uploadeventbackground3);
	    	        Thread.sleep(1000);
	    	        uploadeventbackground3.click();
	    	        String import3=flib.getexcelData("EventSetup", 3, 12);
 	    	        flib.uploadFileWithRobot(import3); 
 	    	        WebDriverWait wait3=new WebDriverWait(driver, 20);
 	    	        wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[@id='ContentPlaceHolder1_imgDeleteIPhone']")));
 	    	        Thread.sleep(2000);
 	    	 
 	    	        JavaScriptExecutorConcept.scrollIntoView(uploadeventbackground4);
	    	        Thread.sleep(1000);
	    	        uploadeventbackground4.click();
	    	        String import4=flib.getexcelData("EventSetup", 4, 12);
	    	        flib.uploadFileWithRobot(import4); 
	    	        WebDriverWait wait4=new WebDriverWait(driver, 20);
	    	        wait4.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[contains(@id,'imgDeleteIPhoneX')]")));
	    	        Thread.sleep(2000);
 	    		 }
  	    	 }catch(Exception e){
  	    	 }
    	 }
 	     public void save_and_verify_sucessful_status() throws Throwable{
 	    	 JavaScriptExecutorConcept.scrollIntoView(Deleteeventbackground);
	    	 Thread.sleep(2000);
	    	 
	    	 boolean checkeventimage=Deleteeventbackground.isDisplayed();
 	    	 if(checkeventimage){
 	    	 JavaScriptExecutorConcept.scrollIntoView(save_eventbackground);
 	 	     Thread.sleep(1000);
	    	 save_eventbackground.click(); 
	    	 System.out.println(ConsoleColors.ANSI_GREEN + "EventBackground : " + "Already present" + ConsoleColors.ANSI_RESET);
 	    	 }else{
 	         JavaScriptExecutorConcept.scrollIntoView(save_eventbackground);
 	 	 	 Thread.sleep(1000);
	         save_eventbackground.click(); 
	    	 WebDriverWait wait=new WebDriverWait(driver, 50);
	    	 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@id,'UpdatePanel1')]//li//span[contains(text(),'')]")));
	    	 
	    	 String eventbackgroundmsg=verifystatus.getText();
	    	 System.out.println(ConsoleColors.ANSI_GREEN + "EventBackground : " + eventbackgroundmsg + ConsoleColors.ANSI_RESET);
	    	 } 
 	     } 
 	     public static int Countbanner;
 	     public void navigatetoBanner() throws Throwable{
 	    	 ClickonEventBanner.click();
 	    	 Thread.sleep(2000);
 	    	 
   	         Countbanner=countno_ofBanner.size();
   	         Thread.sleep(2000);
   	         
  	    	 clickonAddNew.click();
 	    	 Thread.sleep(2000);
 	     }
 	     public void importEventbanner() throws Throwable{
 	    	WebDriverWait wait1=new WebDriverWait(driver, 20);
 	        wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[contains(@name,'Banner2') and @type='file']")));
  	    	
 	        Actions act=new Actions(driver);
 	    	act.moveToElement(importbanner1).click().build().perform();
  	    	 String bannerimport1=flib.getexcelData("EventSetup", 5, 12);
 	    	 flib.uploadFileWithRobot(bannerimport1);
 	    	 Thread.sleep(2000);
 	    	 
 	    	 Actions act1=new Actions(driver);
 	    	 act1.moveToElement(importbanner2).click().build().perform();
  	    	 String bannerimport2=flib.getexcelData("EventSetup", 6, 12);
 	    	 flib.uploadFileWithRobot(bannerimport2);
 	    	 Thread.sleep(2000);
 	    	 
 	    	 JavaScriptExecutorConcept.scrollIntoView(importbanner3);
 	    	 Thread.sleep(1000);
  	    	 Actions act3=new Actions(driver);
 	    	 act3.moveToElement(importbanner3).click().build().perform();
 	    	 String bannerimport3=flib.getexcelData("EventSetup", 7, 12);
	    	 flib.uploadFileWithRobot(bannerimport3);
	    	 Thread.sleep(2000);
	    	 
	    	 JavaScriptExecutorConcept.scrollIntoView(importbanner4);
	    	 Thread.sleep(1000);
  	    	 Actions act4=new Actions(driver);
 	    	 act4.moveToElement(importbanner4).click().build().perform();
 	    	 String bannerimport4=flib.getexcelData("EventSetup", 8, 12);
	    	 flib.uploadFileWithRobot(bannerimport4);
	    	 Thread.sleep(2000);
	    	 
	    	 JavaScriptExecutorConcept.scrollIntoView(importbanner5);
	    	 Thread.sleep(1000);
  	    	 Actions act5=new Actions(driver);
 	    	 act5.moveToElement(importbanner5).click().build().perform();
 	    	 String bannerimport5=flib.getexcelData("EventSetup", 9, 12);
	    	 flib.uploadFileWithRobot(bannerimport5);
	    	 Thread.sleep(2000);
	    	 
	    	 JavaScriptExecutorConcept.scrollIntoView(importbanner6);
	    	 Thread.sleep(1000);
  	    	 Actions act6=new Actions(driver);
 	    	 act6.moveToElement(importbanner6).click().build().perform();
 	    	 String bannerimport6=flib.getexcelData("EventSetup", 10, 12);
	    	 flib.uploadFileWithRobot(bannerimport6);
	    	 Thread.sleep(2000);
	    	 
	    	 JavaScriptExecutorConcept.scrollIntoView(importbanner7);
	    	 Thread.sleep(1000);
  	    	 Actions act7=new Actions(driver);
 	    	 act7.moveToElement(importbanner7).click().build().perform();
 	    	 String bannerimport7=flib.getexcelData("EventSetup", 11, 12);
	    	 flib.uploadFileWithRobot(bannerimport7);
	    	 Thread.sleep(2000);
 	     }
 	     public void BannerAdd(){
 	    	AddBanner.click();
 	    	WebDriverWait wait=new WebDriverWait(driver, 20);
 	    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper clearfix brdcun-wrap']//a[text()='Event Banner']")));
   	    	
  	    	int checkbanner=countno_ofBanner.size();
    	    	 if(Countbanner+1==checkbanner){
  	    		    System.out.println(ConsoleColors.ANSI_GREEN + "New Banner Added Sucessfully" +ConsoleColors.ANSI_RESET);
  	    	    }else {
  	    		    System.out.println(ConsoleColors.ANSI_GREEN + "New Banner Not Added" +ConsoleColors.ANSI_RESET);
			  }
  	     }
 	     public void navigateAppMenu() {
 	    	clickonappMenu.click();
 	     }
 	     public void navigateResourse() {
 	    	clickonResourse.click();
 	     } 
   	     public void SearchresourseLink(String title,String link) throws Throwable {
   	    	    Select sel=new Select(SearchResourseType);
  	    	    SearchResourseType.click();
  	    	    sel.selectByVisibleText("Link");
  	    	    Thread.sleep(3000);
  	    	  try{ 
  	    		 boolean flag=true;
   	    	     if(Norecordsfound.getText().contains("No Records Found.")){
      	            System.out.println(ConsoleColors.ANSI_RED + Norecordsfound.getText() + "==>.Please Add Link Resourses" +ConsoleColors.ANSI_RESET +flag);
      	            clickonAddnewResourse.click();
      	            Select sele=new Select(ResourseType);
  	  	            ResourseType.click();
  	  	            sele.selectByVisibleText("Link");
  	  	            
  	  	         Actions act=new Actions(driver);
	  	         act.moveToElement(ResourseTitle).click().build().perform();	   
 	    	     ResourseTitle.sendKeys(title);
 	    	     ResourseLink.sendKeys(link);
 	    	     
 	    	     SaveResourseLink.click();
 	    	     Thread.sleep(2000);
 	    	     
   	   	         Alert alt=driver.switchTo().alert();
   	   	         String s=alt.getText();
   	   	         System.out.println(s);
   	   	        
   	   	         Assert.assertEquals(alt.getText(), "Resource saved successfully.");
   	    	     alt.accept();
  	    	     }
  	    	  }catch(Exception e){
   	    	  }finally{
    	    		if(AllResourses.getAttribute("value").contains(title)){
        	    	System.out.println(ConsoleColors.ANSI_GREEN+ AllResourses.getAttribute("value") + " ==>> Link Resourses are available "+ConsoleColors.ANSI_RESET);   	    	     
    	    	    Reporter.log(AllResourses.getAttribute("value") + " ==>> Link Resourses are available ",true);
    	    		}
   	    	  }
   	     }
   	     public void SearchresourseFile() throws Throwable {
   	    	    WebDriverUtils.waitforElementpresent(driver, SearchResourseType);
   	    	    
	    	    Select sel=new Select(SearchResourseType);
    	        SearchResourseType.click();
    	        sel.selectByVisibleText("File");
  	    			 
    	     try{ 
    		    boolean flag=true;
    		   
	    	    if(Norecordsfound.getText().contains("No Records Found.")){
	            System.out.println(ConsoleColors.ANSI_RED + Norecordsfound.getText() + "==>.Please Add File Resourses" +ConsoleColors.ANSI_RESET +flag);
   	            
   	            Select sele=new Select(ResourseType);
 	            ResourseType.click();
 	            sele.selectByVisibleText("File");

                WebDriverUtils.waitforElementpresent(driver, clickonAddnewResoursefile);
                clickonAddnewResoursefile.click();
                
                String fileresourse=flib.getexcelData("EventSetup", 12, 12);
                flib.uploadFileWithRobot(fileresourse);
  	            
                WebDriverWait w=new WebDriverWait(driver, 60);
                w.until(ExpectedConditions.alertIsPresent());
         
  	   	         Alert alt=driver.switchTo().alert();
	   	         String s=alt.getText();
	   	         System.out.println(s);
	   	        
	   	         
	   	         Assert.assertEquals(alt.getText(), "Total : 1 file(s) uploaded successfully.");
	    	     alt.accept();
	    	     System.out.println(alt.getText());
    	         }
    	     }catch(Exception e){
	         }finally{
	    		  String filereso=AllResourses.getAttribute("value");
	    		  SoftAssert as=new SoftAssert();
	    		  as.assertEquals(AllResourses.getAttribute("value"), filereso);
     	    	  System.out.println(ConsoleColors.ANSI_GREEN+ AllResourses.getAttribute("value") + " ==>> File Resourses are available "+ConsoleColors.ANSI_RESET);   	    	     
 	              Reporter.log(AllResourses.getAttribute("value") + " ==>> File Resourses are available ",true);
	         }
     	 }
   	     public void SearchresourseVideo() throws Throwable {
	    	    WebDriverUtils.waitforElementpresent(driver, SearchResourseType);
   	            Select sel=new Select(SearchResourseType);
	            SearchResourseType.click();
	            sel.selectByVisibleText("Video");
    			 
	       try{ 
		      boolean flag=true;
   	          if(Norecordsfound.getText().contains("No Records Found.")){
              System.out.println(ConsoleColors.ANSI_RED + Norecordsfound.getText() + "==>.Please Add video Resourses" +ConsoleColors.ANSI_RESET +flag);
	            
	          Select sele=new Select(ResourseType);
              ResourseType.click();
              sele.selectByVisibleText("File");

              WebDriverUtils.waitforElementpresent(driver, clickonAddnewResoursefile);
              clickonAddnewResoursefile.click();
          
              String fileresourse=flib.getexcelData("EventSetup", 13, 12);
              flib.uploadFileWithRobot(fileresourse);
            
              WebDriverWait w=new WebDriverWait(driver, 60);
              w.until(ExpectedConditions.alertIsPresent());
   
   	           Alert alt=driver.switchTo().alert();
 	           String s=alt.getText();
 	           System.out.println(s);
 	        
 	         
 	           Assert.assertEquals(alt.getText(), "Total : 1 file(s) uploaded successfully.");
  	           alt.accept();
  	           System.out.println(alt.getText());
	           }
	       }catch(Exception e){
           }finally{
  		       String filereso=AllResourses.getAttribute("value");
  		       SoftAssert as=new SoftAssert();
  		       as.assertEquals(AllResourses.getAttribute("value"), filereso);
	    	   System.out.println(ConsoleColors.ANSI_GREEN+ AllResourses.getAttribute("value") + " ==>> Video Resourses are available "+ConsoleColors.ANSI_RESET); 
	    	   Reporter.log(AllResourses.getAttribute("value") + " ==>> Video Resourses are available",true);
            }
	     }
   	     public void NavigateToManageAMenuItem(){
   	    	clickonManageMenuItem.click();
   	     }
   	     public void SelectCategoryManageMenu(){
   	    	Select sel=new Select(CategorymanageMenu);
   	    	CategorymanageMenu.click();
   	    	sel.selectByVisibleText("Agenda");
   	     }
   	     public void CheckAgenda() throws Throwable{
   	    	 
   	     List<WebElement> wb=driver.findElements(By.xpath(".//table[contains(@id,'gvMenu')]//tbody//tr//td[1]//a"));
   	     List<WebElement> wb1=driver.findElements(By.xpath(".//table[contains(@id,'gvMenu')]//tbody//tr//td[5]//input"));
   	     
//    	  boolean flag = false;
// 		  for(WebElement item : wb)
//		  {
// 			List<WebElement> wb11=driver.findElements(By.xpath(".//table[contains(@id,'gvMenu')]//tbody//tr//td[5]//input"));
// 			for(WebElement ww:wb11){
// 				//  + ": " +ww.getAttribute("data-tooltip")
   	     
// 			if(item.getText().equals("Exhibitors")) {    		
// 				System.out.println(item.getText() + ": " +ww.getAttribute("data-tooltip"));
// 				flag=true;
//  			}
// 			else if(item.getText().equals("Schedule")){
// 				System.out.println(item.getText()  + ": " +ww.getAttribute("data-tooltip"));
// 				flag=true;
//  			}
//            else if(item.getText().equals("Speakers")){
//             	System.out.println(item.getText()  + ": " +ww.getAttribute("data-tooltip"));
//             	flag=true;
//  			}
//            else if(item.getText().equals("Sponsors")){
//             	System.out.println(item.getText()  + ": " +ww.getAttribute("data-tooltip"));
//             	flag=true;
//             }
//            else if(item.getText().equals("Survey")){
//             	System.out.println(item.getText()  + ": " +ww.getAttribute("data-tooltip"));
//             	flag=true;
//             }
//			 break;
//    		    }
// 			// break;
// 		  }
//   	 
 		  
   	 
  	     
   	    	 for(int j=0;j<=wb.size()-1;j++){
       	       for(int i=0;i<=wb1.size()-1;i++){
        	    	
       	    	 String firstindex = wb.get(0).getText(); 
       	    	 String secondindex= wb.get(1).getText();  
       	    	 String thirdindex = wb.get(2).getText();
       	    	 String fourthindex= wb.get(3).getText();
       	    	 String fifthindex = wb.get(4).getText();
       	    	 
       	    	 String firstindexPublish = wb1.get(0).getAttribute("data-tooltip");
       	    	 String secondindexPublish= wb1.get(1).getAttribute("data-tooltip"); 
       	    	 String thirdindexPublish = wb1.get(2).getAttribute("data-tooltip");
       	    	 String fourthindexPublish= wb1.get(3).getAttribute("data-tooltip");
       	    	 String fifthindexPublish = wb1.get(4).getAttribute("data-tooltip");
       	    	 
//       	    	 
//        	     flib.WritesetexcelData("DataCompaire1", 1, 0, firstindexPublish);
//        	     flib.WritesetexcelData("DataCompaire1", 1, 1, secondindexPublish); 
//       	    	 flib.WritesetexcelData("DataCompaire1", 1, 2, thirdindexPublish); 
//       	    	 flib.WritesetexcelData("DataCompaire1", 1, 3, fourthindexPublish); 
//      	    	 flib.WritesetexcelData("DataCompaire1", 1, 4, fifthindexPublish); 
       	    	   
      	    		System.out.println(firstindex  + " : " + firstindexPublish);
     	    		System.out.println(secondindex + " : " + secondindexPublish);
     	    		System.out.println(thirdindex  + " : " + thirdindexPublish);
     	    		System.out.println(fourthindex + " : " + fourthindexPublish);
     	    		System.out.println(fifthindex  + " : " + fifthindexPublish);
     	    		break;
       	          }
     	    		break;
     	    	}
       	   
   	    	
   	     }
   }
