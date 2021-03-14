import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);

        //field test on product Apple cinema
        driver.findElement(By.xpath("//a[normalize-space()='Apple Cinema 30\"']")).click();
        driver.findElement(By.xpath("//input[@value='7']")).click();
        driver.findElement(By.xpath("//input[@value='11']")).click();
        driver.findElement(By.xpath("//input[@id='input-option208']")).clear();
        driver.findElement(By.xpath("//input[@id='input-option208']")).sendKeys("Rush");
        driver.findElement(By.xpath("//select[@id='input-option217']")).click();
        driver.findElement(By.xpath("//*[@id=\"input-option217\"]/option[2]")).click();
        driver.findElement(By.xpath("//textarea[@id='input-option209']")).sendKeys("V.I.P");
        driver.findElement(By.xpath("//input[@id='input-option219']")).clear();
        driver.findElement(By.xpath("//input[@id='input-option219']")).sendKeys("2021-03-09");
        driver.findElement(By.xpath("//input[@id='input-option221']")).clear();
        driver.findElement(By.xpath("//input[@id='input-option221']")).sendKeys("10:30");
        driver.findElement(By.xpath("//input[@id='input-option220']")).clear();
        driver.findElement(By.xpath("//input[@id='input-option220']")).sendKeys("2021-03-09 10:30");
        driver.findElement(By.xpath("//button[@id='button-cart']")).click();


        //field test on product canon camera
        driver.navigate().back();
        driver.findElement(By.xpath("//a[normalize-space()='Canon EOS 5D']")).click();
        driver.findElement(By.xpath("//select[@id='input-option226']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Add to Cart']")).click();
        driver.findElement(By.xpath("//input[@id='input-quantity']")).clear();
        driver.findElement(By.xpath("//input[@id='input-quantity']")).sendKeys("2");


        //field test on product iphone.
        driver.navigate().back();
        driver.findElement(By.xpath("//a[normalize-space()='iPhone']")).click();
        driver.findElement(By.xpath("//input[@id='input-quantity']")).clear();
        driver.findElement(By.xpath("//input[@id='input-quantity']")).sendKeys("3");
        driver.findElement(By.xpath("//button[@id='button-cart']")).click();



    }
}

