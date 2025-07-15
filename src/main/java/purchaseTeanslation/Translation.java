package purchaseTeanslation;

import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Translation {

	
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIDDHAARTHAN\\eclipse-workspace\\InApp\\Drivers\\chromedriver.exe");
			
			
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-blink-features=AutomationControlled");
	        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.5735.110 Safari/537.36");
	        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
	        options.setExperimentalOption("useAutomationExtension", false);
		
	        
	    	ChromeDriver driver = new ChromeDriver(options);
		
	driver.get("https://play.google.com/console/u/0/developers/8640556426190716779/app/4975188440615233462/managed-products");
	//driver.get("https://play.google.com/console/u/0/developers/8640556426190716779/app/4973164729592355824/monetization-setup");
		driver.manage().window().maximize();

	
	driver.get("https://play.google.com/console/u/0/developers/8640556426190716779/app/4975188440615233462/managed-products/sku-up_1hr2");
	
       
    Thread.sleep(2000);
    WebDriverWait wait = new WebDriverWait(driver, (50));

    WebElement manageTranslationsButton = wait.until(
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
	
	
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
//
//
//    
////////ADS FREE
// WebDriverWait wait1  = new WebDriverWait(driver,30);
// WebElement dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
// 		    )); dropdownTrigger.click();
//
// 		    WebDriverWait(driver,15);   
// 		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
//WebElement inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 		    inputField.sendKeys("احصل على إعلانات مجانية");
// 		    
//WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 		    	textArea.sendKeys("احصل على إعلانات مجانية");
// 		    	
// 		    	WebDriverWait(driver,10);  
// 	   	 dropdownTrigger.click();
//      	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
//WebElement inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 				    inputField1.sendKeys("免广告");
// 				    
//WebElement textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 				    	textArea1.sendKeys("免广告");
// 		    
// 				    	WebDriverWait(driver,10); 
// 				    	dropdownTrigger.click();
// 		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
//WebElement inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 								    inputField11.sendKeys("免廣告");
// 								    
//WebElement textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 								    	textArea11.sendKeys("免廣告");    
// 				
// 								    	WebDriverWait(driver,10); 
// 								    	dropdownTrigger.click();				    	   
// 		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
//  		 WebElement inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField111.sendKeys("Získejte reklamy zdarma");
// 								    	 								    
//WebElement textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//  	textArea111.sendKeys("Získejte reklamy zdarma");    
// 		
//  	WebDriverWait(driver,10); 
//  	dropdownTrigger.click();
// 	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
// 	 WebElement inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField2.sendKeys("Få annoncer gratis");
// 		
//WebElement textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea2.sendKeys("Få annoncer gratis");   								  
//	
// 	WebDriverWait(driver,10); 
// 	dropdownTrigger.click();
// 	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
// 	 WebElement inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField3.sendKeys("Ontvang gratis advertenties");
//
//WebElement textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea3.sendKeys("Ontvang gratis advertenties");								    	
//
// 	Thread.sleep(2000);
// 	WebDriverWait(driver,10); 
// 	dropdownTrigger.click();
// 	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
// 	WebElement inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField4.sendKeys("Hanki mainokset ilmaiseksi");
// 								    	 								    
//WebElement textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea4.sendKeys("Hanki mainokset ilmaiseksi");								    	
//	
// 	Thread.sleep(2000);
// 	WebDriverWait(driver,10); 
// 	dropdownTrigger.click();
// 	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
// 	WebElement inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField5.sendKeys("Obtenez des publicités gratuites");
// 								    	 								    
//WebElement textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea5.sendKeys("Obtenez des publicités gratuites");				
//	
// 	Thread.sleep(2000);
// 	WebDriverWait(driver,10); 
// 	dropdownTrigger.click();
// 	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
// 	WebElement inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField6.sendKeys("Holen Sie sich kostenlose Anzeigen");
// 								    	 								    
//WebElement textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea6.sendKeys("Holen Sie sich kostenlose Anzeigen");
//	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
// 	WebElement inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField7.sendKeys("Λάβετε δωρεάν διαφημίσεις");
// 								    	 								    
//WebElement textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea7.sendKeys("Λάβετε δωρεάν διαφημίσεις");
//	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
// 	WebElement inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField8.sendKeys("קבל פרסומות בחינם");
// 								    	 								    
//WebElement textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea8.sendKeys("קבל פרסומות בחינם");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
//	  	WebElement inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField9.sendKeys("निःशुल्क विज्ञापन प्राप्त करें");
// 								    	 								    
//WebElement textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea9.sendKeys("निःशुल्क विज्ञापन प्राप्त करें");
//	
// 	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
// 	WebElement inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField10.sendKeys("Ingyenes hirdetések");
// 								    	 								    
//WebElement textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea10.sendKeys("Ingyenes hirdetések");
//	
// 	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
// 	WebElement inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField12.sendKeys("Dapatkan Iklan Gratis");
// 								    	 								    
//WebElement textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea12.sendKeys("Dapatkan Iklan Gratis");
//	
// 	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
// 	WebElement inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField13.sendKeys("Ottieni annunci gratuiti");
// 								    	 								    
//WebElement textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea13.sendKeys("Ottieni annunci gratuiti");
//
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
// 		WebElement inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField14.sendKeys("広告を無料でゲット");
// 								    	 								    
//WebElement textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea14.sendKeys("広告を無料でゲット");
//	
// 	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
// 	WebElement inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField15.sendKeys("광고 없이 보기");
// 								    	 								    
//WebElement textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea15.sendKeys("광고 없이 보기");
//	
// 	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
// 	WebElement inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField16.sendKeys("Dapatkan Iklan Percuma");
// 								    	 								    
//WebElement textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea16.sendKeys("Dapatkan Iklan Percuma");
//	
// 	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
// 	WebElement inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField17.sendKeys("Uzyskaj reklamy za darmo");
// 								    	 								    
//WebElement textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea17.sendKeys("Uzyskaj reklamy za darmo");
//     	
// 	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
// 	WebElement inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField18.sendKeys("Obtenha anúncios grátis");
// 								    	 								    
//WebElement textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea18.sendKeys("Obtenha anúncios grátis");
//	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
// 	WebElement inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField19.sendKeys("Obțineți reclame gratuit");
// 								    	 								    
//WebElement textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea19.sendKeys("Obțineți reclame gratuit");
//	
// 	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
// 	WebElement inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField21.sendKeys("Получите бесплатную рекламу");
// 								    	 								    
//WebElement textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea21.sendKeys("Получите бесплатную рекламу");
// 	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
// 	WebElement inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField20.sendKeys("Získajte reklamy zadarmo");
// 								    	 								    
//WebElement textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea20.sendKeys("Získajte reklamy zadarmo");
//	
// 	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
// 	WebElement inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField22.sendKeys("Obtenga anuncios gratis");
// 								    	 								    
//WebElement textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea22.sendKeys("Obtenga anuncios gratis");
//	
// 	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
// 	WebElement inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	  inputField23.sendKeys("Få annonser gratis");
// 								    	 								    
//WebElement textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea23.sendKeys("Få annonser gratis");
//	
// 	
// 	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
// 	WebElement inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
// 	           inputField24.sendKeys("รับโฆษณาฟรี");
// 								    	 								    
//       WebElement textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	             textArea24.sendKeys("รับโฆษณาฟรี");
//	
// 	           Thread.sleep(2000);
// 	     	WebDriverWait(driver,50); 
// 	     	dropdownTrigger.click();
// 	     	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
// 	WebElement inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     inputField25.sendKeys("Reklamları Ücretsiz Alın");
// 						    	 								    
//WebElement textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//       textArea25.sendKeys("Reklamları Ücretsiz Alın");	
//      
//       Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
// 	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
// 	WebElement inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     inputField26.sendKeys("Nhận Quảng cáo miễn phí");
// 						    	 								    
//WebElement textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//       textArea26.sendKeys("Nhận Quảng cáo miễn phí");  
//    
//       driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
//      	Thread.sleep(1000);
//
//      	driver.findElement(By.xpath("//span[@class='mdc-button__label _ngcontent-tnq-18']")).click();
 

    
    
    
    
    
    
    
    
    
    
    // Triple REWARD
//    WebDriverWait  wait1  = new WebDriverWait(driver,30);
//    WebElement dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
//      		    )); dropdownTrigger.click();
//
//      		    WebDriverWait(driver,15);   
//      		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
//     WebElement inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      		    inputField.sendKeys("احصل على ثلاثة أضعاف المكافآت");
//      		    
//     WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      		    	textArea.sendKeys("احصل على ثلاثة أضعاف المكافآت");
//      		    	
//      		    	WebDriverWait(driver,10);  
//      	   	 dropdownTrigger.click();
//           	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
//     WebElement inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      				    inputField1.sendKeys("获得三倍奖励");
//      				    
//     WebElement textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      				    	textArea1.sendKeys("获得三倍奖励");
//      		    
//      				    	WebDriverWait(driver,10); 
//      				    	dropdownTrigger.click();
//      		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
//    WebElement inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      								    inputField11.sendKeys("獲得三倍獎勵");
//      								    
//    WebElement textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      								    	textArea11.sendKeys("獲得三倍獎勵");    
//      				
//      								    	WebDriverWait(driver,10); 
//      								    	dropdownTrigger.click();				    	   
//      		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
//       		 WebElement inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField111.sendKeys("získat trojnásobné odměny");
//      								    	 								    
//     WebElement textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//       	textArea111.sendKeys("získat trojnásobné odměny");    
//      		
//       	WebDriverWait(driver,10); 
//       	dropdownTrigger.click();
//      	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
//      	 WebElement inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField2.sendKeys("få tredoblet belønningen");
//      		
//    WebElement textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea2.sendKeys("få tredoblet belønningen");   								  
//    	
//      	WebDriverWait(driver,10); 
//      	dropdownTrigger.click();
//      	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
//      	 WebElement inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField3.sendKeys("krijg drie keer zoveel beloningen");
//
//    WebElement textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea3.sendKeys("krijg drie keer zoveel beloningen");								    	
//
//      	WebDriverWait(driver,10); 
//      	dropdownTrigger.click();
//      	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
//      	WebElement inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField4.sendKeys("saada kolminkertaiset palkinnot");
//      								    	 								    
//    WebElement textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea4.sendKeys("saada kolminkertaiset palkinnot");								    	
//    	
//      	WebDriverWait(driver,10); 
//      	dropdownTrigger.click();
//      	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
//      	WebElement inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField5.sendKeys("obtenez le triple des récompenses");
//      								    	 								    
//    WebElement textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea5.sendKeys("obtenez le triple des récompenses");				
//    	
//      	WebDriverWait(driver,10); 
//      	dropdownTrigger.click();
//      	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
//      	WebElement inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField6.sendKeys("Holen Sie sich die dreifache Belohnung");
//      								    	 								    
//    WebElement textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea6.sendKeys("Holen Sie sich die dreifache Belohnung");
//    	
//      	WebDriverWait(driver,10); 
//      	dropdownTrigger.click();
//      	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
//      	WebElement inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField7.sendKeys("λάβετε τριπλάσια ανταμοιβή");
//      								    	 								    
//    WebElement textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea7.sendKeys("λάβετε τριπλάσια ανταμοιβή");
//    	
//      	Thread.sleep(350);
//    	WebDriverWait(driver,50); 
//    	dropdownTrigger.click();
//    	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
//      	WebElement inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField8.sendKeys("לקבל פרס משולש");
//      								    	 								    
//    WebElement textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea8.sendKeys("לקבל פרס משולש");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
//      	WebElement inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField9.sendKeys("तिगुना इनाम पाएँ");
//      								    	 								    
//    WebElement textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea9.sendKeys("तिगुना इनाम पाएँ");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
//      	WebElement inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField10.sendKeys("kap háromszoros jutalmat");
//      								    	 								    
//    WebElement textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea10.sendKeys("kap háromszoros jutalmat");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
//      	WebElement inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField12.sendKeys("dapatkan tiga kali lipat hadiahnya");
//      								    	 								    
//    WebElement textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea12.sendKeys("dapatkan tiga kali lipat hadiahnya");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
//      	WebElement inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField13.sendKeys("ottieni il triplo delle ricompense");
//      								    	 								    
//    WebElement textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea13.sendKeys("ottieni il triplo delle ricompense");
//
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//
//      	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
//      		WebElement inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField14.sendKeys("報酬を3倍に");
//      								    	 								    
//    WebElement textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea14.sendKeys("報酬を3倍に");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
//      	WebElement inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField15.sendKeys("3배의 보상을 받으세요");
//      								    	 								    
//    WebElement textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea15.sendKeys("3배의 보상을 받으세요");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
//      	WebElement inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField16.sendKeys("mendapat ganjaran tiga kali ganda");
//      								    	 								    
//    WebElement textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea16.sendKeys("mendapat ganjaran tiga kali ganda");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
//      	WebElement inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField17.sendKeys("zdobądź potrójne nagrody");
//      								    	 								    
//    WebElement textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea17.sendKeys("zdobądź potrójne nagrody");
//          	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
//      	WebElement inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField18.sendKeys("ganhe o triplo das recompensas");
//      								    	 								    
//    WebElement textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea18.sendKeys("ganhe o triplo das recompensas");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
//      	WebElement inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField19.sendKeys("obține triplul recompenselor");
//      								    	 								    
//    WebElement textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea19.sendKeys("obține triplul recompenselor");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
//      	WebElement inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField21.sendKeys("получите тройное вознаграждение");
//      								    	 								    
//    WebElement textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea21.sendKeys("получите тройное вознаграждение");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
//      	WebElement inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField20.sendKeys("získajte trojnásobné odmeny");
//      								    	 								    
//    WebElement textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea20.sendKeys("získajte trojnásobné odmeny");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
//      	WebElement inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField22.sendKeys("Obtén el triple de recompensas");
//      								    	 								    
//    WebElement textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea22.sendKeys("Obtén el triple de recompensas");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
//      	WebElement inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField23.sendKeys("få tredubbla belöningarna");
//      								    	 								    
//    WebElement textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea23.sendKeys("få tredubbla belöningarna");
//    	
//      	Thread.sleep(350);
//        	WebDriverWait(driver,50); 
//        	dropdownTrigger.click();
//        	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
//      	WebElement inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	           inputField24.sendKeys("รับรางวัลสามเท่า");
//      								    	 								    
//            WebElement textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	             textArea24.sendKeys("รับรางวัลสามเท่า");
//    	
//      	             Thread.sleep(350);
//      	           	WebDriverWait(driver,50); 
//      	           	dropdownTrigger.click();
//      	           	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
//      	WebElement inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//          inputField25.sendKeys("üç kat ödül kazanın");
//      						    	 								    
//    WebElement textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//            textArea25.sendKeys("üç kat ödül kazanın");	
//    	
//            Thread.sleep(350);
//          	WebDriverWait(driver,50); 
//          	dropdownTrigger.click();
//          	Thread.sleep(350);
//      	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
//      	WebElement inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//          inputField26.sendKeys("nhận được gấp ba phần thưởng");
//      						    	 								    
//    WebElement textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//            textArea26.sendKeys("nhận được gấp ba phần thưởng");	  
//    
//    
//    
//    
//            driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
//      	Thread.sleep(1000);
//
//      	driver.findElement(By.xpath("//span[@class='mdc-button__label _ngcontent-tnq-18']")).click();
      	

    
    
    
    
    
    
    
    
//   // GET Quadruple  
// WebDriverWait wait1  = new WebDriverWait(driver,50);
// WebElement dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
//		    )); dropdownTrigger.click();
//
//		    WebDriverWait(driver,15);   
//		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
//WebElement inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//		    inputField.sendKeys("احصل على أربعة أضعاف المكافآت");
//		    
//WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//		    	textArea.sendKeys("احصل على أربعة أضعاف المكافآت");
//		    	
//		    	WebDriverWait(driver,50);  
//	   	 dropdownTrigger.click();
//    	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
//WebElement inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//				    inputField1.sendKeys("获得四倍奖励");
//				    
//WebElement textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//				    	textArea1.sendKeys("获得四倍奖励");
//		    
//				    	WebDriverWait(driver,50); 
//				    	dropdownTrigger.click();
//		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
//WebElement inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//								    inputField11.sendKeys("獲得四倍獎勵");
//								    
//WebElement textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//								    	textArea11.sendKeys("獲得四倍獎勵");    
//				
//								    	WebDriverWait(driver,50); 
//								    	dropdownTrigger.click();				    	   
//		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
//		 WebElement inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField111.sendKeys("získat čtyřnásobné odměny");
//								    	 								    
//WebElement textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea111.sendKeys("získat čtyřnásobné odměny");    
//		
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
//	 WebElement inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField2.sendKeys("få firdoblet belønningen");
//		
//WebElement textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea2.sendKeys("få firdoblet belønningen");   								  
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
//	 WebElement inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField3.sendKeys("krijg vier keer zoveel beloningen");
//
//WebElement textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea3.sendKeys("krijg vier keer zoveel beloningen");								    	
//
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
//	WebElement inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField4.sendKeys("saat nelinkertaiset palkinnot");
//								    	 								    
//WebElement textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea4.sendKeys("saat nelinkertaiset palkinnot");								    	
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
//	WebElement inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField5.sendKeys("obtenez quatre fois plus de récompenses");
//								    	 								    
//WebElement textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea5.sendKeys("obtenez quatre fois plus de récompenses");				
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
//	WebElement inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField6.sendKeys("Holen Sie sich die vierfache Belohnung");
//								    	 								    
//WebElement textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea6.sendKeys("Holen Sie sich die vierfache Belohnung");
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
//	WebElement inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField7.sendKeys("λάβετε τετραπλάσιες ανταμοιβές");
//								    	 								    
//WebElement textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea7.sendKeys("λάβετε τετραπλάσιες ανταμοιβές");
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
//	WebElement inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField8.sendKeys("לקבל פי ארבעה את התגמולים");
//								    	 								    
//WebElement textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea8.sendKeys("לקבל פי ארבעה את התגמולים");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
//	WebElement inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField9.sendKeys("चौगुना इनाम पाएँ");
//								    	 								    
//WebElement textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea9.sendKeys("चौगुना इनाम पाएँ");
//	
//	Thread.sleep(50);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
//	WebElement inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField10.sendKeys("négyszeres jutalmat kap");
//								    	 								    
//WebElement textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea10.sendKeys("négyszeres jutalmat kap");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
//	WebElement inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField12.sendKeys("dapatkan hadiah empat kali lipat");
//								    	 								    
//WebElement textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea12.sendKeys("dapatkan hadiah empat kali lipat");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
//	WebElement inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField13.sendKeys("ottieni il quadruplo delle ricompense");
//								    	 								    
//WebElement textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea13.sendKeys("ottieni il quadruplo delle ricompense");
//
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
//		WebElement inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField14.sendKeys("報酬が4倍になる");
//								    	 								    
//WebElement textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea14.sendKeys("報酬が4倍になる");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
//	WebElement inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField15.sendKeys("4배의 보상을 받으세요");
//								    	 								    
//WebElement textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea15.sendKeys("4배의 보상을 받으세요");
//	
//	Thread.sleep(50);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
//	WebElement inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField16.sendKeys("mendapat ganjaran empat kali ganda");
//								    	 								    
//WebElement textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea16.sendKeys("mendapat ganjaran empat kali ganda");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
//	WebElement inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField17.sendKeys("zdobądź poczwórne nagrody");
//								    	 								    
//WebElement textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea17.sendKeys("zdobądź poczwórne nagrody");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
//	WebElement inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField18.sendKeys("ganhe o quádruplo das recompensas");
//								    	 								    
//WebElement textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea18.sendKeys("ganhe o quádruplo das recompensas");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
//	WebElement inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField19.sendKeys("obține de patru ori recompense");
//								    	 								    
//WebElement textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea19.sendKeys("obține de patru ori recompense");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
//	WebElement inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField21.sendKeys("получите вчетверо больше наград");
//								    	 								    
//WebElement textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea21.sendKeys("получите вчетверо больше наград");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
//	WebElement inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField20.sendKeys("získajte štvornásobné odmeny");
//								    	 								    
//WebElement textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea20.sendKeys("získajte štvornásobné odmeny");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
//	WebElement inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField22.sendKeys("Obtén el cuádruple de recompensas");
//								    	 								    
//WebElement textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea22.sendKeys("Obtén el cuádruple de recompensas");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
//	WebElement inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField23.sendKeys("få fyrdubbla belöningarna");
//								    	 								    
//WebElement textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea23.sendKeys("få fyrdubbla belöningarna");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
//	WebElement inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	           inputField24.sendKeys("รับรางวัลเพิ่มเป็นสี่เท่า");
//								    	 								    
//     WebElement textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	             textArea24.sendKeys("รับรางวัลเพิ่มเป็นสี่เท่า");
//	
//	           Thread.sleep(350);
//	           WebDriverWait (driver,50); 
//	             dropdownTrigger.click();
//	         	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
//	WebElement inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//   inputField25.sendKeys("dört kat ödül kazanın");
//						    	 								    
//WebElement textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     textArea25.sendKeys("dört kat ödül kazanın");
//	
//     Thread.sleep(350);
// 	WebDriverWait(driver,50); 
// 	dropdownTrigger.click();
// 	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
//	WebElement inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//   inputField26.sendKeys("nhận được gấp bốn lần phần thưởng");
//						    	 								    
//WebElement textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     textArea26.sendKeys("nhận được gấp bốn lần phần thưởng");
//
// 
//     driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();
//	Thread.sleep(2000);
//
//	 wait = new WebDriverWait(driver, 50);
//	WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
//	button.click();
    
    
    
    
    
    
    
    
    
    
    
//  // GET 5Hours
//  WebDriverWait wait1  = new WebDriverWait(driver,50);
//  WebElement dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
//		    )); dropdownTrigger.click();
//
//		    WebDriverWait(driver,15);   
//		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
// WebElement inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//		    inputField.sendKeys("احصل على 5 ساعات غير محدودة");
//		    
// WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//		    	textArea.sendKeys("احصل على 5 ساعات غير محدودة");
//		    	
//		    	WebDriverWait(driver,50);  
//	   	 dropdownTrigger.click();
//     	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
// WebElement inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//				    inputField1.sendKeys("5 小时无限畅享");
//				    
// WebElement textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//				    	textArea1.sendKeys("5 小时无限畅享");
//		    
//				    	WebDriverWait(driver,50); 
//				    	dropdownTrigger.click();
//		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
//WebElement inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//								    inputField11.sendKeys("5 小時無限暢享");
//								    
//WebElement textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//								    	textArea11.sendKeys("5 小時無限暢享");    
//				
//								    	WebDriverWait(driver,50); 
//								    	dropdownTrigger.click();				    	   
//		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
// 		 WebElement inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField111.sendKeys("získat neomezeně po dobu 5 hodin");
//								    	 								    
// WebElement textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea111.sendKeys("získat neomezeně po dobu 5 hodin");    
//		
// 	WebDriverWait(driver,50); 
// 	dropdownTrigger.click();
//	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
//	 WebElement inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField2.sendKeys("få ubegrænset i 5 timer");
//		
//WebElement textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea2.sendKeys("få ubegrænset i 5 timer");   								  
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
//	 WebElement inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField3.sendKeys("krijg onbeperkt voor 5 uur");
//
//WebElement textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea3.sendKeys("krijg onbeperkt voor 5 uur");								    	
//
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
//	WebElement inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField4.sendKeys("saada rajattomasti 5 tuntia");
//								    	 								    
//WebElement textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea4.sendKeys("saada rajattomasti 5 tuntia");								    	
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
//	WebElement inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField5.sendKeys("obtenez un accès illimité pendant 5 heures");
//								    	 								    
//WebElement textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea5.sendKeys("obtenez un accès illimité pendant 5 heures");				
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
//	WebElement inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField6.sendKeys("5 Stunden unbegrenzt nutzen");
//								    	 								    
//WebElement textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea6.sendKeys("5 Stunden unbegrenzt nutzen");
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
//	WebElement inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField7.sendKeys("πάρτε απεριόριστο για 5 ώρες");
//								    	 								    
//WebElement textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea7.sendKeys("πάρτε απεριόριστο για 5 ώρες");
//	
//	Thread.sleep(350); 
//	WebDriverWait(driver,350); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
//	WebElement inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField8.sendKeys("קבל ללא הגבלה למשך 5 שעות");
//								    	 								    
//WebElement textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea8.sendKeys("קבל ללא הגבלה למשך 5 שעות");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
//	WebElement inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField9.sendKeys("5 घंटे तक अनलिमिटेड पाएं");
//								    	 								    
//WebElement textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea9.sendKeys("5 घंटे तक अनलिमिटेड पाएं");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
//	WebElement inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField10.sendKeys("korlátlanul 5 órán keresztül");
//								    	 								    
//WebElement textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea10.sendKeys("korlátlanul 5 órán keresztül");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
//	WebElement inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField12.sendKeys("dapatkan unlimited selama 5 jam");
//								    	 								    
//WebElement textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea12.sendKeys("dapatkan unlimited selama 5 jam");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
//	WebElement inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField13.sendKeys("ottieni illimitato per 5 ore");
//								    	 								    
//WebElement textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea13.sendKeys("ottieni illimitato per 5 ore");
//
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
//		WebElement inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField14.sendKeys("5時間無制限");
//								    	 								    
//WebElement textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea14.sendKeys("5時間無制限");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
//	WebElement inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField15.sendKeys("5시간 동안 무제한으로 이용하세요");
//								    	 								    
//WebElement textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea15.sendKeys("5시간 동안 무제한으로 이용하세요");
//	
//	Thread.sleep(50);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
//	WebElement inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField16.sendKeys("dapatkan tanpa had selama 5 jam");
//								    	 								    
//WebElement textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea16.sendKeys("dapatkan tanpa had selama 5 jam");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
//	WebElement inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField17.sendKeys("otrzymaj nieograniczony dostęp przez 5 godzin");
//								    	 								    
//WebElement textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea17.sendKeys("otrzymaj nieograniczony dostęp przez 5 godzin");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
//	WebElement inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField18.sendKeys("ganhe ilimitado por 5 horas");
//								    	 								    
//WebElement textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea18.sendKeys("ganhe ilimitado por 5 horas");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
//	WebElement inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField19.sendKeys("obțineți nelimitat timp de 5 ore");
//								    	 								    
//WebElement textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea19.sendKeys("obțineți nelimitat timp de 5 ore");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
//	WebElement inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField21.sendKeys("получить безлимит на 5 часов");
//								    	 								    
//WebElement textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea21.sendKeys("получить безлимит на 5 часов");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
//	WebElement inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField20.sendKeys("získajte neobmedzené množstvo na 5 hodín");
//								    	 								    
//WebElement textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea20.sendKeys("získajte neobmedzené množstvo na 5 hodín");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
//	WebElement inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField22.sendKeys("Obtén acceso ilimitado por 5 horas");
//								    	 								    
//WebElement textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea22.sendKeys("Obtén acceso ilimitado por 5 horas");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
//	WebElement inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField23.sendKeys("få obegränsat i 5 timmar");
//								    	 								    
//WebElement textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea23.sendKeys("få obegränsat i 5 timmar");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
//	WebElement inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	           inputField24.sendKeys("ได้ไม่จำกัด 5 ชั่วโมง");
//								    	 								    
//      WebElement textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	             textArea24.sendKeys("ได้ไม่จำกัด 5 ชั่วโมง");
//	
//	           Thread.sleep(350);
//	             WebDriverWait(driver,50); 
//	             dropdownTrigger.click();
//	         	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
//	WebElement inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//    inputField25.sendKeys("5 saat boyunca sınırsız kullanabilirsiniz");
//						    	 								    
//WebElement textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      textArea25.sendKeys("5 saat boyunca sınırsız kullanabilirsiniz");
//	
//	
//      WebDriverWait(driver,50); 
//      dropdownTrigger.click();
//    	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
//	WebElement inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//    inputField26.sendKeys("nhận được không giới hạn trong 5 giờ");
//						    	 								    
//WebElement textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      textArea26.sendKeys("nhận được không giới hạn trong 5 giờ");
//  
//      driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click(); 
//  	Thread.sleep(1500);
//      wait = new WebDriverWait(driver, 50);
//  	WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
//  	button.click();
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
//    //  GET COIN 1000

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // GET COIN 165
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//      	 // Double REWARD 
//  	 Thread.sleep(2000);
// 	WebElement firstButton = wait.until(ExpectedConditions.elementToBeClickable(
// 		    By.xpath("(//span[text()='View in-app product'])[2]")
// 		));
// 		firstButton.click();
//    	
//      	 manageTranslationsButton = wait.until(
//      	        ExpectedConditions.elementToBeClickable(
//      	            By.cssSelector("material-button[debug-id='manage-translations-button'] button") ));
//      	    manageTranslationsButton.click();
//      	   // driver.findElement(By.cssSelector("material-button[debug-id='manage-translations-button'] button")).click();
//      	    Thread.sleep(3000);
//      	   // driver.findElement(By.xpath("//div[text()='Manage translations']")).click();
//      		
//      	    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
//      		driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
//      		driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
//      		driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
//      		driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
//      		driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
//      		driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
//      		driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
//      		driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
//      		driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
//      		driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
//      		driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
//      		driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
//      		driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
//      		driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
//      		driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
//      		driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
//      		driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
//      		driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
//      		driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
//      		driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
//      		driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
//      		driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
//      		driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
//      		driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
//      		driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
//      		driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
//      		driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();
//      		
//      		
//      	    Thread.sleep(1000);
//      	    driver.findElement(By.xpath("//button[@debug-id='yes-button']//span[1]")).click();
//    
//    
//    
//    
// 
// wait1  = new WebDriverWait(driver,30);
// dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
//     		    )); dropdownTrigger.click();
//   
//     		    WebDriverWait(driver,15);   
//     		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
//      inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     		    inputField.sendKeys("احصل على ضعف المكافآت");
//     		    
//      textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     		    	textArea.sendKeys("احصل على ضعف المكافآت");
//     		    	
//     		    	WebDriverWait(driver,10);  
//     	   	 dropdownTrigger.click();
//          	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
//      inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     				    inputField1.sendKeys("获得双倍奖励");
//     				    
//      textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     				    	textArea1.sendKeys("获得双倍奖励");
//     		    
//     				    	WebDriverWait(driver,10); 
//     				    	dropdownTrigger.click();
//     		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
//     inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     								    inputField11.sendKeys("獲得雙倍獎勵");
//     								    
//     textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     								    	textArea11.sendKeys("獲得雙倍獎勵");    
//     				
//     								    	WebDriverWait(driver,10); 
//     								    	dropdownTrigger.click();				    	   
//     		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
//      		   inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField111.sendKeys("Získejte dvojnásobek odměn");
//     								    	 								    
//      textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea111.sendKeys("Získejte dvojnásobek odměn");    
//     		
//      	WebDriverWait(driver,10); 
//      	dropdownTrigger.click();
//     	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
//     	   inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField2.sendKeys("Få dobbelte belønninger");
//     		
//     textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea2.sendKeys("Få dobbelte belønninger");   								  
//   	
//     	WebDriverWait(driver,10); 
//     	dropdownTrigger.click();
//     	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
//     	   inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField3.sendKeys("Krijg dubbele beloningen");
//   
//     textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea3.sendKeys("Krijg dubbele beloningen");								    	
//   
//     	Thread.sleep(2000);
//     	WebDriverWait(driver,10); 
//     	dropdownTrigger.click();
//     	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
//     	  inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField4.sendKeys("Hanki kaksinkertaiset palkinnot");
//     								    	 								    
//     textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea4.sendKeys("Hanki kaksinkertaiset palkinnot");								    	
//   	
//     	Thread.sleep(2000);
//     	WebDriverWait(driver,10); 
//     	dropdownTrigger.click();
//     	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
//     	  inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField5.sendKeys("Obtenez le double de récompenses");
//     								    	 								    
//     textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea5.sendKeys("Obtenez le double de récompenses");				
//   	
//     	Thread.sleep(2000);
//     	WebDriverWait(driver,10); 
//     	dropdownTrigger.click();
//     	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
//     	  inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField6.sendKeys("Holen Sie sich die doppelte Belohnung");
//     								    	 								    
//     textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea6.sendKeys("Holen Sie sich die doppelte Belohnung");
//   	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
//     	  inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField7.sendKeys("Αποκτήστε διπλάσια ανταμοιβή");
//     								    	 								    
//     textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea7.sendKeys("Αποκτήστε διπλάσια ανταμοιβή");
//   	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
//     	  inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField8.sendKeys("קבל כפול את התגמולים");
//     								    	 								    
//     textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea8.sendKeys("קבל כפול את התגמולים");
//   	
//   	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//   	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
//   	  	  inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField9.sendKeys("दोगुना इनाम पाएं");
//     								    	 								    
//     textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea9.sendKeys("दोगुना इनाम पाएं");
//   	
//     	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
//     	  inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField10.sendKeys("Szerezzen dupla jutalmat");
//     								    	 								    
//     textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea10.sendKeys("Szerezzen dupla jutalmat");
//   	
//     	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
//     	  inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField12.sendKeys("Dapatkan Hadiah Ganda");
//     								    	 								    
//     textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea12.sendKeys("Dapatkan Hadiah Ganda");
//   	
//     	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
//     	  inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField13.sendKeys("Ottieni il doppio delle ricompense");
//     								    	 								    
//     textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea13.sendKeys("Ottieni il doppio delle ricompense");
//   
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
//     		  inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField14.sendKeys("報酬を2倍獲得");
//     								    	 								    
//     textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea14.sendKeys("報酬を2倍獲得");
//   	
//     	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
//     	  inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField15.sendKeys("두 배의 보상을 받으세요");
//     								    	 								    
//     textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea15.sendKeys("두 배의 보상을 받으세요");
//   	
//     	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
//     	  inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField16.sendKeys("Dapatkan Ganjaran Berganda");
//     								    	 								    
//     textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea16.sendKeys("Dapatkan Ganjaran Berganda");
//   	
//     	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
//     	  inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField17.sendKeys("Zdobądź podwójne nagrody");
//     								    	 								    
//     textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea17.sendKeys("Zdobądź podwójne nagrody");
//         	
//     	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
//     	  inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField18.sendKeys("Ganhe o dobro de recompensas");
//     								    	 								    
//     textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea18.sendKeys("Ganhe o dobro de recompensas");
//   	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
//     	  inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField19.sendKeys("Obțineți recompense duble");
//     								    	 								    
//     textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea19.sendKeys("Obțineți recompense duble");
//   	
//     	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
//     	  inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField21.sendKeys("Получите двойные награды");
//     								    	 								    
//     textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea21.sendKeys("Получите двойные награды");
//     	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
//     	  inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField20.sendKeys("Získajte dvojnásobnú odmenu");
//     								    	 								    
//     textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea20.sendKeys("Získajte dvojnásobnú odmenu");
//   	
//     	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
//     	  inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField22.sendKeys("Obtenga el doble de recompensas");
//     								    	 								    
//     textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea22.sendKeys("Obtenga el doble de recompensas");
//   	
//     	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
//     	  inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	  inputField23.sendKeys("Få dubbla belöningar");
//     								    	 								    
//     textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	textArea23.sendKeys("Få dubbla belöningar");
//   	
//     	
//     	Thread.sleep(2000);
//   	WebDriverWait(driver,50); 
//   	dropdownTrigger.click();
//   	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
//     	  inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//     	           inputField24.sendKeys("รับรางวัลสองเท่า");
//     								    	 								    
//       textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//     	             textArea24.sendKeys("รับรางวัลสองเท่า");
//   	
//     	           Thread.sleep(2000);
//     	     	WebDriverWait(driver,50); 
//     	     	dropdownTrigger.click();
//     	     	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
//     	  inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//         inputField25.sendKeys("Ödüllerin İki Katını Kazanın");
//     						    	 								    
//     textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//           textArea25.sendKeys("Ödüllerin İki Katını Kazanın");	
//          
//           Thread.sleep(2000);
//       	WebDriverWait(driver,50); 
//       	dropdownTrigger.click();
//       	Thread.sleep(50);
//     	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
//     	  inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//         inputField26.sendKeys("Nhận gấp đôi phần thưởng");
//     						    	 								    
//     textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//           textArea26.sendKeys("Nhận gấp đôi phần thưởng");								    	
//         	Thread.sleep(1000);
//
//            driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click(); 
//         	Thread.sleep(2000);
//         	wait = new WebDriverWait(driver, 50);
//          	 button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='In-app products']")));
//          	button.click();
//					    	
//         	wait = new WebDriverWait(driver, 50);	
//         	 firstButton = wait.until(ExpectedConditions.elementToBeClickable(
//         		    By.xpath("(//span[text()='View in-app product'])[8]")
//         		));
//         		firstButton.click();						    	
   								    	
   								    	
   								    	
   								    	
   								    	
						    	

    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//   /// 65 hints + 5 skip
//   
//    WebDriverWait wait1  = new WebDriverWait(driver,50);
//  WebElement dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
//		    )); dropdownTrigger.click();
//
//		    WebDriverWait(driver,15);   
//		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
// WebElement inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//		    inputField.sendKeys("احصل على 65 تلميحًا + 5 تخطي");
//		    
// WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//		    	textArea.sendKeys("احصل على 65 تلميحًا + 5 تخطي");
//		    	
//		    	WebDriverWait(driver,50);  
//	   	 dropdownTrigger.click();
//     	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
// WebElement inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//				    inputField1.sendKeys("获得 65 条提示 + 5 次跳过");
//				    
// WebElement textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//				    	textArea1.sendKeys("获得 65 条提示 + 5 次跳过");
//		    
//				    	WebDriverWait(driver,50); 
//				    	dropdownTrigger.click();
//		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
//WebElement inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//								    inputField11.sendKeys("獲得 65 個提示 + 5 次跳過");
//								    
//WebElement textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//								    	textArea11.sendKeys("獲得 65 個提示 + 5 次跳過");    
//				
//								    	WebDriverWait(driver,50); 
//								    	dropdownTrigger.click();				    	   
//		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
// 		 WebElement inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField111.sendKeys("Získejte 65 tipů + 5 přeskočení");
//								    	 								    
// WebElement textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea111.sendKeys("Získejte 65 tipů + 5 přeskočení");    
//		
// 	WebDriverWait(driver,50); 
// 	dropdownTrigger.click();
//	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
//	 WebElement inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField2.sendKeys("Få 65 tip + 5 spring over");
//		
//WebElement textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea2.sendKeys("Få 65 tip + 5 spring over");   								  
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
//	 WebElement inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField3.sendKeys("Krijg 65 hint + 5 overslaan");
//
//WebElement textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea3.sendKeys("Krijg 65 hint + 5 overslaan");								    	
//
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
//	WebElement inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField4.sendKeys("Hanki 65 vihjettä + 5 ohitusta");
//								    	 								    
//WebElement textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea4.sendKeys("Hanki 65 vihjettä + 5 ohitusta");								    	
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
//	WebElement inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField5.sendKeys("Obtenez 65 indices + 5 sauts");
//								    	 								    
//WebElement textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea5.sendKeys("Obtenez 65 indices + 5 sauts");				
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
//	WebElement inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField6.sendKeys("Holen Sie sich 65 Hinweise + 5 überspringen");
//								    	 								    
//WebElement textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea6.sendKeys("Holen Sie sich 65 Hinweise + 5 überspringen");
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
//	WebElement inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField7.sendKeys("Λάβετε 65 συμβουλές + 5 παράλειψη");
//								    	 								    
//WebElement textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea7.sendKeys("Λάβετε 65 συμβουλές + 5 παράλειψη");
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
//	WebElement inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField8.sendKeys("קבל 65 רמז + 5 דילוגים");
//								    	 								    
//WebElement textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea8.sendKeys("קבל 65 רמז + 5 דילוגים");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
//	WebElement inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField9.sendKeys("65 संकेत + 5 छोड़ें प्राप्त करें");
//								    	 								    
//WebElement textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea9.sendKeys("65 संकेत + 5 छोड़ें प्राप्त करें");
//	
//	Thread.sleep(50);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
//	WebElement inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField10.sendKeys("65 tipp + 5 kihagyás");
//								    	 								    
//WebElement textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea10.sendKeys("65 tipp + 5 kihagyás");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
//	WebElement inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField12.sendKeys("Dapatkan 65 petunjuk + 5 lewati");
//								    	 								    
//WebElement textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea12.sendKeys("Dapatkan 65 petunjuk + 5 lewati");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
//	WebElement inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField13.sendKeys("Ottieni 65 suggerimenti + 5 salti");
//								    	 								    
//WebElement textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea13.sendKeys("Ottieni 65 suggerimenti + 5 salti");
//
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
//		WebElement inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField14.sendKeys("65のヒント+5のスキップを取得");
//								    	 								    
//WebElement textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea14.sendKeys("65のヒント+5のスキップを取得");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
//	WebElement inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField15.sendKeys("힌트 65개 + 건너뛰기 5개 받기");
//								    	 								    
//WebElement textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea15.sendKeys("힌트 65개 + 건너뛰기 5개 받기");
//	
//	Thread.sleep(50);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
//	WebElement inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField16.sendKeys("Dapatkan 65 pembayang + 5 langkau");
//								    	 								    
//WebElement textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea16.sendKeys("Dapatkan 65 pembayang + 5 langkau");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
//	WebElement inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField17.sendKeys("Zdobądź 65 wskazówek + 5 pominięć");
//								    	 								    
//WebElement textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea17.sendKeys("Zdobądź 65 wskazówek + 5 pominięć");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
//	WebElement inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField18.sendKeys("Ganhe 65 dicas + 5 pulos");
//								    	 								    
//WebElement textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea18.sendKeys("Ganhe 65 dicas + 5 pulos");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
//	WebElement inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField19.sendKeys("Obțineți 65 de indicii + 5 de sărituri");
//								    	 								    
//WebElement textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea19.sendKeys("Obțineți 65 de indicii + 5 de sărituri");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
//	WebElement inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField21.sendKeys("Получить 65 подсказок + 5 пропустить");
//								    	 								    
//WebElement textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea21.sendKeys("Получить 65 подсказок + 5 пропустить");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
//	WebElement inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField20.sendKeys("Získajte 65 tipov + 5 preskočení");
//								    	 								    
//WebElement textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea20.sendKeys("Získajte 65 tipov + 5 preskočení");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
//	WebElement inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField22.sendKeys("Obtenga 65 pistas + 5 saltos");
//								    	 								    
//WebElement textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea22.sendKeys("Obtenga 65 pistas + 5 saltos");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
//	WebElement inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField23.sendKeys("Få 65 tips + 5 hoppa över");
//								    	 								    
//WebElement textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea23.sendKeys("Få 65 tips + 5 hoppa över");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
//	WebElement inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	           inputField24.sendKeys("รับ 65 คำใบ้ + 5 ข้าม");
//								    	 								    
//      WebElement textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	             textArea24.sendKeys("รับ 65 คำใบ้ + 5 ข้าม");
//	
//	           Thread.sleep(300);
//	             WebDriverWait(driver,50); 
//	             dropdownTrigger.click();
//	         	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
//	WebElement inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//    inputField25.sendKeys("65 ipucu + 5 atlama al");
//						    	 								    
//WebElement textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      textArea25.sendKeys("65 ipucu + 5 atlama al");
//	
//	
//      WebDriverWait(driver,50); 
//      dropdownTrigger.click();
//    	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
//	WebElement inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//    inputField26.sendKeys("Nhận 65 gợi ý + 5 lần bỏ qua");
//						    	 								    
//WebElement textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      textArea26.sendKeys("Nhận 65 gợi ý + 5 lần bỏ qua");

      
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//  // GET hint 80
//  WebDriverWait wait1  = new WebDriverWait(driver,50);
//  WebElement dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
//		    )); dropdownTrigger.click();
//
//		    WebDriverWait(driver,15);   
//		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
// WebElement inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//		    inputField.sendKeys("احصل على 80 تلميحًا");
//		    
// WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//		    	textArea.sendKeys("احصل على 80 تلميحًا");
//		    	
//		    	WebDriverWait(driver,50);  
//	   	 dropdownTrigger.click();
//     	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
// WebElement inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//				    inputField1.sendKeys("获得80条提示");
//				    
// WebElement textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//				    	textArea1.sendKeys("获得80条提示");
//		    
//				    	WebDriverWait(driver,50); 
//				    	dropdownTrigger.click();
//		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
//WebElement inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//								    inputField11.sendKeys("獲得80個提示");
//								    
//WebElement textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//								    	textArea11.sendKeys("獲得80個提示");    
//				
//								    	WebDriverWait(driver,50); 
//								    	dropdownTrigger.click();				    	   
//		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
// 		 WebElement inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField111.sendKeys("Získejte 80 tipů");
//								    	 								    
// WebElement textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea111.sendKeys("Získejte 80 tipů");    
//		
// 	WebDriverWait(driver,50); 
// 	dropdownTrigger.click();
//	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
//	 WebElement inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField2.sendKeys("Få 80 tip");
//		
//WebElement textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea2.sendKeys("Få 80 tip");   								  
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
//	 WebElement inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField3.sendKeys("Krijg 80 hints");
//
//WebElement textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea3.sendKeys("Krijg 80 hints");								    	
//
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
//	WebElement inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField4.sendKeys("Hanki 80 vihje");
//								    	 								    
//WebElement textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea4.sendKeys("Hanki 80 vihje");								    	
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
//	WebElement inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField5.sendKeys("Obtenez 80 indices");
//								    	 								    
//WebElement textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea5.sendKeys("Obtenez 80 indices");				
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
//	WebElement inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField6.sendKeys("Holen Sie sich 80 Hinweise");
//								    	 								    
//WebElement textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea6.sendKeys("Holen Sie sich 80 Hinweise");
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
//	WebElement inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField7.sendKeys("Λάβετε υπόδειξη 80");
//								    	 								    
//WebElement textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea7.sendKeys("Λάβετε υπόδειξη 80");
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
//	WebElement inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField8.sendKeys("קבל רמז 80");
//								    	 								    
//WebElement textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea8.sendKeys("קבל רמז 80");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
//	WebElement inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField9.sendKeys("80 संकेत प्राप्त करें");
//								    	 								    
//WebElement textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea9.sendKeys("80 संकेत प्राप्त करें");
//	
//	Thread.sleep(50);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
//	WebElement inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField10.sendKeys("Szerezzen 80 tippet");
//								    	 								    
//WebElement textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea10.sendKeys("Szerezzen 80 tippet");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
//	WebElement inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField12.sendKeys("Dapatkan 80 petunjuk");
//								    	 								    
//WebElement textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea12.sendKeys("Dapatkan 80 petunjuk");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
//	WebElement inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField13.sendKeys("Ottieni 80 suggerimenti");
//								    	 								    
//WebElement textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea13.sendKeys("Ottieni 80 suggerimenti");
//
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
//		WebElement inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField14.sendKeys("80のヒントを得る");
//								    	 								    
//WebElement textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea14.sendKeys("80のヒントを得る");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
//	WebElement inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField15.sendKeys("힌트 80개 받기");
//								    	 								    
//WebElement textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea15.sendKeys("힌트 80개 받기");
//	
//	Thread.sleep(50);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
//	WebElement inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField16.sendKeys("Dapatkan 80 petunjuk");
//								    	 								    
//WebElement textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea16.sendKeys("Dapatkan 80 petunjuk");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
//	WebElement inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField17.sendKeys("Zdobądź 80 wskazówek");
//								    	 								    
//WebElement textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea17.sendKeys("Zdobądź 80 wskazówek");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
//	WebElement inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField18.sendKeys("Obtenha 80 dicas");
//								    	 								    
//WebElement textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea18.sendKeys("Obtenha 80 dicas");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
//	WebElement inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField19.sendKeys("Obțineți 80 de indicii");
//								    	 								    
//WebElement textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea19.sendKeys("Obțineți 80 de indicii");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
//	WebElement inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField21.sendKeys("Получить 80 подсказок");
//								    	 								    
//WebElement textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea21.sendKeys("Получить 80 подсказок");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
//	WebElement inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField20.sendKeys("Získajte 80 tipov");
//								    	 								    
//WebElement textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea20.sendKeys("Získajte 80 tipov");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
//	WebElement inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField22.sendKeys("Obtener 80 pistas");
//								    	 								    
//WebElement textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea22.sendKeys("Obtener 80 pistas");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
//	WebElement inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField23.sendKeys("Få 80 tips");
//								    	 								    
//WebElement textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea23.sendKeys("Få 80 tips");
//	
//	Thread.sleep(300);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
//	WebElement inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	           inputField24.sendKeys("รับ 80 คำใบ้");
//								    	 								    
//      WebElement textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	             textArea24.sendKeys("รับ 80 คำใบ้");
//	
//	           Thread.sleep(300);
//	             WebDriverWait(driver,50); 
//	             dropdownTrigger.click();
//	         	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
//	WebElement inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//    inputField25.sendKeys("80 ipucu al");
//						    	 								    
//WebElement textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      textArea25.sendKeys("80 ipucu al");
//	
//	
//      WebDriverWait(driver,50); 
//      dropdownTrigger.click();
//    	Thread.sleep(300);
//	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
//	WebElement inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//    inputField26.sendKeys("Nhận 80 gợi ý");
//						    	 								    
//WebElement textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      textArea26.sendKeys("Nhận 80 gợi ý");
//
//  
//      Thread.sleep(30000000);    
    
    
    
    
    
    
    
    
    
    
       
       
       
       
       

       
       
       
       
       
       
       
       
       
       
       
    
    
    
    
    
    
    
    
    
    
    
    
  
    
//    // GET 2Hours


 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//  // GET 1Hours
  WebDriverWait wait1  = new WebDriverWait(driver,50);
  WebElement dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
		    )); dropdownTrigger.click();

		    WebDriverWait(driver,15);   
		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
 WebElement inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
		    inputField.sendKeys("احصل على 1 ساعات غير محدودة");
		    
 WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
		    	textArea.sendKeys("احصل على 1 ساعات غير محدودة");
		    	
		    	WebDriverWait(driver,50);  
	   	 dropdownTrigger.click();
     	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
 WebElement inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
				    inputField1.sendKeys("1 小时无限畅享");
				    
 WebElement textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
				    	textArea1.sendKeys("1 小时无限畅享");
		    
				    	WebDriverWait(driver,50); 
				    	dropdownTrigger.click();
		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
