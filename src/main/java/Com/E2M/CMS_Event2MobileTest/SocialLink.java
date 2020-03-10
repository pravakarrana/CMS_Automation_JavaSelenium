package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Usermanagementpage;
import Com.E2M.ObjectRepository.Venuepage;

@Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
public class SocialLink extends Baseclass_libraries {
	
	@Test
    public void CMS_E2MTest_SocialLink_TC014() throws Throwable  {
		String sociallink=flib.getexcelData("EventSetup", 1, 6);
		String sociallinkUrl=flib.getexcelData("EventSetup", 1, 7);
 		
		Venuepage vnu=PageFactory.initElements(driver, Venuepage.class);
		          vnu.ClickParticularEvent();
             
		Venuepage sclnink=PageFactory.initElements(driver, Venuepage.class);
		          sclnink.NaviagtetoSociallink();
		          
		Usermanagementpage uploadimage=PageFactory.initElements(driver, Usermanagementpage.class);
		                   uploadimage.ClickOnUploadSociallink();
		          
		Venuepage socialname=PageFactory.initElements(driver, Venuepage.class);
		          socialname.EnternameSociallink(sociallink);
		          
		Venuepage socialnameurl=PageFactory.initElements(driver, Venuepage.class);
		          socialnameurl.EnternameSociallinkurl(sociallinkUrl);
		          
		Venuepage publish=PageFactory.initElements(driver, Venuepage.class);
		          publish.ClickonPublish(); 
		          
		Venuepage addsociallink=PageFactory.initElements(driver, Venuepage.class);
		          addsociallink.AddSocialLink();
	 }         

}
