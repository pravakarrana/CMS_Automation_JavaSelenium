package Com.E2M.CMS_Event2MobileTest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Findjavascripterror {

	//public static void main(String[] args) {
      
		
		public WebDriver driver;
		
		@BeforeMethod
		public void setup() {
			
			DesiredCapabilities capabilities=DesiredCapabilities.chrome();
			LoggingPreferences loginpreference=new LoggingPreferences();
			loginpreference.enable(LogType.BROWSER, Level.ALL);
			capabilities.setCapability(CapabilityType.LOGGING_PREFS, loginpreference);
			System.setProperty("webdriver.chrome.driver", "./Resourse/chromedriver.exe");
			driver=new ChromeDriver(capabilities);
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
	    public void testmethod() throws ParseException {
	    	driver.get("https://mckcms.e2m.live/");
	    	 
	    	
	    	driver.findElement(By.xpath("//input[@name='txtLogin']")).sendKeys("clientadmin@ws.com");
	    	driver.findElement(By.xpath("//a[@id='btnProceed']")).click();
	    	driver.findElement(By.xpath("//input[@name='txtPass']")).sendKeys("123456");
	    	driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	    	List<WebElement> we=driver.findElements(By.xpath("//a[contains(@href,'')]"));
	    	int link=we.size();
	    	System.out.println(link);
	    	for(int i=0;i<=we.size()-1;i++)
	    	{
	    		String linkname=we.get(i).getText();
	    		System.out.println(linkname);
	    	}
	    	jsInfo();
	    }
	    
	    
}

















