package Com.E2M.GenericLibraries;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.Random;
 import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.gargoylesoftware.htmlunit.WebClient;

 
      public class fileutil extends Baseclass_libraries{		
		 String filepath="./Data/commondata.properties";
		 String excelpath="./Data/testdata.xlsx";
	 
		 public Properties getpropertiesfileobject() throws IOException
		 {
			 FileInputStream fis=new FileInputStream(filepath);
			 Properties pobj=new Properties();
			 pobj.load(fis);
			 
			 return pobj;
		 }
		 public String getexcelData(String sheetname,int rownum,int celnum) throws Throwable   
		 {		 
			 FileInputStream fis=new FileInputStream(excelpath);
				Workbook read= new XSSFWorkbook(fis);
				Sheet sh=read.getSheet(sheetname);
				String data=sh.getRow(rownum).getCell(celnum).getStringCellValue();			 			 
			 return data;  		
		 }
//		 public String getexcelRandomData(String sheetname,int rownum,int celnum) throws Throwable   
//		 {		 
//			 FileInputStream fis=new FileInputStream(excelpath);
//				Workbook we= new XSSFWorkbook(fis);
//				Sheet sh=we.getSheet(sheetname);
//				Random num=new Random();
//				int a= num(sh.getLastRowNum());
//				Row row=sh.getRow(a);
//				
				//String data=sh.getRow(rownum).getCell(celnum).getStringCellValue();			 			 
			 //return data;  		
		// }
		 public String WritesetexcelData(String sheetname,int rownum,int celnum,String data) throws Throwable   
		 {
			 FileInputStream fis=new FileInputStream(excelpath);
			 Workbook setwb=new XSSFWorkbook(fis);  
  			 Sheet shh=setwb.createSheet(sheetname);
 			       shh.createRow(rownum).createCell(celnum).setCellValue(data);  
		     FileOutputStream pos=new FileOutputStream(excelpath);
			                  setwb.write(pos);
 			 return data;
		 }
		 public String setexcelData(String sheetname,int rownum,int celnum,String data) throws Throwable   
		 {
			 FileInputStream fis=new FileInputStream(excelpath);
			  Workbook setwb=new XSSFWorkbook(fis);
			  
//			  if(!setwb.equals(sheetname)) {
// 			       Sheet shh=setwb.createSheet(sheetname);
// 			             shh.createRow(rownum).createCell(celnum).setCellValue(data);  }
//			  }else(setwb.equals(sheetname))
//			  {
//				  if(setwb.equals(sheetname)) {
			  
  				  Sheet sh=setwb.getSheet(sheetname);
				  sh.createRow(rownum).createCell(celnum).setCellValue(data);
//            }
//            }
		     FileOutputStream pos=new FileOutputStream(excelpath);
				  setwb.write(pos);
 			 return data;
		 }
		 public static int getResponseCode1(String urlString) throws Throwable {
		        URL url = new URL(urlString);
		    HttpURLConnection huc = (HttpURLConnection)url.openConnection();
		    huc.setRequestMethod("GET");
		    huc.connect();
		    int code=huc.getResponseCode();
		    System.out.println("URL ResponseCode : " + code);
		    return huc.getResponseCode();
		 }
		 public static int getStatusCode(long appUserId) throws IOException {
			    WebClient webClient = new WebClient();
			    int code = webClient.getPage("http://your.url/123/").getWebResponse().getStatusCode();
			    webClient.close();
			    return code;
	     }
 		 public boolean getResponseCode(String urlString) {
		    	boolean isValid = false;
		        try {
		            URL u = new URL(urlString);
		            HttpURLConnection h = (HttpURLConnection) u.openConnection();
		            h.setRequestMethod("HEAD");
		            h.connect();
 		            int code=h.getResponseCode();
		            System.out.println(code);
		            if (code != 400) {
		                isValid = true;
		                Assert.assertEquals(code, 200);
		            }
 		        } catch (Exception e) {

		        }
		    return isValid;
//		        boolean isValid = false;
//		        try {
//		            URL u = new URL(urlString);
//		            HttpURLConnection h = (HttpURLConnection) u.openConnection();
//		            h.setRequestMethod("HEAD");
//		            h.connect();
// 		            int code=h.getResponseCode();
//		            System.out.println(code);
//		            if (code != 400) {
//		                isValid = true;
//		                Assert.assertEquals(code, 200);
//		            }
// 		        } catch (Exception e) {
//
//		        }
//		    return isValid;
		    }
		 public String isLinkBroken(URL url) throws Exception {
 			 
	            String response = " ";
	 
	            //Create an instance of HTTP URL connection
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	 
	            //connect to the URL
	            connection.connect();
	 
	            // get the response
	            response = connection.getResponseMessage();
	 
	            // Disconnect the connection
	            connection.disconnect();
	 
	            return response;
	 
	        }
		    public boolean getErrorpage(String urlsearch) {
		    	
 		          
		          WebElement img = driver.findElement(By.id("warp"));
		          String imgpath = img.getCssValue("background-image");     
		          String expected="error-cms.png";
		          String done = " ";
		    	  String[] hope = imgpath.split("https://arrowcms.e2m.live/Images/");
		 
		  	        for ( int i = 0; i < hope.length; i++)
		  	        {
		  	           done = done + hope[i];
		  	        }
		  	           String actual_error=done.substring(6,19);
		    	       boolean errorpage=actual_error.contains(expected);
		    	       System.out.println("Error page found : " + errorpage);
		    	       
		    	       SoftAssert assrt=new SoftAssert();
		    	       assrt.assertFalse(actual_error.contains(expected));
		    	       assrt.assertAll();
 		    return errorpage;
		    }
		    
		    

}
