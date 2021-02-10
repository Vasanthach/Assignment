package firstprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.goibibo.com/");
		driver.findElement(By.id("departureCalendar")).click();
		
		Thread.sleep(3000);
		
		
	}
}
