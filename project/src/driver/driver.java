package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class driver {
		
	public static void main(String[] args) {
		
		WebDriver driver;			
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\skw9h\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   	driver= new ChromeDriver();						
	    driver.manage().window().maximize();			
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		
		//Login
		driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=account/account']")).click();;
		driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=account/login']")).click();;
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("temp@temp.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("temp");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//Add item
//		driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=25']")).click();;
//		driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=25_28']")).click();;
//		driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=product/product&path=25_28&product_id=33']")).click();;
//		driver.findElement(By.xpath("//input[@data-loading-text='Loading...']")).click();

		//Wish list
//		driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=25']")).click();;
//		driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=25_28']")).click();;
//		driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=product/product&path=25_28&product_id=33']")).click();;
//		driver.findElement(By.xpath("//input[@onclick='wishlist.add('33');']")).click();
		
		//Newsletter
		driver.findElement(By.xpath("//a[@href='http://tutorialsninja.com/demo/index.php?route=account/newsletter']")).click();;
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();


		
	}
	    
	
}
