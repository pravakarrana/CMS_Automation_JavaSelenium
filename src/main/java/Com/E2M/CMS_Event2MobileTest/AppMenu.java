package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.EventSetupPage;
import Com.E2M.ObjectRepository.ResponsiveLoginPage;
import Com.E2M.ObjectRepository.Venuepage;

  @Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
  public class AppMenu extends Baseclass_libraries {
	  
	    @Test
		public void CMS_E2MTest_Theme_Splash_Background_Banner_1TC014() throws Throwable  {
		
		  
	    	Venuepage vnu=PageFactory.initElements(driver, Venuepage.class);
                      vnu.ClickParticularEvent();
            
            EventSetupPage togglemenu=PageFactory.initElements(driver, EventSetupPage.class);
                           togglemenu.navigateToggleMenu();
                           
            EventSetupPage CKbranding=PageFactory.initElements(driver, EventSetupPage.class);
    		               CKbranding.navigateAppMenu();
		  
    		EventSetupPage mngmenu=PageFactory.initElements(driver, EventSetupPage.class);
    		               mngmenu.NavigateToManageAMenuItem(); 
    		               
    		EventSetupPage mngmenucategory=PageFactory.initElements(driver, EventSetupPage.class);
    		               mngmenucategory.SelectCategoryManageMenu();
    		               
    		EventSetupPage mngmenucategoryc=PageFactory.initElements(driver, EventSetupPage.class);
    		               mngmenucategoryc.CheckAgenda(); 
    		               
    		ResponsiveLoginPage mngmenucategoryc1=PageFactory.initElements(driver, ResponsiveLoginPage.class);
    		                    mngmenucategoryc1.OpenNewTabwith_Responsive(); 
		  
    		ResponsiveLoginPage mngmenucatersp=PageFactory.initElements(driver, ResponsiveLoginPage.class);
    		                    mngmenucatersp.selectResponsiveEvent();
    		                    
    		ResponsiveLoginPage mn=PageFactory.initElements(driver, ResponsiveLoginPage.class);
    		                    mn.SelectDisclaimer();
    		                    
    		ResponsiveLoginPage mngmenu1=PageFactory.initElements(driver, ResponsiveLoginPage.class);
    		                    mngmenu1.SelectIconBar();
    		                    
    		ResponsiveLoginPage selmenu=PageFactory.initElements(driver, ResponsiveLoginPage.class);
    		                    selmenu.SelectMenu(); 
    		                    
    		ResponsiveLoginPage iconmenu=PageFactory.initElements(driver, ResponsiveLoginPage.class);
    		                    iconmenu.CheckVisibleorNotIconList(); 
//    		                    <dependency>
//    		                    <groupId>org.seleniumhq.selenium</groupId>
//    		                    <artifactId>selenium-htmlunit-driver</artifactId>
//    		                    <version>2.38.0</version>
//    		                </dependency>   
    		                    
//
//<dependency>
//    <groupId>org.seleniumhq.selenium</groupId>
//    <artifactId>selenium-java</artifactId>
//    <version>2.53.1</version>
//  </dependency>
    		                    
    		                    
    		                    
    		                    
    		                    
    		                    
    		                    
	  }
   }
