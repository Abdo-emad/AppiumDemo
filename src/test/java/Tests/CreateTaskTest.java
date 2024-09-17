package Tests;

import Pages.CreateTaskPage;
import Pages.TaskFieldListPage;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;

public class CreateTaskTest extends TestBase{
    CreateTaskPage createTaskPage ;
    TaskFieldListPage taskFieldListPage;
    public  JsonElement TaskName;
    public JsonElement TaskDescription ;

    @Test
    public void CreateTask() throws MalformedURLException, FileNotFoundException {
        String path = System.getProperty("user.dir"+"Data/File.json");
        File file = new File(path);
        JsonParser jsonParser = new JsonParser();
        JsonArray jsonArray = (JsonArray) jsonParser.parse(new FileReader(file));
        for (Object obj :jsonArray){
            JsonObject jsonObject = (JsonObject) obj;
            TaskName = jsonObject.get("TaskName");
            TaskDescription = jsonObject.get("TaskDescription");

            AndroidSetUp();
            createTaskPage = new CreateTaskPage(appiumDriver);
            taskFieldListPage = new TaskFieldListPage(appiumDriver);
            createTaskPage.ClickOnCreateButton();
            taskFieldListPage.EnterTaskName(String.valueOf(TaskName));
            taskFieldListPage.EnterTaskDescription(String.valueOf(TaskDescription));
         //   appiumDriver.hideKeyboard();
            taskFieldListPage.ClickOnSubmitButton();


        }





    }
}
