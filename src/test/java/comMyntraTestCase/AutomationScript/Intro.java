package comMyntraTestCase.AutomationScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Intro {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\sneha\\Downloads\\chromedriver-win64 (2).exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
	}
public void method3() {
	System.out.println("1");
	System.out.println("2");
}
}

