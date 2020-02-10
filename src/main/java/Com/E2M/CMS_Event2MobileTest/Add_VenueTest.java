package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Venuepage;

  @Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
  public class Add_VenueTest extends Baseclass_libraries {
	
	
	 @Test
     public void CMS_E2MTest_AddVenue_TC014() throws Throwable  {

		 
		Venuepage vnu=PageFactory.initElements(driver, Venuepage.class);
 		          vnu.ClickParticularEvent();
 		          
 		Venuepage addvnue=PageFactory.initElements(driver, Venuepage.class);
 		          addvnue.navigateAddVenue();
 		          
 		Venuepage vnuname=PageFactory.initElements(driver, Venuepage.class);
		          vnuname.AddVenueName("Karunamayee");
		          
	    Venuepage vnuaddr=PageFactory.initElements(driver, Venuepage.class);
	              vnuaddr.AddAddress();
		
//	    Venuepage sv=PageFactory.initElements(driver, Venuepage.class);
//	              sv.clickOnsave();
// 		 
}
}
