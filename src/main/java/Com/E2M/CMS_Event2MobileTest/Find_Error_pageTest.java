package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Errorpage;
 
@Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
public class Find_Error_pageTest extends Baseclass_libraries{

	
	 @Test
     public void CMS_E2MTest_Errorpage() throws Throwable  {

		 
		 Errorpage vnsu=PageFactory.initElements(driver, Errorpage.class);
 		          vnsu.ClickParticularEvent();
}
}
