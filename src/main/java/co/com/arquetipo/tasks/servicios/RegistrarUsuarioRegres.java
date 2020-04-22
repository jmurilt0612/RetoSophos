package co.com.arquetipo.tasks.servicios;

import co.com.arquetipo.utils.RecursosServicios;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class RegistrarUsuarioRegres implements Task {

    private final Object userInfo;
    public RegistrarUsuarioRegres(Object userInfo){this.userInfo=userInfo;}
    public static Performable withInfo(Object userInfo){
        return Tasks.instrumented(RegistrarUsuarioRegres.class, userInfo);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Post.to(RecursosServicios.RECURSO_CREAR_USUARIO_REGREST.getRecurso())
                .with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(userInfo)
                )
        );

    }


}
