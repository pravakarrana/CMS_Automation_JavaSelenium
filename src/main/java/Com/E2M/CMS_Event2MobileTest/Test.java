package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Test {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "./Resourse/chromedriver1.exe");
		WebDriver d=new HtmlUnitDriver();
		d.get("https://gmail.com");
        WebElement x=d.findElement(By.xpath("//button[text()='Forgot email?']"));
        System.out.println(x.getText());
         
	}

}
