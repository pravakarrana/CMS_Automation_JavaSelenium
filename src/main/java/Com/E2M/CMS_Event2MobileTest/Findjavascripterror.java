package Com.E2M.CMS_Event2MobileTest;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class Findjavascripterror {

	//public static void main(String[] args) {
      
		
		public WebDriver driver;
		
		@BeforeMethod
		public void setup() {
			
			DesiredCapabilities capabilities=DesiredCapabilities.chrome();
			LoggingPreferences loginpreference=new LoggingPreferences();
			loginpreference.enable(LogType.BROWSER, Level.ALL);
			capabilities.setCapability(CapabilityType.LOGGING_PREFS, loginpreference);
			System.setProperty("webdriver.chrome.driver", "./Resourse/chromedriver1.exe");
			driver=new ChromeDriver(capabilities);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		@AfterMethod
		public void teardown() {
			//driver.quit();
		}
		
	    
 		public void jsInfo() throws ParseException {
	    	LogEntries logentries=driver.manage().logs().get(LogType.BROWSER);
	    	for(LogEntry entry : logentries) {
	        SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy h:mm:ss Z");
	        System.out.println(entry.getTimestamp() + " " + entry.getLevel() + " " + entry.getMessage());
      		System.out.println(new Date());
 	    	}
	    }
        @Test
	    public void testmethod() throws ParseException, Throwable {
	    	driver.get("https://mckcms.e2m.live/");
 	    	
	    	driver.findElement(By.xpath("//input[@name='txtLogin']")).sendKeys("clientadmin@ws.com");
	    	driver.findElement(By.xpath("//a[@id='btnProceed']")).click();
	    	driver.findElement(By.xpath("//input[@name='txtPass']")).sendKeys("123456");
	    	driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	      //driver.findElement(By.xpath("//a[text()='New Event']")).click();
	    	
	    	
//  	    	List<WebElement> we=driver.findElements(By.xpath(".//a[contains(@href,'')]"));
// 	    	int link=we.size();
//	    	System.out.println(link);
//	    	 
//	    	for(int i=0;i<=we.size()-1;i++) {
// 	    		String linkname=we.get(i).getAttribute("href");
// 	    	    System.out.println("MCK" + ":" + linkname);
//  	    	}
	    	Thread.sleep(3000);
	    	//jsInfo();

	    	Robot r = new Robot();                          
	    	r.keyPress(KeyEvent.VK_CONTROL); 
	    	r.keyPress(KeyEvent.VK_T); 
	    	r.keyRelease(KeyEvent.VK_CONTROL); 
	    	r.keyRelease(KeyEvent.VK_T); 
	        
	    	String parent=driver.getWindowHandle();
	    	Set<String>st=driver.getWindowHandles();
	    	Iterator<String> it=st.iterator();
	    	String parentid=it.next();
	    	String childid=it.next();
	    			
	    	
	    	driver.switchTo().window(childid);
  	    	driver.get("https://truliantcms.e2m.live/");
 	    	driver.findElement(By.xpath("//input[@name='txtLogin']")).sendKeys("clientadmin@ws.com");
	    	driver.findElement(By.xpath("//a[@id='btnProceed']")).click();
	    	driver.findElement(By.xpath("//input[@name='txtPass']")).sendKeys("123456");
	    	driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	    	 
	    	List<WebElement> web=driver.findElements(By.xpath(".//a[contains(@href,'')]"));
 	    	int link2=web.size();
	    	System.out.println(link2);
	    	
	    	for(int i=0;i<=web.size()-1;i++) {
	    		String  linkname1=web.get(i).getAttribute("href");
	    	    System.out.println("Truliant" + ":" + linkname1);
  	    	}
	    	
	    	 driver.switchTo().window(parent);
	    	 List<WebElement> we=driver.findElements(By.xpath(".//a[contains(@href,'')]"));
	 	    	int link=we.size();
		    	System.out.println(link);
		    	 
		    	for(int i=0;i<=we.size()-1;i++) {
	 	    		String linkname=we.get(i).getAttribute("href");
	 	    	    System.out.println("MCK" + ":" + linkname);
	 	    	    driver.close();
	 	    	    driver.switchTo().window(childid);
	 	    	   List<WebElement> web1=driver.findElements(By.xpath(".//a[contains(@href,'')]"));
	 	    	   for(int j=0;i<=web1.size()-1;j++) {
		    		     String bb=web1.get(i).getAttribute("href");  
	  	    	  }
		       }
		    	Thread.sleep(3000);
		    	// driver.switchTo().window(childid);
	    	 
//	    	 
//	    	 for(int i=0;i<=we.size()-1;i++) {
//	    		 String linkname=we.get(i).getAttribute("href");
//	    		 System.out.println("MCK" + ":" + linkname);
//	    		 
//	    		 driver.switchTo().window(childid); 
// 	    		 for(int j=0;i<=web.size()-1;j++) {
//	    		     String bb=web.get(i).getAttribute("href"); 
//	    		     if(linkname.equals(bb)) { 
// 	    			    System.out.println("Truliant" +"::>>"+ bb);
// 	    			    break;
//	    		 }
//	    		}
//	    	 }
//     }	 
	    		
//	    	ArrayList<String>aa=new ArrayList<String>();
//	    	aa.add(linkname);
//	    	int a=aa.size();
//	    	System.out.println(a);
//	    	
//	    	System.out.println(aa);
 	    
        }    
}  

















