package org.Dem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnuSatishSaanvi\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
			
			
			System.out.println("Browser launched sucessfully");
			
			System.out.println("Test project");
			
	}

}
