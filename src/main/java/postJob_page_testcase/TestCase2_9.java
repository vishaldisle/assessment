package postJob_page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.JobDetailsPage;
import utilityPAck.BaseClass;

public class TestCase2_9 extends BaseClass {
	@Test(priority=9)
	public void Check_the_Experience_Required_Drop_Down() throws InterruptedException
	{
		String givenSize="Mid-Level: 4 to 6 years";
		JobDetailsPage jp=new JobDetailsPage(driver);
		jp.experienceDropdownBoxclick();
		jp.requiredExperienceDropdown(givenSize);
		String actualSize=jp.actualSelectedExperience();
		System.out.println(actualSize);
		Assert.assertEquals(actualSize, givenSize);
		
	}
}
