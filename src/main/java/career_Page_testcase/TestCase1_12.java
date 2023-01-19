package career_Page_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase1_12 extends BaseClass{
	@Test(priority=12)
	public void Check_the_Password_text_Box()
	{	
String given4="1234567@expertia";
		WebElement name4=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		name4.sendKeys(given4);
		String actual4=name4.getAttribute("value").toString();
		Assert.assertEquals(actual4, given4);
		 
}
}
