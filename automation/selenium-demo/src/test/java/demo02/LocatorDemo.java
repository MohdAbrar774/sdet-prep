package demo02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LocatorDemo {

	
	
	public static void main(String args[]) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");//flipkart open
	driver.manage().window().maximize();
	
	
	//name
	driver.findElement(By.name("q")).sendKeys("Mac"); //enter Mac in search box
	
	
	//id
	//boolean isDisplay = driver.findElement(By.id("product-2")).isDisplayed();
	// System.out.print(isDisplay); 
	// isDisplay = driver.findElement(By.id("product-3")).isDisplayed();
	//System.out.print(isDisplay);
 
	//linkText
    driver.findElement(By.className("_2iLD__")).click();   // click search button 
    driver.findElement(By.className("DByuf4")).click();    //click on first mac product displayed
    
	//driver.findElement(By.linkText("Login")).click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
	WebElement pincod = driver.findElement(By.id("pincodeInputId"));
	pincod.sendKeys("440012");
	
	driver.findElement(By.className("i40dM4")).click();
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	  WebElement resultMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nyRpc8")));

      // 6️⃣ Fetch and print text
      String message = resultMsg.getText();
      System.out.println("Availability Status: " + message);

      // 7️⃣ (Optional) Verify text
      //if (message.toLowerCase().contains("available")) {
      //    System.out.println("✅ Product is available for this pincode.");
    //  } else {
      //    System.out.println("❌ Product not available.");
   //   }
	//partialLinkText  
	//driver.findElement(By.partialLinkText("AppleMacBookAIRAppleM2 - (16 GB/256 GB SSD/macOS Sequoia) MC7X4HN/A")).click();
	
	}
}
