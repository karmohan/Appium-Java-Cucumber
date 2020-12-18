package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Settings_Screen {
	AndroidDriver<AndroidElement> driver;
	By profile_setting_button=By.id("com.instagram.android:id/menu_settings_row");


	public Settings_Screen(AndroidDriver<AndroidElement> driver) {
		this.driver= driver;
	}
	
	public WebElement getprofile_setting_button()
	{
		return driver.findElement(profile_setting_button);
	}

}
