package utilityPAck;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends BaseClass {
	
	

	public  void takeScreenShot(String testName)
	{
			
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	try 
	{
	 FileUtils.copyFile(source, new File(".//ScrrenShotsFolders//"+testName+generateTimeStamp()+".png"));
	} 
	catch (IOException e) {e.printStackTrace();}
	}

	public  String generateTimeStamp()
	{
		Date date=new Date();
		return date.toString().replace(" ", "_").replace(":", "_");
	}

}
