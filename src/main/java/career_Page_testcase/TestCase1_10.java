package career_Page_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase1_10 extends BaseClass{
	@Test(priority=10)
	public void Check_the_Phone_Number_text_Box()
	{	
String given2="123456789021";
		WebElement name2=driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		name2.sendKeys(given2);
		String actual2=name2.getAttribute("value").toString();
		Assert.assertEquals(actual2, given2);
		 
	}
}
