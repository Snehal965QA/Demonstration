package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Steampowered {
	public static void main(String[] args) {
		// Set up WebDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to Steam login page
		driver.get("https://store.steampowered.com/login/");

		driver.findElement(By.xpath("(//input[@class=\"_2GBWeup5cttgbTw8FM3tfx\"])[1]")).sendKeys("snehal");
		driver.findElement(By.xpath("(//input[@class=\"_2GBWeup5cttgbTw8FM3tfx\"])[2]")).sendKeys("12345");
// css selector for sign in-  button[type='submit']
	
	
	System.out.println("hi");
	}
}