WebElement inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
								    inputField11.sendKeys("1 小時無限暢享");
								    
WebElement textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
								    	textArea11.sendKeys("1 小時無限暢享");    
				
								    	WebDriverWait(driver,50); 
								    	dropdownTrigger.click();				    	   
		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
 		 WebElement inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField111.sendKeys("získat neomezeně po dobu 1 hodin");
								    	 								    
 WebElement textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
 	textArea111.sendKeys("získat neomezeně po dobu 1 hodin");    
		
 	WebDriverWait(driver,50); 
 	dropdownTrigger.click();
	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
	 WebElement inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField2.sendKeys("få ubegrænset i 1 timer");
		
WebElement textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea2.sendKeys("få ubegrænset i 1 timer");   								  
	
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
	 WebElement inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField3.sendKeys("krijg onbeperkt voor 1 uur");

WebElement textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea3.sendKeys("krijg onbeperkt voor 1 uur");								    	

	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
	WebElement inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField4.sendKeys("saada rajattomasti 1 tuntia");
								    	 								    
WebElement textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea4.sendKeys("saada rajattomasti 1 tuntia");								    	
	
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
	WebElement inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField5.sendKeys("obtenez un accès illimité pendant 1 heures");
								    	 								    
WebElement textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea5.sendKeys("obtenez un accès illimité pendant 1 heures");				
	
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
	WebElement inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField6.sendKeys("1 Stunden unbegrenzt nutzen");
								    	 								    
