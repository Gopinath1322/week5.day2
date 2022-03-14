package week5.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextChanged {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.xpath("//button[@id='btn']"));
		WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(25));
		wait3.until(ExpectedConditions.textToBePresentInElement(text, "Click ME!"));
		text.click();
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
	}

}
