package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
         

public class FirstTestCase {

        public static void main(String[] args) {

         
        System.setProperty("webdriver.gecko.driver", "\\\\novsvrazfs01\\shared$\\Selenium\\SeleniumDrivers\\Firefox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://facebook.com/");
        
//        driver.findElement(By.id("email")).sendKeys("hi");
//        driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
//        driver.findElement(By.cssSelector("#pass")).sendKeys("123");
        
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("xx");;
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("xx");;
        driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("xx");;
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("xx");;

        
        Select day = new Select(driver.findElement(By.name("birthday_day")));
        day.selectByVisibleText("1");
        Select month = new Select(driver.findElement(By.name("birthday_month")));
        month.selectByVisibleText("Dec");
        Select year = new Select(driver.findElement(By.name("birthday_year")));
        year.selectByVisibleText("2020");

        driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();

        
//        driver.findElement(By.linkText("Forgotten account?")).click();
//        driver.findElement(By.className("uiButtonText")).click();
//        
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hi2");
        
        //driver.close();
        }

}