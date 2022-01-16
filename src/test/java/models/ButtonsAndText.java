package models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import utils.Locators;
import utils.TimeOut;
import org.junit.Assert;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class ButtonsAndText {
    AndroidDriver<AndroidElement> driver;
    TimeOut timeout = new TimeOut();

    public ButtonsAndText(AndroidDriver<AndroidElement> driver) { this.driver = driver; }

    public void btnClick (By btn) {
        driver.findElement(btn).click();
    }

    public void fillEmail (By email, String mail) {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(mail);
    }
    public void fillName (By name, String nameText) {
        driver.findElement(name).clear();
        driver.findElement(name).sendKeys(nameText);
    }
    public void fillPass (By pass, String passText) {
        driver.findElement(pass).clear();
        driver.findElement(pass).sendKeys(passText);
    }

    public void verifyElementById (String elementText) {
            String text = driver.findElementsById("com.bikroy:id/toolbar").get(1).getText();
            assertEquals(text,elementText);
    }

    public void clickItemByIndex (String index) {
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup["+index+"]").click();
    }

    public void sendText(By field, String text) {
        driver.findElement(field).sendKeys(text);
    }
    public void verifyPage(By element, String text){
        String elementText = driver.findElement(element).getText();
        assertTrue(elementText.equals(text));
    }
}
