import co.com.arquetipo.models.RegistroDelUsuarioInformacion;
import co.com.arquetipo.questions.CodigoDeRespuesta;
import co.com.arquetipo.tasks.servicios.RegistrarUsuarioRegres;
import co.com.arquetipo.utils.ConstantesUrl;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.junit.Assert;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class TestDePrueba {

    @Test
    public void RegistrarUsuario(){

        Actor Juan = Actor.named("Juan")
                .whoCan(
                        CallAnApi.at(ConstantesUrl.URL_REGREST.getUrl())
                );

        String userInfo ="{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"Juanr\"\n" +
                "}";

        Juan.attemptsTo(
                RegistrarUsuarioRegres.withInfo(userInfo)

        );
        SerenityRest.lastResponse().getBody().prettyPrint();
       String codigo = "200";
       Juan.should(
               seeThat("El codigo es: ", new CodigoDeRespuesta() ,equalTo("201"))
       );
    }

    @Test
    public void RegistrarUsuario2(){

        Actor Juan = Actor.named("Juan")
                .whoCan(
                        CallAnApi.at(ConstantesUrl.URL_REGREST.getUrl())
                );

        RegistroDelUsuarioInformacion registroDelUsuarioInformacion = new RegistroDelUsuarioInformacion();

        registroDelUsuarioInformacion.setName("Juan Esteban");
        registroDelUsuarioInformacion.setJob("Vendedor de Loteria");
        registroDelUsuarioInformacion.setPassword("pistql");

        Juan.attemptsTo(
                RegistrarUsuarioRegres.withInfo(registroDelUsuarioInformacion)

        );
        SerenityRest.lastResponse().getBody().prettyPrint();
        String codigo = "200";
        Juan.should(
                seeThat("El codigo es: ", new CodigoDeRespuesta() ,equalTo("201"))
        );
    }
}
