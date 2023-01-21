package postJob_page_testcase;

import org.testng.Assert;

import pomClasses.AddSkillPage;
import utilityPAck.BaseClass;

public class TestCase2_13 extends BaseClass {

	public void check_addSkill_textBox() throws InterruptedException
	{
		AddSkillPage ap=new AddSkillPage(driver);
		ap.addSkilltextBox("Java");
		ap.nameofSkilladd("JavaScript");
		String actualSkill=ap.skillAdded();
		
		Assert.assertNotNull(actualSkill);
	}
	
	
	
	
	
}
