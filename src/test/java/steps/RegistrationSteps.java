package steps;

import base.BaseTests;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ButtonsAndText;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.Locators;
import utils.TimeOut;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;


public class RegistrationSteps {

    BaseTests baseTests = new BaseTests();
    AndroidDriver<AndroidElement> driver = baseTests.setUp();
    ButtonsAndText buttonsAndText =new ButtonsAndText(driver);
    TimeOut timeOut = new TimeOut();


    public RegistrationSteps() throws MalformedURLException {
    }


    @Given("User navigate to Bikroy homepage")
    public void user_navigate_to_bikroy_homepage() {

    }
    @When("User go to registration page and enter in use your email")
    public void user_go_to_registration_page_and_enter_in_use_your_email() {
        buttonsAndText.btnClick(Locators.accountPanel);
        timeOut.timeOut();
        buttonsAndText.btnClick(Locators.goWithEmail);
        timeOut.timeOut();
        buttonsAndText.btnClick(Locators.signUpBtnEnter);
        timeOut.timeOut();

    }
    @When("Fill up the form by given data")
    public void fill_up_the_form_by_given_data(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        buttonsAndText.fillEmail(Locators.email, data.get(0).get("Email"));
        buttonsAndText.fillName(Locators.name, data.get(0).get("Name"));
        timeOut.timeOut();
        buttonsAndText.fillPass(Locators.password, data.get(0).get("Password"));
        buttonsAndText.fillPass(Locators.confirmPass, data.get(0).get("ConfirmPassword"));
    }
    @Then("Click on Contine")
    public void click_on_contine() {
        timeOut.timeOut();
        buttonsAndText.btnClick(Locators.signUpBtn);
    }

    @Then("User go to home page")
    public void user_go_to_home_page() {

    }

}
