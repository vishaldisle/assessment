package postJob_page_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.CareerPage;
import pomClasses.MainPage;
import utilityPAck.BaseClass;

public class TestCase2_2 extends BaseClass{
	@Test(priority=2)
	public void Verify_the_Button_Access_For_Free() throws InterruptedException
	{
		

		MainPage url = new MainPage(driver);
		url.accesForFreeButton();

		CareerPage cp = new CareerPage(driver);
		String givenText = "Create Your Company Career Page";
		String actualText = cp.careerPageName();
		Assert.assertEquals(actualText, givenText);

	}
}
