package postJob_page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase2_1 extends BaseClass
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
