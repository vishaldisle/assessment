package postJob_page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.CompanyDetailsPage;
import utilityPAck.BaseClass;

public class TestCase2_7 extends BaseClass{
	@Test(priority=7)
public void Check_the_Confirm_Details_Button() throws InterruptedException
	{	
		CompanyDetailsPage cp = new CompanyDetailsPage(driver);
		String givenURL="https://www.expertia.ai/getstarted/register/publish";
		String actualURL=cp.clickonConfirmButton();
		Assert.assertEquals(actualURL, givenURL);
		
	}	
}
