package week3.sundayAssaignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver type=new ChromeDriver(option);
		type.get("https://www.snapdeal.com/");
		type.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		type.manage().window().maximize();
		
		
        Actions builder=new Actions(type);
		
		WebElement men = type.findElement(By.xpath("//span[@class='catText']"));
		builder.moveToElement(men).perform();
		
		type.findElement(By.linkText("Sports Shoes")).click();
		
		String count=type.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		System.out.println(count);
		type.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		
		type.findElement(By.xpath("//span[@class='sort-label']")).click();
		type.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		
		type.findElement(By.name("fromVal")).clear();
		type.findElement(By.name("fromVal")).sendKeys("900");
		type.findElement(By.name("toVal")).clear();
		type.findElement(By.name("toVal")).sendKeys("1200");
		
		type.findElement(By.xpath("(//span[@class='filter-color-tile'])[5]")).click();
		WebElement men1 = type.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]"));
		builder.moveToElement(men1).perform();
		
		type.findElement(By.xpath("//div[@pogid='621868725223']")).click();
		
		
		
	}

}















