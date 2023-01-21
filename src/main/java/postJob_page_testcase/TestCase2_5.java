package postJob_page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.CompanyDetailsPage;
import utilityPAck.BaseClass;

public class TestCase2_5 extends BaseClass{
	@Test(priority=5)
	public void Check_ComapnyNameEnter() throws InterruptedException
	{	
		CompanyDetailsPage cp = new CompanyDetailsPage(driver);
		cp.comapnyNameEnter("Expertia");

		cp.nameOfCompany("Expertia AI");

		String Given_Website_Url = "https://www.expertia.ai";
		String Given_Head_Quarters = "Bangalore";

		String Actual_Head_Quarters = cp.headQuarterName();
		Assert.assertEquals(Actual_Head_Quarters, Given_Head_Quarters);

		String Actual_Website_Url = cp.website_UrlName();
		Assert.assertEquals(Actual_Website_Url, Given_Website_Url);
	}
}
