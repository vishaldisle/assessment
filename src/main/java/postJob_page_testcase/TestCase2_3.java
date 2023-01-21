package postJob_page_testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.PostAJobPage;
import utilityPAck.BaseClass;

public class TestCase2_3 extends BaseClass{
	@Test(priority=3)
	public void Verify_the_Post_a_Job()
	{
		String given="https://www.expertia.ai/getstarted";
		PostAJobPage pp=new PostAJobPage(driver);
		pp.postJobButton();
		
		String actual=pp.urlofcompanyDetailpage();
		Assert.assertEquals(actual, given);
	}

}