WebElement textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea6.sendKeys("1 Stunden unbegrenzt nutzen");
	
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
	WebElement inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField7.sendKeys("πάρτε απεριόριστο για 1 ώρες");
								    	 								    
WebElement textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea7.sendKeys("πάρτε απεριόριστο για 1 ώρες");
	
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
	WebElement inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField8.sendKeys("קבל ללא הגבלה למשך 1 שעות");
								    	 								    
WebElement textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea8.sendKeys("קבל ללא הגבלה למשך 1 שעות");
	
	Thread.sleep(2000);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(50);
	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
	WebElement inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField9.sendKeys("1 घंटे तक अनलिमिटेड पाएं");
								    	 								    
WebElement textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea9.sendKeys("1 घंटे तक अनलिमिटेड पाएं");
	
	Thread.sleep(50);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
	WebElement inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField10.sendKeys("korlátlanul 1 órán keresztül");
								    	 								    
WebElement textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea10.sendKeys("korlátlanul 1 órán keresztül");
	
	Thread.sleep(350);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
	WebElement inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField12.sendKeys("dapatkan unlimited selama 1 jam");
								    	 								    
WebElement textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea12.sendKeys("dapatkan unlimited selama 1 jam");
	
	Thread.sleep(350);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
	WebElement inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField13.sendKeys("ottieni illimitato per 1 ore");
								    	 								    
