import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Verifylinks {
    public static void main(String[] args) throws FileNotFoundException {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);
        //we take all the links from the file "link_list.txt" and validate them.
        File ll = new File("link_list.txt");
        Scanner ol = new Scanner(ll);
        while (ol.hasNextLine()) {
            String line = ol.nextLine();
            driver.get(line);
            String url = driver.getCurrentUrl();
            if (url.equalsIgnoreCase(line)) {
                System.out.println("test pass");
            }
            // In the last 4 tests fails need to login to the system
            else {
                System.out.println("test fail");
            }


        }


    }
}
