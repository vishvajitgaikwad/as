package cdac.dac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
       WebDriver driver = new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Thread.sleep(4000);
       WebElement nameField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
       nameField.sendKeys("admin");
       
  
       
       
       
    }
}



/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        WebElement nameField = driver.findElement(By.name("name"));
        nameField.sendKeys("John Doe");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("password123");

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        driver.quit();
    }
}

*/