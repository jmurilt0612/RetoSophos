package co.com.arquetipo.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CodigoDeRespuesta implements Question {

    public static CodigoDeRespuesta es (){return new CodigoDeRespuesta();}

    @Override
    public Integer answeredBy(Actor actor) {
        return SerenityRest.lastResponse().statusCode();
    }
}
