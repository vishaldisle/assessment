package career_Page_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase1_4 extends BaseClass{
	@Test(priority=4)
	public void Verify_enterCompanyNameTextBox_displayOrNot()
	{
		WebElement CompanyNameTextBox=driver.findElement(By.xpath("//input[@placeholder='Company Name']"));
		
		boolean textBox=CompanyNameTextBox.isDisplayed();
		Assert.assertTrue(textBox);
	}
}
