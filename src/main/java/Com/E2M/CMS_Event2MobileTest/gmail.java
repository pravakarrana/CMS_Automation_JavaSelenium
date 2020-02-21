package Com.E2M.CMS_Event2MobileTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "./Resourse/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://truliantcms.e2m.live");
		  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='txtLogin']")).sendKeys("clientadmin@ws.com");
		driver.findElement(By.xpath("//div[@class='fullwidth btn-login-hld']/a[@id='btnProceed']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='txtPass']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();

		WebElement img = driver.findElement(By.id("warp"));
        String imgpath = img.getCssValue("background-image");     
        String expected="error-cms.png";
        String done = " ";
          String[] hope = imgpath.split("https://truliantcms.e2m.live/Images/");

          for ( int j = 0; j < hope.length; j++) {
             done = done + hope[j];
          }
             String actual_error=done.substring(6,19);
               //boolean errorpage=actual_error.contains(expected);
               System.out.println("Error page found : " + actual_error);
  	
		//List<WebElement> checklink=driver.findElements(By.xpath(".//a[contains(@href,'')]"));
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));	
		    String[] linkTexts = new String[linkElements.size()];
		    int i = 0;	
			for (WebElement e : linkElements) {							
    			linkTexts[i] = e.getText();							
    			i++;			
            }
			for (String t : linkTexts) {							
    			driver.findElement(By.linkText(t)).click();					
    			if (driver.getTitle().equals(actual_error)) {							
                    System.out.println("\"" + t + "\"" + " is under construction.");			
                } else {			
                    System.out.println("\"" + t + "\"" + " is working.");			
                }	
    			driver.navigate().back();			
            }		
    			driver.quit();			
        }		
    
     }

		
 