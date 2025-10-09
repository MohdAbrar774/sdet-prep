package demo02;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LocatorDemo {

	
	
	public static void main(String args[]) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.demoblaze.com/index.html");
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
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.linkText("Samsung galaxy s6")).click();
	
//	List<WebElement> hyperLink = driver.findElements(By.className("_1ch8e_"));
//	List<WebElement> hyperLink = driver.findElements(By.tagName("img"));
//	System.out.print("Here's the No. of images on the top:"+hyperLink.size());
}
}
