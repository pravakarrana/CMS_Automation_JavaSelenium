package Com.E2M.ObjectRepository;

    
 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import Com.E2M.GenericLibraries.Baseclass_libraries;

public class Usermanagementpage extends Baseclass_libraries{
	//WebElement Locators
	@FindBy(xpath="//a[text()='Add']")
	private WebElement ClickAdduser;
	
	@FindBy(xpath="//input[contains(@id,'btnImport')]")
	private WebElement ClickImport;
	
	@FindBy(xpath="//input[contains(@name,'fileupload')]")
	private WebElement Clickuploadfile;
	
	@FindBy(xpath="//input[contains(@name,'fileupload2')]")
	private WebElement ClickuploadfileZip2;
	
	@FindBy(xpath="//input[contains(@name,'fileupload3')]")
	private WebElement ClickuploadfileZip3;
	
	@FindBy(xpath="//input[contains(@name,'fileupload1')]")
	private WebElement ClickuploadfileZip;
    
	@FindBy(xpath="//input[contains(@name,'fileupload')]")
	private WebElement upl;
	
	@FindBy(xpath="//input[contains(@id,'fuNewLogo')]")
    private WebElement Uploadimage;
	
    @FindBy(xpath="//a[@id='anchorFileUpload']")
    private WebElement allimageupload;
    
    @FindBy(xpath="//img[contains(@id,'iphonelandscape')]")
    private WebElement alliPhoneimageuploadVerify; 
    
    @FindBy(xpath="//div[contains(@class,'iPhonediv')]")
    private WebElement alliPhoneimageuploadVerify1;
    
    @FindBy(xpath="//span[contains(text(),'iPhone X Images')]")
    private WebElement clickiPhoneXimageupload; 
    
    @FindBy(xpath="//img[contains(@id,'iphoneXlandscape')]")
    private WebElement iphoneXimageuploadVerify; 
    
    @FindBy(xpath="//span[contains(text(),'All Android Images')]")
    private WebElement clickallandroidimageupload;  
    
    @FindBy(xpath="//img[contains(@id,'androidlandscape')]")
    private WebElement alliandroidimageuploadVerify;
    
    @FindBy(xpath="//span[contains(text(),'iPad Portrait Images')]")
    private WebElement clickIpadportimageupload;
    
    @FindBy(xpath="//img[contains(@id,'ipadlandscape')]")
    private WebElement ipadportimageuploadVerify;
    
    @FindBy(xpath="//span[contains(text(),'iPad Landscape Images')]")
    private WebElement clicklandscapeportimageupload;
    
    @FindBy(xpath="//img[contains(@id,'ipadNext')]")
    private WebElement ipadlandscapeimageuploadVerify;
	 
	
	
	
	
