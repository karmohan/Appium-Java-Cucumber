package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class User_Profile_Info_Screen {

	AndroidDriver<AndroidElement> driver;
	By user_full_name=By.id("com.instagram.android:id/full_name");
	By user_name=By.id("com.instagram.android:id/username");
	By edit_profile_container=By.id("com.instagram.android:id/action_bar_textview_title_container");
	By select_button = MobileBy.AccessibilityId("Done");


	public User_Profile_Info_Screen(AndroidDriver<AndroidElement> driver) {
		this.driver= driver;
	}

	public WebElement getuser_full_name()
	{
		return driver.findElement(user_full_name);
	}
	
	public WebElement getuser_name()
	{
		return driver.findElement(user_name);
	}
	
	public WebElement getedit_profile_container()
	{
		return driver.findElement(edit_profile_container);
	}
	
	public WebElement getselect_button()
	{
		return driver.findElement(select_button);
	}
}
