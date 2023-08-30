package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class BaseClass {
	public static WebDriver driver;

	// fetching test parameters from mysql database

	public static WebDriver initDriver() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {

		String browser = "chrome";


		if (browser.toLowerCase().equals("chrome")) {
			// System.out.println("Test initiated using Chrome browser");

			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\drivers\\chromedriver");
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("incognito");
			//option.setHeadless(true);
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);



		}



		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	public static void screenshot(String testCaseName, WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver; // taking screenshot with help of driver
		File source = ts.getScreenshotAs(OutputType.FILE); // saving screenshot to a File
		String destinationFile = System.getProperty("user.dir") + "\\Reports\\" + testCaseName + ".png"; //creating aPNG filewith dynamic methodname and webdriverinstance

		FileUtils.copyFile(source, new File(destinationFile)); // Transferring PNG file from source to Destination
																// location in project folder
		System.out.println("Error screenshot attached with " + testCaseName);
	}

}