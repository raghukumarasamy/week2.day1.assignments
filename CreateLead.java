package week2.day1.assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CA");
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raghu");
		String firstname = "Ragu";
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumarasamy");
		WebElement datasource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select ds = new Select(datasource);
		ds.selectByIndex(2);
		WebElement marketingcampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mc = new Select(marketingcampaign);
		mc.selectByValue("9000");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("LocalRaghu");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("LocalKumarasamy");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/24/86");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software QA");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality Assurance");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("999999999");
		WebElement preferredcurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select pc = new Select(preferredcurrency);
		pc.selectByVisibleText("INR - Indian Rupee");
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select indus = new Select(industry);
		indus.selectByValue("IND_SOFTWARE");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("750");		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own = new Select(ownership);
		own.selectByIndex(3);
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("Code001");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("CALL");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This ia a practice code");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Learn Carefully");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9884119664");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Ragu");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rocker.ragu@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://www.google.com/");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("MrXXXX");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("MyYYYY");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Kappi Kadai Busstop");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Saravanampatty");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Coimbatore");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select county = new Select(country);
		county.selectByVisibleText("India");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select province = new Select(state);
		province.selectByVisibleText("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641035");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("035");
		driver.findElement(By.name("submitButton")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String etitle = "View Lead | opentaps CRM";
		String atitle = driver.getTitle();
		if (etitle.equals(atitle)) {
			System.out.println("CORRECT TITLE");
		}
		else {
			System.out.println("WRONG TITLE");
		}
		String createdfirstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (createdfirstname.equals(firstname)) {
			System.out.println("Entered name "+firstname+" is correctly saved and printed in view lead page");
		}
		else {
			System.out.println("Entered firstname and createdfirstname differs");
		}
			
		
	//	driver.close();
	}

}
