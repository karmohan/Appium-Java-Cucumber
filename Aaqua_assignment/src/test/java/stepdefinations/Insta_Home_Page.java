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
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Screens.Insta_Home_Screen;
import Screens.Login_Screen;
import Screens.User_profile_Screen;

@RunWith(Cucumber.class)
public class Insta_Home_Page {
	public static AndroidDriver<AndroidElement> driver;

	public Insta_Home_Page() throws IOException {
		this.driver = Hooks.getDriver();

	}

	@Test
	@Then("^User successfully logged into the app$")
	public void user_successfully_logged_into_app() throws Throwable {
		Insta_Home_Screen insta_home = new Insta_Home_Screen(driver);
		Assert.assertTrue(insta_home.getuser_profile().isDisplayed());
	}

	@Test
	@Given("^User navigates to a profile page$")
	public void user_navigate_to_profile_page() throws Throwable {
		Insta_Home_Screen insta_home = new Insta_Home_Screen(driver);
		User_profile_Screen profile_screen = new User_profile_Screen(driver);
		insta_home.getuser_profile().click();
		Assert.assertTrue(profile_screen.gethamburger_button().isDisplayed());
	}

	@Test
	@Given("^User landed to homepage$")
	public void user_landed_to_homepage() throws Throwable {
		Insta_Home_Screen insta_home = new Insta_Home_Screen(driver);
		Assert.assertTrue(insta_home.gethome_button().isDisplayed());
	}

	@Test
	@When("^A user checks the options available on the home page$")
	public void user_checks_the_options_available_in_home_page() throws Throwable {
		Insta_Home_Screen insta_home = new Insta_Home_Screen(driver);
		Assert.assertTrue(insta_home.getnews_feed().isDisplayed());
		Assert.assertTrue(insta_home.getnews_feeder_name().isDisplayed());
		Assert.assertTrue(insta_home.getmore_action_on_the_post().isDisplayed());
		Assert.assertTrue(insta_home.getlike_button().isDisplayed());
		Assert.assertTrue(insta_home.getcomment_button().isDisplayed());
		Assert.assertTrue(insta_home.getsend_post().isDisplayed());
		Assert.assertTrue(insta_home.getadd_to_saved().isDisplayed());
		
	}

}
