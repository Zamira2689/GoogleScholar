package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePageStepDefs {

    HomePage homePage= new HomePage();

    @Given("user needs to go to main page of Google Scholar")
    public void user_needs_to_go_to_main_page_of_Google_Scholar() {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get(ConfigurationReader.get("url"));
       // driver.get("https://scholar.google.com/");
        driver.manage().window().maximize();
    }



    @Then("user needs verify the page title")
    public void user_needs_verify_the_page_title() {
BrowserUtils.waitFor(3);
        String actual=Driver.get().findElement(By.cssSelector("#gs_hdr_hp_lgo")).getText();
        Assert.assertEquals("Google Scholar",actual);
       System.out.println("homePage.pageTitle.getText() = " + homePage.pageTitle.getText());


    }



    @Then("user should be able to enter some valid keywords in the search bar")
    public void user_should_be_able_to_enter_some_valid_keywords_in_the_search_bar() {

        homePage.searchBox.sendKeys("phone");
        BrowserUtils.waitFor(4);
    }



    @Then("user should click on the search button")
    public void user_should_click_on_the_search_button() {
        homePage.searchButton.click();

    }



    @Then("user verifies that relevant search results are displayed")
    public void user_verifies_that_relevant_search_results_are_displayed() {
        homePage.page.contains("phone");

    }



}
