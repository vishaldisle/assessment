package career_Page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.SignUpOrLoginPage;
import utilityPAck.BaseClass;

public class TestCase1_8 extends BaseClass{
	@Test(priority=8)
	public void Check_the_First_Name_text_Box()
	{	
		String given="ABCDEF";
		SignUpOrLoginPage sp=new SignUpOrLoginPage(driver);
		sp.firstName(given);
		String actual=sp.valueFirstName();
		Assert.assertEquals(actual, given);
		 
	}	
}
