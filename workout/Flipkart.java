package workout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.performance.Performance.EnableTimeDomain;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Actions type=new Actions(driver);
		WebElement Fashion=driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		type.moveToElement(Fashion).perform();
		driver.findElement(By.linkText("Men's T-Shirts")).click();
		WebElement priceSort=driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[1]")); 
		type.dragAndDropBy(priceSort, 90, 0).perform();
		
		//java.util.List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		//System.out.println(price.size());
		
//		for (int i = 0; i<price.size(); i=i+1) 
//        {
//        System.out.print(price.get(i).getText());
//	        }
	}
}
