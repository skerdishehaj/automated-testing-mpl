package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SeleniumTest {
  WebDriver driver;

  @BeforeEach
  public void init() {
    // Initialize Edge WebDriver
    WebDriverManager.edgedriver().setup();

    // Initialize Edge web browser instance
    driver = new EdgeDriver();

    // maximise the browser window
    driver.manage().window().maximize();

    // Implicit wait - means that the WebDriver will wait for a certain amount of time before it throws a "No Such Element Exception"
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }

  @Test
  public void firstSeleniumTest() {

    driver.get("https://google.com/");

    System.out.println(driver.getTitle());
    Assertions.assertEquals("Google", driver.getTitle());

    System.out.println(driver.getCurrentUrl());
    Assertions.assertEquals("https://www.google.com/", driver.getCurrentUrl());

    driver.navigate().back();
//    Thread.sleep(3000);
    driver.navigate().forward();
//    Thread.sleep(3000);
    driver.navigate().refresh();
//    Thread.sleep(3000);

    driver.navigate().to("https://www.selenium.dev/");


    // Close window
    // driver.close();
    // Close the browser
    driver.quit();
  }

  @Test
  public void testStackOverflow() {
    driver.get("https://stackoverflow.com/");
    System.out.println(driver.getTitle());
    Assertions.assertEquals("Stack Overflow - Where Developers Learn, Share, & Build Careers", driver.getTitle());
  }

  /**
   * Write a test that performs the following steps:
   * <p>
   * 1.Go to https://opensource-demo.orangehrmlive.com/
   * 2.In the field 'Username' enter: Admin
   * 3.In the 'Password' field enter: admin123
   * 4.Click the Login button
   * 5.Make sure the user has logged in
   */
  @Test
  public void testOrangeHRM() {
    driver.get("https://opensource-demo.orangehrmlive.com/");

    By usernameBy = By.cssSelector("input[name='username']");
    driver.findElement(usernameBy).sendKeys("Admin");

    By passwordBy = By.name("password");
    driver.findElement(passwordBy).sendKeys("admin123");

    By loginBtnBy = By.cssSelector("button[type='submit']");
    driver.findElement(loginBtnBy).click();

//    Assertions.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
  }

  @Test
  public void testSimpleScenario() throws InterruptedException {
    // Step 1: Open the website
    driver.get("https://demo.nopcommerce.com/");

    // Step 2: Click Login Menu
    WebElement loginMenu = driver.findElement(By.className("ico-login"));
    loginMenu.click();

    // Step 3: Click Register Button
    WebElement registerButton = driver.findElement(By.cssSelector(".button-1.register-button"));
    registerButton.click();

    // Step 4: Print Page Title
    System.out.println("Page Title: " + driver.getTitle());

    // Step 5: Fill Registration Form
//     Assuming the form fields have ids: firstName, lastName, email, password, confirmPassword
    WebElement maleRadioBtn = driver.findElement(By.id("gender-male"));
    maleRadioBtn.click();
    Assertions.assertTrue(maleRadioBtn.isSelected());


    driver.findElement(By.id("FirstName")).
        sendKeys("Skerdian");
    driver.findElement(By.id("LastName")).
        sendKeys("Shehaj");

    Select drpDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
    drpDay.selectByValue("3");
    Select drpMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
    drpMonth.selectByValue("9");
    Select drpYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
    drpYear.selectByValue("2002");


    int random = (int) (Math.random() * 1000);
    String email = "testmail" + String.valueOf(random) + "@gmail.com";
    driver.findElement(By.id("Email"))
        .sendKeys(email);

    driver.findElement(By.id("Company")).
        sendKeys("FTI");
String password = "Skerdi123.";
    driver.findElement(By.id("Password")).
        sendKeys(password);
    driver.findElement(By.id("ConfirmPassword")).
        sendKeys(password);

    // Click Register Button
    driver.findElement(By.id("register-button"))
        .click(); // Assuming the id of the register button is 'register'

    // Step 6: Verify Registration Success
    String registrationSuccessMessage = driver.findElement(By.cssSelector(".result")).getText();
    Assertions.assertTrue(registrationSuccessMessage.contains("Your registration completed"));



    // Step 8: Click Login Menu
    loginMenu = driver.findElement(By.className("ico-login"));
    loginMenu.click();

    // Step 9: Login with the previously created credentials
    driver.findElement(By.id("Email")).sendKeys(email);
    driver.findElement(By.id("Password")).sendKeys(password);
    driver.findElement(By.cssSelector(".button-1.login-button")).click();

    // Step 10: Verify Login Success
    String welcomeText = driver.findElement(By.cssSelector(".topic-block-title")).getText();
    Assertions.assertTrue(welcomeText.contains("Welcome to our store"));

    // Step 11: Log out
    driver.findElement(By.cssSelector(".ico-logout")).click();

    Thread.sleep(10000);

  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

}
