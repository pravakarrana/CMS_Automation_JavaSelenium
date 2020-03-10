package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.EventSetupPage;
import Com.E2M.ObjectRepository.Venuepage;

   @Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
   public class AppBranding extends Baseclass_libraries {
	
	@Test
	public void CMS_E2MTest_Theme_Splash_Background_Banner_1TC014() throws Throwable  {
		
		Venuepage vnu=PageFactory.initElements(driver, Venuepage.class);
                  vnu.ClickParticularEvent();
  
		EventSetupPage togglemenu=PageFactory.initElements(driver, EventSetupPage.class);
		               togglemenu.navigateToggleMenu();
		               
		EventSetupPage CKbranding=PageFactory.initElements(driver, EventSetupPage.class);
		               CKbranding.navigateAppBranding();
		               
		EventSetupPage topbar=PageFactory.initElements(driver, EventSetupPage.class);
		               topbar.Logo_themecolor();  
		             
		//EventLogo              
		EventSetupPage evntlogo=PageFactory.initElements(driver, EventSetupPage.class);
		               evntlogo.Eventlogo();
		
		//EventSplash
		EventSetupPage clsplash=PageFactory.initElements(driver, EventSetupPage.class);
		               clsplash.Navigate_AddSplash();
		               
		EventSetupPage dltsplash1=PageFactory.initElements(driver, EventSetupPage.class);
		               dltsplash1.SelectEventusessplash();
		               
		EventSetupPage splashtime=PageFactory.initElements(driver, EventSetupPage.class);
		               splashtime.AddSplashTime("3"); 
		               
		EventSetupPage dltsplash=PageFactory.initElements(driver, EventSetupPage.class);
		               dltsplash.Deletesplashandverify(); 
 
		               
		EventSetupPage dltsplashport=PageFactory.initElements(driver, EventSetupPage.class);
		               dltsplashport.Deletesplashporttaitverify();
 
		               
		EventSetupPage dltsplashiphone=PageFactory.initElements(driver, EventSetupPage.class);
		               dltsplashiphone.DeletesplashIphone();
	 
		EventSetupPage dltsplashiphoneX=PageFactory.initElements(driver, EventSetupPage.class);
		               dltsplashiphoneX.DeletesplashIphoneX(); 
 
		EventSetupPage splashsave=PageFactory.initElements(driver, EventSetupPage.class);
		               splashsave.SaveSplash();
		
		//EventBackground
		EventSetupPage evntbckgrnd=PageFactory.initElements(driver, EventSetupPage.class);
		               evntbckgrnd.navigatetoEventbackground(); 
		               
		EventSetupPage evntbckgrndscrn=PageFactory.initElements(driver, EventSetupPage.class);
		               evntbckgrndscrn.SelectEventusesbackground();
		               
		EventSetupPage evntbckgrndradio=PageFactory.initElements(driver, EventSetupPage.class);
		               evntbckgrndradio.clickonImageorColorRadioButton();  
		               
		EventSetupPage typeofimage=PageFactory.initElements(driver, EventSetupPage.class);
		               typeofimage.SelectGalleryorImageupload(); 
		               
		EventSetupPage import1=PageFactory.initElements(driver, EventSetupPage.class);
		               import1.importEventbackground(); 
		               
		EventSetupPage saveandverify=PageFactory.initElements(driver, EventSetupPage.class);
		               saveandverify.save_and_verify_sucessful_status(); 
		             
		//EventBanner
		EventSetupPage bannerandAddNew=PageFactory.initElements(driver, EventSetupPage.class);
		               bannerandAddNew.navigatetoBanner(); 
		               
		EventSetupPage import11=PageFactory.initElements(driver, EventSetupPage.class);
		               import11.importEventbanner();
		               
		EventSetupPage Addbanner=PageFactory.initElements(driver, EventSetupPage.class);
		               Addbanner.BannerAdd();
		
		
    }
 }
