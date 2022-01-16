package utils;

import org.openqa.selenium.By;

public class Locators {

   /* public static By register = By.id ("com.ebay.mobile:id/button_register");
    public static By signIn = By.id("com.ebay.mobile:id/button_sign_in");
    public static By useYourEmail = By.id("com.ebay.mobile:id/button_classic");*/

    public static By introClose = By.id("com.bikroy:id/intro_close");
    public static By close = By.id("com.bikroy:id/close");
    public static By yes = By.id("android:id/button2");
    public static By yes2 = By.id("android:id/button1");

    //signup
    public static By name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
    public static By email = By.id("com.bikroy:id/sign_in_email");
    public static By password = By.id("com.bikroy:id/sign_in_password");
    public static By confirmPass = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
    public static By signUpBtn = By.id("com.bikroy:id/register_register_button");
    public static By signUpBtnEnter = By.id("com.bikroy:id/register_signup_button");
    public static By goWithEmail = By.id("com.bikroy:id/sign_in_sign_up_email_button");
    public static By myAccountPanel = By.id("com.bikroy:id/main_bottom_panel_my_account");
    public static By accountPanel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageButton[3]");

    public static By notifyMessage = By.id("com.bikroy:id/notification_message");
    public static By userHeading = By.id("com.bikroy:id/my_account_user_heading");

    public static By logout = By.id("com.bikroy:id/my_account_logout");

    //ads post
    public static By postBtn = By.id("com.bikroy:id/btn_post");
    public static By mobilePhone = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
    public static By locationNext = By.id("com.bikroy:id/locationNextTv");
    public static By used = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
    public static By original = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    public static By mi = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[6]");
    public static By redmi = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.widget.TextView[2]");
    public static By skip = By.id("com.bikroy:id/textSkip");
    public static By multiSkip = By.id("com.bikroy:id/multiSkip");
    public static By desc = By.id("com.bikroy:id/descriptionValue");
    public static By descNext = By.id("com.bikroy:id/descriptionNext");
    public static By moneyValue = By.id("com.bikroy:id/moneyValue");
    public static By moneyNext = By.id("com.bikroy:id/moneyNext");
    public static By addPhoto = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.ImageView");
    public static By next = By.id("com.bikroy:id/next");
    public static By gallery = By.id("com.bikroy:id/gallery");
    public static By car = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    public static By usedMobile = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");

    //car
    public static By firstBrand = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.widget.ImageView[1]");
    public static By firstModel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.widget.TextView[1]");
    public static By nextYear = By.id("com.bikroy:id/yearNext");
    public static By measurementValue = By.id("com.bikroy:id/measurementValue");
    public static By measurementNext = By.id("com.bikroy:id/measurementNext");
    //public static By measurementValue = By.id("com.bikroy:id/measurementValue");
    public static By fuelType = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.CheckBox");
    public static By multiNext = By.id("com.bikroy:id/multiNext");
    public static By automation = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
    public static By bodyType = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    public static By yearSkip = By.id("com.bikroy:id/yearSkip");
    public static By descValue = By.id("com.bikroy:id/descriptionValue");
    //public static By descNext =By.id("com.bikroy:id/descriptionNext");
    public static String descValueText = "This is something good item";

    //motorbike
    public static By bikeType = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");

    //property
    public static By flatRent = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
    public static By propertyPlace = By.id("com.bikroy:id/spinner_view");
    public static By dhaka = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]");
    public static By mirpur = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[1]");


    //My profile
    public static By back = By.id("উপরে নেভিগেট করুন");
    public static By myAds = By.id("com.bikroy:id/my_account_my_ads");
    public static By myMemberShip = By.id("com.bikroy:id/my_account_my_membership");
    public static By favorites = By.id("com.bikroy:id/my_account_favorites");
    public static By myResume = By.id("com.bikroy:id/my_account_my_resume");
    public static By staySafe = By.id("com.bikroy:id/my_account_stay_safe");
    public static By myFaq = By.id("com.bikroy:id/my_account_faq");
    public static By sellFast = By.id("com.bikroy:id/my_account_sell_fast");
    public static By more = By.id("com.bikroy:id/my_account_more");
    public static By adsPath = By.id("aa4b1f7c-78bb-4118-9cf9-70e13dbb6d0c");
    public static String adsText = "আমার বিজ্ঞাপনসমূহ";
    public static By membershipXpath = By.id("857bb974-7729-4859-af50-240f322ce8cb");
    public static String membershipText = "আমার মেম্বারশিপ";
    public static By favoriteXpath = By.id("ed59edc3-70ab-4268-933a-e87b9ba6669c");
    public static String favoriteText = "প্রিয়";
    public static By myProfileXpath = By.id("effa6ffc-aaf8-4237-bb6f-b6d1a937d9aa");
    public static String myProfileText = "আমার প্রোফাইল";

    //search
    public static By searchBtn = By.id("com.bikroy:id/main_bottom_panel_search");
    public static By searchField = By.id("com.bikroy:id/search_verticals");
    public static By searchBox = By.id("com.bikroy:id/edit_search");
    public static By searchResult = By.id("com.bikroy:id/home_search_results");
    public static String searchPageText = "mobile";

}
