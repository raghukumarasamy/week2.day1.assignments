package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("UserFirstName")).sendKeys("Jason");
	driver.findElement(By.name("UserLastName")).sendKeys("Statham");
	driver.findElement(By.name("UserEmail")).sendKeys("test@gmail.com");
	WebElement jobtitle = driver.findElement(By.name("UserTitle"));
	Select jt = new Select(jobtitle);
	jt.selectByVisibleText("Developer / Software Engineer / Analyst");
	driver.findElement(By.name("CompanyName")).sendKeys("CA");
	WebElement employees = driver.findElement(By.name("CompanyEmployees"));
	Select emp = new Select(employees);
	emp.selectByVisibleText("101 - 500 employees");
	driver.findElement(By.name("UserPhone")).sendKeys("9889889881");
	WebElement country = driver.findElement(By.name("CompanyCountry"));
	Select county = new Select(country);
	county.selectByVisibleText("India");
	driver.findElement(By.className("checkbox-ui")).click();
	
	}

}
/*
6.	Fill in all the text boxes
7.	Handle all the dropdowns
8.	Click the check box
9.	Close the browser
*Note: No need click Start my freeTrial
optional:
https://www.opencart.com/index.php?route=account/register
*/