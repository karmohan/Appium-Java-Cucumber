package Instagram.Aaqua_assignment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Utilities {
	 static AndroidDriver<AndroidElement> driver;
	
	public Utilities(AndroidDriver<AndroidElement> driver) {
		this.driver= driver;
	}

	public void switchcontext(String context) {
		System.out.println("Before switching" + driver.getContext());
		Set<String> contextNames = driver.getContextHandles();
    	for (String contextName : contextNames) {
    	    System.out.println("Available context : " + contextName);
    	    if(contextName.contains(context)) {
    	    	driver.context(contextName);
    	    	break;
    	    }
    	}
    	System.out.println("After switching" + driver.getContext());
	}
	
	public static void getScreenshot(String s) throws IOException
	{
	File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrfile,new File("Desktop"+"\\"+s+".png"));
	
	}

}
