package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AdvancedsearchPage;
import utilities.BrowserUtils;

public class AdvancedsearchPageStepDefs {

    AdvancedsearchPage advancedsearchPage= new AdvancedsearchPage();

        @Then("user needs click on left side button on the top")
        public void user_needs_click_on_left_side_button_on_the_top () {

            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://scholar.google.com/#d=gs_hdr_drw&t=1691973334841");
        }

        @Then("user needs click Advanced search option")
        public void user_needs_click_Advanced_search_option () {
            advancedsearchPage.advancedSearch.click();
        }

        @Then("user should be in the advanced search")
        public void user_should_be_in_the_advanced_search () {

        }

        @Then("user should be able to enter multiple search criteria such as author, publication year and key words")
        public void user_should_be_able_to_enter_multiple_search_criteria_such_as_author_publication_year_and_key_words
        () {
              advancedsearchPage.sendKeys.click();
        }

        @Then("user should be able to click search button")
        public void user_should_be_able_to_click_search_button () {

        }

        @Then("user verifies that relevant search results are d isplayed")
        public void user_verifies_that_relevant_search_results_are_d_isplayed () {

        }


    }
