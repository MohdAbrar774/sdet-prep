package demo02;

import java.time.Duration;
import java.util.List;

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
	//driver.findElement(By.name("q")).sendKeys("Mac"); //enter Mac in search box
	
	
	//id
	//boolean isDisplay = driver.findElement(By.id("product-2")).isDisplayed();
	// System.out.print(isDisplay); 
	// isDisplay = driver.findElement(By.id("product-3")).isDisplayed();
	//System.out.print(isDisplay);
 
	//linkText
   // driver.findElement(By.className("_2iLD__")).click();   // click search button 
   // driver.findElement(By.className("DByuf4")).click();    //click on first mac product displayed	

  
	//partialLinkText  
	//driver.findElement(By.partialLinkText("AppleMacBookAIRAppleM2 - (16 GB/256 GB SSD/macOS Sequoia) MC7X4HN/A")).click();
	
	List<WebElement> hyperLink = driver.findElements(By.className("_1ch8e_"));
	System.out.print("Here's the No. of hyperLinks on the top:"+hyperLink.size());
}
}
