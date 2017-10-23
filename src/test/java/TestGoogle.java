import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class TestGoogle {

    @Test
    public void googleTest() {
        FirefoxDriverManager.getInstance().setup();
        ChromeOptions options = new ChromeOptions();
        FirefoxOptions opt = new FirefoxOptions();

        WebDriver driver = new FirefoxDriver(opt);
    }
}
