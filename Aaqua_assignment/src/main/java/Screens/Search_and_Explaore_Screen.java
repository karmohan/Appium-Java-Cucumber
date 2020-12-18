package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Search_and_Explaore_Screen {
	AndroidDriver<AndroidElement> driver;
	By search_bar = By.id("com.instagram.android:id/action_bar_search_edit_text");
	By search_result = By.id("android:id/list");
	
	
	public Search_and_Explaore_Screen(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public WebElement getsearch_bar() {
		return driver.findElement(search_bar);
	}
	
	public WebElement getsearch_result() {
		return driver.findElement(search_result);
	}
	

}
