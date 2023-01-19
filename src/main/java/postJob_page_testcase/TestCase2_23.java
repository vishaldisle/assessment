package postJob_page_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase2_23 extends BaseClass{
	@Test(priority=13)
public void Check_the_Sign_Up_For_Free_Button()
	{	

	 driver.findElement(By.xpath("//button[text()='Sign Up For Free']")).click();
	 String given="https://www.expertia.ai/getstarted/register/verify";
	 String given1="Please enter the verification code sent at ";
	 String actual=driver.getCurrentUrl();
	 WebElement actt=driver.findElement(By.xpath("//h1[text()='Please enter the verification code sent at ']"));
	 	 String actual1=actt.getText();
	 	 
	 	 Assert.assertEquals(actual, given);
	 	 Assert.assertEquals(actual1, given1);
	 
	}
}
