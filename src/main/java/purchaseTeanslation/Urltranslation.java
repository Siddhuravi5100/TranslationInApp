package purchaseTeanslation;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Urltranslation {

	ChromeDriver driver =new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIDDHAARTHAN\\eclipse-workspace\\InApp\\Drivers\\chromedriver.exe");
			
			
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-blink-features=AutomationControlled");
	        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.5735.110 Safari/537.36");
	        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
	        options.setExperimentalOption("useAutomationExtension", false);
		
	        
	    	ChromeDriver driver = new ChromeDriver(options);
		
	driver.get("https://play.google.com/console/u/0/developers/8640556426190716779/app/4974104740153793134/managed-products/sku-ads_free");
		driver.manage().window().maximize();


	
	
	driver.get("https://play.google.com/console/u/0/developers/8640556426190716779/app/4974104740153793134/managed-products/sku-ads_free");
	
    
    Thread.sleep(2000);
    WebDriverWait wait = new WebDriverWait(driver, (50));

    WebElement manageTranslationsButton = wait.until(
        ExpectedConditions.elementToBeClickable(
            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
    manageTranslationsButton.click();
    Thread.sleep(3000);
	
    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
	driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
	driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
	driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
	driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
	
	
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click(); 
//////ADS FREE
    Thread.sleep(3000);
   
 WebDriverWait wait1  = new WebDriverWait(driver,30);
 WebElement dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
 		    )); dropdownTrigger.click();

 		    WebDriverWait(driver,15);   
 		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
WebElement inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 		    inputField.sendKeys("احصل على إعلانات مجانية");
 		    
WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 		    	textArea.sendKeys("احصل على إعلانات مجانية");
 		    	
 		    	WebDriverWait(driver,10);  
 	   	 dropdownTrigger.click();
      	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
WebElement inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 				    inputField1.sendKeys("免广告");
 				    
WebElement textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 				    	textArea1.sendKeys("免广告");
 		    
 				    	WebDriverWait(driver,10); 
 				    	dropdownTrigger.click();
 		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
WebElement inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 								    inputField11.sendKeys("免廣告");
 								    
WebElement textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 								    	textArea11.sendKeys("免廣告");    
 				
 								    	WebDriverWait(driver,10); 
 								    	dropdownTrigger.click();				    	   
 		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
  		 WebElement inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField111.sendKeys("Získejte reklamy zdarma");
 								    	 								    
WebElement textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
  	textArea111.sendKeys("Získejte reklamy zdarma");    
 		
  	WebDriverWait(driver,10); 
  	dropdownTrigger.click();
 	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
 	 WebElement inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField2.sendKeys("Få annoncer gratis");
 		
WebElement textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea2.sendKeys("Få annoncer gratis");   								  
	
 	WebDriverWait(driver,10); 
 	dropdownTrigger.click();
 	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
 	 WebElement inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField3.sendKeys("Ontvang gratis advertenties");

WebElement textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea3.sendKeys("Ontvang gratis advertenties");								    	

 	Thread.sleep(2000);
 	WebDriverWait(driver,10); 
 	dropdownTrigger.click();
 	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
 	WebElement inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField4.sendKeys("Hanki mainokset ilmaiseksi");
 								    	 								    
WebElement textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea4.sendKeys("Hanki mainokset ilmaiseksi");								    	
	
 	Thread.sleep(2000);
 	WebDriverWait(driver,10); 
 	dropdownTrigger.click();
 	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
 	WebElement inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField5.sendKeys("Obtenez des publicités gratuites");
 								    	 								    
WebElement textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea5.sendKeys("Obtenez des publicités gratuites");				
	
 	Thread.sleep(2000);
 	WebDriverWait(driver,10); 
 	dropdownTrigger.click();
 	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
 	WebElement inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField6.sendKeys("Holen Sie sich kostenlose Anzeigen");
 								    	 								    
WebElement textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea6.sendKeys("Holen Sie sich kostenlose Anzeigen");
	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
 	WebElement inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField7.sendKeys("Λάβετε δωρεάν διαφημίσεις");
 								    	 								    
WebElement textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea7.sendKeys("Λάβετε δωρεάν διαφημίσεις");
	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
 	WebElement inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField8.sendKeys("קבל פרסומות בחינם");
 								    	 								    
WebElement textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea8.sendKeys("קבל פרסומות בחינם");
	
	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
	  	WebElement inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField9.sendKeys("निःशुल्क विज्ञापन प्राप्त करें");
 								    	 								    
WebElement textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea9.sendKeys("निःशुल्क विज्ञापन प्राप्त करें");
	
 	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
 	WebElement inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField10.sendKeys("Ingyenes hirdetések");
 								    	 								    
WebElement textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea10.sendKeys("Ingyenes hirdetések");
	
 	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
 	WebElement inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField12.sendKeys("Dapatkan Iklan Gratis");
 								    	 								    
WebElement textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea12.sendKeys("Dapatkan Iklan Gratis");
	
 	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
 	WebElement inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField13.sendKeys("Ottieni annunci gratuiti");
 								    	 								    
WebElement textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea13.sendKeys("Ottieni annunci gratuiti");

 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
 		WebElement inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField14.sendKeys("広告を無料でゲット");
 								    	 								    
WebElement textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea14.sendKeys("広告を無料でゲット");
	
 	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
 	WebElement inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField15.sendKeys("광고 없이 보기");
 								    	 								    
WebElement textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea15.sendKeys("광고 없이 보기");
	
 	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
 	WebElement inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField16.sendKeys("Dapatkan Iklan Percuma");
 								    	 								    
WebElement textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea16.sendKeys("Dapatkan Iklan Percuma");
	
 	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
 	WebElement inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField17.sendKeys("Uzyskaj reklamy za darmo");
 								    	 								    
WebElement textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea17.sendKeys("Uzyskaj reklamy za darmo");
     	
 	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
 	WebElement inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField18.sendKeys("Obtenha anúncios grátis");
 								    	 								    
WebElement textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea18.sendKeys("Obtenha anúncios grátis");
	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
 	WebElement inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField19.sendKeys("Obțineți reclame gratuit");
 								    	 								    
WebElement textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea19.sendKeys("Obțineți reclame gratuit");
	
 	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
 	WebElement inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField21.sendKeys("Получите бесплатную рекламу");
 								    	 								    
WebElement textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea21.sendKeys("Получите бесплатную рекламу");
 	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
 	WebElement inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField20.sendKeys("Získajte reklamy zadarmo");
 								    	 								    
WebElement textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea20.sendKeys("Získajte reklamy zadarmo");
	
 	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
 	WebElement inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField22.sendKeys("Obtenga anuncios gratis");
 								    	 								    
WebElement textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea22.sendKeys("Obtenga anuncios gratis");
	
 	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
 	WebElement inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	  inputField23.sendKeys("Få annonser gratis");
 								    	 								    
WebElement textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea23.sendKeys("Få annonser gratis");
	
 	
 	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
 	WebElement inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
 	           inputField24.sendKeys("รับโฆษณาฟรี");
 								    	 								    
       WebElement textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	             textArea24.sendKeys("รับโฆษณาฟรี");
	
 	           Thread.sleep(2000);
 	     	WebDriverWait(driver,50); 
 	     	dropdownTrigger.click();
 	     	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
 	WebElement inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
     inputField25.sendKeys("Reklamları Ücretsiz Alın");
 						    	 								    
WebElement textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
       textArea25.sendKeys("Reklamları Ücretsiz Alın");	
      
       Thread.sleep(2000);
   	WebDriverWait(driver,50); 
   	dropdownTrigger.click();
   	Thread.sleep(50);
 	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
 	WebElement inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
     inputField26.sendKeys("Nhận Quảng cáo miễn phí");
 						    	 								    
WebElement textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
       textArea26.sendKeys("Nhận Quảng cáo miễn phí");  
    
       driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
      	Thread.sleep(5000);
        wait = new WebDriverWait(driver, 50);
    	WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
    	button.click();	

    	
    	
    	
    	// Double REWARD 
     	 Thread.sleep(2000);
    	WebElement firstButton = wait.until(ExpectedConditions.elementToBeClickable(
    		    By.xpath("(//span[text()='View in-app product'])[2]")
    		));
    		firstButton.click();
       	
         	 manageTranslationsButton = wait.until(
         	        ExpectedConditions.elementToBeClickable(
         	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
         	    manageTranslationsButton.click();
         	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
         	    Thread.sleep(3000);
         	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
         		
         	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
         		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
         		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
         		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
         		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
         		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
         		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
         		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
         		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
         		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
         		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
         		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
         		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
         		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
         		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
         		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
         		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
         		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
         		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
         		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
         		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
         		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
         		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
         		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
         		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
         		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
         		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
         		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
         		
         		
         	    Thread.sleep(1000);
         	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
          		 Thread.sleep(1000);
    wait1  = new WebDriverWait(driver,30);
    dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
        		    )); dropdownTrigger.click();
      
        		    WebDriverWait(driver,15);   
        		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
         inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        		    inputField.sendKeys("احصل على ضعف المكافآت");
        		    
         textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        		    	textArea.sendKeys("احصل على ضعف المكافآت");
        		    	
        		    	WebDriverWait(driver,10);  
        	   	 dropdownTrigger.click();
             	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
         inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        				    inputField1.sendKeys("获得双倍奖励");
        				    
         textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        				    	textArea1.sendKeys("获得双倍奖励");
        		    
        				    	WebDriverWait(driver,10); 
        				    	dropdownTrigger.click();
        		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
        inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        								    inputField11.sendKeys("獲得雙倍獎勵");
        								    
        textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        								    	textArea11.sendKeys("獲得雙倍獎勵");    
        				
        								    	WebDriverWait(driver,10); 
        								    	dropdownTrigger.click();				    	   
        		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
         		   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField111.sendKeys("Získejte dvojnásobek odměn");
        								    	 								    
         textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
         	textArea111.sendKeys("Získejte dvojnásobek odměn");    
        		
         	WebDriverWait(driver,10); 
         	dropdownTrigger.click();
        	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
        	   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField2.sendKeys("Få dobbelte belønninger");
        		
        textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea2.sendKeys("Få dobbelte belønninger");   								  
      	
        	WebDriverWait(driver,10); 
        	dropdownTrigger.click();
        	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
        	   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField3.sendKeys("Krijg dubbele beloningen");
      
        textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea3.sendKeys("Krijg dubbele beloningen");								    	
      
        	Thread.sleep(2000);
        	WebDriverWait(driver,10); 
        	dropdownTrigger.click();
        	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
        	  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField4.sendKeys("Hanki kaksinkertaiset palkinnot");
        								    	 								    
        textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea4.sendKeys("Hanki kaksinkertaiset palkinnot");								    	
      	
        	Thread.sleep(2000);
        	WebDriverWait(driver,10); 
        	dropdownTrigger.click();
        	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
        	  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField5.sendKeys("Obtenez le double de récompenses");
        								    	 								    
        textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea5.sendKeys("Obtenez le double de récompenses");				
      	
        	Thread.sleep(2000);
        	WebDriverWait(driver,10); 
        	dropdownTrigger.click();
        	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
        	  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField6.sendKeys("Holen Sie sich die doppelte Belohnung");
        								    	 								    
        textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea6.sendKeys("Holen Sie sich die doppelte Belohnung");
      	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
        	  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField7.sendKeys("Αποκτήστε διπλάσια ανταμοιβή");
        								    	 								    
        textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea7.sendKeys("Αποκτήστε διπλάσια ανταμοιβή");
      	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
        	  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField8.sendKeys("קבל כפול את התגמולים");
        								    	 								    
        textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea8.sendKeys("קבל כפול את התגמולים");
      	
      	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
      	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
      	  	  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField9.sendKeys("दोगुना इनाम पाएं");
        								    	 								    
        textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea9.sendKeys("दोगुना इनाम पाएं");
      	
        	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
        	  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField10.sendKeys("Szerezzen dupla jutalmat");
        								    	 								    
        textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea10.sendKeys("Szerezzen dupla jutalmat");
      	
        	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
        	  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField12.sendKeys("Dapatkan Hadiah Ganda");
        								    	 								    
        textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea12.sendKeys("Dapatkan Hadiah Ganda");
      	
        	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
        	  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField13.sendKeys("Ottieni il doppio delle ricompense");
        								    	 								    
        textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea13.sendKeys("Ottieni il doppio delle ricompense");
      
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
        		  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField14.sendKeys("報酬を2倍獲得");
        								    	 								    
        textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea14.sendKeys("報酬を2倍獲得");
      	
        	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
        	  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField15.sendKeys("두 배의 보상을 받으세요");
        								    	 								    
        textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea15.sendKeys("두 배의 보상을 받으세요");
      	
        	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
        	  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField16.sendKeys("Dapatkan Ganjaran Berganda");
        								    	 								    
        textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea16.sendKeys("Dapatkan Ganjaran Berganda");
      	
        	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
        	  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField17.sendKeys("Zdobądź podwójne nagrody");
        								    	 								    
        textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea17.sendKeys("Zdobądź podwójne nagrody");
            	
        	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
        	  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField18.sendKeys("Ganhe o dobro de recompensas");
        								    	 								    
        textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea18.sendKeys("Ganhe o dobro de recompensas");
      	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
        	  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField19.sendKeys("Obțineți recompense duble");
        								    	 								    
        textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea19.sendKeys("Obțineți recompense duble");
      	
        	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
        	  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField21.sendKeys("Получите двойные награды");
        								    	 								    
        textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea21.sendKeys("Получите двойные награды");
        	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
        	  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField20.sendKeys("Získajte dvojnásobnú odmenu");
        								    	 								    
        textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea20.sendKeys("Získajte dvojnásobnú odmenu");
      	
        	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
        	  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField22.sendKeys("Obtenga el doble de recompensas");
        								    	 								    
        textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea22.sendKeys("Obtenga el doble de recompensas");
      	
        	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
        	  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	  inputField23.sendKeys("Få dubbla belöningar");
        								    	 								    
        textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	textArea23.sendKeys("Få dubbla belöningar");
      	
        	
        	Thread.sleep(2000);
      	WebDriverWait(driver,50); 
      	dropdownTrigger.click();
      	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
        	  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
        	           inputField24.sendKeys("รับรางวัลสองเท่า");
        								    	 								    
          textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
        	             textArea24.sendKeys("รับรางวัลสองเท่า");
      	
        	           Thread.sleep(2000);
        	     	WebDriverWait(driver,50); 
        	     	dropdownTrigger.click();
        	     	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
        	  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
            inputField25.sendKeys("Ödüllerin İki Katını Kazanın");
        						    	 								    
        textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              textArea25.sendKeys("Ödüllerin İki Katını Kazanın");	
             
              Thread.sleep(2000);
          	WebDriverWait(driver,50); 
          	dropdownTrigger.click();
          	Thread.sleep(50);
        	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
        	  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
            inputField26.sendKeys("Nhận gấp đôi phần thưởng");
        						    	 								    
        textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              textArea26.sendKeys("Nhận gấp đôi phần thưởng");								    	
            	Thread.sleep(1000);

               driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click(); 
            	Thread.sleep(5000);
            	wait = new WebDriverWait(driver, 150);
             	 button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
             	button.click();
   					    	
            	
             	
             	
             	
             	
      //     Triple       	
             	Thread.sleep(2000);
            	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
            		    By.xpath("(//span[text()='View in-app product'])[3]")
            		));
            		firstButton.click();
    
            		 manageTranslationsButton = wait.until(
                  	        ExpectedConditions.elementToBeClickable(
                  	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
                  	    manageTranslationsButton.click();
                  	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
                  	    Thread.sleep(3000);
                  	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
                  		
                  	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                  		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                  		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                  		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                  		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                  		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                  		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                  		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                  		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                  		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                  		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                  		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                  		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                  		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                  		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                  		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                  		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                  		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                  		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                  		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                  		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
                  		
                  		
                  	    Thread.sleep(1000);
                  	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
                  		 Thread.sleep(1000);
                        wait1  = new WebDriverWait(driver,30);
                       dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
                        		    )); dropdownTrigger.click();
                  
                        		    WebDriverWait(driver,15);   
                        		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                         inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        		    inputField.sendKeys("احصل على ثلاثة أضعاف المكافآت");
                        		    
                         textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        		    	textArea.sendKeys("احصل على ثلاثة أضعاف المكافآت");
                        		    	
                        		    	WebDriverWait(driver,10);  
                        	   	 dropdownTrigger.click();
                             	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                         inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        				    inputField1.sendKeys("获得三倍奖励");
                        				    
                         textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        				    	textArea1.sendKeys("获得三倍奖励");
                        		    
                        				    	WebDriverWait(driver,10); 
                        				    	dropdownTrigger.click();
                        		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                        inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        								    inputField11.sendKeys("獲得三倍獎勵");
                        								    
                        textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        								    	textArea11.sendKeys("獲得三倍獎勵");    
                        				
                        								    	WebDriverWait(driver,10); 
                        								    	dropdownTrigger.click();				    	   
                        		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                         		   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField111.sendKeys("získat trojnásobné odměny");
                        								    	 								    
                         textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                         	textArea111.sendKeys("získat trojnásobné odměny");    
                        		
                         	WebDriverWait(driver,10); 
                         	dropdownTrigger.click();
                        	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                        	   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField2.sendKeys("få tredoblet belønningen");
                        		
                        textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea2.sendKeys("få tredoblet belønningen");   								  
                      	
                        	WebDriverWait(driver,10); 
                        	dropdownTrigger.click();
                        	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                        	   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField3.sendKeys("krijg drie keer zoveel beloningen");
                  
                        textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea3.sendKeys("krijg drie keer zoveel beloningen");								    	
                  
                        	WebDriverWait(driver,10); 
                        	dropdownTrigger.click();
                        	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                        	  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField4.sendKeys("saada kolminkertaiset palkinnot");
                        								    	 								    
                        textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea4.sendKeys("saada kolminkertaiset palkinnot");								    	
                      	
                        	WebDriverWait(driver,10); 
                        	dropdownTrigger.click();
                        	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                        	  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField5.sendKeys("obtenez le triple des récompenses");
                        								    	 								    
                        textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea5.sendKeys("obtenez le triple des récompenses");				
                      	
                        	WebDriverWait(driver,10); 
                        	dropdownTrigger.click();
                        	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                        	  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField6.sendKeys("Holen Sie sich die dreifache Belohnung");
                        								    	 								    
                        textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea6.sendKeys("Holen Sie sich die dreifache Belohnung");
                      	
                        	WebDriverWait(driver,10); 
                        	dropdownTrigger.click();
                        	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                        	  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField7.sendKeys("λάβετε τριπλάσια ανταμοιβή");
                        								    	 								    
                        textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea7.sendKeys("λάβετε τριπλάσια ανταμοιβή");
                      	
                        	Thread.sleep(350);
                      	WebDriverWait(driver,50); 
                      	dropdownTrigger.click();
                      	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                        	  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField8.sendKeys("לקבל פרס משולש");
                        								    	 								    
                        textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea8.sendKeys("לקבל פרס משולש");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                        	  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField9.sendKeys("तिगुना इनाम पाएँ");
                        								    	 								    
                        textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea9.sendKeys("तिगुना इनाम पाएँ");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                        	  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField10.sendKeys("kap háromszoros jutalmat");
                        								    	 								    
                        textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea10.sendKeys("kap háromszoros jutalmat");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                        	  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField12.sendKeys("dapatkan tiga kali lipat hadiahnya");
                        								    	 								    
                        textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea12.sendKeys("dapatkan tiga kali lipat hadiahnya");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                        	  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField13.sendKeys("ottieni il triplo delle ricompense");
                        								    	 								    
                        textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea13.sendKeys("ottieni il triplo delle ricompense");
                  
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                  
                        	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                        		  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField14.sendKeys("報酬を3倍に");
                        								    	 								    
                        textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea14.sendKeys("報酬を3倍に");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                        	  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField15.sendKeys("3배의 보상을 받으세요");
                        								    	 								    
                        textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea15.sendKeys("3배의 보상을 받으세요");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                        	  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField16.sendKeys("mendapat ganjaran tiga kali ganda");
                        								    	 								    
                        textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea16.sendKeys("mendapat ganjaran tiga kali ganda");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                        	  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField17.sendKeys("zdobądź potrójne nagrody");
                        								    	 								    
                        textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea17.sendKeys("zdobądź potrójne nagrody");
                            	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                        	  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField18.sendKeys("ganhe o triplo das recompensas");
                        								    	 								    
                        textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea18.sendKeys("ganhe o triplo das recompensas");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                        	  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField19.sendKeys("obține triplul recompenselor");
                        								    	 								    
                        textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea19.sendKeys("obține triplul recompenselor");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                        	  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField21.sendKeys("получите тройное вознаграждение");
                        								    	 								    
                        textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea21.sendKeys("получите тройное вознаграждение");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                        	  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField20.sendKeys("získajte trojnásobné odmeny");
                        								    	 								    
                        textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea20.sendKeys("získajte trojnásobné odmeny");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                        	  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField22.sendKeys("Obtén el triple de recompensas");
                        								    	 								    
                        textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea22.sendKeys("Obtén el triple de recompensas");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                        	  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	  inputField23.sendKeys("få tredubbla belöningarna");
                        								    	 								    
                        textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	textArea23.sendKeys("få tredubbla belöningarna");
                      	
                        	Thread.sleep(350);
                          	WebDriverWait(driver,50); 
                          	dropdownTrigger.click();
                          	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                        	  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        	           inputField24.sendKeys("รับรางวัลสามเท่า");
                        								    	 								    
                                textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                        	             textArea24.sendKeys("รับรางวัลสามเท่า");
                      	
                        	             Thread.sleep(350);
                        	           	WebDriverWait(driver,50); 
                        	           	dropdownTrigger.click();
                        	           	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                        	  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                            inputField25.sendKeys("üç kat ödül kazanın");
                        						    	 								    
                        textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                              textArea25.sendKeys("üç kat ödül kazanın");	
                      	
                              Thread.sleep(350);
                            	WebDriverWait(driver,50); 
                            	dropdownTrigger.click();
                            	Thread.sleep(350);
                        	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
                        	  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                            inputField26.sendKeys("nhận được gấp ba phần thưởng");
                        						    	 								    
                       textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                              textArea26.sendKeys("nhận được gấp ba phần thưởng");                  	    
                  	    
                  	    
                              driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
                              Thread.sleep(5000);
                          	wait = new WebDriverWait(driver, 150);
                         		  button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
                         		button.click(); 
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    //Quadruple 
                  	  Thread.sleep(2000);
                  	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
                  		    By.xpath("(//span[text()='View in-app product'])[4]")
                  		));
                  		firstButton.click();
                  	    
                  	  manageTranslationsButton = wait.until(
                   	        ExpectedConditions.elementToBeClickable(
                   	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
                   	    manageTranslationsButton.click();
                   	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
                   	    Thread.sleep(3000);
                   	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
                   		
                   	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                   		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                   		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                   		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                   		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                   		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                   		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                   		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                   		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                   		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                   		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                   		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                   		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                   		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                   		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                   		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                   		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                   		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                   		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                   		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                   		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
                   		
                   		
                   	    Thread.sleep(1000);
                   	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
                  		 Thread.sleep(1000);
                   	  wait1  = new WebDriverWait(driver,50);
                   	   dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
                   			    )); dropdownTrigger.click();
                   	
                   			    WebDriverWait(driver,15);   
                   			    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                   	  inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   			    inputField.sendKeys("احصل على أربعة أضعاف المكافآت");
                   			    
                   	  textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   			    	textArea.sendKeys("احصل على أربعة أضعاف المكافآت");
                   			    	
                   			    	WebDriverWait(driver,50);  
                   		   	 dropdownTrigger.click();
                   	    	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                   	  inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   					    inputField1.sendKeys("获得四倍奖励");
                   					    
                   	  textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   					    	textArea1.sendKeys("获得四倍奖励");
                   			    
                   					    	WebDriverWait(driver,50); 
                   					    	dropdownTrigger.click();
                   			 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                   	  inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   									    inputField11.sendKeys("獲得四倍獎勵");
                   									    
                   	  textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   									    	textArea11.sendKeys("獲得四倍獎勵");    
                   					
                   									    	WebDriverWait(driver,50); 
                   									    	dropdownTrigger.click();				    	   
                   			     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                   			   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField111.sendKeys("získat čtyřnásobné odměny");
                   									    	 								    
                   	  textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea111.sendKeys("získat čtyřnásobné odměny");    
                   			
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                   		   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField2.sendKeys("få firdoblet belønningen");
                   			
                   	  textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea2.sendKeys("få firdoblet belønningen");   								  
                   		
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                   		   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField3.sendKeys("krijg vier keer zoveel beloningen");
                   	
                   	  textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea3.sendKeys("krijg vier keer zoveel beloningen");								    	
                   	
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                   		  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField4.sendKeys("saat nelinkertaiset palkinnot");
                   									    	 								    
                   	  textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea4.sendKeys("saat nelinkertaiset palkinnot");								    	
                   		
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                   		  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField5.sendKeys("obtenez quatre fois plus de récompenses");
                   									    	 								    
                   	  textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea5.sendKeys("obtenez quatre fois plus de récompenses");				
                   		
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                   		  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField6.sendKeys("Holen Sie sich die vierfache Belohnung");
                   									    	 								    
                   	  textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea6.sendKeys("Holen Sie sich die vierfache Belohnung");
                   		
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                   		  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField7.sendKeys("λάβετε τετραπλάσιες ανταμοιβές");
                   									    	 								    
                   	  textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea7.sendKeys("λάβετε τετραπλάσιες ανταμοιβές");
                   		
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                   		  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField8.sendKeys("לקבל פי ארבעה את התגמולים");
                   									    	 								    
                   	  textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea8.sendKeys("לקבל פי ארבעה את התגמולים");
                   		
                   		Thread.sleep(2000);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(50);
                   		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                   		  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField9.sendKeys("चौगुना इनाम पाएँ");
                   									    	 								    
                   	  textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea9.sendKeys("चौगुना इनाम पाएँ");
                   		
                   		Thread.sleep(50);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                   		  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField10.sendKeys("négyszeres jutalmat kap");
                   									    	 								    
                   	  textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea10.sendKeys("négyszeres jutalmat kap");
                   		
                   		Thread.sleep(350);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                   		  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField12.sendKeys("dapatkan hadiah empat kali lipat");
                   									    	 								    
                   	  textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea12.sendKeys("dapatkan hadiah empat kali lipat");
                   		
                   		Thread.sleep(350);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                   		  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField13.sendKeys("ottieni il quadruplo delle ricompense");
                   									    	 								    
                   	  textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea13.sendKeys("ottieni il quadruplo delle ricompense");
                   	
                   		Thread.sleep(350);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                   			  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField14.sendKeys("報酬が4倍になる");
                   									    	 								    
                   	  textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea14.sendKeys("報酬が4倍になる");
                   		
                   		Thread.sleep(350);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                   		  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField15.sendKeys("4배의 보상을 받으세요");
                   									    	 								    
                   	  textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea15.sendKeys("4배의 보상을 받으세요");
                   		
                   		Thread.sleep(50);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                   		  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField16.sendKeys("mendapat ganjaran empat kali ganda");
                   									    	 								    
                   	  textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea16.sendKeys("mendapat ganjaran empat kali ganda");
                   		
                   		Thread.sleep(350);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                   		  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField17.sendKeys("zdobądź poczwórne nagrody");
                   									    	 								    
                   	  textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea17.sendKeys("zdobądź poczwórne nagrody");
                   		
                   		Thread.sleep(350);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                   		  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField18.sendKeys("ganhe o quádruplo das recompensas");
                   									    	 								    
                   	  textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea18.sendKeys("ganhe o quádruplo das recompensas");
                   		
                   		Thread.sleep(350);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                   		  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField19.sendKeys("obține de patru ori recompense");
                   									    	 								    
                   	  textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea19.sendKeys("obține de patru ori recompense");
                   		
                   		Thread.sleep(350);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                   		  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField21.sendKeys("получите вчетверо больше наград");
                   									    	 								    
                   	  textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea21.sendKeys("получите вчетверо больше наград");
                   		
                   		Thread.sleep(350);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                   		  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField20.sendKeys("získajte štvornásobné odmeny");
                   									    	 								    
                   	  textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea20.sendKeys("získajte štvornásobné odmeny");
                   		
                   		Thread.sleep(350);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                   		  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField22.sendKeys("Obtén el cuádruple de recompensas");
                   									    	 								    
                   	  textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea22.sendKeys("Obtén el cuádruple de recompensas");
                   		
                   		Thread.sleep(350);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                   		  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		  inputField23.sendKeys("få fyrdubbla belöningarna");
                   									    	 								    
                   	  textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		textArea23.sendKeys("få fyrdubbla belöningarna");
                   		
                   		Thread.sleep(350);
                   		WebDriverWait(driver,50); 
                   		dropdownTrigger.click();
                   		Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                   		  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   		           inputField24.sendKeys("รับรางวัลเพิ่มเป็นสี่เท่า");
                   									    	 								    
                   	       textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   		             textArea24.sendKeys("รับรางวัลเพิ่มเป็นสี่เท่า");
                   		
                   		           Thread.sleep(350);
                   		           WebDriverWait (driver,50); 
                   		             dropdownTrigger.click();
                   		         	Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                   		  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	   inputField25.sendKeys("dört kat ödül kazanın");
                   							    	 								    
                   	  textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	     textArea25.sendKeys("dört kat ödül kazanın");
                   		
                   	     Thread.sleep(350);
                   	 	WebDriverWait(driver,50); 
                   	 	dropdownTrigger.click();
                   	 	Thread.sleep(350);
                   		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
                   		  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	   inputField26.sendKeys("nhận được gấp bốn lần phần thưởng");
                   							    	 								    
                   	  textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	     textArea26.sendKeys("nhận được gấp bốn lần phần thưởng");
                   	
                   	 
                   	     driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
                   	  Thread.sleep(5000);
                  	wait = new WebDriverWait(driver, 150);
                   		  button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
                   		button.click();                   	    
                   	    
                 	    
                   	  //5Hours  
                   	 Thread.sleep(2000);
                 	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
                 		    By.xpath("(//span[text()='View in-app product'])[5]")
                 		));
                 		firstButton.click();
                   	    
                   	 manageTranslationsButton = wait.until(
                  	        ExpectedConditions.elementToBeClickable(
                  	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
                  	    manageTranslationsButton.click();
                  	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
                  	    Thread.sleep(3000);
                  	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
                  		
                  	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                  		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                  		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                  		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                  		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                  		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                  		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                  		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                  		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                  		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                  		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                  		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                  		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                  		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                  		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                  		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                  		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                  		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                  		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                  		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                  		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
                  		                             	    Thread.sleep(1000);
                  	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
                  		 Thread.sleep(1000);
                  	    wait1  = new WebDriverWait(driver,50);
                  	    dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
                  			    )); dropdownTrigger.click();
                  	
                  			    WebDriverWait(driver,15);   
                  			    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                  	   inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  			    inputField.sendKeys("احصل على 5 ساعات غير محدودة");
                  			    
                  	   textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  			    	textArea.sendKeys("احصل على 5 ساعات غير محدودة");
                  			    	
                  			    	WebDriverWait(driver,50);  
                  		   	 dropdownTrigger.click();
                  	     	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                  	   inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  					    inputField1.sendKeys("5 小时无限畅享");
                  					    
                  	   textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  					    	textArea1.sendKeys("5 小时无限畅享");
                  			    
                  					    	WebDriverWait(driver,50); 
                  					    	dropdownTrigger.click();
                  			 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                  	  inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  									    inputField11.sendKeys("5 小時無限暢享");
                  									    
                  	  textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  									    	textArea11.sendKeys("5 小時無限暢享");    
                  					
                  									    	WebDriverWait(driver,50); 
                  									    	dropdownTrigger.click();				    	   
                  			     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                  	 		   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField111.sendKeys("získat neomezeně po dobu 5 hodin");
                  									    	 								    
                  	   textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	 	textArea111.sendKeys("získat neomezeně po dobu 5 hodin");    
                  			
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  		 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                  		   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField2.sendKeys("få ubegrænset i 5 timer");
                  			
                  	  textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea2.sendKeys("få ubegrænset i 5 timer");   								  
                  		
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                  		   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField3.sendKeys("krijg onbeperkt voor 5 uur");
                  	
                  	  textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea3.sendKeys("krijg onbeperkt voor 5 uur");								    	
                  	
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                  		  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField4.sendKeys("saada rajattomasti 5 tuntia");
                  									    	 								    
                  	  textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea4.sendKeys("saada rajattomasti 5 tuntia");								    	
                  		
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                  		  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField5.sendKeys("obtenez un accès illimité pendant 5 heures");
                  									    	 								    
                  	  textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea5.sendKeys("obtenez un accès illimité pendant 5 heures");				
                  		
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                  		  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField6.sendKeys("5 Stunden unbegrenzt nutzen");
                  									    	 								    
                  	  textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea6.sendKeys("5 Stunden unbegrenzt nutzen");
                  		
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                  		  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField7.sendKeys("πάρτε απεριόριστο για 5 ώρες");
                  									    	 								    
                  	  textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea7.sendKeys("πάρτε απεριόριστο για 5 ώρες");
                  		
                  		Thread.sleep(350); 
                  		WebDriverWait(driver,350); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                  		  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField8.sendKeys("קבל ללא הגבלה למשך 5 שעות");
                  									    	 								    
                  	  textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea8.sendKeys("קבל ללא הגבלה למשך 5 שעות");
                  		
                  		Thread.sleep(2000);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(50);
                  		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                  		  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField9.sendKeys("5 घंटे तक अनलिमिटेड पाएं");
                  									    	 								    
                  	  textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea9.sendKeys("5 घंटे तक अनलिमिटेड पाएं");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                  		  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField10.sendKeys("korlátlanul 5 órán keresztül");
                  									    	 								    
                  	  textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea10.sendKeys("korlátlanul 5 órán keresztül");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                  		  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField12.sendKeys("dapatkan unlimited selama 5 jam");
                  									    	 								    
                  	  textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea12.sendKeys("dapatkan unlimited selama 5 jam");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                  		  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField13.sendKeys("ottieni illimitato per 5 ore");
                  									    	 								    
                  	  textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea13.sendKeys("ottieni illimitato per 5 ore");
                  	
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                  			  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField14.sendKeys("5時間無制限");
                  									    	 								    
                  	  textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea14.sendKeys("5時間無制限");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                  		  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField15.sendKeys("5시간 동안 무제한으로 이용하세요");
                  									    	 								    
                  	  textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea15.sendKeys("5시간 동안 무제한으로 이용하세요");
                  		
                  		Thread.sleep(50);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                  		  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField16.sendKeys("dapatkan tanpa had selama 5 jam");
                  									    	 								    
                  	  textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea16.sendKeys("dapatkan tanpa had selama 5 jam");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                  		  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField17.sendKeys("otrzymaj nieograniczony dostęp przez 5 godzin");
                  									    	 								    
                  	  textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea17.sendKeys("otrzymaj nieograniczony dostęp przez 5 godzin");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                  		  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField18.sendKeys("ganhe ilimitado por 5 horas");
                  									    	 								    
                  	  textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea18.sendKeys("ganhe ilimitado por 5 horas");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                  		  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField19.sendKeys("obțineți nelimitat timp de 5 ore");
                  									    	 								    
                  	  textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea19.sendKeys("obțineți nelimitat timp de 5 ore");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                  		  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField21.sendKeys("получить безлимит на 5 часов");
                  									    	 								    
                  	  textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea21.sendKeys("получить безлимит на 5 часов");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                  		  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField20.sendKeys("získajte neobmedzené množstvo na 5 hodín");
                  									    	 								    
                  	  textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea20.sendKeys("získajte neobmedzené množstvo na 5 hodín");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                  		  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField22.sendKeys("Obtén acceso ilimitado por 5 horas");
                  									    	 								    
                  	  textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea22.sendKeys("Obtén acceso ilimitado por 5 horas");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                  		  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField23.sendKeys("få obegränsat i 5 timmar");
                  									    	 								    
                  	  textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea23.sendKeys("få obegränsat i 5 timmar");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                  		  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		           inputField24.sendKeys("ได้ไม่จำกัด 5 ชั่วโมง");
                  									    	 								    
                  	        textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		             textArea24.sendKeys("ได้ไม่จำกัด 5 ชั่วโมง");
                  		
                  		           Thread.sleep(350);
                  		             WebDriverWait(driver,50); 
                  		             dropdownTrigger.click();
                  		         	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                  		  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	    inputField25.sendKeys("5 saat boyunca sınırsız kullanabilirsiniz");
                  							    	 								    
                  	  textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	      textArea25.sendKeys("5 saat boyunca sınırsız kullanabilirsiniz");
                  		
                  		
                  	      WebDriverWait(driver,50); 
                  	      dropdownTrigger.click();
                  	    	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
                  		  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	    inputField26.sendKeys("nhận được không giới hạn trong 5 giờ");
                  							    	 								    
                  	  textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	      textArea26.sendKeys("nhận được không giới hạn trong 5 giờ");
                  	  
                  	      driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click(); 
                  	    Thread.sleep(5000);
                    	wait = new WebDriverWait(driver, 150);
                  	  	 button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
                  	  	button.click();                  	    
                    	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	   //1000 Coin 
                  	  Thread.sleep(2000);
                  	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
                  		    By.xpath("(//span[text()='View in-app product'])[6]")
                  		));
                  		firstButton.click();
                  	     manageTranslationsButton = wait.until(
                   	        ExpectedConditions.elementToBeClickable(
                   	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
                   	    manageTranslationsButton.click();
                   	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
                   	    Thread.sleep(3000);
                   	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
                   		
                   	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                   		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                   		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                   		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                   		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                   		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                   		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                   		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                   		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                   		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                   		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                   		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                   		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                   		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                   		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                   		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                   		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                   		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                   		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                   		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                   		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
                Thread.sleep(1000);
                   	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
                  		 Thread.sleep(1000);
                   	     wait1  = new WebDriverWait(driver,50);
                   	      dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
                   	  		    )); dropdownTrigger.click();

                   	  		    WebDriverWait(driver,15);   
                   	  		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                   	     inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  		    inputField.sendKeys("احصل على 1000 قطعة نقدية");
                   	  		    
                   	     textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  		    	textArea.sendKeys("احصل على 1000 قطعة نقدية");
                   	  		    	
                   	  		    	WebDriverWait(driver,50);  
                   	  	   	 dropdownTrigger.click();
                   	       	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                   	     inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  				    inputField1.sendKeys("获得 1000 枚硬币");
                   	  				    
                   	     textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  				    	textArea1.sendKeys("获得 1000 枚硬币");
                   	  		    
                   	  				    	WebDriverWait(driver,50); 
                   	  				    	dropdownTrigger.click();
                   	  		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                   	    inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  								    inputField11.sendKeys("獲得 1000 枚硬幣");
                   	  								    
                   	    textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  								    	textArea11.sendKeys("獲得 1000 枚硬幣");    
                   	  				
                   	  								    	WebDriverWait(driver,50); 
                   	  								    	dropdownTrigger.click();				    	   
                   	  		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                   	   		   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField111.sendKeys("Získejte 1000 mincí");
                   	  								    	 								    
                   	     textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	   	textArea111.sendKeys("Získejte 1000 mincí");    
                   	  		
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	  	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                   	  	   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField2.sendKeys("Få 1000 mønter");
                   	  		
                   	    textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea2.sendKeys("Få 1000 mønter");   								  
                   	  	
                   	  	Thread.sleep(350);
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	   	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                   	  	   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField3.sendKeys("Ontvang 1000 munten");

                   	    textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea3.sendKeys("Ontvang 1000 munten");								    	

                   	  	Thread.sleep(350);
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	   	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                   	  	  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField4.sendKeys("Hanki 1000 kolikkoa");
                   	  								    	 								    
                   	    textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea4.sendKeys("Hanki 1000 kolikkoa");								    	
                   	  	
                   	  	Thread.sleep(350);
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	   	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                   	  	  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField5.sendKeys("Obtenez 1000 pièces");
                   	  								    	 								    
                   	    textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea5.sendKeys("Obtenez 1000 pièces");				
                   	  	
                   	  	Thread.sleep(350);
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	   	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                   	  	  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField6.sendKeys("Erhalte 1000 Münzen");
                   	  								    	 								    
                   	    textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea6.sendKeys("Erhalte 1000 Münzen");
                   	  	
                   	  	Thread.sleep(350);
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	   	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                   	  	  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField7.sendKeys("Πάρτε 1000 νομίσματα");
                   	  								    	 								    
                   	    textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea7.sendKeys("Πάρτε 1000 νομίσματα");
                   	  	
                   	  	Thread.sleep(350);
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	   	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                   	  	  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField8.sendKeys("קבל 1000 מטבעות");
                   	  								    	 								    
                   	    textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea8.sendKeys("קבל 1000 מטבעות");
                   	  	
                   	  	Thread.sleep(350);
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	   	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                   	  	  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField9.sendKeys("1000 सिक्के पाएं");
                   	  								    	 								    
                   	    textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea9.sendKeys("1000 सिक्के पाएं");
                   	  	
                   	  	Thread.sleep(350);
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	   	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                   	  	  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField10.sendKeys("Szerezz 1000 érmét");
                   	  								    	 								    
                   	    textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea10.sendKeys("Szerezz 1000 érmét");
                   	  	
                   	  	Thread.sleep(350);
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	   	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                   	  	  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField12.sendKeys("Dapatkan 1000 Koin");
                   	  								    	 								    
                   	    textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea12.sendKeys("Dapatkan 1000 Koin");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                   	  	  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField13.sendKeys("Ottieni 1000 monete");
                   	  								    	 								    
                   	    textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea13.sendKeys("Ottieni 1000 monete");

                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                   	  		  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField14.sendKeys("1000コインを獲得");
                   	  								    	 								    
                   	    textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea14.sendKeys("1000コインを獲得");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                   	  	  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField15.sendKeys("1000개의 코인을 얻으세요");
                   	  								    	 								    
                   	    textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea15.sendKeys("1000개의 코인을 얻으세요");
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                   	  	  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField16.sendKeys("Dapatkan 1000 Syiling");
                   	  								    	 								    
                   	    textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea16.sendKeys("Dapatkan 1000 Syiling");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                   	  	  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField17.sendKeys("Zdobądź 1000 monet");
                   	  								    	 								    
                   	    textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea17.sendKeys("Zdobądź 1000 monet");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                   	  	  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField18.sendKeys("Ganhe 1000 moedas");
                   	  								    	 								    
                   	    textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea18.sendKeys("Ganhe 1000 moedas");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                   	  	  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField19.sendKeys("Obțineți 1000 de monede");
                   	  								    	 								    
                   	    textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea19.sendKeys("Obțineți 1000 de monede");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                   	  	  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField21.sendKeys("Получите 1000 монет");
                   	  								    	 								    
                   	    textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea21.sendKeys("Получите 1000 монет");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                   	  	  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField20.sendKeys("Získajte 1000 mincí");
                   	  								    	 								    
                   	    textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea20.sendKeys("Získajte 1000 mincí");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                   	  	  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField22.sendKeys("Consigue 1000 monedas");
                   	  								    	 								    
                   	    textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea22.sendKeys("Consigue 1000 monedas");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                   	  	  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField23.sendKeys("Få 1000 mynt");
                   	  								    	 								    
                   	    textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea23.sendKeys("Få 1000 mynt");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                   	  	  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	           inputField24.sendKeys("รับ 1000 เหรียญ");
                   	  								    	 								    
                   	          textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	             textArea24.sendKeys("รับ 1000 เหรียญ");
                   	  	
                   	  	           Thread.sleep(300);
                   	  	             WebDriverWait(driver,50); 
                   	  	             dropdownTrigger.click();
                   	  	         	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                   	  	  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	      inputField25.sendKeys("1000 Jeton Alın");
                   	  						    	 								    
                   	    textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	        textArea25.sendKeys("1000 Jeton Alın");
                   	  	
                   	  	
                   	    	Thread.sleep(350);
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	   	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
                   	  	  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	      inputField26.sendKeys("Nhận 1000 xu");
                   	  						    	 								    
                   	    textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	        textArea26.sendKeys("Nhận 1000 xu");

                   	    
                   	        driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click(); 
                   	     Thread.sleep(5000);
                     	wait = new WebDriverWait(driver, 150);
                   	  	  button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
                   	  	button.click();
                   	    
                 	    
                   	    
                   	    
                   	    
                   	   //165 Coin 
                   	 Thread.sleep(2000);
                 	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
                 		    By.xpath("(//span[text()='View in-app product'])[7]")
                 		));
                 		firstButton.click();  
                   	 manageTranslationsButton = wait.until(
                  	        ExpectedConditions.elementToBeClickable(
                  	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
                  	    manageTranslationsButton.click();
                  	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
                  	    Thread.sleep(3000);
                  	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
                  		
                  	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                  		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                  		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                  		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                  		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                  		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                  		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                  		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                  		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                  		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                  		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                  		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                  		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                  		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                  		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                  		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                  		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                  		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                  		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                  		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                  		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
                  		Thread.sleep(1000);
                  	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
                  		 Thread.sleep(1000);
                  	    wait1  = new WebDriverWait(driver,50);
                  	      dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
                  	  		    )); dropdownTrigger.click();

                  	  		    WebDriverWait(driver,50);   
                  	  		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                  	     inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  		    inputField.sendKeys("احصل على 165 قطعة نقدية");
                  	  		    
                  	     textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  		    	textArea.sendKeys("احصل على 165 قطعة نقدية");
                  	  		    	
                  	  		    	WebDriverWait(driver,50);  
                  	  	   	 dropdownTrigger.click();
                  	       	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                  	     inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  				    inputField1.sendKeys("获得 165 枚硬币");
                  	  				    
                  	     textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  				    	textArea1.sendKeys("获得 165 枚硬币");
                  	  		    
                  	  				    	WebDriverWait(driver,50); 
                  	  				    	dropdownTrigger.click();
                  	  		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                  	    inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  								    inputField11.sendKeys("獲得 165 枚硬幣");
                  	  								    
                  	    textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  								    	textArea11.sendKeys("獲得 165 枚硬幣");    
                  	  				
                  	  								    	WebDriverWait(driver,50); 
                  	  								    	dropdownTrigger.click();				    	   
                  	  		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                  	   		   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField111.sendKeys("Získejte 165 mincí");
                  	  								    	 								    
                  	     textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	   	textArea111.sendKeys("Získejte 165 mincí");    
                  	  		
                  	   	WebDriverWait(driver,50); 
                  	   	dropdownTrigger.click();
                  	  	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                  	  	   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField2.sendKeys("Få 165 mønter");
                  	  		
                  	    textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea2.sendKeys("Få 165 mønter");   								  
                  	  	
                  	  	Thread.sleep(350);
                  	   	WebDriverWait(driver,50); 
                  	   	dropdownTrigger.click();
                  	   	Thread.sleep(350);
                  	  	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                  	  	   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField3.sendKeys("Ontvang 165 munten");

                  	    textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea3.sendKeys("Ontvang 165 munten");								    	

                  	  	Thread.sleep(350);
                  	   	WebDriverWait(driver,50); 
                  	   	dropdownTrigger.click();
                  	   	Thread.sleep(350);
                  	  	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                  	  	  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField4.sendKeys("Hanki 165 kolikkoa");
                  	  								    	 								    
                  	    textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea4.sendKeys("Hanki 165 kolikkoa");								    	
                  	  	
                  	  	Thread.sleep(350);
                  	   	WebDriverWait(driver,50); 
                  	   	dropdownTrigger.click();
                  	   	Thread.sleep(350);
                  	  	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                  	  	  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField5.sendKeys("Obtenez 165 pièces");
                  	  								    	 								    
                  	    textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea5.sendKeys("Obtenez 165 pièces");				
                  	  	
                  	  	Thread.sleep(350);
                  	   	WebDriverWait(driver,50); 
                  	   	dropdownTrigger.click();
                  	   	Thread.sleep(350);
                  	  	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                  	  	  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField6.sendKeys("Erhalte 165 Münzen");
                  	  								    	 								    
                  	    textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea6.sendKeys("Erhalte 165 Münzen");
                  	  	
                  	  	Thread.sleep(350);
                  	   	WebDriverWait(driver,50); 
                  	   	dropdownTrigger.click();
                  	   	Thread.sleep(350);
                  	  	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                  	  	  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField7.sendKeys("Πάρτε 165 νομίσματα");
                  	  								    	 								    
                  	    textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea7.sendKeys("Πάρτε 165 νομίσματα");
                  	  	
                  	  	Thread.sleep(350);
                  	   	WebDriverWait(driver,50); 
                  	   	dropdownTrigger.click();
                  	   	Thread.sleep(350);
                  	  	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                  	  	  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField8.sendKeys("קבל 165 מטבעות");
                  	  								    	 								    
                  	    textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea8.sendKeys("קבל 165 מטבעות");
                  	  	
                  	  	Thread.sleep(350);
                  	   	WebDriverWait(driver,50); 
                  	   	dropdownTrigger.click();
                  	   	Thread.sleep(350);
                  	  	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                  	  	  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField9.sendKeys("165 सिक्के पाएं");
                  	  								    	 								    
                  	    textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea9.sendKeys("165 सिक्के पाएं");
                  	  	
                  	  	Thread.sleep(350);
                  	   	WebDriverWait(driver,50); 
                  	   	dropdownTrigger.click();
                  	   	Thread.sleep(350);
                  	  	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                  	  	  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField10.sendKeys("Szerezz 165 érmét");
                  	  								    	 								    
                  	    textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea10.sendKeys("Szerezz 165 érmét");
                  	  	
                  	  	Thread.sleep(350);
                  	   	WebDriverWait(driver,50); 
                  	   	dropdownTrigger.click();
                  	   	Thread.sleep(350);
                  	  	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                  	  	  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField12.sendKeys("Dapatkan 165 Koin");
                  	  								    	 								    
                  	    textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea12.sendKeys("Dapatkan 165 Koin");
                  	  	
                  	  	Thread.sleep(300);
                  	  	WebDriverWait(driver,50); 
                  	  	dropdownTrigger.click();
                  	  	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                  	  	  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField13.sendKeys("Ottieni 165 monete");
                  	  								    	 								    
                  	    textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea13.sendKeys("Ottieni 165 monete");

                  	  	Thread.sleep(300);
                  	  	WebDriverWait(driver,50); 
                  	  	dropdownTrigger.click();
                  	  	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                  	  		  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField14.sendKeys("165コインを獲得");
                  	  								    	 								    
                  	    textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea14.sendKeys("165コインを獲得");
                  	  	
                  	  	Thread.sleep(300);
                  	  	WebDriverWait(driver,50); 
                  	  	dropdownTrigger.click();
                  	  	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                  	  	  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField15.sendKeys("165개의 코인을 얻으세요");
                  	  								    	 								    
                  	    textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea15.sendKeys("165개의 코인을 얻으세요");
                  	  	
                  	  	Thread.sleep(50);
                  	  	WebDriverWait(driver,50); 
                  	  	dropdownTrigger.click();
                  	  	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                  	  	  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField16.sendKeys("Dapatkan 165 Syiling");
                  	  								    	 								    
                  	    textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea16.sendKeys("Dapatkan 165 Syiling");
                  	  	
                  	  	Thread.sleep(300);
                  	  	WebDriverWait(driver,50); 
                  	  	dropdownTrigger.click();
                  	  	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                  	  	  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField17.sendKeys("Zdobądź 165 monet");
                  	  								    	 								    
                  	    textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea17.sendKeys("Zdobądź 165 monet");
                  	  	
                  	  	Thread.sleep(300);
                  	  	WebDriverWait(driver,50); 
                  	  	dropdownTrigger.click();
                  	  	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                  	  	  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField18.sendKeys("Ganhe 165 moedas");
                  	  								    	 								    
                  	    textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea18.sendKeys("Ganhe 165 moedas");
                  	  	
                  	  	Thread.sleep(300);
                  	  	WebDriverWait(driver,50); 
                  	  	dropdownTrigger.click();
                  	  	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                  	  	  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField19.sendKeys("Obțineți 165 de monede");
                  	  								    	 								    
                  	    textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea19.sendKeys("Obțineți 165 de monede");
                  	  	
                  	  	Thread.sleep(300);
                  	  	WebDriverWait(driver,50); 
                  	  	dropdownTrigger.click();
                  	  	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                  	  	  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField21.sendKeys("Получите 165 монет");
                  	  								    	 								    
                  	    textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea21.sendKeys("Получите 165 монет");
                  	  	
                  	  	Thread.sleep(300);
                  	  	WebDriverWait(driver,50); 
                  	  	dropdownTrigger.click();
                  	  	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                  	  	  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField20.sendKeys("Získajte 165 mincí");
                  	  								    	 								    
                  	    textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea20.sendKeys("Získajte 165 mincí");
                  	  	
                  	  	Thread.sleep(300);
                  	  	WebDriverWait(driver,50); 
                  	  	dropdownTrigger.click();
                  	  	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                  	  	  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField22.sendKeys("Consigue 165 monedas");
                  	  								    	 								    
                  	    textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea22.sendKeys("Consigue 165 monedas");
                  	  	
                  	  	Thread.sleep(300);
                  	  	WebDriverWait(driver,50); 
                  	  	dropdownTrigger.click();
                  	  	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                  	  	  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	  inputField23.sendKeys("Få 165 mynt");
                  	  								    	 								    
                  	    textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	textArea23.sendKeys("Få 165 mynt");
                  	  	
                  	  	Thread.sleep(300);
                  	  	WebDriverWait(driver,50); 
                  	  	dropdownTrigger.click();
                  	  	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                  	  	  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	  	           inputField24.sendKeys("รับ 165 เหรียญ");
                  	  								    	 								    
                  	          textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	  	             textArea24.sendKeys("รับ 165 เหรียญ");
                  	  	
                  	  	           Thread.sleep(300);
                  	  	             WebDriverWait(driver,50); 
                  	  	             dropdownTrigger.click();
                  	  	         	Thread.sleep(300);
                  	  	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                  	  	  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	      inputField25.sendKeys("165 Jeton Alın");
                  	  						    	 								    
                  	    textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	        textArea25.sendKeys("165 Jeton Alın");
                  	  	
                  	  	
                  	    	Thread.sleep(350);
                  	   	WebDriverWait(driver,50); 
                  	   	dropdownTrigger.click();
                  	   	Thread.sleep(350);
                  	  	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
                  	  	  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	      inputField26.sendKeys("Nhận 165 xu");
                  	  						    	 								    
                  	    textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	        textArea26.sendKeys("Nhận 165 xu");
                  	      driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
                  	    Thread.sleep(5000);
                    	wait = new WebDriverWait(driver, 150);
                      	 button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
                      	button.click();	
                   	    
                  	    
                  	    
                  	    
                  	    
                  	    
                  	 //300 Coin   
                  	  Thread.sleep(2000);
                  	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
                  		    By.xpath("(//span[text()='View in-app product'])[8]")
                  		));
                  		firstButton.click(); 
                  	  manageTranslationsButton = wait.until(
                   	        ExpectedConditions.elementToBeClickable(
                   	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
                   	    manageTranslationsButton.click();
                   	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
                   	    Thread.sleep(3000);
                   	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
                   		
                   	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                   		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                   		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                   		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                   		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                   		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                   		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                   		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                   		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                   		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                   		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                   		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                   		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                   		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                   		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                   		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                   		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                   		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                   		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                   		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                   		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
                   		Thread.sleep(1000);
                   	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
                  		 Thread.sleep(1000);
                   	     wait1  = new WebDriverWait(driver,50);
                   	      dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
                   	  		    )); dropdownTrigger.click();

                   	  		    WebDriverWait(driver,15);   
                   	  		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                   	     inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  		    inputField.sendKeys("احصل على 300 قطعة نقدية");
                   	  		    
                   	     textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  		    	textArea.sendKeys("احصل على 300 قطعة نقدية");
                   	  		    	
                   	  		    	WebDriverWait(driver,50);  
                   	  	   	 dropdownTrigger.click();
                   	       	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                   	     inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  				    inputField1.sendKeys("获得 300 枚硬币");
                   	  				    
                   	     textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  				    	textArea1.sendKeys("获得 300 枚硬币");
                   	  		    
                   	  				    	WebDriverWait(driver,50); 
                   	  				    	dropdownTrigger.click();
                   	  		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                   	    inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  								    inputField11.sendKeys("獲得 300 枚硬幣");
                   	  								    
                   	    textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  								    	textArea11.sendKeys("獲得 300 枚硬幣");    
                   	  				
                   	  								    	WebDriverWait(driver,50); 
                   	  								    	dropdownTrigger.click();				    	   
                   	  		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                   	   		   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField111.sendKeys("Získejte 300 mincí");
                   	  								    	 								    
                   	     textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	   	textArea111.sendKeys("Získejte 300 mincí");    
                   	  		
                   	   	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                   	  	   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField2.sendKeys("Få 300 mønter");
                   	  		
                   	    textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea2.sendKeys("Få 300 mønter");   								  
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                   	  	   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField3.sendKeys("Ontvang 300 munten");

                   	    textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea3.sendKeys("Ontvang 300 munten");								    	

                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                   	  	  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField4.sendKeys("Hanki 300 kolikkoa");
                   	  								    	 								    
                   	    textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea4.sendKeys("Hanki 300 kolikkoa");								    	
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                   	  	  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField5.sendKeys("Obtenez 300 pièces");
                   	  								    	 								    
                   	    textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea5.sendKeys("Obtenez 300 pièces");				
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                   	  	  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField6.sendKeys("Erhalte 300 Münzen");
                   	  								    	 								    
                   	    textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea6.sendKeys("Erhalte 300 Münzen");
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                   	  	  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField7.sendKeys("Πάρτε 300 νομίσματα");
                   	  								    	 								    
                   	    textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea7.sendKeys("Πάρτε 300 νομίσματα");
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                   	  	  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField8.sendKeys("קבל 300 מטבעות");
                   	  								    	 								    
                   	    textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea8.sendKeys("קבל 300 מטבעות");
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                   	  	  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField9.sendKeys("300 सिक्के पाएं");
                   	  								    	 								    
                   	    textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea9.sendKeys("300 सिक्के पाएं");
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                   	  	  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField10.sendKeys("Szerezz 300 érmét");
                   	  								    	 								    
                   	    textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea10.sendKeys("Szerezz 300 érmét");
                   		Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                   	  	  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField12.sendKeys("Dapatkan 300 Koin");
                   	  								    	 								    
                   	    textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea12.sendKeys("Dapatkan 300 Koin");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                   	  	  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField13.sendKeys("Ottieni 300 monete");
                   	  								    	 								    
                   	    textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea13.sendKeys("Ottieni 300 monete");

                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                   	  		  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField14.sendKeys("300コインを獲得");
                   	  								    	 								    
                   	    textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea14.sendKeys("300コインを獲得");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                   	  	  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField15.sendKeys("300개의 코인을 얻으세요");
                   	  								    	 								    
                   	    textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea15.sendKeys("300개의 코인을 얻으세요");
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                   	  	  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField16.sendKeys("Dapatkan 300 Syiling");
                   	  								    	 								    
                   	    textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea16.sendKeys("Dapatkan 300 Syiling");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                   	  	  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField17.sendKeys("Zdobądź 300 monet");
                   	  								    	 								    
                   	    textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea17.sendKeys("Zdobądź 300 monet");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                   	  	  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField18.sendKeys("Ganhe 300 moedas");
                   	  								    	 								    
                   	    textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea18.sendKeys("Ganhe 300 moedas");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                   	  	  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField19.sendKeys("Obțineți 300 de monede");
                   	  								    	 								    
                   	    textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea19.sendKeys("Obțineți 300 de monede");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                   	  	  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField21.sendKeys("Получите 300 монет");
                   	  								    	 								    
                   	    textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea21.sendKeys("Получите 300 монет");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                   	  	  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField20.sendKeys("Získajte 300 mincí");
                   	  								    	 								    
                   	    textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea20.sendKeys("Získajte 300 mincí");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                   	  	  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField22.sendKeys("Consigue 300 monedas");
                   	  								    	 								    
                   	    textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea22.sendKeys("Consigue 300 monedas");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                   	  	  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField23.sendKeys("Få 300 mynt");
                   	  								    	 								    
                   	    textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea23.sendKeys("Få 300 mynt");
                   	  	
                   	  	Thread.sleep(300);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                   	  	  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	           inputField24.sendKeys("รับ 300 เหรียญ");
                   	  								    	 								    
                   	          textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	             textArea24.sendKeys("รับ 300 เหรียญ");
                   	  	
                   	  	           Thread.sleep(300);
                   	  	             WebDriverWait(driver,50); 
                   	  	             dropdownTrigger.click();
                   	  	         	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                   	  	  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	      inputField25.sendKeys("300 Jeton Alın");
                   	  						    	 								    
                   	    textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	        textArea25.sendKeys("300 Jeton Alın");
                   	  	
                   	  	
                   	        WebDriverWait(driver,50); 
                   	        dropdownTrigger.click();
                   	      	Thread.sleep(300);
                   	  	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
                   	  	  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	      inputField26.sendKeys("Nhận 300 xu");
                   	  						    	 								    
                   	   textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	        textArea26.sendKeys("Nhận 300 xu");

                   	     driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
                   	  Thread.sleep(5000);
                  	wait = new WebDriverWait(driver, 150);
                    		  button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
                    		button.click(); 
                   	    
                   	    
                   	    
                   	    
                   	    
                   	    
                   	    
                   	    
                   	//50 Coin    
                   	 Thread.sleep(2000);
                 	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
                 		    By.xpath("(//span[text()='View in-app product'])[9]")
                 		));
                 		firstButton.click();  
                   	 manageTranslationsButton = wait.until(
                  	        ExpectedConditions.elementToBeClickable(
                  	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
                  	    manageTranslationsButton.click();
                  	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
                  	    Thread.sleep(3000);
                  	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
                  		
                  	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                  		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                  		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                  		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                  		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                  		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                  		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                  		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                  		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                  		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                  		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                  		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                  		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                  		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                  		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                  		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                  		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                  		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                  		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                  		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                  		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
                  		Thread.sleep(1000);
                  	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
                  		 Thread.sleep(1000);
                  	   wait1  = new WebDriverWait(driver,50);
                  	    dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
                  			    )); dropdownTrigger.click();

                  			    WebDriverWait(driver,15);   
                  			    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                  	   inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  			    inputField.sendKeys("احصل على 50 قطعة نقدية");
                  			    
                  	   textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  			    	textArea.sendKeys("احصل على 50 قطعة نقدية");
                  			    	
                  			    	WebDriverWait(driver,50);  
                  		   	 dropdownTrigger.click();
                  	     	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                  	   inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  					    inputField1.sendKeys("获得 50 枚硬币");
                  					    
                  	   textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  					    	textArea1.sendKeys("获得 50 枚硬币");
                  			    
                  					    	WebDriverWait(driver,50); 
                  					    	dropdownTrigger.click();
                  			 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                  	  inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  									    inputField11.sendKeys("獲得 50 枚硬幣");
                  									    
                  	  textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  									    	textArea11.sendKeys("獲得 50 枚硬幣");    
                  					
                  									    	WebDriverWait(driver,50); 
                  									    	dropdownTrigger.click();				    	   
                  			     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                  	 		   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField111.sendKeys("Získejte 50 mincí");
                  									    	 								    
                  	   textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	 	textArea111.sendKeys("Získejte 50 mincí");    
                  			
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  		 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                  		   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField2.sendKeys("Få 50 mønter");
                  			
                  	  textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea2.sendKeys("Få 50 mønter");   								  
                  		
                  		Thread.sleep(350);
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  	 	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                  		   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField3.sendKeys("Ontvang 50 munten");

                  	  textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea3.sendKeys("Ontvang 50 munten");								    	

                  		Thread.sleep(350);
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  	 	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                  		  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField4.sendKeys("Hanki 50 kolikkoa");
                  									    	 								    
                  	  textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea4.sendKeys("Hanki 50 kolikkoa");								    	
                  		
                  		Thread.sleep(350);
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  	 	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                  		  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField5.sendKeys("Obtenez 50 pièces");
                  									    	 								    
                  	  textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea5.sendKeys("Obtenez 50 pièces");				
                  		
                  		Thread.sleep(350);
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  	 	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                  		  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField6.sendKeys("Erhalte 50 Münzen");
                  									    	 								    
                  	  textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea6.sendKeys("Erhalte 50 Münzen");
                  		
                  		Thread.sleep(350);
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  	 	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                  		  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField7.sendKeys("Πάρτε 50 νομίσματα");
                  									    	 								    
                  	  textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea7.sendKeys("Πάρτε 50 νομίσματα");
                  		
                  		Thread.sleep(350);
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  	 	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                  		  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField8.sendKeys("קבל 50 מטבעות");
                  									    	 								    
                  	  textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea8.sendKeys("קבל 50 מטבעות");
                  		
                  		Thread.sleep(350);
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  	 	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                  		  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField9.sendKeys("50 सिक्के पाएं");
                  									    	 								    
                  	  textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea9.sendKeys("50 सिक्के पाएं");
                  		
                  		Thread.sleep(350);
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  	 	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                  		  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField10.sendKeys("Szerezz 50 érmét");
                  									    	 								    
                  	  textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea10.sendKeys("Szerezz 50 érmét");
                  		
                  		Thread.sleep(350);
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  	 	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                  		  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField12.sendKeys("Dapatkan 50 Koin");
                  									    	 								    
                  	  textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea12.sendKeys("Dapatkan 50 Koin");
                  		
                  		Thread.sleep(300);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                  		  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField13.sendKeys("Ottieni 50 monete");
                  									    	 								    
                  	  textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea13.sendKeys("Ottieni 50 monete");

                  		Thread.sleep(300);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                  			  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField14.sendKeys("50コインを獲得");
                  									    	 								    
                  	  textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea14.sendKeys("50コインを獲得");
                  		
                  		Thread.sleep(300);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                  		  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField15.sendKeys("50개의 코인을 얻으세요");
                  									    	 								    
                  	  textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea15.sendKeys("50개의 코인을 얻으세요");
                  		
                  		Thread.sleep(50);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                  		  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField16.sendKeys("Dapatkan 50 Syiling");
                  									    	 								    
                  	  textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea16.sendKeys("Dapatkan 50 Syiling");
                  		
                  		Thread.sleep(300);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                  		  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField17.sendKeys("Zdobądź 50 monet");
                  									    	 								    
                  	  textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea17.sendKeys("Zdobądź 50 monet");
                  		
                  		Thread.sleep(300);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                  		  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField18.sendKeys("Ganhe 50 moedas");
                  									    	 								    
                  	  textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea18.sendKeys("Ganhe 50 moedas");
                  		
                  		Thread.sleep(300);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                  		  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField19.sendKeys("Obțineți 50 de monede");
                  									    	 								    
                  	  textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea19.sendKeys("Obțineți 50 de monede");
                  		
                  		Thread.sleep(300);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                  		  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField21.sendKeys("Получите 50 монет");
                  									    	 								    
                  	  textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea21.sendKeys("Получите 50 монет");
                  		
                  		Thread.sleep(300);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                  		  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField20.sendKeys("Získajte 50 mincí");
                  									    	 								    
                  	  textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea20.sendKeys("Získajte 50 mincí");
                  		
                  		Thread.sleep(300);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                  		  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField22.sendKeys("Consigue 50 monedas");
                  									    	 								    
                  	  textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea22.sendKeys("Consigue 50 monedas");
                  		
                  		Thread.sleep(300);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                  		  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField23.sendKeys("Få 50 mynt");
                  									    	 								    
                  	  textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea23.sendKeys("Få 50 mynt");
                  		
                  		Thread.sleep(300);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                  		  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		           inputField24.sendKeys("รับ 50 เหรียญ");
                  									    	 								    
                  	        textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		             textArea24.sendKeys("รับ 50 เหรียญ");
                  		
                  		           Thread.sleep(300);
                  		             WebDriverWait(driver,50); 
                  		             dropdownTrigger.click();
                  		         	Thread.sleep(300);
                  		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                  		  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	    inputField25.sendKeys("50 Jeton Alın");
                  							    	 								    
                  	  textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	      textArea25.sendKeys("50 Jeton Alın");
                  		
                  		
                  	  	Thread.sleep(350);
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  	 	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
                  		  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	    inputField26.sendKeys("Nhận 50 xu");
                  							    	 								    
                  	 textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	      textArea26.sendKeys("Nhận 50 xu");
                  	    driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
                  	  Thread.sleep(5000);
                  	wait = new WebDriverWait(driver, 150);
                   		  button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
                   		button.click(); 
                  	    
                  	    
                  	    
                  	    
                 
                  	    //300 Coin
                  	  Thread.sleep(2000);
                  	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
                  		    By.xpath("(//span[text()='View in-app product'])[10]")
                  		));
                  		firstButton.click();
                  	  manageTranslationsButton = wait.until(
                   	        ExpectedConditions.elementToBeClickable(
                   	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
                   	    manageTranslationsButton.click();
                   	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
                   	    Thread.sleep(3000);
                   	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
                   		
                   	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                   		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                   		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                   		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                   		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                   		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                   		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                   		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                   		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                   		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                   		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                   		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                   		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                   		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                   		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                   		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                   		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                   		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                   		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                   		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                   		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
                   		Thread.sleep(1000);
                   	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
                  		 Thread.sleep(1000);
                   	 wait1  = new WebDriverWait(driver,50);
              	      dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
              	  		    )); dropdownTrigger.click();

              	  		    WebDriverWait(driver,15);   
              	  		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
              	     inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  		    inputField.sendKeys("احصل على 300 قطعة نقدية");
              	  		    
              	     textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  		    	textArea.sendKeys("احصل على 300 قطعة نقدية");
              	  		    	
              	  		    	WebDriverWait(driver,50);  
              	  	   	 dropdownTrigger.click();
              	       	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
              	     inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  				    inputField1.sendKeys("获得 300 枚硬币");
              	  				    
              	     textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  				    	textArea1.sendKeys("获得 300 枚硬币");
              	  		    
              	  				    	WebDriverWait(driver,50); 
              	  				    	dropdownTrigger.click();
              	  		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
              	    inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  								    inputField11.sendKeys("獲得 300 枚硬幣");
              	  								    
              	    textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  								    	textArea11.sendKeys("獲得 300 枚硬幣");    
              	  				
              	  								    	WebDriverWait(driver,50); 
              	  								    	dropdownTrigger.click();				    	   
              	  		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
              	   		   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField111.sendKeys("Získejte 300 mincí");
              	  								    	 								    
              	     textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	   	textArea111.sendKeys("Získejte 300 mincí");    
              	  		
              	   	Thread.sleep(50);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
              	  	   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField2.sendKeys("Få 300 mønter");
              	  		
              	    textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea2.sendKeys("Få 300 mønter");   								  
              	  	
              	  	Thread.sleep(50);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
              	  	   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField3.sendKeys("Ontvang 300 munten");

              	    textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea3.sendKeys("Ontvang 300 munten");								    	

              	  	Thread.sleep(50);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
              	  	  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField4.sendKeys("Hanki 300 kolikkoa");
              	  								    	 								    
              	    textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea4.sendKeys("Hanki 300 kolikkoa");								    	
              	  	
              	  	Thread.sleep(50);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
              	  	  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField5.sendKeys("Obtenez 300 pièces");
              	  								    	 								    
              	    textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea5.sendKeys("Obtenez 300 pièces");				
              	  	
              	  	Thread.sleep(50);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
              	  	  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField6.sendKeys("Erhalte 300 Münzen");
              	  								    	 								    
              	    textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea6.sendKeys("Erhalte 300 Münzen");
              	  	
              	  	Thread.sleep(50);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
              	  	  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField7.sendKeys("Πάρτε 300 νομίσματα");
              	  								    	 								    
              	    textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea7.sendKeys("Πάρτε 300 νομίσματα");
              	  	
              	  	Thread.sleep(50);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
              	  	  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField8.sendKeys("קבל 300 מטבעות");
              	  								    	 								    
              	    textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea8.sendKeys("קבל 300 מטבעות");
              	  	
              	  	Thread.sleep(50);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
              	  	  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField9.sendKeys("300 सिक्के पाएं");
              	  								    	 								    
              	    textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea9.sendKeys("300 सिक्के पाएं");
              	  	
              	  	Thread.sleep(50);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
              	  	  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField10.sendKeys("Szerezz 300 érmét");
              	  								    	 								    
              	    textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea10.sendKeys("Szerezz 300 érmét");
              		Thread.sleep(50);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
              	  	  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField12.sendKeys("Dapatkan 300 Koin");
              	  								    	 								    
              	    textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea12.sendKeys("Dapatkan 300 Koin");
              	  	
              	  	Thread.sleep(300);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
              	  	  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField13.sendKeys("Ottieni 300 monete");
              	  								    	 								    
              	    textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea13.sendKeys("Ottieni 300 monete");

              	  	Thread.sleep(300);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
              	  		  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField14.sendKeys("300コインを獲得");
              	  								    	 								    
              	    textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea14.sendKeys("300コインを獲得");
              	  	
              	  	Thread.sleep(300);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
              	  	  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField15.sendKeys("300개의 코인을 얻으세요");
              	  								    	 								    
              	    textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea15.sendKeys("300개의 코인을 얻으세요");
              	  	
              	  	Thread.sleep(50);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
              	  	  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField16.sendKeys("Dapatkan 300 Syiling");
              	  								    	 								    
              	    textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea16.sendKeys("Dapatkan 300 Syiling");
              	  	
              	  	Thread.sleep(300);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
              	  	  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField17.sendKeys("Zdobądź 300 monet");
              	  								    	 								    
              	    textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea17.sendKeys("Zdobądź 300 monet");
              	  	
              	  	Thread.sleep(300);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
              	  	  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField18.sendKeys("Ganhe 300 moedas");
              	  								    	 								    
              	    textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea18.sendKeys("Ganhe 300 moedas");
              	  	
              	  	Thread.sleep(300);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
              	  	  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField19.sendKeys("Obțineți 300 de monede");
              	  								    	 								    
              	    textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea19.sendKeys("Obțineți 300 de monede");
              	  	
              	  	Thread.sleep(300);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
              	  	  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField21.sendKeys("Получите 300 монет");
              	  								    	 								    
              	    textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea21.sendKeys("Получите 300 монет");
              	  	
              	  	Thread.sleep(300);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
              	  	  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField20.sendKeys("Získajte 300 mincí");
              	  								    	 								    
              	    textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea20.sendKeys("Získajte 300 mincí");
              	  	
              	  	Thread.sleep(300);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
              	  	  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField22.sendKeys("Consigue 300 monedas");
              	  								    	 								    
              	    textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea22.sendKeys("Consigue 300 monedas");
              	  	
              	  	Thread.sleep(300);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
              	  	  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	  inputField23.sendKeys("Få 300 mynt");
              	  								    	 								    
              	    textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	textArea23.sendKeys("Få 300 mynt");
              	  	
              	  	Thread.sleep(300);
              	  	WebDriverWait(driver,50); 
              	  	dropdownTrigger.click();
              	  	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
              	  	  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	  	           inputField24.sendKeys("รับ 300 เหรียญ");
              	  								    	 								    
              	          textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	  	             textArea24.sendKeys("รับ 300 เหรียญ");
              	  	
              	  	           Thread.sleep(300);
              	  	             WebDriverWait(driver,50); 
              	  	             dropdownTrigger.click();
              	  	         	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
              	  	  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	      inputField25.sendKeys("300 Jeton Alın");
              	  						    	 								    
              	    textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	        textArea25.sendKeys("300 Jeton Alın");
              	  	
              	  	
              	        WebDriverWait(driver,50); 
              	        dropdownTrigger.click();
              	      	Thread.sleep(300);
              	  	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
              	  	  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
              	      inputField26.sendKeys("Nhận 300 xu");
              	  						    	 								    
              	   textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
              	        textArea26.sendKeys("Nhận 300 xu");

              	      driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
              	    Thread.sleep(5000);
                	wait = new WebDriverWait(driver, 150);
                 		  button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
                 		button.click(); 
                   	    
                   	    
                   	    
                   	    
                        	    //700 Coin
                   	 Thread.sleep(2000);
                 	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
                 		    By.xpath("(//span[text()='View in-app product'])[11]")
                 		));
                 		firstButton.click(); 
                   	 manageTranslationsButton = wait.until(
                  	        ExpectedConditions.elementToBeClickable(
                  	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
                  	    manageTranslationsButton.click();
                  	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
                  	    Thread.sleep(3000);
                  	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
                  		
                  	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                  		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                  		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                  		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                  		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                  		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                  		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                  		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                  		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                  		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                  		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                  		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                  		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                  		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                  		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                  		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                  		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                  		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                  		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                  		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                  		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
                  		Thread.sleep(1000);
                  	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
                  		 Thread.sleep(1000);
                  	   wait1  = new WebDriverWait(driver,50);
                          dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
                    		    )); dropdownTrigger.click();

                    		    WebDriverWait(driver,50);   
                    		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                       inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    		    inputField.sendKeys("احصل على 700 قطعة نقدية");
                    		    
                       textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    		    	textArea.sendKeys("احصل على 700 قطعة نقدية");
                    		    	
                    		    	WebDriverWait(driver,50);  
                    	   	 dropdownTrigger.click();
                         	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                       inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    				    inputField1.sendKeys("获得 700 枚硬币");
                    				    
                       textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    				    	textArea1.sendKeys("获得 700 枚硬币");
                    		    
                    				    	WebDriverWait(driver,50); 
                    				    	dropdownTrigger.click();
                    		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                      inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    								    inputField11.sendKeys("獲得 700 枚硬幣");
                    								    
                      textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    								    	textArea11.sendKeys("獲得 700 枚硬幣");    
                    				
                    								    	WebDriverWait(driver,50); 
                    								    	dropdownTrigger.click();				    	   
                    		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                     		   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField111.sendKeys("Získejte 700 mincí");
                    								    	 								    
                       textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                     	textArea111.sendKeys("Získejte 700 mincí");    
                    		
                     	WebDriverWait(driver,50); 
                     	dropdownTrigger.click();
                    	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                    	   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField2.sendKeys("Få 700 mønter");
                    		
                      textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea2.sendKeys("Få 700 mønter");   								  
                    	
                    	Thread.sleep(300);
                        WebDriverWait(driver,50); 
                        dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                    	   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField3.sendKeys("Ontvang 700 munten");

                      textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea3.sendKeys("Ontvang 700 munten");								    	

                    	Thread.sleep(300);
                        WebDriverWait(driver,50); 
                        dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                    	  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField4.sendKeys("Hanki 700 kolikkoa");
                    								    	 								    
                      textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea4.sendKeys("Hanki 700 kolikkoa");								    	
                    	
                    	Thread.sleep(300);
                        WebDriverWait(driver,50); 
                        dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                    	  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField5.sendKeys("Obtenez 700 pièces");
                    								    	 								    
                      textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea5.sendKeys("Obtenez 700 pièces");				
                    	
                    	Thread.sleep(300);
                        WebDriverWait(driver,50); 
                        dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                    	  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField6.sendKeys("Erhalte 700 Münzen");
                    								    	 								    
                      textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea6.sendKeys("Erhalte 700 Münzen");
                    	
                    	Thread.sleep(300);
                        WebDriverWait(driver,50); 
                        dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                    	  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField7.sendKeys("Πάρτε 700 νομίσματα");
                    								    	 								    
                      textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea7.sendKeys("Πάρτε 700 νομίσματα");
                    	
                    	Thread.sleep(300);
                        WebDriverWait(driver,50); 
                        dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                    	  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField8.sendKeys("קבל 700 מטבעות");
                    								    	 								    
                      textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea8.sendKeys("קבל 700 מטבעות");
                    	
                    	Thread.sleep(2000);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(50);
                    	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                    	  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField9.sendKeys("700 सिक्के पाएं");
                    								    	 								    
                      textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea9.sendKeys("700 सिक्के पाएं");
                    	
                    	Thread.sleep(50);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                    	  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField10.sendKeys("Szerezz 700 érmét");
                    								    	 								    
                      textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea10.sendKeys("Szerezz 700 érmét");
                    	
                    	Thread.sleep(300);
                        WebDriverWait(driver,50); 
                        dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                    	  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField12.sendKeys("Dapatkan 700 Koin");
                    								    	 								    
                      textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea12.sendKeys("Dapatkan 700 Koin");
                    	
                    	Thread.sleep(300);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                    	  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField13.sendKeys("Ottieni 700 monete");
                    								    	 								    
                      textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea13.sendKeys("Ottieni 700 monete");

                    	Thread.sleep(300);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                    		  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField14.sendKeys("700コインを獲得");
                    								    	 								    
                      textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea14.sendKeys("700コインを獲得");
                    	
                    	Thread.sleep(300);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                    	  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField15.sendKeys("700개의 코인을 얻으세요");
                    								    	 								    
                      textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea15.sendKeys("700개의 코인을 얻으세요");
                    	
                    	Thread.sleep(50);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                    	  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField16.sendKeys("Dapatkan 700 Syiling");
                    								    	 								    
                      textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea16.sendKeys("Dapatkan 700 Syiling");
                    	
                    	Thread.sleep(300);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                    	  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField17.sendKeys("Zdobądź 700 monet");
                    								    	 								    
                      textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea17.sendKeys("Zdobądź 700 monet");
                    	
                    	Thread.sleep(300);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                    	  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField18.sendKeys("Ganhe 700 moedas");
                    								    	 								    
                      textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea18.sendKeys("Ganhe 700 moedas");
                    	
                    	Thread.sleep(300);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                    	  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField19.sendKeys("Obțineți 700 de monede");
                    								    	 								    
                      textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea19.sendKeys("Obțineți 700 de monede");
                    	
                    	Thread.sleep(300);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                    	  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField21.sendKeys("Получите 700 монет");
                    								    	 								    
                      textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea21.sendKeys("Получите 700 монет");
                    	
                    	Thread.sleep(300);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                    	  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField20.sendKeys("Získajte 700 mincí");
                    								    	 								    
                      textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea20.sendKeys("Získajte 700 mincí");
                    	
                    	Thread.sleep(300);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                    	  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField22.sendKeys("Consigue 700 monedas");
                    								    	 								    
                      textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea22.sendKeys("Consigue 700 monedas");
                    	
                    	Thread.sleep(300);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                    	  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	  inputField23.sendKeys("Få 700 mynt");
                    								    	 								    
                      textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	textArea23.sendKeys("Få 700 mynt");
                    	
                    	Thread.sleep(300);
                    	WebDriverWait(driver,50); 
                    	dropdownTrigger.click();
                    	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                    	  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                    	           inputField24.sendKeys("รับ 700 เหรียญ");
                    								    	 								    
                            textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                    	             textArea24.sendKeys("รับ 700 เหรียญ");
                    	
                    	           Thread.sleep(300);
                    	             WebDriverWait(driver,50); 
                    	             dropdownTrigger.click();
                    	         	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                    	  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        inputField25.sendKeys("700 Jeton Alın");
                    						    	 								    
                      textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                          textArea25.sendKeys("700 Jeton Alın");
                    	
                    	
                          Thread.sleep(300);
                            WebDriverWait(driver,50); 
                            dropdownTrigger.click();
                        	Thread.sleep(300);
                    	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
                    	  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                        inputField26.sendKeys("Nhận 700 xu");
                    						    	 								    
                     textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                          textArea26.sendKeys("Nhận 700 xu");

                          driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
                          Thread.sleep(5000);
                      	wait = new WebDriverWait(driver, 150);
                     		  button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
                     		button.click(); 
                  	    
                  	    
                  	    
                  	    
                    	    
                  	    
                 	    
                  	    
                  	    
                  	    //30 Min
                  	  Thread.sleep(2000);
                  	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
                  		    By.xpath("(//span[text()='View in-app product'])[12]")
                  		));
                  		firstButton.click();
                  	  manageTranslationsButton = wait.until(
                   	        ExpectedConditions.elementToBeClickable(
                   	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
                   	    manageTranslationsButton.click();
                   	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
                   	    Thread.sleep(3000);
                   	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
                   		
                   	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                   		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                   		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                   		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                   		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                   		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                   		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                   		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                   		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                   		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                   		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                   		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                   		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                   		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                   		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                   		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                   		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                   		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                   		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                   		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                   		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
                   		Thread.sleep(1000);
                   	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
                  		 Thread.sleep(1000);
                   	     wait1  = new WebDriverWait(driver,50);
                   	      dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
                   	  		    )); dropdownTrigger.click();

                   	  		    WebDriverWait(driver,15);   
                   	  		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                   	     inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  		    inputField.sendKeys("احصل على 30 دقيقة غير محدودة");
                   	  		    
                   	     textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  		    	textArea.sendKeys("احصل على 30 دقيقة غير محدودة");
                   	  		    	
                   	  		    	WebDriverWait(driver,50);  
                   	  	   	 dropdownTrigger.click();
                   	       	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                   	     inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  				    inputField1.sendKeys("无限畅享 30 分钟");
                   	  				    
                   	     textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  				    	textArea1.sendKeys("无限畅享 30 分钟");
                   	  		    
                   	  				    	WebDriverWait(driver,50); 
                   	  				    	dropdownTrigger.click();
                   	  		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                   	    inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  								    inputField11.sendKeys("無限享 30 分鐘");
                   	  								    
                   	    textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  								    	textArea11.sendKeys("無限享 30 分鐘");    
                   	  				
                   	  								    	WebDriverWait(driver,50); 
                   	  								    	dropdownTrigger.click();				    	   
                   	  		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                   	   		   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField111.sendKeys("Získejte neomezené množství na 30 minut");
                   	  								    	 								    
                   	     textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	   	textArea111.sendKeys("Získejte neomezené množství na 30 minut");    
                   	  		
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	  	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                   	  	   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField2.sendKeys("Få ubegrænset i 30 minutter");
                   	  		
                   	    textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea2.sendKeys("Få ubegrænset i 30 minutter");   								  
                   	  	
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                   	  	   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField3.sendKeys("Krijg 30 minuten onbeperkt");

                   	    textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea3.sendKeys("Krijg 30 minuten onbeperkt");								    	

                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                   	  	  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField4.sendKeys("Saat rajattomasti 30 minuuttia");
                   	  								    	 								    
                   	    textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea4.sendKeys("Saat rajattomasti 30 minuuttia");								    	
                   	  	
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                   	  	  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField5.sendKeys("Obtenez un forfait illimité pendant 30 minutes");
                   	  								    	 								    
                   	    textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea5.sendKeys("Obtenez un forfait illimité pendant 30 minutes");				
                   	  	
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                   	  	  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField6.sendKeys("Erhalten Sie 30 Minuten unbegrenzten");
                   	  								    	 								    
                   	    textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea6.sendKeys("Erhalten Sie 30 Minuten unbegrenzten");
                   	  	
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                   	  	  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField7.sendKeys("Αποκτήστε απεριόριστο χρόνο για 30 λεπτά");
                   	  								    	 								    
                   	    textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea7.sendKeys("Αποκτήστε απεριόριστο χρόνο για 30 λεπτά");
                   	  	
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                   	  	  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField8.sendKeys("קבל ללא הגבלה למשך 30 דקות");
                   	  								    	 								    
                   	    textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea8.sendKeys("קבל ללא הגבלה למשך 30 דקות");
                   	  	
                   	  	Thread.sleep(2000);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(50);
                   	  	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                   	  	  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField9.sendKeys("30 मिनट के लिए असीमित पाएं");
                   	  								    	 								    
                   	    textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea9.sendKeys("30 मिनट के लिए असीमित पाएं");
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                   	  	  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField10.sendKeys("Korlátlanul 30 percig");
                   	  								    	 								    
                   	    textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea10.sendKeys("Korlátlanul 30 percig");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   		Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                   	  	  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField12.sendKeys("Dapatkan unlimited selama 30 menit");
                   	  								    	 								    
                   	    textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea12.sendKeys("Dapatkan unlimited selama 30 menit");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                   	  	  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField13.sendKeys("Ottieni 30 minuti illimitati");
                   	  								    	 								    
                   	    textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea13.sendKeys("Ottieni 30 minuti illimitati");

                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                   	  		  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField14.sendKeys("30分間無制限");
                   	  								    	 								    
                   	    textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea14.sendKeys("30分間無制限");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                   	  	  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField15.sendKeys("30분 동안 무제한으로 이용하세요");
                   	  								    	 								    
                   	    textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea15.sendKeys("30분 동안 무제한으로 이용하세요");
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                   	  	  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField16.sendKeys("Dapatkan tanpa had selama 30 minit");
                   	  								    	 								    
                   	    textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea16.sendKeys("Dapatkan tanpa had selama 30 minit");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                   	  	  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField17.sendKeys("Uzyskaj nieograniczony dostęp przez 30 minut");
                   	  								    	 								    
                   	    textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea17.sendKeys("Uzyskaj nieograniczony dostęp przez 30 minut");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                   	  	  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField18.sendKeys("Obtenha acesso ilimitado por 30 minutos");
                   	  								    	 								    
                   	    textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea18.sendKeys("Obtenha acesso ilimitado por 30 minutos");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                   	  	  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField19.sendKeys("Obțineți nelimitat timp de 30 de minute");
                   	  								    	 								    
                   	    textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea19.sendKeys("Obțineți nelimitat timp de 30 de minute");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                   	  	  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField21.sendKeys("Получите безлимит на 30 минут");
                   	  								    	 								    
                   	    textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea21.sendKeys("Получите безлимит на 30 минут");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                   	  	  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField20.sendKeys("Získajte neobmedzené množstvo na 30 minút");
                   	  								    	 								    
                   	    textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea20.sendKeys("Získajte neobmedzené množstvo na 30 minút");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                   	  	  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField22.sendKeys("Obtén ilimitado por 30 minutos");
                   	  								    	 								    
                   	    textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea22.sendKeys("Obtén ilimitado por 30 minutos");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                   	  	  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField23.sendKeys("Få obegränsat i 30 minuter");
                   	  								    	 								    
                   	    textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea23.sendKeys("Få obegränsat i 30 minuter");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                   	  	  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	           inputField24.sendKeys("รับไม่จำกัด 30 นาที");
                   	  								    	 								    
                   	          textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	             textArea24.sendKeys("รับไม่จำกัด 30 นาที");
                   	  	
                   	  	           Thread.sleep(350);
                   	  	             WebDriverWait(driver,50); 
                   	  	             dropdownTrigger.click();
                   	  	         	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                   	  	  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	      inputField25.sendKeys("30 dakika boyunca sınırsız erişim elde edin");
                   	  						    	 								    
                   	    textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	        textArea25.sendKeys("30 dakika boyunca sınırsız erişim elde edin");
                   	  	
                   	  	
                   	        WebDriverWait(driver,50); 
                   	        dropdownTrigger.click();
                   	      	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
                   	  	  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	      inputField26.sendKeys("Nhận không giới hạn trong 30 phút");
                   	  						    	 								    
                   	   textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	        textArea26.sendKeys("Nhận không giới hạn trong 30 phút");

                   	     driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
                   	  Thread.sleep(5000);
                  	wait = new WebDriverWait(driver, 150);
                    		  button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
                    		button.click(); 
                   	    
                   	    
                   	    
         
                   	    
                   	    
                   	    
                   	//1 Hour    
                   	 Thread.sleep(2000);
                 	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
                 		    By.xpath("(//span[text()='View in-app product'])[13]")
                 		));
                 		firstButton.click();   
                   	 manageTranslationsButton = wait.until(
                  	        ExpectedConditions.elementToBeClickable(
                  	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
                  	    manageTranslationsButton.click();
                  	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
                  	    Thread.sleep(3000);
                  	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
                  		
                  	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                  		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                  		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                  		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                  		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                  		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                  		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                  		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                  		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                  		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                  		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                  		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                  		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                  		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                  		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                  		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                  		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                  		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                  		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                  		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                  		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                  		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                  		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                  		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
                  		Thread.sleep(1000);
                  	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
                  		 Thread.sleep(1000);
                  	   wait1  = new WebDriverWait(driver,50);
                  	    dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
                  			    )); dropdownTrigger.click();

                  			    WebDriverWait(driver,15);   
                  			    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                  	   inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  			    inputField.sendKeys("احصل على 1 ساعات غير محدودة");
                  			    
                  	   textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  			    	textArea.sendKeys("احصل على 1 ساعات غير محدودة");
                  			    	
                  			    	WebDriverWait(driver,50);  
                  		   	 dropdownTrigger.click();
                  	     	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                  	   inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  					    inputField1.sendKeys("1 小时无限畅享");
                  					    
                  	   textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  					    	textArea1.sendKeys("1 小时无限畅享");
                  			    
                  					    	WebDriverWait(driver,50); 
                  					    	dropdownTrigger.click();
                  			 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                  	  inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  									    inputField11.sendKeys("1 小時無限暢享");
                  									    
                  	  textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  									    	textArea11.sendKeys("1 小時無限暢享");    
                  					
                  									    	WebDriverWait(driver,50); 
                  									    	dropdownTrigger.click();				    	   
                  			     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                  	 		   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField111.sendKeys("získat neomezeně po dobu 1 hodin");
                  									    	 								    
                  	   textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	 	textArea111.sendKeys("získat neomezeně po dobu 1 hodin");    
                  			
                  	 	WebDriverWait(driver,50); 
                  	 	dropdownTrigger.click();
                  		 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                  		   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField2.sendKeys("få ubegrænset i 1 timer");
                  			
                  	  textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea2.sendKeys("få ubegrænset i 1 timer");   								  
                  		
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                  		   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField3.sendKeys("krijg onbeperkt voor 1 uur");

                  	  textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea3.sendKeys("krijg onbeperkt voor 1 uur");								    	

                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                  		  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField4.sendKeys("saada rajattomasti 1 tuntia");
                  									    	 								    
                  	  textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea4.sendKeys("saada rajattomasti 1 tuntia");								    	
                  		
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                  		  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField5.sendKeys("obtenez un accès illimité pendant 1 heures");
                  									    	 								    
                  	  textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea5.sendKeys("obtenez un accès illimité pendant 1 heures");				
                  		
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                  		  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField6.sendKeys("1 Stunden unbegrenzt nutzen");
                  									    	 								    
                  	  textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea6.sendKeys("1 Stunden unbegrenzt nutzen");
                  		
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                  		  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField7.sendKeys("πάρτε απεριόριστο για 1 ώρες");
                  									    	 								    
                  	  textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea7.sendKeys("πάρτε απεριόριστο για 1 ώρες");
                  		
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                  		  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField8.sendKeys("קבל ללא הגבלה למשך 1 שעות");
                  									    	 								    
                  	  textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea8.sendKeys("קבל ללא הגבלה למשך 1 שעות");
                  		
                  		Thread.sleep(2000);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(50);
                  		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                  		  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField9.sendKeys("1 घंटे तक अनलिमिटेड पाएं");
                  									    	 								    
                  	  textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea9.sendKeys("1 घंटे तक अनलिमिटेड पाएं");
                  		
                  		Thread.sleep(50);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                  		  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField10.sendKeys("korlátlanul 1 órán keresztül");
                  									    	 								    
                  	  textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea10.sendKeys("korlátlanul 1 órán keresztül");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                  		  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField12.sendKeys("dapatkan unlimited selama 1 jam");
                  									    	 								    
                  	  textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea12.sendKeys("dapatkan unlimited selama 1 jam");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                  		  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField13.sendKeys("ottieni illimitato per 1 ore");
                  									    	 								    
                  	  textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea13.sendKeys("ottieni illimitato per 1 ore");

                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                  			  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField14.sendKeys("1時間無制限");
                  									    	 								    
                  	  textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea14.sendKeys("1時間無制限");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                  		  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField15.sendKeys("1시간 동안 무제한으로 이용하세요");
                  									    	 								    
                  	  textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea15.sendKeys("1시간 동안 무제한으로 이용하세요");
                  		
                  		Thread.sleep(50);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                  		  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField16.sendKeys("dapatkan tanpa had selama 1 jam");
                  									    	 								    
                  	  textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea16.sendKeys("dapatkan tanpa had selama 1 jam");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                  		  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField17.sendKeys("otrzymaj nieograniczony dostęp przez 1 godzin");
                  									    	 								    
                  	  textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea17.sendKeys("otrzymaj nieograniczony dostęp przez 1 godzin");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                  		  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField18.sendKeys("ganhe ilimitado por 1 horas");
                  									    	 								    
                  	  textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea18.sendKeys("ganhe ilimitado por 1 horas");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                  		  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField19.sendKeys("obțineți nelimitat timp de 1 ore");
                  									    	 								    
                  	  textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea19.sendKeys("obțineți nelimitat timp de 1 ore");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                  		  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField21.sendKeys("получить безлимит на 1 часов");
                  									    	 								    
                  	  textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea21.sendKeys("получить безлимит на 1 часов");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                  		  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField20.sendKeys("získajte neobmedzené množstvo na 1 hodín");
                  									    	 								    
                  	  textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea20.sendKeys("získajte neobmedzené množstvo na 1 hodín");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                  		  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField22.sendKeys("Obtén acceso ilimitado por 1 horas");
                  									    	 								    
                  	  textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea22.sendKeys("Obtén acceso ilimitado por 1 horas");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                  		  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		  inputField23.sendKeys("få obegränsat i 1 timmar");
                  									    	 								    
                  	  textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		textArea23.sendKeys("få obegränsat i 1 timmar");
                  		
                  		Thread.sleep(350);
                  		WebDriverWait(driver,50); 
                  		dropdownTrigger.click();
                  		Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                  		  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  		           inputField24.sendKeys("ได้ไม่จำกัด 1 ชั่วโมง");
                  									    	 								    
                  	        textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  		             textArea24.sendKeys("ได้ไม่จำกัด 1 ชั่วโมง");
                  		
                  		           Thread.sleep(350);
                  		             WebDriverWait(driver,50); 
                  		             dropdownTrigger.click();
                  		         	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                  		  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	    inputField25.sendKeys("1 saat boyunca sınırsız kullanabilirsiniz");
                  							    	 								    
                  	  textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	      textArea25.sendKeys("1 saat boyunca sınırsız kullanabilirsiniz");
                  		
                  		
                  	      WebDriverWait(driver,50); 
                  	      dropdownTrigger.click();
                  	    	Thread.sleep(350);
                  		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
                  		  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                  	    inputField26.sendKeys("nhận được không giới hạn trong 1 giờ");
                  							    	 								    
                  	  textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                  	      textArea26.sendKeys("nhận được không giới hạn trong 1 giờ");

                  	    driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
                  	  Thread.sleep(5000);
                  	wait = new WebDriverWait(driver, 150);
                   		  button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
                   		button.click(); 
                  	    
                  
        
    
    
   // 2 Hour
                  	  Thread.sleep(2000);
                  	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
                  		    By.xpath("(//span[text()='View in-app product'])[14]")
                  		));
                  		firstButton.click();   
                    	 manageTranslationsButton = wait.until(
                   	        ExpectedConditions.elementToBeClickable(
                   	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
                   	    manageTranslationsButton.click();
                   	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
                   	    Thread.sleep(3000);
                   	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
                   		
                   	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                   		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                   		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                   		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                   		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                   		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                   		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                   		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                   		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                   		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                   		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                   		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                   		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                   		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                   		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                   		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                   		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                   		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                   		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                   		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                   		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                   		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                   		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                   		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
                   		 Thread.sleep(1000);
                   	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
                  		 Thread.sleep(1000);
                   	    wait1  = new WebDriverWait(driver,50);
                   	    dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
                   	  		    )); dropdownTrigger.click();

                   	  		    WebDriverWait(driver,15);   
                   	  		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
                   	   inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  		    inputField.sendKeys("احصل على 2 ساعات غير محدودة");
                   	  		    
                   	   textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  		    	textArea.sendKeys("احصل على 2 ساعات غير محدودة");
                   	  		    	
                   	  		    	WebDriverWait(driver,50);  
                   	  	   	 dropdownTrigger.click();
                   	       	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
                   	   inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  				    inputField1.sendKeys("2 小时无限畅享");
                   	  				    
                   	   textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  				    	textArea1.sendKeys("2 小时无限畅享");
                   	  		    
                   	  				    	WebDriverWait(driver,50); 
                   	  				    	dropdownTrigger.click();
                   	  		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
                   	   inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  								    inputField11.sendKeys("2 小時無限暢享");
                   	  								    
                   	   textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  								    	textArea11.sendKeys("2 小時無限暢享");    
                   	  				
                   	  								    	WebDriverWait(driver,50); 
                   	  								    	dropdownTrigger.click();				    	   
                   	  		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
                   	   		  inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField111.sendKeys("získat neomezeně po dobu 2 hodin");
                   	  								    	 								    
                   	    textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	   	textArea111.sendKeys("získat neomezeně po dobu 2 hodin");    
                   	  		
                   	   	WebDriverWait(driver,50); 
                   	   	dropdownTrigger.click();
                   	  	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
                   	  	  inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField2.sendKeys("få ubegrænset i 2 timer");
                   	  		
                   	   textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea2.sendKeys("få ubegrænset i 2 timer");   								  
                   	  	
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
                   	  	  inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField3.sendKeys("krijg onbeperkt voor 2 uur");

                   	   textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea3.sendKeys("krijg onbeperkt voor 2 uur");								    	

                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
                   	  	 inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField4.sendKeys("saada rajattomasti 2 tuntia");
                   	  								    	 								    
                   	   textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea4.sendKeys("saada rajattomasti 2 tuntia");								    	
                   	  	
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
                   	  	 inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField5.sendKeys("obtenez un accès illimité pendant 2 heures");
                   	  								    	 								    
                   	   textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea5.sendKeys("obtenez un accès illimité pendant 2 heures");				
                   	  	
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
                   	  	 inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField6.sendKeys("2 Stunden unbegrenzt nutzen");
                   	  								    	 								    
                   	   textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea6.sendKeys("2 Stunden unbegrenzt nutzen");
                   	  	
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
                   	  	 inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField7.sendKeys("πάρτε απεριόριστο για 2 ώρες");
                   	  								    	 								    
                   	   textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea7.sendKeys("πάρτε απεριόριστο για 2 ώρες");
                   	  	
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
                   	  	 inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField8.sendKeys("קבל ללא הגבלה למשך 2 שעות");
                   	  								    	 								    
                   	   textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea8.sendKeys("קבל ללא הגבלה למשך 2 שעות");
                   	  	
                   	  	Thread.sleep(2000);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(50);
                   	  	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
                   	  	 inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField9.sendKeys("2 घंटे तक अनलिमिटेड पाएं");
                   	  								    	 								    
                   	   textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea9.sendKeys("2 घंटे तक अनलिमिटेड पाएं");
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
                   	  	 inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField10.sendKeys("korlátlanul 2 órán keresztül");
                   	  								    	 								    
                   	   textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea10.sendKeys("korlátlanul 2 órán keresztül");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
                   	  	 inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField12.sendKeys("dapatkan unlimited selama 2 jam");
                   	  								    	 								    
                   	   textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea12.sendKeys("dapatkan unlimited selama 2 jam");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
                   	  	 inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField13.sendKeys("ottieni illimitato per 2 ore");
                   	  								    	 								    
                   	   textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea13.sendKeys("ottieni illimitato per 2 ore");

                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
                   	  		 inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField14.sendKeys("2時間無制限");
                   	  								    	 								    
                   	   textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea14.sendKeys("2時間無制限");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
                   	  	 inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField15.sendKeys("2시간 동안 무제한으로 이용하세요");
                   	  								    	 								    
                   	   textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea15.sendKeys("2시간 동안 무제한으로 이용하세요");
                   	  	
                   	  	Thread.sleep(50);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
                   	  	 inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField16.sendKeys("dapatkan tanpa had selama 2 jam");
                   	  								    	 								    
                   	   textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea16.sendKeys("dapatkan tanpa had selama 2 jam");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
                   	  	 inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField17.sendKeys("otrzymaj nieograniczony dostęp przez 2 godzin");
                   	  								    	 								    
                   	   textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea17.sendKeys("otrzymaj nieograniczony dostęp przez 2 godzin");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
                   	  	 inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField18.sendKeys("ganhe ilimitado por 2 horas");
                   	  								    	 								    
                   	   textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea18.sendKeys("ganhe ilimitado por 2 horas");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
                   	  	 inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField19.sendKeys("obțineți nelimitat timp de 2 ore");
                   	  								    	 								    
                   	   textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea19.sendKeys("obțineți nelimitat timp de 2 ore");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
                   	  	 inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField21.sendKeys("получить безлимит на 2 часов");
                   	  								    	 								    
                   	   textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea21.sendKeys("получить безлимит на 2 часов");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
                   	  	 inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField20.sendKeys("získajte neobmedzené množstvo na 2 hodín");
                   	  								    	 								    
                   	   textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea20.sendKeys("získajte neobmedzené množstvo na 2 hodín");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
                   	  	 inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField22.sendKeys("Obtén acceso ilimitado por 2 horas");
                   	  								    	 								    
                   	   textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea22.sendKeys("Obtén acceso ilimitado por 2 horas");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
                   	  	 inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	  inputField23.sendKeys("få obegränsat i 2 timmar");
                   	  								    	 								    
                   	   textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	textArea23.sendKeys("få obegränsat i 2 timmar");
                   	  	
                   	  	Thread.sleep(350);
                   	  	WebDriverWait(driver,50); 
                   	  	dropdownTrigger.click();
                   	  	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
                   	  	 inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	  	           inputField24.sendKeys("ได้ไม่จำกัด 2 ชั่วโมง");
                   	  								    	 								    
                   	         textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	  	             textArea24.sendKeys("ได้ไม่จำกัด 2 ชั่วโมง");
                   	  	
                   	  	           Thread.sleep(350);
                   	  	             WebDriverWait(driver,50); 
                   	  	             dropdownTrigger.click();
                   	  	         	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
                   	  	 inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	      inputField25.sendKeys("2 saat boyunca sınırsız kullanabilirsiniz");
                   	  						    	 								    
                   	   textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	        textArea25.sendKeys("2 saat boyunca sınırsız kullanabilirsiniz");
                   	  	
                   	  	
                   	        WebDriverWait(driver,50); 
                   	        dropdownTrigger.click();
                   	      	Thread.sleep(350);
                   	  	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
                   	  	 inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
                   	      inputField26.sendKeys("nhận được không giới hạn trong 2 giờ");
                   	  						    	 								    
                   	   textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
                   	        textArea26.sendKeys("nhận được không giới hạn trong 2 giờ");
                   	     driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
                   	  Thread.sleep(5000);
                  	wait = new WebDriverWait(driver, 150);
                    		  button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
                    		button.click(); 
    
    
	
	}
	private static void WebDriverWait(ChromeDriver driver2, int i) {
		// TODO Auto-generated method stub
		
	}

}
