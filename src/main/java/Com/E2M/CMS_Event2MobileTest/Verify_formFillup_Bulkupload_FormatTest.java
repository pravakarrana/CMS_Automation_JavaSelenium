package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Eventmanagementpage;
import Com.E2M.ObjectRepository.Usermanagementpage;
import Com.E2M.ObjectRepository.UsersPage;
import Com.E2M.ObjectRepository.VerifyEncryptedFormatpage;

@Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
public class Verify_formFillup_Bulkupload_FormatTest extends Baseclass_libraries {
	
	 //@Test
     public void CMS_E2MTest_VerifyFilledBulkupload_Format_TC09 () throws Throwable {  	 
		 
         String email1=flib.getexcelData("Read", 9, 3);
		
         
		 Eventmanagementpage EMP=PageFactory.initElements(driver, Eventmanagementpage.class);
                             EMP.ClickOnMenu();
           
         Eventmanagementpage Emp_User=PageFactory.initElements(driver, Eventmanagementpage.class);
                             Emp_User.ClickOnEventManagement(); 
         
         Usermanagementpage imp=PageFactory.initElements(driver, Usermanagementpage.class);
                            imp.ClickOnImport();
        
         Usermanagementpage uplod=PageFactory.initElements(driver, Usermanagementpage.class);
                            uplod.OnlyClickOnUploadBLK();
                            
         UsersPage sv=PageFactory.initElements(driver, UsersPage.class);
                   sv.ClickOnSaveBulkupload();
                   
         //Verify the successfully message
                   
         UsersPage msg=PageFactory.initElements(driver, UsersPage.class);
                   msg.verifymsg();
                   
         UsersPage bck=PageFactory.initElements(driver, UsersPage.class);
                   bck.NaviagteBack();
                   
         UsersPage chkusers=PageFactory.initElements(driver, UsersPage.class);		          
     		       chkusers.NavigateToCheckOnUser(email1);
//     		       
//         UsersPage varify=PageFactory.initElements(driver, UsersPage.class);
//	               varify.varifyuser();
//	               
//	     UsersPage particularuser=PageFactory.initElements(driver, UsersPage.class);
//	               particularuser.ClickOnUser();          
//         
//	     UsersPage vefifyfstnameBLK=PageFactory.initElements(driver, UsersPage.class);
//		           vefifyfstnameBLK.VerifyBLKfirstname();
//		           vefifyfstnameBLK.verifyBLKlastname();
//		           vefifyfstnameBLK.VerifyBLKPosition();
//		           vefifyfstnameBLK.VerifyBLKOrganisation();
 

}
}
