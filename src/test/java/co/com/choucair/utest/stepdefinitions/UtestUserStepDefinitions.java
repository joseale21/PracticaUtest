package co.com.choucair.utest.stepdefinitions;

import co.com.choucair.utest.models.UtestData;
import co.com.choucair.utest.tasks.OpenUp;
import co.com.choucair.utest.tasks.RegisterOnUtest;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestUserStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Dante wants create user on utest website and enters the page$")
    public void thatDanteWantsCreateUserOnUtestWebsiteAndEntersThePage() {
        OnStage.theActorCalled("Dante").wasAbleTo(OpenUp.thePage());
    }


    @When("^he filled out the registration from on the utest website$")
    public void heFilledOutTheRegistrationFromOnTheUtestWebsite(List <UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterOnUtest.onThePage(
                utestData.get(0).getStrFirstName(),
                utestData.get(0).getStrLastName(),
                utestData.get(0).getStrEmail(),
                utestData.get(0).getStrBirthMonth(),
                utestData.get(0).getStrBirthDay(),
                utestData.get(0).getStrBirthYear(),
                utestData.get(0).getStrLanguage(),
                utestData.get(0).getStrPostalCode(),
                utestData.get(0).getStrPassword(),
                utestData.get(0).getStrConfirmPassword()
        ));
    }

    @Then("^he verify that the user is create successfully$")
    public void heVerifyThatTheUserIsCreateSuccessfully() {

    }


}
