package uk.co.rightmove.stepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class CustomersSearchSteps {

    @Given("I navigate to homepage")
    public void i_navigate_to_homepage() {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.navigate().to("https://www.rightmove.co.uk/");
    }

    @When("I enter {string} into the search field")
    public void i_enter_into_the_search_field(String string) {

    }

    @When("I click on For Sale button")
    public void i_click_on_for_sale_button() {

    }

    @When("I select radius {string} of the location")
    public void i_select_radius_of_the_location(String string) {

    }

    @When("minimum price range of {string}")
    public void minimum_price_range_of(String string) {

    }

    @When("maximum price range of {string}")
    public void maximum_price_range_of(String string) {

    }

    @When("I select {string} as the minimum number of bed")
    public void i_select_as_the_minimum_number_of_bed(String string) {

    }

    @When("I select {string} as the maximum number of bed")
    public void i_select_as_the_maximum_number_of_bed(String string) {

    }

    @When("I select {string} as the property type")
    public void i_select_as_the_property_type(String string) {

    }

    @When("I select {string} as added to site option")
    public void i_select_as_added_to_site_option(String string) {

    }

    @When("I ensure that search result page is displayed")
    public void i_ensure_that_search_result_page_is_displayed() {

    }

    @When("I click on the second result")
    public void i_click_on_the_second_result() {

    }

    @Then("the details of the property is displayed")
    public void the_details_of_the_property_is_displayed() {

    }
}
