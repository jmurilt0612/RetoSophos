package co.com.arquetipo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
            features = "src/test/resources/features/carro_de_compra_promart.feature",
            glue = "co.com.arquetipo.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CarroDeComprasRunner { }
