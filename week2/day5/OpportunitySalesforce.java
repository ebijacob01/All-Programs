package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpportunitySalesforce {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver force=new ChromeDriver();
		
		force.get("https://login.salesforce.com/");
		force.manage().window().maximize();
		force.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		force.findElement(By.id("password")).sendKeys("Password@123");
		force.findElement(By.id("Login")).click();
		force.findElement(By.className("slds-icon-waffle")).click();
		force.findElement(By.linkText("View All")).click();
		
	}

}