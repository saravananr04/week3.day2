package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for = 'Men']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String Items = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items found : " +Items);
		System.out.println("Brand List :");
		List<WebElement> bagBrandList = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println(" Size :" + bagBrandList.size());
		System.out.println("Brand Names:");
		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}		
		System.out.println(" List of Bags:");
		List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println("Bag Names:");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}

	}

}