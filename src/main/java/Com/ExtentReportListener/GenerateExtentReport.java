package Com.ExtentReportListener;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class GenerateExtentReport  {
	
	ExtentReports extent;
	ExtentTest test;
	
	
	public void Startreport()
	{
		extent=new ExtentReports(System.getProperty("user.dir") +"/test-output/MyOwnReport.html",true);
		extent.addSystemInfo("Host Name","WebSpider_CMS");
		extent.addSystemInfo("Environment","QA");
		extent.addSystemInfo("User Name","Pravakar");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}

}
