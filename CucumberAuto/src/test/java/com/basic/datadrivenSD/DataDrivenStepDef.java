package com.basic.datadrivenSD;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenStepDef {

    WebDriver driver;

    @Given("^User need to be on Facebook login page$")
    public void user_need_to_be_on_Facebook_login_page() {
        System.setProperty("webdriver.chrome.driver", "/Users/taytzushieh/CucumberSetup/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @When("^User enters user \"([^\"]*)\" first name$")
    public void user_enters_user_first_name(String userName) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys(userName);
        Thread.sleep(1000);
    }
    
    @And("^User enters user \"([^\"]*)\" surname$")
    public void user_enters_user_surname(String surName) throws InterruptedException {
    	driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(surName);
    	Thread.sleep(1000);
    }

    @Then("^User checks user \"([^\"]*)\" first name is present$")
    public void user_checks_user_first_name_is_present(String userName) throws InterruptedException {
        String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_j']")).getAttribute("value");
        Assert.assertEquals(userName, userNameActual);
        Thread.sleep(1000);
    }
    
    @Then("^User Mobile field should be blank$")
    public void user_mobile_field_should_be_blank() throws InterruptedException {
    	String mobileActual = driver.findElement(By.xpath("//input[@id='u_0_o']")).getAttribute("value");
    	Assert.assertEquals("", mobileActual);
    	Thread.sleep(1000);
    }
    
    @Then("^close browser$")
    public void close_browser() {
    	driver.quit();
    	driver = null;
    }

    @When("Enter following data")
    public void enter_following_data(DataTable table) throws InterruptedException {
    	List<List<String>> data = table.raw();
    	
    	String values4 = data.get(1).get(0);
    	String values5 = data.get(1).get(1);
    	
    	driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys(values4);
    	driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(values5);
    	Thread.sleep(2000);
    }
}
