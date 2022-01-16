package models;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.TimeOut;

public class Methods {
    AndroidDriver<AndroidElement> driver;
    TimeOut timeout = new TimeOut();

    public Methods(AndroidDriver<AndroidElement> driver) { this.driver = driver; }

}
