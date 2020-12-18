package stepdefinations;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import Instagram.Aaqua_assignment.base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Hooks extends base {

	public Hooks() throws IOException {
		super();
	}

    public static AndroidDriver<AndroidElement> driver;

	@Before
	public void setUpAppium() throws MalformedURLException {
	File appDir = new File("src");
    File app = new File(appDir,getappName());
		
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		capability.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    capability.setCapability(MobileCapabilityType.APP_PACKAGE, "com.instagram.android");
	    capability.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.instagram.mainactivity.LauncherActivity");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	public static AndroidDriver<AndroidElement> getDriver() {
		return driver;
	}
}
