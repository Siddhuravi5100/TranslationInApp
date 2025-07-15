package fullTranslator;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PurchaseTranslator {

	
		ChromeDriver driver =new ChromeDriver() ;
		public static void main(String[] args) throws InterruptedException {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIDDHAARTHAN\\eclipse-workspace\\InApp\\Drivers\\chromedriver.exe");
				
				
		        ChromeOptions options = new ChromeOptions();
		        options.addArguments("--disable-blink-features=AutomationControlled");
		        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.5735.110 Safari/537.36");
		        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		        options.setExperimentalOption("useAutomationExtension", false);
			
		        
		    	ChromeDriver driver = new ChromeDriver(options);
			
		driver.get("https://play.google.com/console/u/0/developers/8640556426190716779/app/4975092509810365831/app-dashboard");
		//driver.get("https://play.google.com/console/u/0/developers/8640556426190716779/app/4973164729592355824/monetization-setup");
			driver.manage().window().maximize();
	 //driver.findElement(By.id("identifierId")).sendKeys("hfgentertainments1@gmail.com");
	  driver.findElement(By.id("identifierId")).sendKeys("hfgentertainments.sm@gmail.com");
		driver.findElement(By.id("identifierNext")).click(); 
		
		   Thread.sleep(5000);
		//driver.findElement(By.name("Passwd")).sendKeys("hfgNew@**2025**");
		driver.findElement(By.name("Passwd")).sendKeys("ENAmarketing##123**");
		driver.findElement(By.id("passwordNext")).click();
		
		driver.get("https://play.google.com/console/u/0/developers/8640556426190716779/app/4975092509810365831/statistics?metrics=ACTIVE_USERS-ALL-UNIQUE-PER_INTERVAL-DAY&dimension=COUNTRY&dimensionValues=OVERALL%2CIN%2CUS%2CIR%2CRU&dateRange=2025_6_14-2025_7_13&tab=APP_STATISTICS&ctpMetric=DAU_MAU-ACQUISITION_UNSPECIFIED-COUNT_UNSPECIFIED-CALCULATION_UNSPECIFIED-DAY&ctpDateRange=2025_6_14-2025_7_13&ctpDimension=COUNTRY&ctpDimensionValue=OVERALL&ctpPeersetKey=3%3Add9c18ce4bec35c9");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Installed audience']")).click();
		driver.findElement(By.xpath("//span[@id='a80C3B7F7-FDE8-4925-A150-E01D400A08D8--122']")).click();





		
		
		
		
		

		
		
		
		
	}

}