WebElement textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea13.sendKeys("ottieni illimitato per 1 ore");

	Thread.sleep(350);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
		WebElement inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField14.sendKeys("1時間無制限");
								    	 								    
WebElement textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea14.sendKeys("1時間無制限");
	
	Thread.sleep(350);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
	WebElement inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField15.sendKeys("1시간 동안 무제한으로 이용하세요");
								    	 								    
WebElement textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea15.sendKeys("1시간 동안 무제한으로 이용하세요");
	
	Thread.sleep(50);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
	WebElement inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField16.sendKeys("dapatkan tanpa had selama 1 jam");
								    	 								    
WebElement textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea16.sendKeys("dapatkan tanpa had selama 1 jam");
	
	Thread.sleep(350);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
	WebElement inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField17.sendKeys("otrzymaj nieograniczony dostęp przez 1 godzin");
								    	 								    
WebElement textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea17.sendKeys("otrzymaj nieograniczony dostęp przez 1 godzin");
	
	Thread.sleep(350);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
	WebElement inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField18.sendKeys("ganhe ilimitado por 1 horas");
								    	 								    
WebElement textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea18.sendKeys("ganhe ilimitado por 1 horas");
	
	Thread.sleep(350);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
	WebElement inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField19.sendKeys("obțineți nelimitat timp de 1 ore");
								    	 								    
