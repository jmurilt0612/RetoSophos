package co.com.arquetipo.tasks;


import co.com.arquetipo.exceptions.ObjetoNoEncontrado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.WebElementQuestion;


import static co.com.arquetipo.userinterfaces.PaginaInicial.BTN_BUSCAR_PAGINA_PRINCIPAL;
import static co.com.arquetipo.userinterfaces.PaginaInicial.COMBOX_BUSCAR;
import static co.com.arquetipo.userinterfaces.PaginaResultadoBusqueda.BTN_AGREGAR_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class BuscarArticuloEnLaPaginaInicial implements Task {
    private String articulo;
    public BuscarArticuloEnLaPaginaInicial(String articulo){this.articulo=articulo;}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(articulo).into(COMBOX_BUSCAR),
                Click.on(BTN_BUSCAR_PAGINA_PRINCIPAL)
                );
        actor.should(GivenWhenThen
                .seeThat(WebElementQuestion.the(BTN_AGREGAR_PRODUCTO.of(articulo)), isVisible())
                .orComplainWith(ObjetoNoEncontrado.class, ObjetoNoEncontrado.MENSAJE_OBJETO_NO_ENCONTRDO)
        );

    }

    public static BuscarArticuloEnLaPaginaInicial elArticulo(String articulo) {
        return instrumented(BuscarArticuloEnLaPaginaInicial.class, articulo);
    }
}
