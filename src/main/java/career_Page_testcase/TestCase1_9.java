package career_Page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.SignUpOrLoginPage;
import utilityPAck.BaseClass;

public class TestCase1_9 extends BaseClass{
	@Test(priority=9)
	public void Check_the_Last_Name_text_Box() {
		String given1 = "WXYZs";
		SignUpOrLoginPage sp = new SignUpOrLoginPage(driver);
		sp.lastName(given1);
		String actual1 = sp.valueLastName();
		Assert.assertEquals(actual1, given1);

	}
}
