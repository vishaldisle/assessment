package postJob_page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.SignUpOrLoginPage;
import utilityPAck.BaseClass;

public class TestCase2_21 extends BaseClass{
	@Test(priority=11)
	public void Check_the_Work_Email_Box()
	{	
		String given3="expertia1ai@test.com";
		SignUpOrLoginPage sp = new SignUpOrLoginPage(driver);
		sp.workEmail(given3);
		String actual3=sp.valueWorkEmail();
		Assert.assertEquals(actual3, given3);
}
}
