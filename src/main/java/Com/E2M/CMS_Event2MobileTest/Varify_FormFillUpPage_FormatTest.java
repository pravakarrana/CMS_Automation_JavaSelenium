package Com.E2M.CMS_Event2MobileTest;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.ObjectRepository.Eventmanagementpage;
import Com.E2M.ObjectRepository.Usermanagementpage;
import Com.E2M.ObjectRepository.UsersPage;
 
     @Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
     public class Varify_FormFillUpPage_FormatTest extends Baseclass_libraries {
	

	 //@Test
     public void CMS_E2MTest_VerifyFilledFormFormat_TC08() throws Throwable {
		 Random num=new Random();
         int name=num.nextInt(1000);
         String email="aadamlori"+name+"@webspiders.com";
         
		 String firstname   =flib.getexcelData("Read", 8, 1);
         String lastname    =flib.getexcelData("Read", 8, 2);
         String WriteEmail  =flib.setexcelData("Write", 8, 3, email);
         String position    =flib.getexcelData("Read", 8, 4);
         String organisation=flib.getexcelData("Read", 8, 5);

	     
      
	      Eventmanagementpage EMP=PageFactory.initElements(driver, Eventmanagementpage.class);
                              EMP.ClickOnMenu();
	         
	      Eventmanagementpage Emp_User=PageFactory.initElements(driver, Eventmanagementpage.class);
                              Emp_User.ClickOnEventManagement();	     
     
          Usermanagementpage addusr=PageFactory.initElements(driver, Usermanagementpage.class);	
                             addusr.ClickOnAddUsers();
	     
          UsersPage fillfrm=PageFactory.initElements(driver, UsersPage.class);	
     		        fillfrm.Fillformfirstname(firstname);
     		        fillfrm.Fillformlastname(lastname); 
     		        fillfrm.Fillformemail(email);
     		        fillfrm.FillformPosition(position);
     		        fillfrm.FillformOrganisation(organisation);
     		        
     	  UsersPage saveusr=PageFactory.initElements(driver, UsersPage.class);
                    saveusr.ClickOnSave();
                    
          Alert alt=driver.switchTo().alert();
		        alt.accept();
 	 
 		  UsersPage chkusr=PageFactory.initElements(driver, UsersPage.class);		          
		            chkusr.NavigateToCheckOnUser(WriteEmail);
    
  		  UsersPage varify=PageFactory.initElements(driver, UsersPage.class);
		            varify.varifyuser();
		            
		  UsersPage particularuser=PageFactory.initElements(driver, UsersPage.class);
		            particularuser.ClickOnUser();
     		        
		  UsersPage vefifyfstname=PageFactory.initElements(driver, UsersPage.class);
		            vefifyfstname.Verifyfirstname();
		            vefifyfstname.verifylastname();
		            vefifyfstname.VerifyPosition();
		            vefifyfstname.VerifyOrganisation();
                
                 
	
	 }
}
