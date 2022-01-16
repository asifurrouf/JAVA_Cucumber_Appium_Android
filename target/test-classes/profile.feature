Feature: User can visit profile tabs

  Background: User is logged in

    Given User go to profile and visit login page of bikroy
    When Fill up login information with UserName and Password
      |ashiq3@gmail.com |Ashiq@1234 |
    Then Click Login and go to account page

    Scenario Outline: User can visit all section of profile page

      When User can click on "<TabId>"
      Then verify "<Tab>" visited by "<TabPathId>" and "<TabText>" Then back
      And Logout from app

      Examples:
         |  Tab         |    TabId                               |              TabPathId               |   TabText   |
         | myAds        | com.bikroy:id/my_account_my_ads        | aa4b1f7c-78bb-4118-9cf9-70e13dbb6d0c | আমার বিজ্ঞাপনসমূহ |
         | myMemberShip | com.bikroy:id/my_account_my_membership | 857bb974-7729-4859-af50-240f322ce8cb | আমার মেম্বারশিপ   |
         | favorites    | com.bikroy:id/my_account_favorites     | ed59edc3-70ab-4268-933a-e87b9ba6669c |     প্রিয়          |
         | myResume     | com.bikroy:id/my_account_my_resume     | effa6ffc-aaf8-4237-bb6f-b6d1a937d9aa |   আমার প্রোফাইল  |

