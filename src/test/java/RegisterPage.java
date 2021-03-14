import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class RegisterPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
       // emailTextBx.sendKeys("username"+ randomInt +"@gmail.com");

        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("omer");
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("ofir");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("omer"+ randomInt +"@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("056888488");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12366688");
        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("12366688");
        driver.findElement(By.xpath("//input[@value='0']")).click();
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
    }
}
