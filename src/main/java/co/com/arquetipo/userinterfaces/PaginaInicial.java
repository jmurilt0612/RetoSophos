package co.com.arquetipo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial {

    public static Target COMBOX_BUSCAR = Target.the("Caja de busqueda inicial")
            .located(By.id("i-search"));

    public static Target BTN_BUSCAR_PAGINA_PRINCIPAL = Target.the("Boton buscar en la pagina principal")
            .locatedBy("//*[@class='icons-buscar']");
}
