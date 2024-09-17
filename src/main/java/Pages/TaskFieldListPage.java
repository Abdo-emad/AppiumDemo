package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TaskFieldListPage extends PageBase{
    public TaskFieldListPage(AppiumDriver appiumDriver1) {
        super(appiumDriver1);
    }

    By name = By.id("");
    WebElement TaskName = appiumDriver.findElement(name);
    By desc = By.id("");
    WebElement description = appiumDriver.findElement(desc);
    By submitBtn = By.id("");
    WebElement SubmitButton = appiumDriver.findElement(submitBtn);
    public void EnterTaskName(String value){
        Clear(TaskName);
        SendValues(TaskName , value);
    }

    public void EnterTaskDescription(String s){
        Clear(description);
        SendValues(description , desc_value);
    }
    public void ClickOnSubmitButton(){
       Click(SubmitButton);
    }
}
