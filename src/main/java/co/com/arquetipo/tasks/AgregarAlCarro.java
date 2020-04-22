package co.com.arquetipo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.arquetipo.userinterfaces.PaginaCarroDeCompras.LBL_INICIAL_CARRO_COMPRAS;
import static co.com.arquetipo.userinterfaces.PaginaResultadoBusqueda.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarAlCarro implements Task {

    String articulo;
    public AgregarAlCarro(String articulo){
        this.articulo=articulo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_AGREGAR_PRODUCTO.of(articulo), isVisible())
                        .forNoMoreThan(10).seconds(),
                Click.on(BTN_AGREGAR_PRODUCTO.of(articulo)),
                WaitUntil.the(LBL_MENSAJE_COMPRA, isVisible())
                        .forNoMoreThan(10 ).seconds(),
                Click.on(BTN_IR_A_CARRO_COMPRAS),
                WaitUntil.the(LBL_INICIAL_CARRO_COMPRAS, isVisible())
                        .forNoMoreThan(10).seconds()

        );
    }

    public static AgregarAlCarro elArticulo(String articulo) {
        return instrumented(AgregarAlCarro.class, articulo);
    }
}
