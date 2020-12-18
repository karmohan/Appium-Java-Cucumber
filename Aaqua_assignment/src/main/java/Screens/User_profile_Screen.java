package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class User_profile_Screen {
	

		AndroidDriver<AndroidElement> driver;
		By hamburger_button = MobileBy.AccessibilityId("Options");
		By profile_title_container=By.id("com.instagram.android:id/action_bar_textview_custom_title_container");
		By profile_setting_button=By.id("com.instagram.android:id/menu_settings_row");
		By edit_profile_button=By.id("com.instagram.android:id/profile_header_actions_top_row");
		By profile_full_name=By.id("com.instagram.android:id/profile_header_full_name");


		public User_profile_Screen(AndroidDriver<AndroidElement> driver) {
			this.driver= driver;
		}

		public WebElement gethamburger_button()
		{
			return driver.findElement(hamburger_button);
		}
		
		public WebElement getprofile_title_container()
		{
			return driver.findElement(profile_title_container);
		}
		
		public WebElement getedit_profile_button()
		{
			return driver.findElement(edit_profile_button);
		}
		
		public WebElement getprofile_full_name()
		{
			return driver.findElement(profile_full_name);
		}

}
