package Com.ExtentReportListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Com.E2M.GenericLibraries.fileutil;
import Com.E2M.ObjectRepository.LoginPage;
import Com.E2M.ObjectRepository.LogoutPage;



//public class screenshot {
//	
//	
//	public WebDriver driver;
//	public ExtentReports extent;
//	public ExtentTest extentTest;
//
//	
//	
//	@BeforeTest
//	public void setExtent(){
//		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html", true);
//		extent.addSystemInfo("Host Name", "Naveen Mac");
//		extent.addSystemInfo("User Name", "Naveen Automation Labs");
//		extent.addSystemInfo("Environment", "QA");
//		
//	}
//	
//	@AfterTest
//	public void endReport(){
//		extent.flush();
//		extent.close();
//	}
//	
//	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
//		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		// after execution, you could see a folder "FailedTestsScreenshots"
//		// under src folder
//		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
//				+ ".png";
//		File finalDestination = new File(destination);
//		FileUtils.copyFile(source, finalDestination);
//		return destination;
//	}
//	
//	
//	
//	
//	@BeforeMethod
//	public void setup(){
//		
//		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");	
//		driver = new ChromeDriver(); 
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.get("https://www.freecrm.com/");
//		
//	}
//	
//	
//	
//	@Test
//	public void freeCrmTitleTest(){
//		extentTest = extent.startTest("freeCrmTitleTest");
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals(title,"#1 Free CRM for Any Business: Online Customer Relationship Software123");
//	}
//	
//	@Test
//	public void freemCRMLogoTest(){
//		extentTest = extent.startTest("freemCRMLogoTest");
//		boolean b = driver.findElement(By.xpath("//img[@class='img-responsive111']")).isDisplayed();
//		Assert.assertTrue(b);
//	}
//	
//	
//	
//	
//	
//	@AfterMethod
//	public void tearDown(ITestResult result) throws IOException{
//		
//		if(result.getStatus()==ITestResult.FAILURE){
//			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
//			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
//			
//			String screenshotPath = screenshot.getScreenshot(driver, result.getName());
//			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
//			//extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report
//		}
//		else if(result.getStatus()==ITestResult.SKIP){
//			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
//		}
//		else if(result.getStatus()==ITestResult.SUCCESS){
//			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
//
//		}
//		
//		
//		extent.endTest(extentTest); //ending test and ends the current test and prepare to create html report
//		driver.quit();
//	}
//	
//	
//	










//	public static WebDriver driver;
//public static fileutil flib=new fileutil();
//public static ExtentReports extent;
//public static ExtentTest test;
//
//
//
//	 
//
//@BeforeClass 
//public void configBc() throws IOException {
//	System.out.println("========Lunch browser========");
//	 
//	Properties pobj=flib.getpropertiesfileobject();
//	String browsername=pobj.getProperty("BROWSER");
//	if(browsername.equals("chrome")){
//		System.setProperty("webdriver.chrome.driver", "./Resourse/chromedriver.exe");
//		driver=new ChromeDriver();
//	}
//	else if(browsername.equals("firefox")){
//		driver=new FirefoxDriver();
//		}
//	else if(browsername.equals("IE")){
//		System.setProperty("webdriver.IE.driver", "");
//		driver=new InternetExplorerDriver();
//	}
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	 
//}
//@BeforeTest
//public void configBT() {
//	extent=new ExtentReports(System.getProperty("user.dir") +"/test-output/MyOwnReport.html",true);
//	extent.addSystemInfo("Host Name","Local Host");
//	extent.addSystemInfo("Environment","QA");
//	extent.addSystemInfo("User Name","Pravakar");
//	extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));		
//}
//@AfterTest
// public void configAT() {
//	extent.flush(); 
// }
//
//@BeforeMethod 
//public void configBm() throws IOException, Throwable
//{
//	System.out.println("Login To Event2Mobile");
//	
//	Properties pobj=flib.getpropertiesfileobject();
//	driver.get(pobj.getProperty("URL"));
//	
//	extent=new ExtentReports(System.getProperty("user.dir") +"/test-output/MyOwnReport.html",true);
//	extent.addSystemInfo("Host Name","Local Host");
//	extent.addSystemInfo("Environment","QA");
//	extent.addSystemInfo("User Name","Pravakar");
//	extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	
//	 LoginPage log=PageFactory.initElements(driver, LoginPage.class);
//	           log.EnterUsername(pobj.getProperty("USERNAME").trim());
//	           Thread.sleep(2000);
//	
//     LoginPage pro=PageFactory.initElements(driver, LoginPage.class);
//	           pro.clickOnProceed();
//	           Thread.sleep(2000);
//	           
//	 LoginPage pwd=PageFactory.initElements(driver, LoginPage.class);
//	           pwd.EnterPassword(pobj.getProperty("PASSWORD"));
//	           Thread.sleep(2000);
//	           
//	 LoginPage sub=PageFactory.initElements(driver, LoginPage.class);
//	           sub.clickOnSubmit();
//	
//
//}
//
//
// @AfterMethod 
// public void configAm(ITestResult result)
//{
//	 if(result.getStatus()==ITestResult.FAILURE) {
//		 test.log(LogStatus.FAIL, result.getThrowable());
//	 }
//	 extent.endTest(test);
//	 System.out.println("Logout To Event2mobile");
//	 LogoutPage lout=PageFactory.initElements(driver, LogoutPage.class);
//	            lout.clickOnlogout();
//	           // extent.flush();
//}
//  
// @AfterClass 
// public void configAc()
//	{
//		System.out.println("========close browser=========");
//        driver.close();
//        driver.quit();
//         
//    }

	  
//	
//	
//	
//	
//	
//	
//	
//	
//
//}