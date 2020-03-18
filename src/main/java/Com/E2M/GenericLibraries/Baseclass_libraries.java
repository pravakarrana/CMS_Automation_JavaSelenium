package Com.E2M.GenericLibraries;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import Com.E2M.ObjectRepository.LoginPage;
import Com.E2M.ObjectRepository.LogoutPage;

 
public class Baseclass_libraries   {
	
	public static WebDriver driver;
	public static fileutil flib=new fileutil();
    
 	@BeforeClass 
	public void configBc() throws IOException {
		System.out.println("========Lunch browser========");
		Properties pobj=flib.getpropertiesfileobject();
		String browsername=pobj.getProperty("BROWSER");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./Resourse/chromedriver1.exe");
			 ChromeOptions options = new ChromeOptions();
             options.addArguments("headless");
             options.addArguments("window-size=1200x600");
  			driver=new ChromeDriver(options);
		} 
		else if(browsername.equals("firefox")){
			System.setProperty("webdriver.chrome.driver", "./Resourse/geckodriver.exe");
			driver=new FirefoxDriver();
 		}
		else if(browsername.equals("IE")){
			System.setProperty("webdriver.IE.driver", "");
			driver=new InternetExplorerDriver();
		}
		else if(browsername.equals("HeadLessBrowser")) {
			driver=new HtmlUnitDriver(BrowserVersion.CHROME);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30L, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(3L, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@BeforeMethod 
	public void configBm() throws IOException, Throwable{
		System.out.println("Login To Event2Mobile");
		 
    	Properties pobj=flib.getpropertiesfileobject();
    	String CMS_URL=pobj.getProperty("MCKURL");
    	String PRD_MCKurl=flib.getexcelData("Varification", 1, 1);
    	String PRD_ARROWurl=flib.getexcelData("Varification", 2, 1);
    	String PRD_TRULIANTurl=flib.getexcelData("Varification", 4, 1);
    	String PRD_PCOAurl=flib.getexcelData("Varification", 5, 1);
 
     	if(CMS_URL.equals(PRD_MCKurl)) {
    		driver.get(pobj.getProperty("MCKURL"));
    	}
     	else if(CMS_URL.equals(PRD_ARROWurl)) {
    		driver.get(pobj.getProperty("ARROWURL"));
    	}
     	else if(CMS_URL.equals(PRD_TRULIANTurl)) {
    		driver.get(pobj.getProperty("TRULIANTURL"));
    	}
     	else if(CMS_URL.equals(PRD_PCOAurl)) {
    		driver.get(pobj.getProperty("PCOAURL"));
    	}
 		 LoginPage log=PageFactory.initElements(driver, LoginPage.class);
		           log.EnterUsername(pobj.getProperty("USERNAME").trim());
		           Thread.sleep(2000);
		
	     LoginPage pro=PageFactory.initElements(driver, LoginPage.class);
		           pro.clickOnProceed();
		           Thread.sleep(2000);
		           
		 LoginPage pwd=PageFactory.initElements(driver, LoginPage.class);
		           pwd.EnterPassword(pobj.getProperty("PASSWORD"));
 		           
		 LoginPage sub=PageFactory.initElements(driver, LoginPage.class);
		           sub.clickOnSubmit();
     }	
	 @AfterMethod 
	 public void configAm(ITestResult result){
		 System.out.println("Logout To Event2mobile");
//		 try {
//		     LogoutPage lout=PageFactory.initElements(driver, LogoutPage.class);
//		     lout.clickOnlogoutall();
//		 }catch (Exception e) {
//			 LogoutPage lout=PageFactory.initElements(driver, LogoutPage.class);
//			 lout.clickOnlogout();	  
//		}
	 } 
	 @AfterClass 
	 public void configAc(){
		 System.out.println("========close browser=========");
//             driver.close();                
//             driver.quit();	
	 }	
}
