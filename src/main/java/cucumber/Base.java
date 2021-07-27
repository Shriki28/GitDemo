package cucumber;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Eclipse Workplace\\Cucumber\\src\\test\\java\\cucumber\\global.properties");
		prop.load(fis);
		String url = prop.getProperty("URL");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		return driver;
	}

}
