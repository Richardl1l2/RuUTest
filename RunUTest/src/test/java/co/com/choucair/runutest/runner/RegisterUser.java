package co.com.choucair.runutest.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_user.feature",
        glue = "co.com.choucair.runutest.stepdefinitions"
)
public class RegisterUser {
}
