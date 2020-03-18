import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Test {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "./Resourse/chromedriver1.exe");
 		WebDriver driver=new ChromeDriver();
    
         driver.get("https:gmail.com");
         driver.manage().window().maximize();
         driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         
	}

}
