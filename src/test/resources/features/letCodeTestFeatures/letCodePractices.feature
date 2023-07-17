@letcode
Feature: Apps on LetCode homepage

  @InputApp
  Scenario: The Input implement on LetCode homepage

    Given Login to LetCode test homepage
    When Click Edit button on Input Section on the homepage
    Then Verify that login to Input page

  @InputPagePractices
  Scenario: The Input Page Practices

    Given Login to LetCode test homepage
    When Click Edit button on Input Section on the homepage
    And Use sendkeys to type your full name
    And use keyboard TAB and go to type in next box
    And Verify that what is inside the text box
    And Clear the next box and verify that the box is empty
    And Confirm edit field is disabled
    Then Confirm text is readonly

  @BtnClick
  Scenario:Buttons click

    Given Login to LetCode test homepage
    When Click the Click button in the Button Section on the home page
    And Click the Go to Home button
    And Come back using driver command
    And Get the X & Y co-ordinates
    And Find the color of the button
    And Find the height & width of the button
    And Confirm button is disabled
    Then Click and Hold Button

  @SelectDropDown
  Scenario: Click select section

    Given Login to LetCode test homepage
    When Click the Drop-Down button in the Select Section on the home page
    And Select the apple using visible text
    And Select your super hero's
    And Select the last programming language and print all the options
    Then Select India using value & print the selected value

  @AlertSection
  Scenario: Click Alert Section and Interact with different types of dialog boxes

    Given Login to LetCode test homepage
    When Click to Dialog button  in the Alert Section on the homepage
    And Click to Simple Alert
    And Then Click OK! for close the alert box
    And Click to Confirm Alert button
    And Click to prompt Alert button
    And Type your name and accept
    And Click Sweet Alert Button
    Then Verify the text in the sweet box

  @Framesection
  Scenario: Interact with different types of frames/iframes

    Given Login to LetCode test homepage
    When Click to Inner HTML button in the Frame Section on the homepage
    And Type to email box
    And Type to First Name Box
    And Type to Last Name Box
    Then Refresh to page

  @RadioSection
  Scenario: Radio Button part test page

    Given Login to LetCode test homepage
    When Click to Toggle button in the Radio Section on the homepage
    And Verify that go to radio section page
    And Select any one
    And Confirm you can select only one radio button
    And Find the bug
    And Find which one is selected
    And Confirm last field is disabled
    And Find if the checkbox is selected?
    And Accept the T&C
    Then Verify that Something

    @WindowSections
    Scenario: Switch different types of tabs or windows

      Given Login to LetCode test homepage
      When Click the Tabs Button in the Window Section on the homepage
      And Click on the home button
      And Goto the newly opened tab
      And Print the title of the page
      And Close the parent window
      And Close the child window
      And Click on the Multiple windows button
      And Print all the window title
      Then Close all the windows

      @ElementSection
      Scenario: Play with lot's of element and smash them

        Given Login to LetCode test homepage
        When Click Find Elements Button in the Elements Section on the homepage
        And Click username input box
        And Type and Enter your Github username "yusuf"
        And Click search button
        And Verify that user has image
        And Print the user name & other informations
        Then Verify that no.of public repositories are listed correctly


        @DragSection
        Scenario: Let's go for a ride drag me around

          Given Login to LetCode test homepage
          When Click Auı Button in the Drag Section on the homepage
          And Drag the Drag box



        @DropSection
        Scenario: Let's go for a ride drop me around

          Given Login to LetCode test homepage
          When Click DropAuı Button In The Drop Section On The Homepage
          And Drag Source Box On Target Box
          Then Verify that Where Is The Source Box










