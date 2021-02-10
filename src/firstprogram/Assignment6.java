package firstprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		 * 
		 * String opt =
		 * driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]"))
		 * .getText(); System.out.println(opt);
		 * 
		 * WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		 * Select s = new Select(dropdown); s.selectByVisibleText(opt);
		 * 
		 * driver.findElement(By.name("enter-name")).sendKeys(opt);
		 * driver.findElement(By.id("alertbtn")).click();
		 * 
		 * String text = driver.switchTo().alert().getText();
		 * 
		 * if (text.contains(opt)) {
		 * 
		 * System.out.println("Success"); } else { System.out.println("error"); }
		 * 
		 * driver.switchTo().alert().accept();
		 */
		
		List<WebElement> chkBox = driver.findElements(By.xpath("//htmltag[@attribute='checkbox']"));

				for(int i=0; i<chkBox.size(); i++){

				chkBox.get(i).click();
				}
	}

}
