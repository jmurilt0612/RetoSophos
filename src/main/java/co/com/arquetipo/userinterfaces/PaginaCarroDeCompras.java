package co.com.arquetipo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaCarroDeCompras {

    private PaginaCarroDeCompras(){}

    public static final Target LBL_PRODUCTO = Target.the("Titulo del producto en el carro")
    .locatedBy("//*[@class=\"product-name\"]");

    public static final Target LBL_INICIAL_CARRO_COMPRAS = Target.the("Titulo de la pagina del carro de compras")
     .locatedBy("//*[@id=\"cart-title\"]");
}
