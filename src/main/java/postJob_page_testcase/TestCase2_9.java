package postJob_page_testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase2_9 extends BaseClass {
	@Test(priority=9)
	public void Check_the_Experience_Required_Drop_Down()
	{
	
		driver.findElement(By.xpath("//div[@role='listbox']")).click();
		List<WebElement>lists=driver.findElements(By.xpath("//div[@role='option']"));
		for(WebElement list:lists)
		{
		    if(list.getText().equals("Mid-Level: 4 to 6 years"))
		    {
		    	list.click();
		    	break;
		    }
		}
		
		String givenSize="Mid-Level: 4 to 6 years";
		WebElement size=driver.findElement(By.xpath("//div[@role='listbox']/div/div[3]"));
		String atualSize=size.getText();
		Assert.assertEquals(atualSize, givenSize);
		
	}
}
