import java.util.Date;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		
	    @SuppressWarnings("deprecation")
		public void jsInfo() {
	    	LogEntries logentries=driver.manage().logs().get(LogType.BROWSER);
	    	for(LogEntry entry : logentries) {
	    		System.out.println(new Date(entry.getTimestamp() + " " + entry.getLevel() + " " + entry.getMessage()));
	    	}
	    }
        @Test
	    public void testmethod() {
	    	driver.get("https://truliantcms.e2m.live/");
	    	jsInfo();
	    	
	    	driver.findElement(By.xpath("//input[@name='txtLogin']")).sendKeys("clientadmin@ws.com");
	    	driver.findElement(By.xpath("//a[@id='btnProceed']")).click();
	    }
	    
	    
}

















