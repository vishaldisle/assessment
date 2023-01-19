package career_Page_testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilityPAck.BaseClass;

public class TestCase1_6 extends BaseClass {
	@Test(priority=6)
	public void Check_Company_Size_Drop_Down() throws InterruptedException
	{	
		driver.findElement(By.xpath("//div[@role='listbox']")).click();
		List<WebElement>lists=driver.findElements(By.xpath("//div[@role='option']"));
		for(WebElement list:lists)
		{
		    if(list.getText().equals("51-200 employees"))
		    {
		    	list.click();
		    	break;
		    }
		}
		
		String givenSize="51-200 employees";
		WebElement size=driver.findElement(By.xpath("//div[@role='listbox']/div[1]"));
		String atualSize=size.getText();
		Assert.assertEquals(atualSize, givenSize);
		Thread.sleep(3000);
	}
}
