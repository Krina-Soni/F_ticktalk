package actions;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerificationClass {

    WebDriver driver;

    public VerificationClass(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyElementNotPresent(WebElement element) {
        try {
            if (element.isDisplayed() == false) {
                System.out.println("Element not displayed or Element not present");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyElementPresent(WebElement element) {
        try {
            if (element.isDisplayed()) {
                System.out.println("Element Present");
            } else {
                System.out.println("Element not present");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isElementPresent(WebElement element, String expectedText) {
        try {
            if (element.isDisplayed()) {
                String text = element.getText();
                if (text.equals(expectedText)) {
                    System.out.println("Success Element text: " +text+ " --Matches with Expected text: "+expectedText);
                }
            } else {
                System.out.println("Element not present in the Add BIDS page");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkToast(WebElement element, String expectedText) {
        try {
            if (element.isDisplayed())
            {
                String text = element.getText();
                if (text.contains(expectedText)) {
                    System.out.println("The required file is empty");
                    System.out.println(expectedText);
                }
                else
                    {
                    System.out.println("File imported");
                }
            }
        }
        catch(Exception e){
                System.out.println(e); }

        }

        }

