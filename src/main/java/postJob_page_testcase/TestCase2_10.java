package postJob_page_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase2_10 extends BaseClass {
	@Test(priority=10)
	public void Check_the_Job_Location_text_box()
	{
	
		WebElement jobtit=driver.findElement(By.xpath("//input[@placeholder='Job Location']"));
		Assert.assertTrue(jobtit.isDisplayed());
		jobtit.sendKeys("India");
		Assert.assertNotNull(jobtit);
		
	}
}
