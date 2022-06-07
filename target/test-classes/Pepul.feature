Feature: validating SignUp Screen

  Scenario Outline: SignUp with valid Mobile Number
    Given user Should Open the App
    When user should enter the "<MobileNumber>" and GetOtp
    And user should select the Profile picture and Click on okay Button
    And user should tap on Profile Pic and Enter the "<FirstName>" and "<LastName>" 
   # And User View a Post
    And User Logout
 		Then User Should Close the App
    

    Examples: 
      | MobileNumber |FirstName |LastName |Date   | Month  |Year|
      |   8148546122 |Masha     |Allah   |  20    | Jun     | 1999  |
      #|    987654321 | nifa     |
 	