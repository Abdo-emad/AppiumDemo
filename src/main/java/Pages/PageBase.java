package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

AppiumDriver appiumDriver;
public static final long WAIT =10;

    public PageBase(AppiumDriver appiumDriver1){
      this.appiumDriver= appiumDriver1;
    }

public void WaitForVisibility(WebElement element){
    WebDriverWait wait = new WebDriverWait(appiumDriver , Duration.ofSeconds(WAIT));
    wait.until(ExpectedConditions.visibilityOf(element));

}
public void Clear(WebElement element){
        WaitForVisibility(element);
        element.clear();
}

public void Click(WebElement element){
        WaitForVisibility(element);
        element.click();
}
public void SendValues(WebElement element , String value){
        WaitForVisibility(element);
        element.sendKeys(value);
}
public String getAttribute(WebElement element, String attribute){
        WaitForVisibility(element);
         return  element.getAttribute(attribute);
}
}
