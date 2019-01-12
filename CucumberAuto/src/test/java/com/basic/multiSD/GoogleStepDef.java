package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {
    WebDriver driver = null;

    @Given("^User need to be on google page$")
    public void user_need_to_be_on_google_page() {
        System.setProperty("webdriver.chrome.driver", "/Users/taytzushieh/CucumberSetup/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    
    @When("^User enters search string$")
    public void user_enters_search_string() throws InterruptedException {
    	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("selenium");
        Thread.sleep(1000);
    }
}
