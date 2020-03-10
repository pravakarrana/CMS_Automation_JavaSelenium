package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Usermanagementpage;
import Com.E2M.ObjectRepository.Venuepage;

  @Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
  public class Apptutorial extends Baseclass_libraries {
	
 	 
	 @Test
     public void CMS_E2MTest_Apptutorial_1TC014() throws Throwable  {
		 
		Venuepage vnu=PageFactory.initElements(driver, Venuepage.class);
                  vnu.ClickParticularEvent();
	 
 		Venuepage apptutorial=PageFactory.initElements(driver, Venuepage.class);
		          apptutorial.ClickonAppTutoriallink();
		          
		Venuepage apptutorialasset=PageFactory.initElements(driver, Venuepage.class);
		          apptutorialasset.ClickonAppTutoriallinkAsset(); 
		          
		Usermanagementpage alliphone=PageFactory.initElements(driver, Usermanagementpage.class);
		                   alliphone.AlliPhoneImageupload(); 
		                   
		Usermanagementpage iphoneX=PageFactory.initElements(driver, Usermanagementpage.class);
		                   iphoneX.iPhoneXImageupload(); 
		                   
		Usermanagementpage allandroid=PageFactory.initElements(driver, Usermanagementpage.class);
		                   allandroid.AllandroidImageupload(); 
		                   
		Usermanagementpage ipadpo=PageFactory.initElements(driver, Usermanagementpage.class);
		                   ipadpo.IpadportaitImageupload(); 
		                   
		Usermanagementpage ipadland=PageFactory.initElements(driver, Usermanagementpage.class);
		                   ipadland.IpadLandscapeImageupload(); 
		                   
		Venuepage appturialsave=PageFactory.initElements(driver, Venuepage.class);
		          appturialsave.clickOnsave_AppTutorial(); 
		           
		          
    }
 }
