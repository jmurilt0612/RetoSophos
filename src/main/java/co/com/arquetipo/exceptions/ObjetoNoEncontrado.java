package co.com.arquetipo.exceptions;

public class ObjetoNoEncontrado extends AssertionError {

    public static final String MENSAJE_OBJETO_NO_ENCONTRDO = "Este articulo no se ecuentra en la lista";

    public ObjetoNoEncontrado(String mensajeDeError, Throwable causaDelError){
        super(mensajeDeError, causaDelError);
    }

}
