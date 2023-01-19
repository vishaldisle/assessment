package postJob_page_testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase2_5 extends BaseClass{
	@Test(priority=5)
	public void Check_ComapnyNameEnter() throws InterruptedException
	{	

		driver.findElement(By.xpath("//input[@placeholder='Company Name']")).sendKeys("Expertia");
		List<WebElement>allsug=driver.findElements(By.xpath("//div[@class='result']/div/div"));
		for(WebElement list:allsug)
		{
			if(list.getText().equals("Expertia AI"))
			{
				list.click();
				Thread.sleep(3000);
				break;
			}
		}
		
		String Given_Website_Url="https://www.expertia.ai";
		String Given_Head_Quarters="Bangalore";
		WebElement headQuarter=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div[3]/div[1]/div[1]/div/div/input"));
		WebElement Website_Url=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div[3]/div[2]/div[2]/div/div/input"));
		Thread.sleep(4000);
		String Actual_Head_Quarters=headQuarter.getAttribute("value").toString();
		Assert.assertEquals(Actual_Head_Quarters, Given_Head_Quarters);
		
		String Actual_Website_Url=Website_Url.getAttribute("value").toString();
		Assert.assertEquals(Actual_Website_Url, Given_Website_Url);
	}
}
