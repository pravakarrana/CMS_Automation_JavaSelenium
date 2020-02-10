package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Event_SetUp_Page;
import Com.E2M.ObjectRepository.Venuepage;


@Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
public class PageValidation_Event_SetUpTest extends Baseclass_libraries {
	
	 @Test
     public void CMS_E2MTest_AboutEvent() throws Throwable  {
	 
 		 
		 Event_SetUp_Page ss= PageFactory.initElements(driver, Event_SetUp_Page.class);
		 ss.clickevent();
		 
		 
		 
		 Event_SetUp_Page s= PageFactory.initElements(driver, Event_SetUp_Page.class);
		 s.printallerror();
		 
//		 Venuepage vnu=PageFactory.initElements(driver, Venuepage.class);
//                   vnu.ClickParticularEvent(); 
//                   
//		 Event_SetUp_Page s=PageFactory.initElements(driver, Event_SetUp_Page.class);
//		                  s.Printallsubmoduleof_aboutevent();
//		 
//		 Event_SetUp_Page k=PageFactory.initElements(driver, Event_SetUp_Page.class);
//		                  k.ss();
//		 
//         Event_SetUp_Page cl=PageFactory.initElements(driver, Event_SetUp_Page.class);
//                          cl.click();  
//                          
//         Event_SetUp_Page prlink=PageFactory.initElements(driver, Event_SetUp_Page.class);
//                          prlink.prolink();
//		 
//         Event_SetUp_Page gen=PageFactory.initElements(driver, Event_SetUp_Page.class);
//                          gen.gennk();  
//                          
//         Event_SetUp_Page chk=PageFactory.initElements(driver, Event_SetUp_Page.class);
//                          chk.check();  
	 }

}
