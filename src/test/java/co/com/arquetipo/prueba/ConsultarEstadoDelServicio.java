package co.com.arquetipo.prueba;

import co.com.arquetipo.questions.CodigoDeRespuesta;
import co.com.arquetipo.questions.ObtenerId;
import co.com.arquetipo.tasks.servicios.ObtenerServicioFiltro;
import co.com.arquetipo.utils.ConstantesUrl;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ConsultarEstadoDelServicio {

    public Actor Juan = Actor.named("Juan");

    @Cuando("^consulte el servicio de GoRest con el token de acceso (.*)y el correo (.*)$")
    public void consulteElServicioDeGoRestConElTokenDeAcceso(String token, String correo) {
        Juan.whoCan(CallAnApi.at(ConstantesUrl.GET_USUARIOS_SERVICIO_GOREST.getUrl()));
        Juan.attemptsTo(ObtenerServicioFiltro.porParametro(token, correo));
    }

    @Entonces("^el estado del servicio es (.*)$")
    public void elEstadoDelServicioEs(int codigo) {
        Juan.should(
                seeThat("El codigo de respuesta" , CodigoDeRespuesta.es(),equalTo(codigo))
        );
    }

    @Entonces("^el id del usuario es (.*)$")
    public void elCorreoVivianeExampleOrgConsultadoCorrespondeAlCorreo(String id) {

        Juan.should(
                seeThat("El usuario consultado", ObtenerId.es(), equalTo(id))
        );

    }


}