WebElement textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea19.sendKeys("obțineți nelimitat timp de 1 ore");
	
	Thread.sleep(350);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
	WebElement inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField21.sendKeys("получить безлимит на 1 часов");
								    	 								    
WebElement textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea21.sendKeys("получить безлимит на 1 часов");
	
	Thread.sleep(350);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
	WebElement inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField20.sendKeys("získajte neobmedzené množstvo na 1 hodín");
								    	 								    
WebElement textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea20.sendKeys("získajte neobmedzené množstvo na 1 hodín");
	
	Thread.sleep(350);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
	WebElement inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField22.sendKeys("Obtén acceso ilimitado por 1 horas");
								    	 								    
WebElement textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea22.sendKeys("Obtén acceso ilimitado por 1 horas");
	
	Thread.sleep(350);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
	WebElement inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	  inputField23.sendKeys("få obegränsat i 1 timmar");
								    	 								    
WebElement textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	textArea23.sendKeys("få obegränsat i 1 timmar");
	
	Thread.sleep(350);
	WebDriverWait(driver,50); 
	dropdownTrigger.click();
	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
	WebElement inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
	           inputField24.sendKeys("ได้ไม่จำกัด 1 ชั่วโมง");
								    	 								    
      WebElement textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
	             textArea24.sendKeys("ได้ไม่จำกัด 1 ชั่วโมง");
	
	           Thread.sleep(350);
	             WebDriverWait(driver,50); 
	             dropdownTrigger.click();
	         	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
	WebElement inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
    inputField25.sendKeys("1 saat boyunca sınırsız kullanabilirsiniz");
						    	 								    
