package co.com.choucair.runutest.stepdefinitions;

import co.com.choucair.runutest.tasks.RegisterUserReto;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterUserStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("pepe");
    }
    @Given("^Se debe ingresar a la pagina Utest con el link https://utest\\.com/$")
    public void se_debe_ingresar_a_la_pagina_Utest_con_el_link_https_utest_com() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com/"));
    }


    @When("^Hace click sobre el boton Join Today$")
    public void hace_click_sobre_el_boton_Join_Today() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Diligenciar los campos First name:-Last name:-Email address:-Date of birth:-Languages\\)$")
    public void diligenciar_los_campos_First_name_Last_name_Email_address_Date_of_birth_Languages() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(RegisterUserReto.makeinformation());

    }

    @When("^Diligenciar los campos City:-Zip or Postal Code:-Country:$")
    public void diligenciar_los_campos_City_Zip_or_Postal_Code_Country() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Diligenciar los campos Your Computer:-Version:-Language:$")
    public void diligenciar_los_campos_Your_Computer_Version_Language() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Diligenciar los campos Create your uTest password:-Confirm password: y marcar los cheklist$")
    public void diligenciar_los_campos_Create_your_uTest_password_Confirm_password_y_marcar_los_cheklist() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Se debe completar el registro de forma correcta\\.$")
    public void se_debe_completar_el_registro_de_forma_correcta() {
        // Write code here that turns the phrase above into concrete actions

    }




}