	//Utilization methods
 	public void ClickOnAddUsers()   {
		ClickAdduser.click();
	}	
	public void ClickOnImport() throws InterruptedException    {
		ClickImport.click();
		Thread.sleep(2000);
	}
	public void OnlyClickOnUpload() throws InterruptedException, Throwable    {
		Actions act=new Actions(driver);
 		act.moveToElement(Clickuploadfile).click().build().perform();	 
        Thread.sleep(2000);
		   StringSelection ss=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\BulkUpload\\ImportUser_Template");
	       Toolkit tk=Toolkit.getDefaultToolkit();
	       Clipboard cb=tk.getSystemClipboard();
	       cb.setContents(ss, null);
	       
	       Robot robot=new Robot();
	       robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	       robot.keyPress(java.awt.event.KeyEvent.VK_V);
	       Thread.sleep(500);
	       
	       robot.keyRelease(java.awt.event.KeyEvent.VK_V);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	       Thread.sleep(500);
      
	       robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
	}
	public void OnlyClickOnUpload_Usefulinfo() throws InterruptedException, Throwable    {
		Actions act=new Actions(driver);
 		act.moveToElement(Clickuploadfile).click().build().perform();	 
        Thread.sleep(2000);
		   StringSelection ss=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\BulkUpload\\UsefulInfoImportTemplate");
	       Toolkit tk=Toolkit.getDefaultToolkit();
	       Clipboard cb=tk.getSystemClipboard();
	       cb.setContents(ss, null);
	       
	       Robot robot=new Robot();
	       robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	       robot.keyPress(java.awt.event.KeyEvent.VK_V);
	       Thread.sleep(500);
	       
	       robot.keyRelease(java.awt.event.KeyEvent.VK_V);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	       Thread.sleep(500);
      
	       robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
	}
	public void  ClickOnUpload_Session_exhibitor_sponsor_match() throws InterruptedException, Throwable    {
		   Actions fileupload=new Actions(driver);
		           fileupload.moveToElement(Clickuploadfile).click().build().perform();	 
                   Thread.sleep(2000);
		     StringSelection ss=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\BulkUpload\\E2MDataImportTemplate_New");
	         Toolkit tk=Toolkit.getDefaultToolkit();
	         Clipboard cb=tk.getSystemClipboard();
	         cb.setContents(ss, null);
	       
	         Robot robot=new Robot();
	         robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	         robot.keyPress(java.awt.event.KeyEvent.VK_V);
	         Thread.sleep(500);
	       
	         robot.keyRelease(java.awt.event.KeyEvent.VK_V);
	         robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	         Thread.sleep(500);
      
	         robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	         robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	         Thread.sleep(3000);
	       
	       Actions fileupload1=new Actions(driver);
	               fileupload1.moveToElement(ClickuploadfileZip).click().build().perform();	 
	               Thread.sleep(2000);
	         StringSelection sss=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\BulkUpload\\Speakers");
		     Toolkit tkk=Toolkit.getDefaultToolkit();
		     Clipboard cbb=tkk.getSystemClipboard();
		     cbb.setContents(sss, null);
		       
		     Robot robot1=new Robot();
		     robot1.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		     robot1.keyPress(java.awt.event.KeyEvent.VK_V);
		     Thread.sleep(500);
		       
		     robot1.keyRelease(java.awt.event.KeyEvent.VK_V);
		     robot1.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		     Thread.sleep(500);
	      
		     robot1.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		     robot1.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		     Thread.sleep(3000);
		       
		   Actions fileupload2=new Actions(driver);
			       fileupload2.moveToElement(ClickuploadfileZip2).click().build().perform();	 
			       Thread.sleep(2000);
			 StringSelection ssss=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\BulkUpload\\exhibitors");
		     Toolkit tkkk=Toolkit.getDefaultToolkit();
			 Clipboard cbbb=tkkk.getSystemClipboard();
			 cbbb.setContents(ssss, null);
				       
			 Robot robot2=new Robot();
			 robot2.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			 robot2.keyPress(java.awt.event.KeyEvent.VK_V);
			 Thread.sleep(500);
				       
			 robot2.keyRelease(java.awt.event.KeyEvent.VK_V);
			 robot2.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			 Thread.sleep(500);
			      
			 robot2.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			 robot2.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
			 Thread.sleep(3000);
			 
		  Actions fileupload5=new Actions(driver);
		          fileupload5.moveToElement(ClickuploadfileZip3).click().build().perform();	 
		          Thread.sleep(2000);
		   StringSelection file4=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\BulkUpload\\Sponsors");
	       Toolkit toolkit=Toolkit.getDefaultToolkit();
		   Clipboard clipbd=toolkit.getSystemClipboard();
		   clipbd.setContents(file4, null);
			       
		   Robot robo=new Robot();
		   robo.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
		   robo.keyPress(java.awt.event.KeyEvent.VK_V);
		   Thread.sleep(500);
			       
		   robo.keyRelease(java.awt.event.KeyEvent.VK_V);
		   robo.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
		   Thread.sleep(500);
		      
		   robo.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		   robo.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
		   Thread.sleep(3000);
	}
	public void OnlyClickOnUploadBLK() throws InterruptedException, Throwable    {
		Actions act=new Actions(driver);
 		act.moveToElement(Clickuploadfile).click().build().perform();	 
        Thread.sleep(2000);
		   StringSelection ss=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\BulkUpload\\ImportUser_Template");
	       Toolkit tk=Toolkit.getDefaultToolkit();
	       Clipboard cb=tk.getSystemClipboard();
	       cb.setContents(ss, null);
	       
	       Robot robot=new Robot();
	       robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	       robot.keyPress(java.awt.event.KeyEvent.VK_V);
	       Thread.sleep(500);
	       
	       robot.keyRelease(java.awt.event.KeyEvent.VK_V);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	       Thread.sleep(500);
      
	       robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
	}	
	public void ClickOnUpload() throws InterruptedException, Throwable    {
		Actions act=new Actions(driver);
 		act.moveToElement(Clickuploadfile).click().build().perform();	 
        Thread.sleep(2000);
		   StringSelection ss=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\ImportUser_Template-TC_07");
	       Toolkit tk=Toolkit.getDefaultToolkit();
	       Clipboard cb=tk.getSystemClipboard();
	       cb.setContents(ss, null);
	       
	       Robot robot=new Robot();
	       robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	       robot.keyPress(java.awt.event.KeyEvent.VK_V);
	       Thread.sleep(500);
	       
	       robot.keyRelease(java.awt.event.KeyEvent.VK_V);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	       Thread.sleep(500);
      
	       robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
	}	
	public void ClickOnUploadZip() throws InterruptedException, Throwable    {
		Actions act=new Actions(driver);
 		act.moveToElement(ClickuploadfileZip).click().build().perform();	 
        Thread.sleep(2000);
		   StringSelection ss=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\Marvel-Transparent.zip");
	       Toolkit tk=Toolkit.getDefaultToolkit();
	       Clipboard cb=tk.getSystemClipboard();
	       cb.setContents(ss, null);
	       
	       Robot robot=new Robot();
	       robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	       robot.keyPress(java.awt.event.KeyEvent.VK_V);
	       Thread.sleep(500);
	       
	       robot.keyRelease(java.awt.event.KeyEvent.VK_V);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	       Thread.sleep(500);
      
	       robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	       robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
	}	
	public void ClickOnUploadSociallink() throws InterruptedException, Throwable    {
		Actions actaa=new Actions(driver);
		actaa.moveToElement(Uploadimage).click().build().perform();	 
        Thread.sleep(2000);
        
		   StringSelection socialstring=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\instagram");
	       Toolkit socialtk=Toolkit.getDefaultToolkit();
	       Clipboard socialcb=socialtk.getSystemClipboard();
	       socialcb.setContents(socialstring, null);
	       
	       Robot socialrobot=new Robot();
	       socialrobot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
	       socialrobot.keyPress(java.awt.event.KeyEvent.VK_V);
	       Thread.sleep(500);
	       
	       socialrobot.keyRelease(java.awt.event.KeyEvent.VK_V);
	       socialrobot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
	       Thread.sleep(500);
      
	       socialrobot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
	       socialrobot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
        
	}
	public void AlliPhoneImageupload() throws InterruptedException, Throwable    {
		Actions Allphone=new Actions(driver);
		Allphone.moveToElement(allimageupload).click().build().perform();	 
        Thread.sleep(2000);
       
		   StringSelection alliphoneimages=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\alliphoneimages");
	       Toolkit alliphonetk=Toolkit.getDefaultToolkit();
	       Clipboard alliphonecb=alliphonetk.getSystemClipboard();
	       alliphonecb.setContents(alliphoneimages, null);
	       
 	       Robot alliphonerobot = null;
 	       try {
	        alliphonerobot=new Robot();
	       }catch (AWTException e) {
	    	   e.printStackTrace();
 		   }
	        alliphonerobot.delay(250);
	        alliphonerobot.keyPress(KeyEvent.VK_ENTER);
	        alliphonerobot.keyRelease(KeyEvent.VK_ENTER);
	        alliphonerobot.keyPress(KeyEvent.VK_CONTROL);
	        alliphonerobot.keyPress(KeyEvent.VK_V);
  	        alliphonerobot.keyRelease(KeyEvent.VK_V);
	        alliphonerobot.keyRelease(KeyEvent.VK_CONTROL);
 	        alliphonerobot.keyPress(KeyEvent.VK_ENTER);
	        alliphonerobot.delay(150);
 	        alliphonerobot.keyRelease(KeyEvent.VK_ENTER);
         
	}
	public void iPhoneXImageupload() throws InterruptedException, Throwable    {
		JavascriptExecutor jss = (JavascriptExecutor) driver; 
        jss.executeScript("window.scrollBy(0,1000)");
   	    Thread.sleep(1000);
   	    
   	    try {
		    WebDriverWait waitforelement=new WebDriverWait(driver, 20);
    	    waitforelement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@id,'iphonelandscape')]")));
   	    }catch (Exception e) {
   	    	WebDriverWait waitforelement=new WebDriverWait(driver, 20);
   	    	waitforelement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'iPhonediv')]")));	 
		}
   	    try {
    	    boolean img=alliPhoneimageuploadVerify.isDisplayed();
    	    Assert.assertEquals(true, img);
    	    System.out.println(img + " :All iPhone Image Showing");
   	    }catch (Exception e) {
   	    	boolean img=alliPhoneimageuploadVerify1.isDisplayed();
   	    	Assert.assertEquals(true, img);
   	    	System.out.println(img + " :All iPhone Image Showing For Test");	 
		}
    	clickiPhoneXimageupload.click();
    	
		Actions phoneX=new Actions(driver);
		phoneX.moveToElement(allimageupload).click().build().perform();	 
        Thread.sleep(2000);
        
		   StringSelection iphoneXimages=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\iphone x");
	       Toolkit iphoneXtk=Toolkit.getDefaultToolkit();
	       Clipboard iphoneXcb=iphoneXtk.getSystemClipboard();
	       iphoneXcb.setContents(iphoneXimages, null);
	       
	       Robot iphoneXrobot=null;
	       try {
	        iphoneXrobot=new Robot();
	       }catch (AWTException e) {
	    	   e.printStackTrace();
 		   }
	        iphoneXrobot.delay(250);
	        iphoneXrobot.keyPress(KeyEvent.VK_ENTER);
	        iphoneXrobot.keyRelease(KeyEvent.VK_ENTER);
	        iphoneXrobot.keyPress(KeyEvent.VK_CONTROL);
	        iphoneXrobot.keyPress(KeyEvent.VK_V);
 	        iphoneXrobot.keyRelease(KeyEvent.VK_V);
	        iphoneXrobot.keyRelease(KeyEvent.VK_CONTROL);
 	        iphoneXrobot.keyPress(KeyEvent.VK_ENTER);
 	        iphoneXrobot.delay(150);
	        iphoneXrobot.keyRelease(KeyEvent.VK_ENTER);
 	}
	public void AllandroidImageupload() throws InterruptedException, Throwable    {
		JavascriptExecutor andr = (JavascriptExecutor) driver;
		andr.executeScript("window.scrollBy(0,1000)");
   	    Thread.sleep(1000);
   	   
   	    try {
		    WebDriverWait waitforelement=new WebDriverWait(driver, 20);
    	    waitforelement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@id,'iphoneXlandscape')]")));
   	    }catch (Exception e) {
   	    	WebDriverWait waitforelement=new WebDriverWait(driver, 20);
   	    	waitforelement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'iPhonediv')]")));	 
		}
   	    try {
    	    boolean img=iphoneXimageuploadVerify.isDisplayed();
    	    Assert.assertEquals(true, img);
    	    System.out.println(img + " : iPhone X Image Showing");
   	    }catch (Exception e) {
   	    	boolean img=alliPhoneimageuploadVerify1.isDisplayed();
   	    	Assert.assertEquals(true, img);
   	    	System.out.println(img + " : iPhone X Image Showing for test");	
		}
    	clickallandroidimageupload.click();
    	
		Actions android=new Actions(driver);
		android.moveToElement(allimageupload).click().build().perform();	 
        Thread.sleep(2000);
       
		   StringSelection allandroid=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\android images");
	       Toolkit androidtk=Toolkit.getDefaultToolkit();
	       Clipboard androidcb=androidtk.getSystemClipboard();
	       androidcb.setContents(allandroid, null);
	       Robot androidrobot=null;
	       try {
	        androidrobot=new Robot();
	       }catch (AWTException e) {
	    	   e.printStackTrace();
 		   }
	       androidrobot.delay(250);
	       androidrobot.keyPress(KeyEvent.VK_ENTER);
	       androidrobot.keyRelease(KeyEvent.VK_ENTER);
	       androidrobot.keyPress(KeyEvent.VK_CONTROL);
	       androidrobot.keyPress(KeyEvent.VK_V);
 	       androidrobot.keyRelease(KeyEvent.VK_V);
	       androidrobot.keyRelease(KeyEvent.VK_CONTROL);
 	       androidrobot.keyPress(KeyEvent.VK_ENTER);
	       androidrobot.delay(150);
 	       androidrobot.keyRelease(KeyEvent.VK_ENTER);
         
	}
	public void IpadportaitImageupload() throws InterruptedException, Throwable    {
		JavascriptExecutor ipadport = (JavascriptExecutor) driver;
		ipadport.executeScript("window.scrollBy(0,1000)");
   	    Thread.sleep(1000);
   	    
		WebDriverWait waitforelement=new WebDriverWait(driver, 20);
    	waitforelement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@id,'androidlandscape')]")));
		
    	boolean img=alliandroidimageuploadVerify.isDisplayed();
    	Assert.assertEquals(true, img);
    	System.out.println(img + " : Android Image Showing");
     	
    	clickIpadportimageupload.click();
 		Actions ipadportm=new Actions(driver);
		ipadportm.moveToElement(allimageupload).click().build().perform();	 
        Thread.sleep(2000);
      
		   StringSelection ipadportmode=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\ipad");
	       Toolkit ipadtk=Toolkit.getDefaultToolkit();
	       Clipboard ipadcb=ipadtk.getSystemClipboard();
	       ipadcb.setContents(ipadportmode, null);
	       
	       Robot ipadporobot = null;
	       try {
	        ipadporobot=new Robot();
	       }catch (AWTException  e) {
			e.printStackTrace();
		   }  
	       ipadporobot.delay(250);
	       ipadporobot.keyPress(KeyEvent.VK_ENTER);
	       ipadporobot.keyRelease(KeyEvent.VK_ENTER);
	       ipadporobot.keyPress(KeyEvent.VK_CONTROL);
	       ipadporobot.keyPress(KeyEvent.VK_V);
 	       ipadporobot.keyRelease(KeyEvent.VK_V);
	       ipadporobot.keyRelease(KeyEvent.VK_CONTROL);
  	       ipadporobot.keyPress(KeyEvent.VK_ENTER);
  	       ipadporobot.delay(150);
	       ipadporobot.keyRelease(KeyEvent.VK_ENTER);
         
	}
	public void IpadLandscapeImageupload() throws InterruptedException, Throwable    {
		JavascriptExecutor ipadlandscape = (JavascriptExecutor) driver;
		ipadlandscape.executeScript("window.scrollBy(0,1000)");
   	    Thread.sleep(1000);
   	    
		WebDriverWait waitforelement=new WebDriverWait(driver, 20);
    	waitforelement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@id,'ipadlandscape')]")));
		
    	boolean img=ipadportimageuploadVerify.isDisplayed();
    	Assert.assertEquals(true, img);
    	System.out.println(img + " : iPad Portait Image Showing");
    	clicklandscapeportimageupload.click();
    	
		Actions ipadlandm=new Actions(driver);
		ipadlandm.moveToElement(allimageupload).click().build().perform();	
		Thread.sleep(2000);
		 
 		   StringSelection ipadlandmode=new StringSelection("C:\\Users\\pravakar.rana\\Downloads\\AutomationTest\\ipad landscape");
	       Toolkit landtk=Toolkit.getDefaultToolkit();
	       Clipboard landcb=landtk.getSystemClipboard();
	       landcb.setContents(ipadlandmode, null);
	       Robot ipadlandrobot=null;
	       try {
	        ipadlandrobot=new Robot();
	       }catch (AWTException e) {
	    	   e.printStackTrace();
 		   }
	       ipadlandrobot.delay(250);
	       ipadlandrobot.keyPress(KeyEvent.VK_ENTER);
	       ipadlandrobot.keyRelease(KeyEvent.VK_ENTER);
	       ipadlandrobot.keyPress(KeyEvent.VK_CONTROL);
	       ipadlandrobot.keyPress(KeyEvent.VK_V);
 	       ipadlandrobot.keyRelease(KeyEvent.VK_V);
	       ipadlandrobot.keyRelease(KeyEvent.VK_CONTROL);
	       ipadlandrobot.keyPress(KeyEvent.VK_ENTER);
	       ipadlandrobot.delay(250);
 	       ipadlandrobot.keyRelease(KeyEvent.VK_ENTER);
 		 
	        JavascriptExecutor ipadlandscape1 = (JavascriptExecutor) driver;
			ipadlandscape1.executeScript("window.scrollBy(0,1000)");
	   	    Thread.sleep(1000);
	   	    
			WebDriverWait waitforelement1=new WebDriverWait(driver, 20);
	    	waitforelement1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@id,'ipadNext')]")));
			
	    	boolean img1=ipadlandscapeimageuploadVerify.isDisplayed();
	    	Assert.assertEquals(true, img1);
	    	System.out.println(img + " : iPad Landscape Image Showing");
	}
	 
 
	
	
	
}
