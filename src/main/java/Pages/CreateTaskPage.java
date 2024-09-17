package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateTaskPage extends PageBase{
    public CreateTaskPage(AppiumDriver appiumDriver1) {
        super(appiumDriver1);
    }

    By createBtn = By.id("");
    WebElement CreateButton = appiumDriver.findElement(createBtn);
    public void ClickOnCreateButton(){
        Click(CreateButton);
    }
}
