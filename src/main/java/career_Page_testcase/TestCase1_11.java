package career_Page_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase1_11 extends BaseClass{
	@Test(priority=11)
	public void Check_the_Phone_Number_text_Box()
	{	
String given3="expertia1ai@test.com";
		WebElement name3=driver.findElement(By.xpath("//input[@placeholder='Work Email']"));
		Assert.assertTrue(name3.isDisplayed());
		name3.sendKeys(given3);
		String actual3=name3.getAttribute("value").toString();
		Assert.assertEquals(actual3, given3);
		 
}
}
