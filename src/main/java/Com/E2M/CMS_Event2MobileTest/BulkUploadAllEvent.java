package Com.E2M.CMS_Event2MobileTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Eventmanagementpage;
import Com.E2M.ObjectRepository.Usermanagementpage;
import Com.E2M.ObjectRepository.UsersPage;
import Com.E2M.ObjectRepository.Venuepage;

@Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
public class BulkUploadAllEvent extends Baseclass_libraries {
	
	

	//@Test
    public void CMS_E2MTest_AddVenue_TC014() throws Throwable  {

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
                  
        UsersPage msg=PageFactory.initElements(driver, UsersPage.class);
                  msg.verifymsg();
                  
        Venuepage Eventpage=PageFactory.initElements(driver, Venuepage.class);
                  Eventpage.navigateToAllEventPage();
                  
		Venuepage vnu=PageFactory.initElements(driver, Venuepage.class);
		          vnu.ClickParticularEvent();
		          
		Venuepage info=PageFactory.initElements(driver, Venuepage.class);
		          info.navigateUsefulInfo();
		          
		Venuepage infoimport=PageFactory.initElements(driver, Venuepage.class);
		          infoimport.navigateUsefulInfoImport();
		          
	    Usermanagementpage infoimportFile=PageFactory.initElements(driver, Usermanagementpage.class);
		                   infoimportFile.OnlyClickOnUpload_Usefulinfo();
		                   
		UsersPage sva=PageFactory.initElements(driver, UsersPage.class);
		          sva.ClickOnSaveBulkupload();
		          
		UsersPage msg1=PageFactory.initElements(driver, UsersPage.class);
                  msg1.verifymsgusefulinfo();
                  
        UsersPage bck=PageFactory.initElements(driver, UsersPage.class);
                  bck.NaviagteBack(); 
                  
        Venuepage adg=PageFactory.initElements(driver, Venuepage.class);
		          adg.navigateTomenu(); 
		          
		Venuepage adgnd=PageFactory.initElements(driver, Venuepage.class);
		          adgnd.ClickonAgenda();
		
		Venuepage upload=PageFactory.initElements(driver, Venuepage.class);
		          upload.ClickonUpload();
		          
		Usermanagementpage Emp_User1=PageFactory.initElements(driver, Usermanagementpage.class);
                           Emp_User1.ClickOnUpload_Session_exhibitor_sponsor_match();             
		          
        UsersPage upld=PageFactory.initElements(driver, UsersPage.class);
                  upld.ClickOnAllBullupload();                    
		          
                   
    }
}