WebElement textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
      textArea25.sendKeys("1 saat boyunca sınırsız kullanabilirsiniz");
	
	
      WebDriverWait(driver,50); 
      dropdownTrigger.click();
    	Thread.sleep(350);
	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
	WebElement inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
    inputField26.sendKeys("nhận được không giới hạn trong 1 giờ");
						    	 								    
WebElement textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
      textArea26.sendKeys("nhận được không giới hạn trong 1 giờ");

      driver.findElement(By.xpath("//div[normalize-space(text())='Save changes']")).click();

    
    
    
    
        
    
    
   
//    
//    // GET 30 min

    
    
    
    
    
    
// // GET COIN 350 
//  WebDriverWait wait1  = new WebDriverWait(driver,50);
//  WebElement dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
//		    )); dropdownTrigger.click();
//
//		    WebDriverWait(driver,15);   
//		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
// WebElement inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//		    inputField.sendKeys("احصل على 350 قطعة نقدية");
//		    
// WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//		    	textArea.sendKeys("احصل على 350 قطعة نقدية");
//		    	
//		    	WebDriverWait(driver,50);  
//	   	 dropdownTrigger.click();
//     	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
// WebElement inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//				    inputField1.sendKeys("获得 350 枚硬币");
//				    
// WebElement textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//				    	textArea1.sendKeys("获得 350 枚硬币");
//		    
//				    	WebDriverWait(driver,50); 
//				    	dropdownTrigger.click();
//		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
//WebElement inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//								    inputField11.sendKeys("獲得 350 枚硬幣");
//								    
//WebElement textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//								    	textArea11.sendKeys("獲得 350 枚硬幣");    
//				
//								    	WebDriverWait(driver,50); 
//								    	dropdownTrigger.click();				    	   
//		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
// 		 WebElement inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField111.sendKeys("Získejte 350 mincí");
//								    	 								    
// WebElement textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea111.sendKeys("Získejte 350 mincí");    
//		
// 	WebDriverWait(driver,50); 
// 	dropdownTrigger.click();
//	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
//	 WebElement inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField2.sendKeys("Få 350 mønter");
//		
//WebElement textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea2.sendKeys("Få 350 mønter");   								  
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
//	 WebElement inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField3.sendKeys("Ontvang 350 munten");
//
//WebElement textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea3.sendKeys("Ontvang 350 munten");								    	
//
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
//	WebElement inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField4.sendKeys("Hanki 350 kolikkoa");
//								    	 								    
//WebElement textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea4.sendKeys("Hanki 350 kolikkoa");								    	
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
//	WebElement inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField5.sendKeys("Obtenez 350 pièces");
//								    	 								    
//WebElement textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea5.sendKeys("Obtenez 350 pièces");				
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
//	WebElement inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField6.sendKeys("Erhalte 350 Münzen");
//								    	 								    
//WebElement textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea6.sendKeys("Erhalte 350 Münzen");
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
//	WebElement inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField7.sendKeys("Πάρτε 350 νομίσματα");
//								    	 								    
//WebElement textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea7.sendKeys("Πάρτε 350 νομίσματα");
//	
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
//	WebElement inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField8.sendKeys("קבל 350 מטבעות");
//								    	 								    
//WebElement textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea8.sendKeys("קבל 350 מטבעות");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
//	WebElement inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField9.sendKeys("350 सिक्के पाएं");
//								    	 								    
//WebElement textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea9.sendKeys("350 सिक्के पाएं");
//	
//	Thread.sleep(50);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
//	WebElement inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField10.sendKeys("Szerezz 350 érmét");
//								    	 								    
//WebElement textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea10.sendKeys("Szerezz 350 érmét");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
//	WebElement inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField12.sendKeys("Dapatkan 350 Koin");
//								    	 								    
//WebElement textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea12.sendKeys("Dapatkan 350 Koin");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
//	WebElement inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField13.sendKeys("Ottieni 350 monete");
//								    	 								    
//WebElement textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea13.sendKeys("Ottieni 350 monete");
//
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
//		WebElement inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField14.sendKeys("350コインを獲得");
//								    	 								    
//WebElement textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea14.sendKeys("350コインを獲得");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
//	WebElement inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField15.sendKeys("350개의 코인을 얻으세요");
//								    	 								    
//WebElement textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea15.sendKeys("350개의 코인을 얻으세요");
//	
//	Thread.sleep(50);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
//	WebElement inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField16.sendKeys("Dapatkan 350 Syiling");
//								    	 								    
//WebElement textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea16.sendKeys("Dapatkan 350 Syiling");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
//	WebElement inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField17.sendKeys("Zdobądź 350 monet");
//								    	 								    
//WebElement textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea17.sendKeys("Zdobądź 350 monet");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
//	WebElement inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField18.sendKeys("Ganhe 350 moedas");
//								    	 								    
//WebElement textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea18.sendKeys("Ganhe 350 moedas");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
//	WebElement inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField19.sendKeys("Obțineți 350 de monede");
//								    	 								    
//WebElement textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea19.sendKeys("Obțineți 350 de monede");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
//	WebElement inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField21.sendKeys("Получите 350 монет");
//								    	 								    
//WebElement textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea21.sendKeys("Получите 350 монет");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
//	WebElement inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField20.sendKeys("Získajte 350 mincí");
//								    	 								    
//WebElement textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea20.sendKeys("Získajte 350 mincí");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
//	WebElement inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField22.sendKeys("Consigue 350 monedas");
//								    	 								    
//WebElement textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea22.sendKeys("Consigue 350 monedas");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
//	WebElement inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField23.sendKeys("Få 350 mynt");
//								    	 								    
//WebElement textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea23.sendKeys("Få 350 mynt");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
//	WebElement inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	           inputField24.sendKeys("รับ 350 เหรียญ");
//								    	 								    
//      WebElement textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	             textArea24.sendKeys("รับ 350 เหรียญ");
//	
//	           Thread.sleep(350);
//	             WebDriverWait(driver,50); 
//	             dropdownTrigger.click();
//	         	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
//	WebElement inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//    inputField25.sendKeys("350 Jeton Alın");
//						    	 								    
//WebElement textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      textArea25.sendKeys("350 Jeton Alın");
//	
//	
//      WebDriverWait(driver,50); 
//      dropdownTrigger.click();
//    	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
//	WebElement inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//    inputField26.sendKeys("Nhận 350 xu");
//						    	 								    
//WebElement textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      textArea26.sendKeys("Nhận 350 xu");
//
//  
//      Thread.sleep(30000000);
  
  

    
    
    
    
    
    
    
    

// // GET COIN 700
  
        
        
      
    
    
    
    
    

        
        
        
        
        
        
        
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
 
    
    
    
    
    
    

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
        
        
        
    
    
    
    
    
    
    
    
    

    
      
       // Get 275 Coins + 5 Keys
    
