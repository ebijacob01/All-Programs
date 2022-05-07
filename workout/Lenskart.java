package workout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lenskart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebElement computerGlass=driver.findElement(By.xpath("//a[text()='COMPUTER GLASSES']"));
		type.moveToElement(computerGlass).perform();
		WebElement Kids=driver.findElement(By.xpath("(//span[text()='kids'])[2]"));
		type.moveToElement(Kids).perform();
		WebElement glass=driver.findElement(By.xpath("//span[text()='Kids Glasses']"));
		type.moveToElement(glass).perform();
		glass.click();

	}

}
