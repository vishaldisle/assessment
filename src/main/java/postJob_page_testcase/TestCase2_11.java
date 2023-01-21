package postJob_page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.JobDetailsPage;
import utilityPAck.BaseClass;

public class TestCase2_11 extends BaseClass {
	@Test(priority=11)
	public void Check_the_Job_Type_selections() throws InterruptedException
	{
		String givenjobType="Part-Time";
		JobDetailsPage jp=new JobDetailsPage(driver);
		jp.jobTypeSelection(givenjobType);
		String actualjobType=jp.jobType();
		Assert.assertEquals(actualjobType, givenjobType);
		
	}
}
