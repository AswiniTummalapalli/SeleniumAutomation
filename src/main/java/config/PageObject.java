package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject extends BaseClass {
    private String i;
    //Landing page Elements
    By already_account_element = By.xpath("//a[contains(text(),'Already have an account? Log in')]");
    By username = By.cssSelector("#username");
    By password = By.cssSelector("#password");
    By login_button = By.cssSelector("#loginButton");
    By loading_icon=By.xpath("//div[@class='_3EU23EffQP4XBqMxAVP']//*[name()='svg']");
    By incorrect_password = By.xpath("//div[contains(text(),'Incorrect password')]");
    By account_email = By.cssSelector(".mjp8WyYQODySClV2byHt");
    By new_note = By.id("qa-CREATE_NOTE");
    By note_option=By.xpath("//button[@class='gFTtUgofaZevRPuVgjwI QCwJEvrfOE_RJqpnMZ6Y P82zRl6hXywGPP7tkBPu ZDFRlrduWQM7RqAI0Vsq']");
    By title_area = By.xpath("//div[@class='P0rnC']//textarea");
    By nav_home = By.xpath("//span[normalize-space()='Home']");
    By sign_out = By.xpath("//a[@id='qa-ACCOUNT_DROPDOWN_LOGOUT']");
    		//span[@class='ATm3C3aUTlB1vovtP09c fqGPff50YEEMz7JBRAUX HUWoDG8e8KhEOGqVocpC']
    

    By confirm_logout = By.cssSelector("#qa-LOGOUT_CONFIRM_DIALOG_CANCEL");




    public PageObject(WebDriver driver) {
        // TODO Auto-generated constructor stub
        this.driver = driver;  // assigning driver instance from Launch class to local instance
    }

    public WebElement already_account_element() {

        return driver.findElement(already_account_element);

    }
    public WebElement username() {

        return driver.findElement(username);

    }
    public WebElement sign_out() {

        return driver.findElement(sign_out);

    }
    public WebElement password() {

        return driver.findElement(password);

    }

    public WebElement confirm_logout() {

        return driver.findElement(confirm_logout);

    }
    public WebElement login_button() {

        return driver.findElement(login_button);

    }
    public WebElement incorrect_password() {

        return driver.findElement(incorrect_password);

    }
    
    public WebElement loading_icon() {

        return driver.findElement(loading_icon);

    }
    public WebElement account_email() {

        return driver.findElement(account_email);

    }
    public WebElement new_note() {

        return driver.findElement(new_note);

    }
    public WebElement note_option() {

        return driver.findElement(note_option);

    }
    public WebElement title_area() {

        return driver.findElement(title_area);

    }
    public WebElement nav_home() {

        return driver.findElement(nav_home);

    }


}
