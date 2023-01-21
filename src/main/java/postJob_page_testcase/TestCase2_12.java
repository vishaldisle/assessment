package postJob_page_testcase;

import org.testng.Assert;

import pomClasses.JobDetailsPage;
import utilityPAck.BaseClass;

public class TestCase2_12 extends BaseClass{

	public void Check_nextButton_click()
	{
		String givenText="Add Additional Questions";
		JobDetailsPage jp=new JobDetailsPage(driver);
		jp.nextButton();
		
		String actualText=jp.addAdditionalQuestion();
		Assert.assertEquals(actualText, givenText);
	}
	
	
	
	
	
	
	
}
