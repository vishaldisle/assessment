package postJob_page_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase2_19 extends BaseClass{
	@Test(priority=9)
	public void Check_the_Last_Name_text_Box()
	{	
		String given1="WXYZs";
		WebElement name1=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		name1.sendKeys(given1);
		String actual1=name1.getAttribute("value").toString();
		Assert.assertEquals(actual1, given1);
		 
	}
}
