import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyAmazonSignInPage {

    public static void main(String[] args) throws AWTException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./Resourse/chromedriver1.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://truliantcms.e2m.live/");
	    driver.findElement(By.xpath("//input[@name='txtLogin']")).sendKeys("clientadmin@ws.com");
    	driver.findElement(By.xpath("//a[@id='btnProceed']")).click();
    	driver.findElement(By.xpath("//input[@name='txtPass']")).sendKeys("123456");
    	driver.findElement(By.xpath("//input[@value='Sign in']")).click();
    	
    	Robot r = new Robot();                          
    	r.keyPress(KeyEvent.VK_CONTROL); 
    	r.keyPress(KeyEvent.VK_T); 
    	r.keyRelease(KeyEvent.VK_CONTROL); 
    	r.keyRelease(KeyEvent.VK_T); 
        
//        Actions act = new Actions(driver);
//        act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
        driver.get("http://www.gmail.com");


    }

}