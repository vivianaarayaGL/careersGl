package carreersTab;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.browserSetup;
import utilities.careerPage;


public class careerTab extends careerPage {


    @Given("^I am on the Gorilla Logic homepage$")
    public void iAmOnGorillaPage(){
    }

    @When("^I click on Careers Tab$")
    public void iClickOnCareersTab() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Careers page is showed up$")
    public void careerPageLoads() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
