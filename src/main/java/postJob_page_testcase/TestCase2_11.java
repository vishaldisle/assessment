package postJob_page_testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase2_11 extends BaseClass {
	@Test(priority=11)
	public void Check_the_Job_Type_selections()
	{
		List<WebElement>lists=driver.findElements(By.xpath("div[@class='ThemedTag__StyledTag-sc-371q41-1 iiNgzY theme-tag-']"));
		for(WebElement list:lists)
		{
		    if(list.getText().equals("Full-Time"))
		    {
		    	list.click();
		    	break;
		    }
		}
		
		String givenSize="Full-Time";
		WebElement size=driver.findElement(By.xpath("//div[text()='Full-Time']"));
		String atualSize=size.getText();
		Assert.assertEquals(atualSize, givenSize);
		
	}
}
