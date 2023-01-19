package postJob_page_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase2_18 extends BaseClass{
	@Test(priority=8)
	public void Check_the_First_Name_text_Box()
	{	
		String given="ABCDEF";
		WebElement name=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		name.sendKeys(given);
		String actual=name.getAttribute("value").toString();
		Assert.assertEquals(actual, given);
		 
	}	
}
