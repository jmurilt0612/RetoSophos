package co.com.arquetipo.utils;

public enum FiltrosServicios {

    FILTRO_CORREO("&email=");


    private String filtro;
    FiltrosServicios(String filtro) {
        this.filtro=filtro;
    }

    public String getFiltro(){return filtro;}
}
