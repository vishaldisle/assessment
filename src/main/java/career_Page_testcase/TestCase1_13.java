package career_Page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.SignUpOrLoginPage;
import pomClasses.VerifyEmailPage;
import utilityPAck.BaseClass;

public class TestCase1_13 extends BaseClass{
	@Test(priority = 13)
	public void Check_the_Sign_Up_For_Free_Button() {
		String given = "https://www.expertia.ai/getstarted/register/verify";
		String given1 = "Please enter the verification code sent at ";

		SignUpOrLoginPage sp = new SignUpOrLoginPage(driver);
		sp.signUpForFreeButton();

		String actual = sp.getEmailVerifyPageURL();
		System.out.println(actual);

		VerifyEmailPage vp = new VerifyEmailPage(driver);
		String actual1 = vp.textOnVerifyEmailPage();
		System.out.println(actual1);

		Assert.assertEquals(actual, given);
		Assert.assertEquals(actual1, given1);

	}
}
