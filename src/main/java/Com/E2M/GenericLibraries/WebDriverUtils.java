package Com.E2M.GenericLibraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

        public class WebDriverUtils extends Baseclass_libraries{
	     /**
	      * 
	      * @ wait for page to load
	      */
        public static void waitforpageToload(WebDriver driver)
        {
	     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        }
         /**
          * @ wait for any element is available in gui
          */
        public static void waitforElementpresent(WebDriver driver,WebElement wb)
        {
	     WebDriverWait wait=new WebDriverWait(driver, 20);
	     wait.until(ExpectedConditions.visibilityOf(wb));
        }
        /**customwait
         * @throws InterruptedException 
         * @ wait for element complete element to load & available in gui
         */
        public static void waitforcompleteelementtoload(WebElement wb) throws InterruptedException
        {
	     int count=0;
	     while(count<20) {
		   try {
			   wb.isDisplayed();
			   break;
		   }catch(Throwable t) {
			   System.out.println("handle the exception & continue..");
			   Thread.sleep(2000);
			   count++;
		   }
	    }
   }
}
