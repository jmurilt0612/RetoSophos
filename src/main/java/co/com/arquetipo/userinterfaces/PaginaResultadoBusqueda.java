package co.com.arquetipo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaResultadoBusqueda {
    private PaginaResultadoBusqueda (){}
    public static final Target BTN_AGREGAR_PRODUCTO = Target.the("El producto indicaado")
            .locatedBy("//*[@class='item-product product-listado']/div[@data-name='{0}']//button");

    public static final Target LBL_MENSAJE_COMPRA = Target.the("Pop Up de con mensaje de agregar al carro")
            .locatedBy("//*[@class=\"add-content\"]");

    public static final Target BTN_IR_A_CARRO_COMPRAS = Target.the("Boton para ir al carro de compras desde la pagina de busqueda")
            .locatedBy("//div[@class='bottomed']/a[@href=\"/checkout\"]");


}
