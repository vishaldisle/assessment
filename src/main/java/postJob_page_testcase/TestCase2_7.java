package postJob_page_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase2_7 extends BaseClass{
	@Test(priority=7)
public void Check_the_Confirm_Details_Button()
	{	

		try {
		     driver.findElement(By.xpath("//button[@class='ui icon right labeled button']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@class='ui icon right labeled button']")));
		  }
		String givenURL="https://www.expertia.ai/getstarted/register/confirm";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, givenURL);
		
	}	
}
