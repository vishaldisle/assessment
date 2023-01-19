package career_Page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase1_1 extends BaseClass
{
	@Test(priority=1)
	public void verify_the_URL()
	{
		String givenURL="https://www.expertia.ai/";
		
		driver.get("https://www.expertia.ai/");
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, givenURL);
	}
}
