package pomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSkillPage {

	private WebDriver driver;
	
@FindBy(xpath="//input[@placeholder='Try...Python Developer']")	
private WebElement addskill;

public void addSkilltextBox(String skill)
{
	addskill.sendKeys(skill);
}
//	
@FindAll({
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]"),
	@FindBy(xpath="//div[@class='result']")
})
private List<WebElement>skille;

public void nameofSkilladd(String skill) throws InterruptedException
{
	for(WebElement list:skille)
	{
		if(list.getText().equals(skill))
		{
			list.click();
			Thread.sleep(3000);
			break;
		}
	}
	
}

@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[6]")
private WebElement skillselected;
public String skillAdded() throws InterruptedException
{
	Thread.sleep(3000);
	return skillselected.getAttribute("value").toString();
}
	
	
	public AddSkillPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
