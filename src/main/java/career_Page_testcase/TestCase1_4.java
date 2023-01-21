package career_Page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.CompanyDetailsPage;
import utilityPAck.BaseClass;

public class TestCase1_4 extends BaseClass{
	@Test(priority = 4)
	public void Verify_enterCompanyNameTextBox_displayOrNot() {
		CompanyDetailsPage cp = new CompanyDetailsPage(driver);

		boolean textBox = cp.companyNameTextBox();
		Assert.assertTrue(textBox);
	}
}
