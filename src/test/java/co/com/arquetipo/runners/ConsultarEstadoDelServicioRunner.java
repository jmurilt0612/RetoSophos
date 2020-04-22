package co.com.arquetipo.runners;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/consultar_estado_servicio.feature",
        glue="co.com.arquetipo.prueba"

)
public class ConsultarEstadoDelServicioRunner {}
