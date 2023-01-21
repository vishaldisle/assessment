package career_Page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.SignUpOrLoginPage;
import utilityPAck.BaseClass;

public class TestCase1_10 extends BaseClass{
	@Test(priority = 10)
	public void Check_the_Phone_Number_text_Box() {
		String given2 = "123456789021";
		SignUpOrLoginPage sp = new SignUpOrLoginPage(driver);
		sp.phoneNumber(given2);
		String actual2 = sp.valuePhoneNumber();
		Assert.assertEquals(actual2, given2);

	}
}
