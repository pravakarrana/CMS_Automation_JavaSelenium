package Com.E2M.ObjectRepository;

    
 
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
 

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
	 
 
	
	
	
}
