package comMyntraTestCase.AutomationScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTestMyntra {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");

		// Actions class
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@data-group=\"beauty\"]"))).keyDown(Keys.TAB).perform();

		driver.findElement(By.xpath("(//a[contains(text(),'Makeup')])[2]")).click();
		driver.findElement(By.xpath("//input[@value=\"Lipstick\"]")).click();
		
	
	
}}
