package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {


	static  WebDriver driver;

	public void openUrl() {
		

		// Using WebDriver Manager
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.close();

		// using WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	// Enter Username
	public void enterUsername() {
		driver.findElement(By.id("email")).sendKeys("Kunal.rock31@gmail.com");
	}

	// Enter Password
	public void enterPassword() {
		driver.findElement(By.id("pass")).sendKeys("Kunal@310894");
	}

	// Click Login Button
	public void clickLoginButton() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	// Valid Login id and password
	public void validLoginCreditionals() {
		System.out.println("User logged in");
	}
}