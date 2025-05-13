package newStartingProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntro {
public static void main(String[] args) {
	// ChromeDriver.exe--> chromeDriver
	// selenium manager
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\sneha\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	
}
}
