This is a Meaven project built using Selenium -JAVA, It is integrated with Cucumber for writing feature files and execution of test cases
## Test Execution Flow
Framework contains below folders

*Refer to the framework flow png file located in the root folder to understand the architecture.


*src/main/java* - Holds all the configuration files

*config* - driver and browser management

*src/test/java* - contains test scripting and execution files

*features* - contains all the features files written in the gherkin language

*Helper* - contains reusable methods to perform repeated actions

*hooks* - Contains @Before @After etc annotations to modify test execution Flow

*stepdefinitions* contains actual steps for features
## Test Execution

* Tests can be executed in 3 ways 

### *Execution Using a Runner File*

 * Test Execution using the runner file
 located at src/main/java/testRunner/Runner

 * tags can be changed to alter the Execution
 the default that is @smoke

### *Execution Using Cucumber.xml*
 * Right-click on the cucumber.xml file located in the working directory

### *Using  command line*
* At the root of the project directory run the command:  mvn test -P cucumber

this is implemented using the maven surefire   plugin


##  Test Reporting

Post-test execution framework generates HTML files under the reports folder located in the root directory.

Ideally reports should be excluded from commit to code repo. For the assignment purpose i have removed them from gitignore file.


* HTML Reports can be opened using any browser.
* Screenshots attached to reports upon failure
* archived_reports folder contains some of the previous execution reports for reference
## Dependency_management
As this project is built using Maven, dependencies are managed using the pom.xml file

Ideally heavy dependencies should be excluded from commit to code repo.
For the assignment purpose i have removed them from gitignore file.
## Author
Name - Aswini Tummalapalli

Linkedin - https://www.linkedin.com/in/aswini-tummalapalli-a86508b0/

Email - aswini.tummalapalli@gmail.com

Please reach out to me by email if you have any queries related to this project.

