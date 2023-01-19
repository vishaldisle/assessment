package postJob_page_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase2_8 extends BaseClass {
	@Test(priority=8)
	public void Check_the_Job_Title_text_box()
	{
	
		WebElement jobtit=driver.findElement(By.xpath("//input[@placeholder='Job Title']"));
		Assert.assertTrue(jobtit.isDisplayed());
		jobtit.sendKeys("Software Engineer");
		Assert.assertNotNull(jobtit);
		
	}

}
