package Com.E2M.ObjectRepository;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.Normalizer.Form;
import java.util.List;

import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.gargoylesoftware.htmlunit.WebClient;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import java.util.regex.*;

import javax.imageio.ImageIO;

import Com.E2M.GenericLibraries.Baseclass_libraries;
 
public class Event_SetUp_Page extends Baseclass_libraries{

	@FindBy(xpath="//ul[@class='menu-3rd-level clearfix']//li//a[contains(@href,'')]")
	private List<WebElement> AboutEvent_Pages;
	
	@FindBy(xpath=".//a[contains(@href,'')]")
	private List<WebElement> checklink;
	 
	@FindBy(xpath="//input[contains(@value,'Save')]")
	private List<WebElement> a;
	
	@FindBy(xpath="//figcaption[contains(text(),'LIVE @ THE EVENT')]//..")
	private WebElement LIVE;
	
	@FindBy(xpath="//a[contains(text(),'Projector Links')]")
	private WebElement Projectorlink;
	 
	@FindBy(xpath="//input[contains(@name,'GenerateLink')]")
	private WebElement generatelink;
	
	@FindBy(xpath="//div[contains(@class,'content-hld clearfix')]")
	private WebElement linkpage;
	
	@FindBy(xpath="//*[contains(@id,'NewEventCreation')]")
	private WebElement clickonevent;
	
	@FindBy(xpath="//h1[contains(text(),'Server Error')]")
	private WebElement error;
	
 	
	public void clickevent()   {
		clickonevent.click();
	}
	
	public void printallerror()   {
		  
	String assa=error.getText();
	System.out.println(assa);	
		String dd=driver.getCurrentUrl();
		System.out.println(dd);
		boolean sssa=flib.getResponseCode(dd);
		System.out.println(sssa);
		
	}
	public void Printallsubmoduleof_aboutevent2()   {
//		System.out.println("size:" + checklink.size());
//		for(int i = 0; i < checklink.size(); i++){
//			String ss=checklink.get(i).getAttribute("href");
//             System.out.println(ss);
//  		}
		List<WebElement> linkElements = driver.findElements(By.xpath(".//a[contains(@href,'.aspx')]"));
		 for(int i=0;i<=linkElements.size()-1;i++) {
			 String aa=linkElements.get(i).getAttribute("href");
			 System.out.println(aa);
		 }
	}
	//.//a[contains(@href,'.aspx')] 
	public static int statusCode;
	public void Printallsubmoduleof_aboutevent1() throws Throwable   {
		
//		WebElement img = driver.findElement(By.id("warp"));
//        String imgpath = img.getCssValue("background-image"); 
        String expected="error-cms.png";
//        String done = " ";
//          String[] hope = imgpath.split("https://truliantcms.e2m.live/Images/");
//           for ( int j = 0; j < hope.length; j++) {
//             done = done + hope[j];
//           }
//             String actual_error=done.substring(6,19);
             //System.out.println(actual_error);
//             
//              if(actual_error.contains(expected)) {
//            	 boolean errorpage = true;
//            	//System.out.println(errorpage);
//             }else {
//              }
             //boolean errorpage=actual_error.contains(expected);
            // System.out.println("Error page found : " + errorpage);
 
		
		List<WebElement> linkElements = driver.findElements(By.xpath(".//a[contains(@href,'.aspx')]"));
   	    String[] linkTexts = new String[linkElements.size()];
   	    	
  	    
 	    int i = 0;	
		for (WebElement e : linkElements) {							
			linkTexts[i] = e.getAttribute("href");							
			i++;	
			//System.out.println(e);
        }
		for (String t : linkTexts) {
			//System.out.println(t);
			driver.findElement(By.linkText(t)).click();	
			WebElement img = driver.findElement(By.id("warp"));
	        String imgpath = img.getCssValue("background-image"); 
 	        String done = " ";
	          String[] hope = imgpath.split("https://truliantcms.e2m.live/Images/");
	           for ( int j = 0; j < hope.length; j++) {
	             done = done + hope[j];
	           }
	             String actual_error=done.substring(6,19);
			if (expected.equals(actual_error)) {							
                System.out.println("\"" + t + "\"" + " is under construction.");			
            } else {			
                System.out.println("\"" + t + "\"" + " is working.");			
            }	
			driver.navigate().back();			
       }		
			driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("size:" + checklink.size());
//		for(int i = 0; i < checklink.size(); i++){
//			String ss=checklink.get(i).getAttribute("href");
//             System.out.println(ss);
//  		}
//		
//		WebClient client1=new WebClient();
//        int codes=client1.getPage("https://truliantcms.e2m.live/event-info.aspx").getWebResponse().getStatusCode();
//        System.out.println("INFO :" + codes);
//        client1.close();
      }
		
//     for(int i = 0; i < checklink.size(); i++){
//        if(!(checklink.get(i).getAttribute("href") == null) && !(checklink.get(i).getAttribute("href").equals(""))){
//            if(checklink.get(i).getAttribute("href").contains("http")){
//                statusCode= flib.getResponseCode1(checklink.get(i).getAttribute("href").trim());
//                if(statusCode == 403){
//                    System.out.println("HTTP 403 Forbidden # " + i + " " + checklink.get(i).getAttribute("href"));
//                }else if(statusCode == 200){
//                    System.out.println("HTTP 200 Forbidden # " + i + " " + checklink.get(i).getAttribute("href"));
//                }else if(statusCode == 404){
//                    System.out.println("HTTP 404 Forbidden # " + i + " " + checklink.get(i).getAttribute("href"));
//                }
//            }else if(checklink.get(i).getAttribute("href").contains("https")){
//                statusCode= flib.getResponseCode1(checklink.get(i).getAttribute("href").trim());
//                if(statusCode == 403){
//                    System.out.println("HTTP 403 Forbidden # " + i + " " + checklink.get(i).getAttribute("href"));
//                }else if(statusCode == 404){
//                    System.out.println("HTTP 404 Forbidden # " + i + " " + checklink.get(i).getAttribute("href"));
//                }else if(statusCode == 200){
//                    System.out.println("HTTP 200 Forbidden # " + i + " " + checklink.get(i).getAttribute("href"));
//                }
//            }
//        }   
//    }   
//}

	
	public void Printallsubmoduleof_aboutevent()   {
		 
        //System.out.println("size:" + AboutEvent_Pages.size());
		System.out.println("size:" + checklink.size());
     
        boolean isValid = false;
        for (int i = 0; i < checklink.size(); i++) {
            try {
             isValid = flib.getResponseCode(checklink.get(i).getAttribute("href"));
             if (isValid) {
                System.out.println("ValidLinks:" + checklink.get(i).getAttribute("href"));
           } else {
                System.out.println("InvalidLinks:" + checklink.get(i).getAttribute("href"));
             }
        
            }catch (Exception e) {
            	isValid=flib.getResponseCode(checklink.get(i).getText());
            	System.out.println(isValid);
			}
 	  }
   }

