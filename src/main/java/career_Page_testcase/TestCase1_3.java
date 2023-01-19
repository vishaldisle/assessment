package career_Page_testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase1_3 extends BaseClass{
	@Test(priority=3)
	public void Verify_CareerPageButton()
	{
		driver.findElement(By.xpath("//button[text()='Create your Career Page!']")).click();
		String given="https://www.expertia.ai/getstarted";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, given);
	}

}
