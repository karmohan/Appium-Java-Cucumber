package stepdefinations;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import Instagram.Aaqua_assignment.base;
import Screens.Insta_Home_Screen;
import Screens.Login_Screen;
import Screens.Search_and_Explaore_Screen;
import Screens.Signin_Screen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class Search_and_Explaore_Page extends base {
	public static AndroidDriver<AndroidElement> driver;

	public Search_and_Explaore_Page() throws IOException {
		this.driver = Hooks.getDriver();

	}

	@Test
	@When("^User navigate to the Search page Explore$")
	public void user_navigate_to_search_page_explaore() throws Throwable {
		Insta_Home_Screen insta_home = new Insta_Home_Screen(driver);
		Search_and_Explaore_Screen search_and_explaore = new Search_and_Explaore_Screen(driver);
		insta_home.getsearch_and_explore_button().click();
		Assert.assertTrue(search_and_explaore.getsearch_bar().isDisplayed());
	}
	
    @And("^Search for a person$")
    public void search_for_a_person() throws Throwable {
    	Search_and_Explaore_Screen search_and_explaore = new Search_and_Explaore_Screen(driver);
    	TouchActions action = new TouchActions(driver);
    	action.singleTap(search_and_explaore.getsearch_bar()).sendKeys(getsearchname()).perform();
    }
    
    @Then("^User successfully found a list of person with the same search$")
    public void user_successfully_found_a_list_od_person_with_same_search() throws Throwable {
    	Search_and_Explaore_Screen search_and_explaore = new Search_and_Explaore_Screen(driver);
    	Assert.assertTrue(search_and_explaore.getsearch_result().isDisplayed());
    }
}



