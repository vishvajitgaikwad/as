
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