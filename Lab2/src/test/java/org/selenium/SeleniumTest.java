package org.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTest {
  WebDriver driver;

  @BeforeEach
  public void init() {
    // Initialize Edge WebDriver
    WebDriverManager.edgedriver().setup();

    // Initialize Edge web browser instance
    driver = new EdgeDriver();
  }

  @Test
  public void firstSeleniumTest() {


    // maximise the browser window
    driver.manage().window().maximize();

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

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

}
