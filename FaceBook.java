package week2.day1.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Jason");
		driver.findElement(By.name("lastname")).sendKeys("Statham");
		driver.findElement(By.name("reg_email__")).sendKeys("9889889881");
		driver.findElement(By.name("reg_passwd__")).sendKeys("password@123");
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select d = new Select (date);
		d.selectByVisibleText("24");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select m = new Select (month);
		m.selectByVisibleText("Apr");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select y = new Select (year);
		y.selectByVisibleText("1986");
		driver.findElement(By.id("u_3_3_ey")).click();
		
	}

}
