package stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import pageObjects.LandingPage;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Instagram.Aaqua_assignment.Utilities;
import Instagram.Aaqua_assignment.base;
import Screens.Login_Screen;

@RunWith(Cucumber.class)
public class Login_Page extends base {

	public static AndroidDriver<AndroidElement> driver;

	public Login_Page() throws IOException {
		this.driver = Hooks.getDriver();

	}

	@Test
	@When("^Login with Facebook account$")
	public void proceed_with_login() throws Throwable {
		Login_Screen login = new Login_Screen(driver);
		Utilities utilities = new Utilities(driver);
		login.getlogin_with_facebook().click();
     	utilities.switchcontext(getWebView());
		login.getalert_accept().click();
		login.getuser_name_using_fb().sendKeys(getUsername());
		login.getpassword_using_fb().sendKeys(getPassword());
		login.getlogin_using_fb().click();
		login.getfb_login_confirmation_button().click();
		utilities.switchcontext(getNativeView());
	}

}
