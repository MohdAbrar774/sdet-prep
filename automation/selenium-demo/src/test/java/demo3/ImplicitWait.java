package demo3;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImplicitWait {

	
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
		//This have to declared each time for wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		
		driver.close();
	}
}
