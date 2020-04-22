package co.com.arquetipo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.arquetipo.userinterfaces.PaginaCarroDeCompras.LBL_PRODUCTO;

public class ValidarArticulo implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_PRODUCTO)
                .viewedBy(actor).asString();
    }

    public static ValidarArticulo enCarro(){return new ValidarArticulo();}
}
