package myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://chatgpt.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.close(); //close the window where the browser got invoked firstly
		driver.quit(); // close all associated windows
		

	}

}
