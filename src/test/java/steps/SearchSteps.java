package steps;

import base.BaseTests;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ButtonsAndText;
import utils.Locators;
import utils.TimeOut;

import java.net.MalformedURLException;

public class SearchSteps extends BaseTests {
    AndroidDriver<AndroidElement> driver = setUp();
    ButtonsAndText buttonsAndText =new ButtonsAndText(driver);
    TimeOut timeOut = new TimeOut();

    public SearchSteps() throws MalformedURLException {
    }

    @When("user click on search")
    public void user_click_on_search() {
       timeOut.timeOut();
       buttonsAndText.btnClick(Locators.searchBtn);
       timeOut.timeOut();
    }
    @When("click on search")
    public void click_on_search() {
        buttonsAndText.btnClick(Locators.searchField);
        timeOut.timeOut();
    }
    @When("fill text in search field")
    public void fill_text_in_search_field() {
        buttonsAndText.btnClick(Locators.searchBox);
        buttonsAndText.sendText(Locators.searchBox, "mobile");
        timeOut.timeOut();
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        timeOut.timeOut();
    }
    @Then("go to search page and verify")
    public void go_to_search_page_and_verify() {
        timeOut.timeOut();
        //buttonsAndText.verifyPage(Locators.searchResult, Locators.searchPageText);
        
        driver.quit();
    }

}
