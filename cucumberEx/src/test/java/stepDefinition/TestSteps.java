package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSteps {

//    @Given("user test")
//    public void test1()
//    {
//        System.setProperty( "webdirver.chrome.driver","C:\\Users\\gs1-thaaruns\\Desktop\\Testing\\cucumberEx\\drivers\\chromedriver.exe");
//        WebDriver driver;
//        driver = new ChromeDriver();
//        driver.get("http://www.seleniumframework.com/practiceform/");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.quit();
//
//    }

    @Given("User should direct to Selenium practice form page")
    public void user_should_direct_to_selenium_practice_form_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Hello");
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
    @When("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello");
    }
    @Then("Click on New Browser Window Button")
    public void click_on_new_browser_window_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello");
    }
    @Then("See Driver gets closed")
    public void see_driver_gets_closed() {
        // Write code here that turns the phrase above into concrete actions

    }



}
