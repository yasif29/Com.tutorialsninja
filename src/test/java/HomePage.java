import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePage {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        //  System.setProperty("webdriver.chrome.driver" , "d:\\selenium\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
    }

    //Open The Website
    @Test(testName = "OpenSite")
    public static void open_site() {
        driver.get(Utils.BASE_URL);
    }



}