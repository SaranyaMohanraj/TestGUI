package WebUIAutomation.Login;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class TestWebUI {

	   @Test
       public void site_header_is_on_home_page() {

                System.setProperty("webdriver.chrome.driver", "D:\\Saranya\\personal\\Learning\\chromedriver\\chromedriver.exe");
                WebDriver browser = new ChromeDriver();
                browser.get("https://www.saucelabs.com");
            WebElement href = browser.findElement(By.xpath("//a[@href='/beta/login']"));
                assertTrue((href.isDisplayed()));

               browser.close();       

}

}
