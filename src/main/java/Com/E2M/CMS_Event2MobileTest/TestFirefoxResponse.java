//package Com.E2M.CMS_Event2MobileTest;
//
//import java.util.List;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
// 
//	import java.io.File;
//	import java.io.IOException;
//	import java.net.MalformedURLException;
//	import java.util.HashMap;
//	import java.util.Map;
//	import java.util.regex.Matcher;
//	import java.util.regex.Pattern;
//
//	import org.apache.commons.io.FileUtils;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.firefox.FirefoxDriver;
//	import org.openqa.selenium.firefox.GeckoDriverService;
//
//	public class TestFirefoxResponse
//	{
//	  public static void main(String[] args)
//	      throws InterruptedException, IOException
//	  {
//	    GeckoDriverService service = null;
// 
//	    Map<String, String> map = new HashMap<String, String>();
//	    map.put("MOZ_LOG", "timestamp,sync,nsHttp:4");
//	    File tempFile = File.createTempFile("mozLog", ".txt");    
//	    map.put("MOZ_LOG_FILE", tempFile.getAbsolutePath());      
//
//	    GeckoDriverService.Builder builder = new GeckoDriverService.Builder();
//	    service = builder.usingAnyFreePort()
//	      .withEnvironment(map)
//	      .build();
//
//	    service.start();      
//
//	    WebDriver driver = new FirefoxDriver(service);
// 
//	     String url = "https://api.ipify.org/?format=text";
//  	    driver.get(url);
//
//	    driver.quit();
//
//	    String logContent = FileUtils.readFileToString(tempFile);
//
//	    ParseLog(logContent, url);
//	  }
//
//	  private static void ParseLog(String logContent, String url) throws MalformedURLException
//	  {
//	     
//	    String pattern = "BeginConnect \\[this=(.*?)\\](?:.*?)uri=(.*?)\\s";
//
//	    Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
//	    Matcher m = p.matcher(logContent);
//
//	    String urlID = null;
//	    while (m.find())
//	    {
//	      String id = m.group(1);
//	      String uri = m.group(2);
//
//	      if (uri.equals(url))
//	      {
//	        urlID = id;
//	        break;
//	      }      
//	    }
//
//	    System.out.println("request id = " + urlID);
//	    pattern = "ProcessResponse \\[this=" + urlID + " httpStatus=(.*?)\\]";
//
//	    p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
//	    m = p.matcher(logContent);
//
//	    if (m.find())
//	    {
//	      String responseCode = m.group(1);
//	      System.out.println("response code found " + responseCode);
//	    }
//	    else
//	    {
//	      System.out.println("response code not found");
//	    }
//	  }
//	}
//
//
