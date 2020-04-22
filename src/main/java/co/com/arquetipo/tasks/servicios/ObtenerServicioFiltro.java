package co.com.arquetipo.tasks.servicios;

import co.com.arquetipo.utils.FiltrosServicios;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ObtenerServicioFiltro implements Task {

   private String token;
   private String correo;
   public ObtenerServicioFiltro(String token, String correo){
       this.correo= correo;
       this.token=token;
   }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(token.concat(FiltrosServicios.FILTRO_CORREO.getFiltro()).concat(correo))
        );

        SerenityRest.lastResponse().getBody().prettyPrint();
    }

    public static ObtenerServicioFiltro porParametro(String token, String correo) {

        return Tasks.instrumented(ObtenerServicioFiltro.class, token, correo);
    }
}
