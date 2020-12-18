package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Signin_Screen {

	AndroidDriver<AndroidElement> driver;
	By login = By.id("com.instagram.android:id/log_in_button");
	By Create_new_account = By.id("com.instagram.android:id/sign_up_with_email_or_phone");
	By language_selector = By.id("com.instagram.android:id/language_selector_button");

	public Signin_Screen(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}

	public WebElement getlanguage_selector() {
		return driver.findElement(language_selector);
	}

	public WebElement getCreate_new_account() {
		return driver.findElement(Create_new_account);
	}

}
