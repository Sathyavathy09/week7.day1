package testcases;

import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class CreateLead extends BaseHooks {
	
	@Test
	public void runCreateLead()
	
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyCRMSFAdisplayed()
		.clickCRMFSA()
		.clickLeadsButton()
		.clickCreateLeads()
		.enterCompany()
		.enterFirstName()
		.enterLastName()
		.clickSubmitButton()
		.verifyFirsName();
		
		
	}

}
