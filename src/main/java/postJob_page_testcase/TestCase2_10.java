package postJob_page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.JobDetailsPage;
import utilityPAck.BaseClass;

public class TestCase2_10 extends BaseClass {
	@Test(priority=10)
	public void Check_the_Job_Location_text_box()
	{
	     String givenLocation="India";
		JobDetailsPage jp=new JobDetailsPage(driver);
		Assert.assertTrue(jp.jobLocationbox());
		jp.jobLocationtext(givenLocation);
		Assert.assertNotNull(givenLocation);
		
	}
}
