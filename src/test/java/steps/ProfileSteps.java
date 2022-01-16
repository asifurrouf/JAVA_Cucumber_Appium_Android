package steps;

import base.BaseTests;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ButtonsAndText;
import org.openqa.selenium.By;
import utils.Locators;
import utils.TimeOut;

import java.net.MalformedURLException;
import java.security.Key;
import java.util.List;

public class ProfileSteps extends BaseTests {
    AndroidDriver<AndroidElement> driver = setUp();
    ButtonsAndText buttonsAndText =new ButtonsAndText(driver);
    TimeOut timeOut = new TimeOut();

    public ProfileSteps() throws MalformedURLException {
    }

    @Given("User go to profile and visit login page of bikroy")
    public void user_go_to_profile_and_visit_login_page_of_bikroy() {
        buttonsAndText.btnClick(Locators.accountPanel);
        timeOut.timeOut();
        buttonsAndText.btnClick(Locators.goWithEmail);
        timeOut.timeOut();
    }
    @When("Fill up login information with UserName and Password")
    public void fill_up_login_information_with_user_name_and_password(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        List<String> credential = userList.get(0);

        buttonsAndText.fillEmail(Locators.email, credential.get(0));
        timeOut.timeOut();
        buttonsAndText.fillPass(Locators.password, credential.get(1));
        timeOut.timeOut();
    }
    @Then("Click Login and go to account page")
    public void click_login_and_go_to_account_page() {
        buttonsAndText.btnClick(Locators.signUpBtn);
        timeOut.timeOut();
    }
    @When("User can click on {string}")
    public void user_can_click_on(String tab) {
        By page = By.id(tab);
        timeOut.timeOut();
        buttonsAndText.btnClick(page);
        timeOut.timeOut();
    }
    @Then("verify {string} visited by {string} and {string} Then back")
    public void verify_visited_by_and_back(String tab, String tabPath, String tabText) {
        //buttonsAndText.verifyElementById(tabText);
        timeOut.timeOut();
        //buttonsAndText.btnClick(Locators.back);
        driver.navigate().back();
        timeOut.timeOut();
    }

    @Then("Logout from app")
    public void logout_from_app() {
        timeOut.timeOut();
        buttonsAndText.btnClick(Locators.logout);
        timeOut.timeOut();
    }

}
