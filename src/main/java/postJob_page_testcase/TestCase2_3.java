package postJob_page_testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase2_3 extends BaseClass{
	@Test(priority=3)
	public void Verify_the_Post_a_Job()
	{
		driver.findElement(By.xpath("//button[text()='Post a Job!']")).click();
		String given="https://www.expertia.ai/getstarted";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, given);
	}

}
