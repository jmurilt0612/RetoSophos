package co.com.arquetipo.utils;

public enum RecursosServicios {

    RECURSO_CREAR_USUARIO_REGREST("/api/users");
    String recurso;
    RecursosServicios(String recurso) {this.recurso=recurso;}
    public String getRecurso() { return recurso;  }
}
