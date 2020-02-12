package actions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ActionClass
{    public static WebDriver driver;

    public ActionClass(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnObject(WebElement element){
        try {
            if (element.isDisplayed()) {
                element.click();
            }
            else {
                System.out.println("Unable to find object : "+element.getAttribute("name"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setValueinTextbox(WebElement element, String value) {
        try {
            if (element.isDisplayed()) {
                element.click();
                element.sendKeys(value);
                element.sendKeys(Keys.ENTER);
                System.out.println("Succesfully entered '"+value+"' in object :" + element.getAttribute("name"));
            } else {
                //Else statement
                System.out.println("Unable to find object : "+element.getAttribute("name"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setValueinURLField(WebElement element, String value) {
        try{
            if (element.isDisplayed()){
                element.click();
                element.clear();
                element.sendKeys(value);
            }else
                System.out.println("Element is not displayed");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setValueinPortalField(WebElement element) {

        try{
            if(element.isDisplayed()){
                element.click();
                element.sendKeys("Elance");
                element.sendKeys(Keys.ENTER);
                element.click();
                element.sendKeys("Freelancer");
                element.sendKeys(Keys.ENTER);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setValueinTagsfield(WebElement element) {
        try {
            if(element.isDisplayed()){
                element.click();
                element.sendKeys("10 minutes Free sessions");
                element.sendKeys(Keys.ENTER);
                element.click();
                element.sendKeys("64 bit architecture");
                element.sendKeys(Keys.ENTER);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void screenCapture(String testcaseName) throws IOException {

        DateFormat dateFormat= new SimpleDateFormat("yyyy_MM_dd_HH_MM_SS");
        Date date=new Date();
        String dateTextname= dateFormat.format(date);
        String screenshotPath = System.getProperty("user.dir") + "/test-output/screenshot/" +testcaseName + "_"+dateTextname + ".png";
        TakesScreenshot screenshot=((TakesScreenshot)driver);
        File srcFile= screenshot.getScreenshotAs(OutputType.FILE);
        File destFile=new File(screenshotPath);
        FileUtils.copyFile(srcFile,destFile);
    }

    public void setValueinNewURLField(WebElement element) {

        try{
            if (element.isDisplayed()){
                element.click();
                element.sendKeys("https://javascript.info/url");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}