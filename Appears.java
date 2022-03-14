package week5.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Appears {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/appear.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Appear = driver.findElement(By.xpath("//button[@id='btn']"));
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(25));
		wait1.until(ExpectedConditions.visibilityOf(Appear));
		System.out.println(Appear.isDisplayed());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
	}

}
