package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Venuepage;
@Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
public class Add_Disclaimer extends Baseclass_libraries{
	
	@Test
	public void CMS_E2MTest_disclaimer_TC014() throws Throwable  {
		String Level=flib.getexcelData("EventSetup", 1, 1);
		String acceptancelevel=flib.getexcelData("EventSetup", 1, 2);
		
		Venuepage vnu=PageFactory.initElements(driver, Venuepage.class);
        vnu.ClickParticularEvent();
		          
		Venuepage dis=PageFactory.initElements(driver, Venuepage.class);
		          dis.navigateDisclaimer();           
		 
		Venuepage rbutton=PageFactory.initElements(driver, Venuepage.class);
		          rbutton.Clickonradionbutton();
		          
		Venuepage disclaimer=PageFactory.initElements(driver, Venuepage.class);
		          disclaimer.DisclaimerLevel(Level);       
		          
		Venuepage acceptance=PageFactory.initElements(driver, Venuepage.class);
		          acceptance.acceptancelevel(acceptancelevel); 
		          
		Venuepage disclaimertext=PageFactory.initElements(driver, Venuepage.class);
		          disclaimertext.EnterDisclaimer_Description();
		          
		Venuepage sveDISC=PageFactory.initElements(driver, Venuepage.class);
		sveDISC.clickOnsave_Disclaimer();
	}

}
