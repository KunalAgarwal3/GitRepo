package pageClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Masterpage {

	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;

	// Constuctor implementation.

	public Masterpage() throws Exception {

		// Configuration properties file implementation.
		FileInputStream ip = new FileInputStream(".\\src\\com\\facebook\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);

		// Locators properties file implementation.
		FileInputStream fs = new FileInputStream(".\\src\\com\\facebook\\repository\\locators.properties");
		or = new Properties();
		or.load(fs);

		// Test data properties file implementation.
		FileInputStream ts = new FileInputStream(".\\src\\com\\facebook\\repository\\Testdata.properties");
		td = new Properties();
		td.load(ts);

		
	}
}
