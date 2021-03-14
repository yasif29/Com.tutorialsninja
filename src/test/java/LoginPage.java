import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginPage {
    public static <Filelist> void main(String[] args) throws FileNotFoundException {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);
        File d = new File("c://Com.tutorialsninja//Login.txt");
        Scanner cd = new Scanner(d);
        List<Filelist> List = new ArrayList<>();
        while (cd.hasNextLine()) {
            String line = cd.nextLine();
            String[] details = line.split(",");
            String email = details[0];
            String password = details[1];

            driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
            driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
            driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
            driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
            driver.findElement(By.xpath("//input[@value='Login']")).click();
            String fail = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
            System.out.println(fail);


        }
    }
}