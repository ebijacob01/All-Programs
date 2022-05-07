package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa..selenium.support.ui.select;

public class LearnDropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrome=new  ChromeDriver();
		chrome.get("http://www.leafground.com/pages/Dropdown.html");
		chrome.manage().window().maximize();
		chrome.findElement(By.id("dropdown1"));
		
		
		WebElement findElement=chrome.findElement(By.id("dropdown1"));
		
	}

}