//        WebDriverWait wait1  = new WebDriverWait(driver,50);
//        WebElement dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
//      		    )); dropdownTrigger.click();
//
//      		    WebDriverWait(driver,15);   
//      		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
//       WebElement inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      		    inputField.sendKeys("احصل على 275 عملة + 5 مفاتيحة");
//      		    
//       WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      		    	textArea.sendKeys("احصل على 275 عملة + 5 مفاتيح");
//      		    	
//      		    	WebDriverWait(driver,50);  
//      	   	 dropdownTrigger.click();
//           	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
//       WebElement inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      				    inputField1.sendKeys("获得 275 枚硬币 + 5 把钥匙");
//      				    
//       WebElement textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      				    	textArea1.sendKeys("获得 275 枚硬币 + 5 把钥匙");
//      		    
//      				    	WebDriverWait(driver,50); 
//      				    	dropdownTrigger.click();
//      		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
//      WebElement inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      								    inputField11.sendKeys("獲得 275 枚硬幣 + 5 把鑰匙");
//      								    
//      WebElement textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      								    	textArea11.sendKeys("獲得 275 枚硬幣 + 5 把鑰匙");    
//      				
//      								    	WebDriverWait(driver,50); 
//      								    	dropdownTrigger.click();				    	   
//      		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
//       		 WebElement inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField111.sendKeys("Získejte 275 mincí + 5 klíčů");
//      								    	 								    
//       WebElement textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//       	textArea111.sendKeys("Získejte 275 mincí + 5 klíčů");    
//      		
//       	WebDriverWait(driver,50); 
//       	dropdownTrigger.click();
//      	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
//      	 WebElement inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField2.sendKeys("Få 275 mønter + 5 nøgler");
//      		
//      WebElement textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea2.sendKeys("Få 275 mønter + 5 nøgler");   								  
//      	
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
//      	 WebElement inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField3.sendKeys("Ontvang 275 munten + 5 sleutels");
//
//      WebElement textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea3.sendKeys("Ontvang 275 munten + 5 sleutels");								    	
//
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
//      	WebElement inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField4.sendKeys("Hanki 275 kolikkoa + 5 avainta");
//      								    	 								    
//      WebElement textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea4.sendKeys("Hanki 275 kolikkoa + 5 avainta");								    	
//      	
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
//      	WebElement inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField5.sendKeys("Obtenez 275 pièces + 5 clés");
//      								    	 								    
//      WebElement textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea5.sendKeys("Obtenez 275 pièces + 5 clés");				
//      	
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
//      	WebElement inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField6.sendKeys("Erhalte 275 Münzen + 5 Schlüssel");
//      								    	 								    
//      WebElement textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea6.sendKeys("Erhalte 275 Münzen + 5 Schlüssel");
//      	
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
//      	WebElement inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField7.sendKeys("Αποκτήστε 275 νομίσματα + 5 κλειδιά");
//      								    	 								    
//      WebElement textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea7.sendKeys("Αποκτήστε 275 νομίσματα + 5 κλειδιά");
//      	
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
//      	WebElement inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField8.sendKeys("קבל 275 מטבעות + 5 מפתחות");
//      								    	 								    
//      WebElement textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea8.sendKeys("קבל 275 מטבעות + 5 מפתחות");
//      	
//      	Thread.sleep(2000);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(50);
//      	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
//      	WebElement inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField9.sendKeys("275 सिक्के + 5 कुंजियाँ प्राप्त करें");
//      								    	 								    
//      WebElement textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea9.sendKeys("275 सिक्के + 5 कुंजियाँ प्राप्त करें");
//      	
//      	Thread.sleep(50);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
//      	WebElement inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField10.sendKeys("Szerezzen 275 érmét + 5 kulcsot");
//      								    	 								    
//      WebElement textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea10.sendKeys("Szerezzen 275 érmét + 5 kulcsot");
//      	
//      	Thread.sleep(300);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
//      	WebElement inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField12.sendKeys("Dapatkan 275 Koin + 5 Kunci");
//      								    	 								    
//      WebElement textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea12.sendKeys("Dapatkan 275 Koin + 5 Kunci");
//      	
//      	Thread.sleep(300);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
//      	WebElement inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField13.sendKeys("Ottieni 275 monete + 5 chiavi");
//      								    	 								    
//      WebElement textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea13.sendKeys("Ottieni 275 monete + 5 chiavi");
//
//      	Thread.sleep(300);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
//      		WebElement inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField14.sendKeys("275枚のコインと5個の鍵を入手");
//      								    	 								    
//      WebElement textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea14.sendKeys("275枚のコインと5個の鍵を入手");
//      	
//      	Thread.sleep(300);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
//      	WebElement inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField15.sendKeys("275개의 코인과 5개의 열쇠를 얻으세요");
//      								    	 								    
//      WebElement textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea15.sendKeys("275개의 코인과 5개의 열쇠를 얻으세요");
//      	
//      	Thread.sleep(50);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
//      	WebElement inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField16.sendKeys("Dapatkan 275 Syiling + 5 Kunci");
//      								    	 								    
//      WebElement textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea16.sendKeys("Dapatkan 275 Syiling + 5 Kunci");
//      	
//      	Thread.sleep(300);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
//      	WebElement inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField17.sendKeys("Zdobądź 275 monet + 5 kluczy");
//      								    	 								    
//      WebElement textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea17.sendKeys("Zdobądź 275 monet + 5 kluczy");
//      	
//      	Thread.sleep(300);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
//      	WebElement inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField18.sendKeys("Ganhe 275 moedas + 5 chaves");
//      								    	 								    
//      WebElement textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea18.sendKeys("Ganhe 275 moedas + 5 chaves");
//      	
//      	Thread.sleep(300);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
//      	WebElement inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField19.sendKeys("Obțineți 275 de monede + 5 chei");
//      								    	 								    
//      WebElement textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea19.sendKeys("Obțineți 275 de monede + 5 chei");
//      	
//      	Thread.sleep(300);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
//      	WebElement inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField21.sendKeys("Получите 275 монет + 5 ключей");
//      								    	 								    
//      WebElement textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea21.sendKeys("Получите 275 монет + 5 ключей");
//      	
//      	Thread.sleep(300);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
//      	WebElement inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField20.sendKeys("Získajte 275 mincí + 5 kľúčov");
//      								    	 								    
//      WebElement textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea20.sendKeys("Získajte 275 mincí + 5 kľúčov");
//      	
//      	Thread.sleep(300);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
//      	WebElement inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField22.sendKeys("Consigue 275 monedas + 5 llaves");
//      								    	 								    
//      WebElement textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea22.sendKeys("Consigue 275 monedas + 5 llaves");
//      	
//      	Thread.sleep(300);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
//      	WebElement inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	  inputField23.sendKeys("Få 275 mynt + 5 nycklar");
//      								    	 								    
//      WebElement textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	textArea23.sendKeys("Få 275 mynt + 5 nycklar");
//      	
//      	Thread.sleep(300);
//      	WebDriverWait(driver,50); 
//      	dropdownTrigger.click();
//      	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
//      	WebElement inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//      	           inputField24.sendKeys("รับ 275 เหรียญ + 5 กุญแจ");
//      								    	 								    
//            WebElement textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      	             textArea24.sendKeys("รับ 275 เหรียญ + 5 กุญแจ");
//      	
//      	           Thread.sleep(300);
//      	             WebDriverWait(driver,50); 
//      	             dropdownTrigger.click();
//      	         	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
//      	WebElement inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//          inputField25.sendKeys("275 Jeton + 5 Anahtar Al");
//      						    	 								    
//      WebElement textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//            textArea25.sendKeys("275 Jeton + 5 Anahtar Al");
//      	
//      	
//            WebDriverWait(driver,50); 
//            dropdownTrigger.click();
//          	Thread.sleep(300);
//      	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
//      	WebElement inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//          inputField26.sendKeys("Nhận 275 xu + 5 chìa khóa");
//      						    	 								    
//      WebElement textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//            textArea26.sendKeys("Nhận 275 xu + 5 chìa khóa");
//
//        
//            Thread.sleep(30000000);
//    
    
    
    
    
    
    
    
    
    
  /// DOUBLE REWARD
//  WebDriverWait wait1  = new WebDriverWait(driver,30);
//  WebElement dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
//		    )); dropdownTrigger.click();
//
//		    WebDriverWait(driver,15);   
//		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
// WebElement inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//		    inputField.sendKeys("احصل على ضعف المكافآت");
//		    
// WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//		    	textArea.sendKeys("احصل على ضعف المكافآت");
//		    	
//		    	WebDriverWait(driver,10);  
//	   	 dropdownTrigger.click();
//     	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
// WebElement inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//				    inputField1.sendKeys("ا获得双倍奖励");
//				    
// WebElement textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//				    	textArea1.sendKeys("ا获得双倍奖励");
//		    
//				    	WebDriverWait(driver,10); 
//				    	dropdownTrigger.click();
//		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
//WebElement inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//								    inputField11.sendKeys("獲得雙倍獎勵");
//								    
//WebElement textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//								    	textArea11.sendKeys("獲得雙倍獎勵");    
//				
//								    	WebDriverWait(driver,10); 
//								    	dropdownTrigger.click();				    	   
//		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
// 		 WebElement inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField111.sendKeys("Získejte dvojnásobek odměn");
//								    	 								    
// WebElement textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea111.sendKeys("Získejte dvojnásobek odměn");    
//		
// 	WebDriverWait(driver,10); 
// 	dropdownTrigger.click();
//	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
//	 WebElement inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField2.sendKeys("Få dobbelte belønninger");
//		
//WebElement textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea2.sendKeys("Få dobbelte belønninger");   								  
//	
//	WebDriverWait(driver,10); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
//	 WebElement inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField3.sendKeys("Krijg dubbele beloningen");
//
//WebElement textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea3.sendKeys("Krijg dubbele beloningen");								    	
//
//	WebDriverWait(driver,10); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
//	WebElement inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField4.sendKeys("Hanki kaksinkertainen palkinto");
//								    	 								    
//WebElement textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea4.sendKeys("Hanki kaksinkertainen palkinto");								    	
//	
//	WebDriverWait(driver,10); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
//	WebElement inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField5.sendKeys("Obtenez le double de récompenses");
//								    	 								    
//WebElement textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea5.sendKeys("Obtenez le double de récompenses");				
//	
//	WebDriverWait(driver,10); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
//	WebElement inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField6.sendKeys("Holen Sie sich die doppelte Belohnung");
//								    	 								    
//WebElement textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea6.sendKeys("Holen Sie sich die doppelte Belohnung");
//	
//	WebDriverWait(driver,10); 
//	dropdownTrigger.click();
//	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
//	WebElement inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField7.sendKeys("Αποκτήστε διπλάσια ανταμοιβή");
//								    	 								    
//WebElement textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea7.sendKeys("Αποκτήστε διπλάσια ανταμοιβή");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
//	WebElement inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField8.sendKeys("קבל כפול את התגמולים");
//								    	 								    
//WebElement textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea8.sendKeys("קבל כפול את התגמולים");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
//	WebElement inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField9.sendKeys("दोगुना इनाम पाएं");
//								    	 								    
//WebElement textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea9.sendKeys("दोगुना इनाम पाएं");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
//	WebElement inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField10.sendKeys("Ingyenes hirdetések");
//								    	 								    
//WebElement textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea10.sendKeys("Ingyenes hirdetések");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
//	WebElement inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField12.sendKeys("Dapatkan Iklan Gratis");
//								    	 								    
//WebElement textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea12.sendKeys("Dapatkan Iklan Gratis");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
//	WebElement inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField13.sendKeys("Ottieni annunci gratuiti");
//								    	 								    
//WebElement textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea13.sendKeys("Ottieni annunci gratuiti");
//
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
//		WebElement inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField14.sendKeys("広告を無料でゲット");
//								    	 								    
//WebElement textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea14.sendKeys("広告を無料でゲット");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
//	WebElement inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField15.sendKeys("광고 없이 보기");
//								    	 								    
//WebElement textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea15.sendKeys("광고 없이 보기");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
//	WebElement inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField16.sendKeys("Dapatkan Iklan Percuma");
//								    	 								    
//WebElement textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea16.sendKeys("Dapatkan Iklan Percuma");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
//	WebElement inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField17.sendKeys("Uzyskaj reklamy za darmo");
//								    	 								    
//WebElement textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea17.sendKeys("Uzyskaj reklamy za darmo");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
//	WebElement inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField18.sendKeys("Obtenha anúncios grátis");
//								    	 								    
//WebElement textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea18.sendKeys("Obtenha anúncios grátis");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
//	WebElement inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField19.sendKeys("Obțineți reclame gratuit");
//								    	 								    
//WebElement textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea19.sendKeys("Obțineți reclame gratuit");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
//	WebElement inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField21.sendKeys("Получите бесплатную рекламу");
//								    	 								    
//WebElement textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea21.sendKeys("Получите бесплатную рекламу");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
//	WebElement inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField20.sendKeys("Získajte reklamy zadarmo");
//								    	 								    
//WebElement textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea20.sendKeys("Získajte reklamy zadarmo");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
//	WebElement inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField22.sendKeys("Obtenga anuncios gratis");
//								    	 								    
//WebElement textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea22.sendKeys("Obtenga anuncios gratis");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
//	WebElement inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField23.sendKeys("Få annonser gratis");
//								    	 								    
//WebElement textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea23.sendKeys("Få annonser gratis");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
//	WebElement inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	           inputField24.sendKeys("รับโฆษณาฟรี");
//								    	 								    
//      WebElement textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	             textArea24.sendKeys("รับโฆษณาฟรี");
//	
//	         	Thread.sleep(2000);
//	        	WebDriverWait(driver,50); 
//	        	dropdownTrigger.click();
//	        	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
//	WebElement inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//    inputField25.sendKeys("Reklamları Ücretsiz Alın");
//						    	 								    
//WebElement textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      textArea25.sendKeys("Reklamları Ücretsiz Alın");
//	
//	
//  	Thread.sleep(2000);
//  	WebDriverWait(driver,50); 
//  	dropdownTrigger.click();
//  	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
//	WebElement inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//    inputField26.sendKeys("Nhận Quảng cáo miễn phí");
//						    	 								    
//WebElement textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      textArea26.sendKeys("Nhận Quảng cáo miễn phí");

  
 
    
    
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

      				    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
