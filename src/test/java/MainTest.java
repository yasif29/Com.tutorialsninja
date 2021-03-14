import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
    //Open The Site
    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver", "d:\\selenium\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);

    }
}
