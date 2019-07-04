package StepDefination;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

@RunWith(Cucumber.class)
public class Dell {


     WebDriver driver ;


    @Given("^User is on Home Page$")
    public void user_is_on_home_page()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammadp\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());

    }

    @When("^User Navigate to LogIn Page$")
    public void user_navigate_to_login_page() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("da vinci books");
        driver.findElement(By.className("nav-input")).click();

        List<WebElement> ty = driver.findElements(By.tagName("span"));
        for(WebElement tr : ty ) {
            System.out.println(tr.getText());
        }

    }



    @Then("^Message displayed Login Successfully$")
    public void message_displayed_login_successfully()  {
        System.out.println("then results");
    }


}
