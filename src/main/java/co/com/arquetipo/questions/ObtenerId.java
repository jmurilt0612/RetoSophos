package co.com.arquetipo.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ObtenerId implements Question{



    public static ObtenerId es() {
        return new ObtenerId();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath().getString("result.id")
                .replace("[", "").replace("]", "");
    }
}
