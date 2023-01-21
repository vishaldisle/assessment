package career_Page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.CareerPage;
import utilityPAck.BaseClass;

public class TestCase1_3 extends BaseClass{
	@Test(priority=3)
	public void Verify_CareerPageButton() {
		CareerPage cp = new CareerPage(driver);
		cp.careerPageButton();
		String given = "https://www.expertia.ai/getstarted";
		String actual = cp.urlofcompanyDetailpage();
		Assert.assertEquals(actual, given);
	}

}
