import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Main {
//    @Test
//    public void click()
//    {
//
//    }
    public static void main(String[] args) {

        System.setProperty( "webdirver.chrome.driver","C:\\Users\\gs1-thaaruns\\Desktop\\Testing\\cucumberEx\\drivers\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://www.seleniumframework.com/practiceform/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