      public void click()   {
	 	
    	   LIVE.click();
    	  // String pagetitle1=driver.getTitle();
           //System.out.println(pagetitle1); 
           
           String urlpage1=driver.getCurrentUrl();
           System.out.println(urlpage1);
      } 
           public void prolink()   {      
           Projectorlink.click();
           }
           public void gennk()   {   
           generatelink.click();
           String urlpage2=driver.getCurrentUrl();
           System.out.println(urlpage2);
           
            
           
      }

      public void check() throws Throwable   {
     
    	  
    	  
      	  boolean d=linkpage.isDisplayed();
          System.out.println("Background image is displayed :" + d);
          
          WebElement img = driver.findElement(By.id("warp"));
          String imgpath = img.getCssValue("background-image");     
          String expected="error-cms.png";
          
          Matcher m = Pattern.compile("\\\".*\\\"").matcher(imgpath);
         
          if (m.find()) {
              String imgUrl = m.group().replace('"', ' ').trim();
              System.out.println(imgUrl);
              // verify imgUrl
              try {
            	    // Getting the Response Code for URL
            	  String de=driver.getCurrentUrl();
          	      System.out.println(de);
            	  
            	    URL url = new URL(de);
            	    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            	    connection.setRequestMethod("GET");
            	    connection.connect();
            	    int code = connection.getResponseCode();
                     System.out.println(code);
            	    // Condition to check whether the URL is valid or Invalid
                 int cd=200;
                 int cd1=404;

         	    if(imgUrl.contains("/error.aspx?aspxerrorpath=/")) {
         	    	System.out.println(cd1);
         	    }
         	    else {
         	    	System.out.println(cd);
         	    }
                     
            	    if (code == 200) {
            	    	System.out.println("Valid Link:" + de);
            	    }
            	    else if(code == 404) {
            	    	System.out.println("INVALID Link:" + de);
            	   } 
            	 
            	    
            	     
                
            
              
              
              
              }
             catch (Exception e) {
            	    System.out.println(e.getMessage());
            	   }  
          } 
//         
//    
//          String done = " ";
//    	  String[] hope = imgpath.split("https://arrowcms.e2m.live/Images/");
// 
//  	        for ( int i = 0; i < hope.length; i++)
//  	        {
//  	           done = done + hope[i];
//  	        }
//  	           String actual_error=done.substring(6,19);
//    	       boolean errorpage=actual_error.contains(expected);
//    	       System.out.println("Error page found : " + errorpage);
//    	       
//    	       SoftAssert assrt=new SoftAssert();
//    	       assrt.assertFalse(actual_error.contains(expected));
//    	       assrt.assertAll();
//       


      }
       
   

}
