package steps;

import base.BaseTests;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ButtonsAndText;
import utils.Locators;
import utils.TimeOut;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Objects;

public class PostAdsStep extends BaseTests {
    AndroidDriver<AndroidElement> driver = setUp();
    ButtonsAndText buttonsAndText =new ButtonsAndText(driver);
    TimeOut timeOut = new TimeOut();

    public PostAdsStep() throws MalformedURLException {
    }

    @Given("user go to home page")
    public void user_go_to_home_page() {
        try {
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.introClose);
        } catch (Exception e) {
            timeOut.timeOut();
        }
    }
    @Given("user click on post add btn")
    public void user_click_on_post_add_btn() {
        timeOut.timeOut();
        buttonsAndText.btnClick(Locators.postBtn);
    }
    @When("user will login")
    public void user_will_login(DataTable dataTable) {
        buttonsAndText.btnClick(Locators.goWithEmail);
        timeOut.timeOut();
        List<List<String>> userList = dataTable.asLists(String.class);
        List<String> credential = userList.get(0);

        buttonsAndText.fillEmail(Locators.email, credential.get(0));
        timeOut.timeOut();
        buttonsAndText.fillPass(Locators.password, credential.get(1));
        timeOut.timeOut();
        buttonsAndText.btnClick(Locators.signUpBtn);
        timeOut.timeOut();

    }
    @When("user click on {string}")
    public void user_click_on(String index) {
        timeOut.timeOut();
        buttonsAndText.clickItemByIndex(index);
    }
    @Then("user will fill all the requirements of {string}")
    public void user_will_fill_all_the_requirements(String index) {

        if (Objects.equals(index, "1")){
            buttonsAndText.btnClick(Locators.locationNext);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.used);
            buttonsAndText.btnClick(Locators.firstBrand);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.firstModel);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.skip);
            buttonsAndText.btnClick(Locators.nextYear);
            buttonsAndText.sendText(Locators.measurementValue, "2000");
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.measurementNext);
            timeOut.timeOut();
            buttonsAndText.sendText(Locators.measurementValue, "350");
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.measurementNext);
            buttonsAndText.btnClick(Locators.fuelType);
            buttonsAndText.btnClick(Locators.multiNext);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.automation);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.bodyType);
            buttonsAndText.btnClick(Locators.yearSkip);
            timeOut.timeOut();
            buttonsAndText.sendText(Locators.descValue, Locators.descValueText);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.descNext);
            timeOut.timeOut();
            buttonsAndText.sendText(Locators.moneyValue, "250000");
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.moneyNext);
        }
        else if (Objects.equals(index, "2")) {
            buttonsAndText.btnClick(Locators.locationNext);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.bikeType);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.used);
            buttonsAndText.btnClick(Locators.firstBrand);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.firstModel);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.skip);
            buttonsAndText.btnClick(Locators.nextYear);
            buttonsAndText.sendText(Locators.measurementValue, "1500");
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.measurementNext);
            timeOut.timeOut();
            buttonsAndText.sendText(Locators.measurementValue, "150");
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.measurementNext);
            buttonsAndText.sendText(Locators.descValue, Locators.descValueText);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.descNext);
            timeOut.timeOut();
            buttonsAndText.sendText(Locators.moneyValue, "250000");
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.moneyNext);
        }
        else if (Objects.equals(index, "3")){
            buttonsAndText.btnClick(Locators.locationNext);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.usedMobile);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.original);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.mi);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.redmi);
            buttonsAndText.btnClick(Locators.skip);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.multiSkip);
            buttonsAndText.sendText(Locators.descValue, Locators.descValueText);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.descNext);
            timeOut.timeOut();
            buttonsAndText.sendText(Locators.moneyValue, "250000");
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.moneyNext);
        }
        else if (Objects.equals(index, "4")) {
            buttonsAndText.btnClick(Locators.flatRent);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.propertyPlace);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.dhaka);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.mirpur);
            timeOut.timeOut();
            driver.navigate().back();
            buttonsAndText.btnClick(Locators.yes2);
            timeOut.timeOut();
        }

    }

    @Then("Go to home page and logout")
    public void go_to_homepage_and_logout() {
        timeOut.timeOut();
        try{
            buttonsAndText.btnClick(Locators.close);
            timeOut.timeOut();
            buttonsAndText.btnClick(Locators.yes);
        } catch (Exception e) {
            System.out.println("work done");
        }
        driver.navigate().back();
        buttonsAndText.btnClick(Locators.accountPanel);
        timeOut.timeOut();
        buttonsAndText.btnClick(Locators.logout);
        timeOut.timeOut();
        driver.quit();
    }
}
