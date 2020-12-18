package stepdefinations;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import Instagram.Aaqua_assignment.base;
import Screens.Insta_Home_Screen;
import Screens.User_Profile_Info_Screen;
import Screens.User_profile_Screen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class User_Profile_Page extends base {
	public static AndroidDriver<AndroidElement> driver;
	static String new_profileName;
	static String profileName;
	public User_Profile_Page() throws IOException {
		this.driver = Hooks.getDriver();

	}

	@Test
	@When("^Click on the edit profile option$")
	public void click_on_eidt_profile_option() throws Throwable {
		User_profile_Screen profile_screen = new User_profile_Screen(driver);
		User_Profile_Info_Screen profile_info_screen = new User_Profile_Info_Screen(driver);
		profileName = profile_screen.getprofile_full_name().getText();
		profile_screen.getedit_profile_button().click();
		Assert.assertTrue(profile_info_screen.getedit_profile_container().isDisplayed());
	}

	@Test
	@And("^Click on the profile name and update the name$")
	public void click_on_profile_name_and_update_the_name() throws Throwable {
		User_Profile_Info_Screen profile_info_screen = new User_Profile_Info_Screen(driver);
		User_profile_Screen profile_screen = new User_profile_Screen(driver);
		TouchActions action = new TouchActions(driver);
		action.singleTap(profile_info_screen.getuser_full_name()).sendKeys(getprofilename()).perform();
		profile_info_screen.getselect_button().click();
		profile_info_screen.getselect_button().click();
		new_profileName = profile_screen.getprofile_full_name().getText();
		
	}

	@Test
	@Then("^User successfully changed the profile name$")
	public void user_successfully_changed_the_profile_name() throws Throwable {
		String profileName_in_home = profileName+getprofilename();
		Assert.assertEquals(profileName_in_home, new_profileName);
	}
}