//  WebDriverWait wait1  = new WebDriverWait(driver,50);
//  WebElement dropdownTrigger = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='button' and .//i[text()='arrow_drop_down']]")
//		    )); dropdownTrigger.click();
//
//		    WebDriverWait(driver,15);   
//		    driver.findElement(By.xpath("//span[text()='Arabic – ar']")).click();
// WebElement inputField = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//		    inputField.sendKeys("احصل على 70قطعة نقدية");
//		    
// WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//		    	textArea.sendKeys("احصل على 70قطعة نقدية");
//		    	
//		    	Thread.sleep(350);
//	             WebDriverWait(driver,50); 
//	             dropdownTrigger.click();
//	         	Thread.sleep(350);
//     	 driver.findElement(By.xpath("//span[text()='Chinese (Simplified) – zh-CN']")).click();
// WebElement inputField1 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//				    inputField1.sendKeys("获得 70枚硬币");
//				    
// WebElement textArea1 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//				    	textArea1.sendKeys("获得 70枚硬币");
//		    
//				    	Thread.sleep(350);
//			             WebDriverWait(driver,50); 
//			             dropdownTrigger.click();
//			         	Thread.sleep(350);
//		 driver.findElement(By.xpath("//span[text()='Chinese (Traditional) – zh-TW']")).click();
//WebElement inputField11 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//								    inputField11.sendKeys("獲得 70枚硬幣");
//								    
//WebElement textArea11 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//								    	textArea11.sendKeys("獲得 70 枚硬幣");    
//				
//								    	Thread.sleep(350);
//							             WebDriverWait(driver,50); 
//							             dropdownTrigger.click();
//							         	Thread.sleep(350);				    	   
//		     driver.findElement(By.xpath("//span[text()='Czech – cs-CZ']")).click();
// 		 WebElement inputField111 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField111.sendKeys("Získejte 70 mincí");
//								    	 								    
// WebElement textArea111 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
// 	textArea111.sendKeys("Získejte 70 mincí");    
//		
// 	Thread.sleep(350);
//    WebDriverWait(driver,50); 
//    dropdownTrigger.click();
//	Thread.sleep(350);
//	 driver.findElement(By.xpath("//span[text()='Danish – da-DK']")).click();
//	 WebElement inputField2 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField2.sendKeys("Få 70 mønter");
//		
//WebElement textArea2 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea2.sendKeys("Få 70 mønter");   								  
//	
//	Thread.sleep(350);
//    WebDriverWait(driver,50); 
//    dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Dutch – nl-NL']")).click();
//	 WebElement inputField3 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField3.sendKeys("Ontvang 70 munten");
//
//WebElement textArea3 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea3.sendKeys("Ontvang 70 munten");								    	
//
//	Thread.sleep(350);
//    WebDriverWait(driver,50); 
//    dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Finnish – fi-FI']")).click();
//	WebElement inputField4 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField4.sendKeys("Hanki 70 kolikkoa");
//								    	 								    
//WebElement textArea4 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea4.sendKeys("Hanki 70 kolikkoa");								    	
//	
//	Thread.sleep(350);
//    WebDriverWait(driver,50); 
//    dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='French (France) – fr-FR']")).click();
//	WebElement inputField5 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField5.sendKeys("Obtenez 70 pièces");
//								    	 								    
//WebElement textArea5 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea5.sendKeys("Obtenez 70 pièces");				
//	
//	Thread.sleep(350);
//    WebDriverWait(driver,50); 
//    dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='German – de-DE']")).click();
//	WebElement inputField6 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField6.sendKeys("Erhalte 70 Münzen");
//								    	 								    
//WebElement textArea6 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea6.sendKeys("Erhalte 70 Münzen");
//	
//	Thread.sleep(350);
//    WebDriverWait(driver,50); 
//    dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Greek – el-GR']")).click();
//	WebElement inputField7 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField7.sendKeys("Πάρτε 70 νομίσματα");
//								    	 								    
//WebElement textArea7 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea7.sendKeys("Πάρτε 70 νομίσματα");
//	
//	Thread.sleep(350);
//    WebDriverWait(driver,50); 
//    dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Hebrew – iw-IL']")).click();
//	WebElement inputField8 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField8.sendKeys("קבל 70 מטבעות");
//								    	 								    
//WebElement textArea8 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea8.sendKeys("קבל 70 מטבעות");
//	
//	Thread.sleep(2000);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(50);
//	driver.findElement(By.xpath("//span[text()='Hindi – hi-IN']")).click();
//	WebElement inputField9 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField9.sendKeys("70 सिक्के पाएं");
//								    	 								    
//WebElement textArea9 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea9.sendKeys("70 सिक्के पाएं");
//	
//	Thread.sleep(50);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Hungarian – hu-HU']")).click();
//	WebElement inputField10 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField10.sendKeys("Szerezz 70 érmét");
//								    	 								    
//WebElement textArea10 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea10.sendKeys("Szerezz 70 érmét");
//	
//	Thread.sleep(350);
//    WebDriverWait(driver,50); 
//    dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Indonesian – id']")).click();
//	WebElement inputField12 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField12.sendKeys("Dapatkan 70 Koin");
//								    	 								    
//WebElement textArea12 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea12.sendKeys("Dapatkan 70 Koin");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Italian – it-IT']")).click();
//	WebElement inputField13 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField13.sendKeys("Ottieni 70 monete");
//								    	 								    
//WebElement textArea13 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea13.sendKeys("Ottieni 70 monete");
//
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Japanese – ja-JP']")).click();
//		WebElement inputField14 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField14.sendKeys("70コインを獲得");
//								    	 								    
//WebElement textArea14 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea14.sendKeys("70コインを獲得");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Korean – ko-KR']")).click();
//	WebElement inputField15 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField15.sendKeys("70개의 코인을 얻으세요");
//								    	 								    
//WebElement textArea15 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea15.sendKeys("70개의 코인을 얻으세요");
//	
//	Thread.sleep(50);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Malay – ms']")).click();
//	WebElement inputField16 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField16.sendKeys("Dapatkan 70 Syiling");
//								    	 								    
//WebElement textArea16 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea16.sendKeys("Dapatkan 70 Syiling");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Polish – pl-PL']")).click();
//	WebElement inputField17 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField17.sendKeys("Zdobądź 70 monet");
//								    	 								    
//WebElement textArea17 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea17.sendKeys("Zdobądź 70 monet");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Portuguese (Portugal) – pt-PT']")).click();
//	WebElement inputField18 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField18.sendKeys("Ganhe 70 moedas");
//								    	 								    
//WebElement textArea18 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea18.sendKeys("Ganhe 70 moedas");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Romanian – ro']")).click();
//	WebElement inputField19 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField19.sendKeys("Obțineți 70 de monede");
//								    	 								    
//WebElement textArea19 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea19.sendKeys("Obțineți 70 de monede");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Russian – ru-RU']")).click();
//	WebElement inputField21 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField21.sendKeys("Получите 70 монет");
//								    	 								    
//WebElement textArea21 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea21.sendKeys("Получите 70 монет");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Slovak – sk']")).click();
//	WebElement inputField20 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField20.sendKeys("Získajte 70 mincí");
//								    	 								    
//WebElement textArea20 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea20.sendKeys("Získajte 70 mincí");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Spanish (Spain) – es-ES']")).click();
//	WebElement inputField22 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField22.sendKeys("Consigue 70 monedas");
//								    	 								    
//WebElement textArea22 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea22.sendKeys("Consigue 70 monedas");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Swedish – sv-SE']")).click();
//	WebElement inputField23 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	  inputField23.sendKeys("Få 70 mynt");
//								    	 								    
//WebElement textArea23 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	textArea23.sendKeys("Få 70 mynt");
//	
//	Thread.sleep(350);
//	WebDriverWait(driver,50); 
//	dropdownTrigger.click();
//	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Thai – th']")).click();
//	WebElement inputField24 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//	           inputField24.sendKeys("รับ 70 เหรียญ");
//								    	 								    
//      WebElement textArea24 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//	             textArea24.sendKeys("รับ 70 เหรียญ");
//	
//	           Thread.sleep(350);
//	             WebDriverWait(driver,50); 
//	             dropdownTrigger.click();
//	         	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Turkish – tr-TR']")).click();
//	WebElement inputField25 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//    inputField25.sendKeys("70 Jeton Alın");
//						    	 								    
//WebElement textArea25 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      textArea25.sendKeys("70 Jeton Alın");
//	
//	
//      Thread.sleep(350);
//      WebDriverWait(driver,50); 
//      dropdownTrigger.click();
//  	Thread.sleep(350);
//	driver.findElement(By.xpath("//span[text()='Vietnamese – vi']")).click();	
//	WebElement inputField26 = driver.findElement(By.xpath("//input[@debugid='acx_264709916']"));
//    inputField26.sendKeys("Nhận 70 xu");
//						    	 								    
//WebElement textArea26 = driver.findElement( By.xpath("//textarea[contains(@class, 'mdc-text-field__input')]"));
//      textArea26.sendKeys("Nhận 70 xu");
//
//  
//      Thread.sleep(30000000);					    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
								    	
		    
		    
		    

	}

	private static void WebDriverWait(ChromeDriver driver, int i) {
		// TODO Auto-generated method stub
		
	}

}
