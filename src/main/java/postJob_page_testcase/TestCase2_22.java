package postJob_page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.SignUpOrLoginPage;
import utilityPAck.BaseClass;

public class TestCase2_22 extends BaseClass{
	@Test(priority=12)
	public void Check_the_Password_text_Box()
	{	
		String given4="1234567@expertia";
		SignUpOrLoginPage sp = new SignUpOrLoginPage(driver);
		sp.passwordTextbox(given4);
		String actual4=sp.valuePassword();
		Assert.assertEquals(actual4, given4);
		 
}
}
