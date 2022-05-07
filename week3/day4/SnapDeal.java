package week3.day4;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver type=new ChromeDriver(option);
		type.get("https://www.snapdeal.com/");
		type.manage().window().maximize();
		type.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        Actions builder=new Actions(type);
		
		WebElement men = type.findElement(By.xpath("//span[@class='catText']"));
		builder.moveToElement(men).perform();
		
		type.findElement(By.linkText("Sports Shoes")).click();
		
		String count=type.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		System.out.println(count);
		type.findElement(By.xpath("(//div[@class=\"child-cat-name \"])[2]")).click();
		
		//ArrayList<String> name=new ArrayList<String>();
		java.util.List<WebElement> price = type.findElements(By.xpath("//span[@class=\"lfloat product-price\"]"));
		System.out.println(price.size());
	
		  for (int i = 0; i<price.size(); i=i+1) 
	        {
	        System.out.print(price.get(i).getText());
	      //  ArrayList<String> name=new ArrayList<String>();
		  //	  name.add(price.get(i).getText());
	        }     
		  
	}

}
