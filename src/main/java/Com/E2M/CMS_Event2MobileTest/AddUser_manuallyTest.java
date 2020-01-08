package Com.E2M.CMS_Event2MobileTest;

 
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import Com.E2M.GenericLibraries.Baseclass_libraries;
import Com.E2M.GenericLibraries.ListenerClass;
import Com.E2M.ObjectRepository.Eventmanagementpage;
import Com.E2M.ObjectRepository.Usermanagementpage;
import Com.E2M.ObjectRepository.UsersPage;
  
             @Listeners(Com.E2M.GenericLibraries.ListenerClass.class)
             public class AddUser_manuallyTest extends Baseclass_libraries {
	        
	     	
	         //@Test
	         public void CMS_E2MTest_AddUser_TC06() throws Throwable {
	        	 
	        	 Random num=new Random();
	             int name=num.nextInt(1000);
	             String email="aadamlori"+name+"@webspiders.com";
	             
 	        	 String firstname   =flib.getexcelData("Read", 6, 1);
		         String lastname    =flib.getexcelData("Read", 6, 2);
		         String WriteEmail  =flib.setexcelData("Write", 6, 3, email);
		         String position    =flib.getexcelData("Read", 6, 4);
		         String organisation=flib.getexcelData("Read", 6, 5); 
		         
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
		   	  	                      
		}
}
