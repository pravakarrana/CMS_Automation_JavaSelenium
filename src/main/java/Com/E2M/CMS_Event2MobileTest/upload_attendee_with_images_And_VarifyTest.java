package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Eventmanagementpage;
import Com.E2M.ObjectRepository.Usermanagementpage;
import Com.E2M.ObjectRepository.UsersPage;

    @Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
    public class upload_attendee_with_images_And_VarifyTest extends Baseclass_libraries {

	

    //@Test
    public void CMS_E2MTest_BulkUpload_TC07() throws Throwable  {
    	 String email=flib.getexcelData("Read", 7, 3);

	
		 Eventmanagementpage EMP=PageFactory.initElements(driver, Eventmanagementpage.class);
                             EMP.ClickOnMenu();  
                            
         Eventmanagementpage Emp_User=PageFactory.initElements(driver, Eventmanagementpage.class);
                             Emp_User.ClickOnEventManagement();  
                            
	     Usermanagementpage imp=PageFactory.initElements(driver, Usermanagementpage.class);
	                        imp.ClickOnImport();
	                        
	     Usermanagementpage uplod=PageFactory.initElements(driver, Usermanagementpage.class);
	                        uplod.ClickOnUpload();
	                        
	     Usermanagementpage uploadzip=PageFactory.initElements(driver, Usermanagementpage.class);
	                        uploadzip.ClickOnUploadZip();
	                        
         UsersPage sv=PageFactory.initElements(driver, UsersPage.class);
                   sv.ClickOnSaveBulkupload();
                   
         UsersPage msg=PageFactory.initElements(driver, UsersPage.class);
    	           msg.verifymsg();
    	           
    	 UsersPage bck=PageFactory.initElements(driver, UsersPage.class);
                   bck.NaviagteBack();
                   
         UsersPage chkusers=PageFactory.initElements(driver, UsersPage.class);		          
     		       chkusers.NavigateToCheckOnUser(email);
     		       
         UsersPage varify=PageFactory.initElements(driver, UsersPage.class);
	               varify.varifyuser();
	               
	     UsersPage particularuser=PageFactory.initElements(driver, UsersPage.class);
	               particularuser.ClickOnUser();
	               
	     UsersPage imge=PageFactory.initElements(driver, UsersPage.class);
	               imge.VarifyImage();	
	 }
}
