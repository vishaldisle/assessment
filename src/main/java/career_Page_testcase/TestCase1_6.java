package career_Page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.CompanyDetailsPage;
import utilityPAck.BaseClass;

public class TestCase1_6 extends BaseClass {
	@Test(priority=6)
	public void Check_Company_Size_Drop_Down() throws InterruptedException {
		CompanyDetailsPage cp = new CompanyDetailsPage(driver);
		cp.dropdownBox();

		cp.companySizedropdown("51-200 employees");

		String givenSize = "51-200 employees";

		String atualSize = cp.actualSizegot();
		Assert.assertEquals(atualSize, givenSize);
		Thread.sleep(3000);
	}
}
