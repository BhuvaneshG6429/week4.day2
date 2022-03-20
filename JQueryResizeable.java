package assignment.weel4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryResizeable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://jqueryui.com/resizable/");
		//maximize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement frame = driver.findElement(By.xpath("//iframe[1]"));
		driver.switchTo().frame(frame);
		WebElement handle1 = driver.findElement(By.xpath("//div[@id='resizable']//div[3]"));
		WebElement handle2 = driver.findElement(By.xpath("//div[@id='resizable']//div[2]"));
		WebElement handle3 = driver.findElement(By.xpath("//div[@id='resizable']//div[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(handle1).clickAndHold(handle1).moveByOffset(100, 100).release(handle1).build().perform();
		action.moveToElement(handle2).clickAndHold(handle2).moveByOffset(0, 100).release(handle2).build().perform();
		action.moveToElement(handle3).clickAndHold(handle3).moveByOffset(100, 0).release(handle3).build().perform();
	}

}
