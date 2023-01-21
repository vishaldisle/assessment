package postJob_page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.JobDetailsPage;
import utilityPAck.BaseClass;

public class TestCase2_8 extends BaseClass {
	@Test(priority = 8)
	public void Check_the_Job_Title_text_box() throws InterruptedException {
		
		String given="Software Engineer";
		JobDetailsPage jp=new JobDetailsPage(driver);
		boolean jobtit =jp.jobTitalTextboxDisplay();
		Assert.assertTrue(jobtit);
		jp.jobTitalTextbox(given);
		Assert.assertNotNull(jobtit);

	}

}
