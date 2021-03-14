import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Linkim {
    public static void main(String[] args) throws IOException {


        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);
        FileWriter writer = new FileWriter("link_list1.txt", true);

        //Get list of web-elements with tagName  - a
        List<WebElement> allLinks = driver.findElements(By.xpath("//footer//div[@class='row']//div[1]//ul[1]//li//a"));
        List<WebElement> AllLinks = driver.findElements(By.xpath("//footer//div[2]//ul[1]//li//a"));
        List<WebElement> AllLink = driver.findElements(By.xpath(" //body//footer//div[3]//ul[1]//li//a"));
        List<WebElement> AlLink = driver.findElements(By.xpath("  /html/body/footer/div/div/div[4]"));

        //Traversing through the list and printing its text along with link address
        for (WebElement link : allLinks) {
            writer.write(link.getAttribute("href") + System.lineSeparator());

            writer.flush();
            System.out.println(link.getText() + " - " + link.getAttribute("href"));


        }
    }
}