package Tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public static AppiumDriver appiumDriver;

    public static void AndroidSetUp() throws MalformedURLException {
        String androidAppPath = System.getProperty("user.dir"+"/Applications/android.apk");
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setCapability("platformName","Android");
        ds.setCapability("automationPlatform","UiAutomator2");
        ds.setCapability("deviceName","Huawei Y5 Prime");
        ds.setCapability("platformVersion","8.0");
        ds.setCapability("app",androidAppPath);
        appiumDriver= new AndroidDriver(new URL("http:127.0.0.1:4723/wd/hub"),ds);

    }


    public static void IOSSetUp() throws MalformedURLException {
        String iosPath = System.getProperty("user.dir"+"/Applications/ios.apk");
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setCapability("platformName","IOS");
        ds.setCapability("deviceName","ios 14 pro max");
        ds.setCapability("platformVersion","14.2");
        ds.setCapability("app",iosPath);
        appiumDriver= new IOSDriver(new URL("http:127.0.0.1:4723/wd/hub"),ds);

    }

    public void Close(){
        if (appiumDriver!=null){
            appiumDriver.quit();
        }

    }
}
