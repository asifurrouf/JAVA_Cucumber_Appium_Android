package steps;

import base.BaseTests;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ButtonsAndText;
import utils.Locators;
import utils.TimeOut;

import java.net.MalformedURLException;
import java.util.Objects;

import static org.testng.Assert.assertEquals;

public class LoginSteps extends BaseTests {

    AndroidDriver<AndroidElement> driver = setUp();
    ButtonsAndText buttonsAndText =new ButtonsAndText(driver);
    TimeOut timeOut = new TimeOut();

    public LoginSteps() throws MalformedURLException {
    }
    @Given("User go to home page of")
    public void user_go_to_home_page_of() {

    }

    @When("User go to profile and visit login page")
    public void user_go_to_profile_and_visit_login_page() {
        buttonsAndText.btnClick(Locators.accountPanel);
        timeOut.timeOut();
        buttonsAndText.btnClick(Locators.goWithEmail);
        timeOut.timeOut();

    }
    @Then("Fill up login information with {string} and {string}")
    public void fill_up_login_information_with_and(String string, String string2) {
        buttonsAndText.fillEmail(Locators.email, string);
        timeOut.timeOut();
        buttonsAndText.fillPass(Locators.password, string2);
        timeOut.timeOut();

    }
    @Then("Login Unsuccessful or login successful checking {string}")
    public void login_unsuccessful_or_login_successful_checking(String string) {
        buttonsAndText.btnClick(Locators.signUpBtn);

        if (Objects.equals(string, "ashiq6@gmail.com")){
            System.out.println(string);
        }
        else if (Objects.equals(string, "ashiq3@gmail.com")){
            timeOut.timeOut();
           assertEquals(driver.findElement(Locators.userHeading).getText(),"Qups2");
           buttonsAndText.btnClick(Locators.logout);
        }
        else if (Objects.equals(string, "ashiq2@gmail.com")){
            timeOut.timeOut();
            assertEquals(driver.findElement(Locators.userHeading).getText(),"Qups2");
            buttonsAndText.btnClick(Locators.logout);
        }
        else {
            System.out.println("Something wrong");
        }

    }

}
