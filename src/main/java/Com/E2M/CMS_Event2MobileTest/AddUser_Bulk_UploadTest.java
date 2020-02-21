package Com.E2M.CMS_Event2MobileTest;

 

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Eventmanagementpage;
import Com.E2M.ObjectRepository.Usermanagementpage;
import Com.E2M.ObjectRepository.UsersPage;

    @Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
    public class AddUser_Bulk_UploadTest extends Baseclass_libraries {
	
	
	 //@Test
     public void CMS_E2MTest_BulkUpload_TC05() throws Throwable  {
	
	
		 Eventmanagementpage EMP=PageFactory.initElements(driver, Eventmanagementpage.class);
                             EMP.ClickOnMenu();
                             
         Eventmanagementpage Emp_User=PageFactory.initElements(driver, Eventmanagementpage.class);
                             Emp_User.ClickOnEventManagement(); 
                             
	     Usermanagementpage imp=PageFactory.initElements(driver, Usermanagementpage.class);
	                        imp.ClickOnImport();
	                        
	     Usermanagementpage uplod=PageFactory.initElements(driver, Usermanagementpage.class);
	                        uplod.OnlyClickOnUpload();
         UsersPage sv=PageFactory.initElements(driver, UsersPage.class);
                   sv.ClickOnSaveBulkupload();
                   
	     //Verify the successfully message
         
         UsersPage msg=PageFactory.initElements(driver, UsersPage.class);
                    msg.verifymsg();
            
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
}
}
