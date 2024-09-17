package Tests;

import Pages.CreateTaskPage;
import Pages.TaskFieldListPage;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class CreateTaskTestforIOS extends TestBase{
    CreateTaskPage createTaskPage ;
    TaskFieldListPage taskFieldListPage;

    @Test
    public void CreateTask() throws MalformedURLException {
        IOSSetUp();
        createTaskPage = new CreateTaskPage(appiumDriver);
        taskFieldListPage = new TaskFieldListPage(appiumDriver);
        createTaskPage.ClickOnCreateButton();
        taskFieldListPage.EnterTaskName("Hello From TAU");
        taskFieldListPage.EnterTaskDescription(String.valueOf(TaskDescription));
        appiumDriver.hideKeyboard();
        taskFieldListPage.ClickOnSubmitButton();


    }
}
