package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Karthik");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("karthikeyan1193@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Hello");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dd = driver.findElement(By.id("exampleFormControlSelect1"));
		Select se =  new Select(dd);
		se.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("16111993");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		String actual = driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText();
		//driver.quit();
		System.out.println(actual);
		
		
		
	}

}
