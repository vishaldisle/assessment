package postJob_page_testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase2_12 extends BaseClass {
	@Test(priority=10)
	public void Check_the_Industry_type_text_box() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@placeholder='Software']")).sendKeys("Hu");
		List<WebElement>allsug=driver.findElements(By.xpath("//div[@class='results transition']/div"));
		for(WebElement list:allsug)
		{
			if(list.getText().equals("Human Resources"))
			{
				list.click();
				Thread.sleep(3000);
				break;
			}
		}
WebElement display=driver.findElement(By.xpath("//div[text()='Add +']"));

Assert.assertTrue(display.isDisplayed());
		
	}
}
//