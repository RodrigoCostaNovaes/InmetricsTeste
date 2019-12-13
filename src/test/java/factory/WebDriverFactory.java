package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverFactory {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public  static void startChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/lib/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--lang=pt-BR");
		chromeOptions.addArguments("--disable-infobars");
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.inmetrics.com.br/");
	}

	public static WebDriver getCurrentRunningDriver() {
		return driver;
	}

	public static void killCurrentRunningDriver() {
		driver.quit();

		
		 
	}
}
