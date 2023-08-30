Feature: Product features
Background: 
Given User clicks on already have account
    @smoke @TC_1  @login
  Scenario Outline: ever note valid user login scenario
    When User logs into evernote application using <email> and <password>
    And User clicks login
    And User must see message as <message>
    Then User clicks logout

    Examples:
      | email                  | password  | message                |
      | ashytechstack@gmail.com | Techstack@9 | ashytechstack@gmail.com |

  @note_operation @smoke @TC_2
  Scenario Outline: creating a new note in ever note
    When User logs into evernote application using <email> and <password>
    And User clicks login
    Then User must see message as <message>
    When User clicks new note button
    And User enters data into title as <title>
    Then User clicks logout
    Examples:
      | email                  | password  | message                | title       |
      | ashytechstack@gmail.com | Techstack@9 | ashytechstack@gmail.com | video_slots |

  @existing_note @smoke @note_operation @TC_3
  Scenario Outline: opening previously created note
    When User logs into evernote application using <email> and <password>
    And User clicks login
    And User must see message as <message>
    And User searches for existing_note
    Then User clicks logout
    Examples:
      | email                  | password  | message                |
      | ashytechstack@gmail.com | Techstack@9 | ashytechstack@gmail.com |
    
   #  @TC_4  @invalid_login
  #Scenario Outline: ever note invalid login scenario
   # When User logs into evernote application using <email> and <password>
   # And User clicks login
    #And User must see message as <message>
    #Examples:
     # | email                  | password | message            |
      #| ashytechstack@gmail.com | ######   | Incorrect password |
