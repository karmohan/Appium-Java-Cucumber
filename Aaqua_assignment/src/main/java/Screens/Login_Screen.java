package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Login_Screen {

	AndroidDriver<AndroidElement> driver;
	By login_with_facebook = By.id("com.instagram.android:id/login_facebook_container");
	By user_name_using_fb = By.id("m_login_email");
	By password_using_fb = By.id("m_login_password");
	By login_using_fb = By.id("u_0_4");
	By alert_accept = By.xpath("//*[@data-cookiebanner='accept_button']");
	By fb_login_confirmation_button = By.xpath("//*[@type='submit']");

	public Login_Screen(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public WebElement getlogin_with_facebook() {
		return driver.findElement(login_with_facebook);
	}

	public WebElement getalert_accept() {
		return driver.findElement(alert_accept);
	}

	public WebElement getfb_login_confirmation_button() {
		return driver.findElement(fb_login_confirmation_button);
	}

	public WebElement getuser_name_using_fb() {
		return driver.findElement(user_name_using_fb);
	}

	public WebElement getpassword_using_fb() {
		return driver.findElement(password_using_fb);
	}

	public WebElement getlogin_using_fb() {
		return driver.findElement(login_using_fb);
	}

}
