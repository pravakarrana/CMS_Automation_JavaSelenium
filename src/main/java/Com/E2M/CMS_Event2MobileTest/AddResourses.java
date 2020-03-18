package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.EventSetupPage;
import Com.E2M.ObjectRepository.Venuepage;

   @Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
   public class AddResourses extends Baseclass_libraries {
	   
	   @Test
		public void CMS_E2MTest_Add_Resourse() throws Throwable  {
             String resoursetitle=flib.getexcelData("EventSetup", 1, 17);
             String resoursetilink=flib.getexcelData("EventSetup", 1, 18);
             
             
		   Venuepage vnu=PageFactory.initElements(driver, Venuepage.class);
                     vnu.ClickParticularEvent();
 
           EventSetupPage togglemenu=PageFactory.initElements(driver, EventSetupPage.class);
                          togglemenu.navigateToggleMenu();
                
           EventSetupPage CKresouse=PageFactory.initElements(driver, EventSetupPage.class);
                          CKresouse.navigateResourse();
	  
	       EventSetupPage selectresourse=PageFactory.initElements(driver, EventSetupPage.class);
	                      selectresourse.SearchresourseLink(resoursetitle, resoursetilink); 
 	                      
	       EventSetupPage selectresoursefl=PageFactory.initElements(driver, EventSetupPage.class);
	                      selectresoursefl.SearchresourseFile(); 
	                      
	       EventSetupPage selectresoursevd=PageFactory.initElements(driver, EventSetupPage.class);
	                      selectresoursevd.SearchresourseVideo();
		   
		   
		   
		   
		   
	   }
   }
