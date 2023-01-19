package career_Page_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase1_2 extends BaseClass{
	@Test(priority=2)
	public void Verify_the_Button_Access_For_Free() throws InterruptedException
	{
		JavascriptExecutor js=	(JavascriptExecutor) driver;
		js.executeScript("scroll(0,300)");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ui button GetStartedHeader__StyleButton-sc-fm1kyw-21 iYMvVn']")).click();
		String givenText="Create Your Company Career Page";
		WebElement text=driver.findElement(By.xpath("//h2[text()='Create Your Company Career Page']"));

		String actualText=text.getText();
		Assert.assertEquals(actualText, givenText);

	}
}
