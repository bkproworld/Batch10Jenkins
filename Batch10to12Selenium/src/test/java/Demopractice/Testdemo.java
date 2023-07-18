package Demopractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdemo {

	@Test
	public void check() {
		System.out.println("connection is on");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
	}
}
