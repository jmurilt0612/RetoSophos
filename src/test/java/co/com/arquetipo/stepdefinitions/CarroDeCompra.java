package co.com.arquetipo.stepdefinitions;

import co.com.arquetipo.questions.ValidarArticulo;
import co.com.arquetipo.tasks.AgregarAlCarro;
import co.com.arquetipo.tasks.BuscarArticuloEnLaPaginaInicial;
import co.com.arquetipo.utils.ConstantesUrl;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CarroDeCompra {



    @Before
    public void inicializarUrl(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Juan").wasAbleTo(Open.url(ConstantesUrl.PAGINA_PROMART.getUrl()));

    }

    @Dado("^que busco el articulo (.*) en la pagina de PROMART$")
    public void queBuscoElArticuloEnLaPaginaDePROMART(String articulo) {
        theActorInTheSpotlight().attemptsTo(BuscarArticuloEnLaPaginaInicial.elArticulo(articulo));

    }

    @Cuando("^agrego el articulo (.*) encontrado al carro de compras$")
    public void agregoElArticuloEncontradoAlCarroDeCompras(String articulo) {

        theActorInTheSpotlight().attemptsTo(AgregarAlCarro.elArticulo(articulo));

    }

    @Entonces("^verifico que el articulo (.*) se encuentra en el carro de compras sea el mismo que seleccione$")
    public void verificoQueElArticuloQueSeEncuentraEnElCarroDeComprasSeaElMismoQueSeleccione(String articulo) {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarArticulo.enCarro(), Matchers.containsString(articulo)));
    }


}
