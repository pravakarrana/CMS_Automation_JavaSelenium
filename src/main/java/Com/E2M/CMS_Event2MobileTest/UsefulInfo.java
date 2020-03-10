package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Venuepage;
@Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
public class UsefulInfo extends Baseclass_libraries{
	
	
	@Test
	public void CMS_E2MTest_UsefulInfo_TC014() throws Throwable  {
		String usefulname=flib.getexcelData("EventSetup", 1, 3);
		String usefulTag=flib.getexcelData("EventSetup", 1, 4);
		
		Venuepage vnu=PageFactory.initElements(driver, Venuepage.class);
                  vnu.ClickParticularEvent();
        
        Venuepage usefulinfo=PageFactory.initElements(driver, Venuepage.class);
                  usefulinfo.navigateUsefulInfo();
        
        Venuepage addusfinfo=PageFactory.initElements(driver, Venuepage.class);
                  addusfinfo.NewAddUsefulInfo();
        
        Venuepage nme=PageFactory.initElements(driver, Venuepage.class);
                  nme.EnterUsefulInfo_Name(usefulname, usefulTag);
         
        Venuepage desc=PageFactory.initElements(driver, Venuepage.class);
                  desc.EnterUsefulInfo_Description();
        
        Venuepage sve=PageFactory.initElements(driver, Venuepage.class);
                  sve.clickOnsave();  
        
        Venuepage vmsg=PageFactory.initElements(driver, Venuepage.class);
                  vmsg.verifyusefulinfo();
		
	}

}
