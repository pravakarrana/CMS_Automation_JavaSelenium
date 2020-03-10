package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Usermanagementpage;
import Com.E2M.ObjectRepository.Venuepage;
@Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
public class E2E_AboutEvent extends Baseclass_libraries {

	@Test
	public void CMS_E2MTest_disclaimer_TC014() throws Throwable  {
		String Level=flib.getexcelData("EventSetup", 1, 1);
		String acceptancelevel=flib.getexcelData("EventSetup", 1, 2);
		String venue=flib.getexcelData("EventSetup", 1, 0);
		String sociallink=flib.getexcelData("EventSetup", 1, 6);
		String sociallinkUrl=flib.getexcelData("EventSetup", 1, 7);
		String usefulname=flib.getexcelData("EventSetup", 1, 3);
		String usefulTag=flib.getexcelData("EventSetup", 1, 4);
		
		Venuepage vnu=PageFactory.initElements(driver, Venuepage.class);
                  vnu.ClickParticularEvent();
        
        /*AppTutorial*/
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
		
        /*Disclaimer*/
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
		 
		/*Venue*/         
        Venuepage addvnue=PageFactory.initElements(driver, Venuepage.class);
                  addvnue.navigateAddVenue();
         
        Venuepage vnuname=PageFactory.initElements(driver, Venuepage.class);
                  vnuname.AddVenueName(venue);
        
        Venuepage vnuaddr=PageFactory.initElements(driver, Venuepage.class);
                  vnuaddr.AddAddress();
        
        Venuepage sv=PageFactory.initElements(driver, Venuepage.class);
                  sv.clickOnsave();         
         
        Venuepage edit=PageFactory.initElements(driver, Venuepage.class);
                  edit.ClickonEditManagevenuepage();

        Venuepage lat=PageFactory.initElements(driver, Venuepage.class);
                  lat.CheckLatitude();
        
         Venuepage lan=PageFactory.initElements(driver, Venuepage.class);
                   lan.CheckLongitude();
        
        Venuepage pcode=PageFactory.initElements(driver, Venuepage.class);
                  pcode.CheckZip_Post_Code();
        
        Venuepage cty=PageFactory.initElements(driver, Venuepage.class);
                  cty.CheckCity();
        
        Venuepage cnty=PageFactory.initElements(driver, Venuepage.class);
                  cnty.CheckCountry();
         
        /*SocialLink*/
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
		 
		/*UseFulInfo*/
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
