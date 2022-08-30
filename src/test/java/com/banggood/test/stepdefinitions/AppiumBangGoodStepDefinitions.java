package com.banggood.test.stepdefinitions;


import com.banggood.automation.AppiumDriver.Questions.ValidateTheProduct;
import com.banggood.automation.AppiumDriver.driver.AppiumAndroidDriver;
import com.banggood.automation.AppiumDriver.tasks.CategoriesSelection;
import com.banggood.automation.AppiumDriver.tasks.ClearTheCart;
import com.banggood.automation.AppiumDriver.tasks.RecomendedItemPurchase;

import com.banggood.automation.AppiumDriver.tasks.SearchByBar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AppiumBangGoodStepDefinitions {

    //Setting up the Stage
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    ///////////////////////////////////// Scenario: Recommended Items //////////////////////////////////////
    @Given("^That Brandon opens the app BangGood$")
    public void thatBrandonOpensTheAppBangGood() {

        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.yourBrowser().onDriver()));

    }

    @When("^Brandon interacts with the elements and adds them to cart$")
    public void brandonInteractsWithTheElementsAndAddsThemToCart() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                RecomendedItemPurchase.on());
    }
    @Then("^he sees the (.*) on the cart list$")
    public void heSeesTheItemsOnTheCartList(String items) {

        OnStage.theActorInTheSpotlight().should(seeThat(ValidateTheProduct.value(), equalTo(items)));

    }

    ///////////////////////////////////// Scenario: Categorized Items //////////////////////////////////////

    @When("^Brandon selects a category and goes to water sports to purchase a pair of fins$")
    public void brandonSelectsACategoryAndGoesToWaterSportsToPurchaseAPairOfFins() {

        OnStage.theActorInTheSpotlight().attemptsTo(CategoriesSelection.on());


    }

    @Then("^he sees the fins on the cart list$")
    public void heSeesTheFinsOnTheCartList() {




    }
}
