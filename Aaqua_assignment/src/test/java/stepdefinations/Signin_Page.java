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
import junit.framework.Assert;

import java.io.IOException;
import java.util.Set;

import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Screens.Login_Screen;
import Screens.Signin_Screen;

@RunWith(Cucumber.class)
public class Signin_Page{
	public static AndroidDriver<AndroidElement> driver;
	
	public Signin_Page() throws IOException
	{
		this.driver=Hooks.getDriver();

	}
	
	@Test
    @Given("^User open the Instagram application$")
    public static void user_open_insta_page_and_login_to_app() throws Throwable {
		Signin_Screen homelogin=new Signin_Screen(driver);
		Login_Screen login = new Login_Screen(driver);
    	homelogin.getLogin().click();
    	Assert.assertTrue(login.getlogin_with_facebook().isDisplayed());
    }
}
