package co.com.arquetipo.utils;

public enum ConstantesUrl {

   PAGINA_PROMART("https://www.promart.pe/"),
   GET_USUARIOS_SERVICIO_GOREST("https://gorest.co.in/public-api/users?access-token="),
   URL_REGREST("https://reqres.in");

    private String url;
    ConstantesUrl(String url) {
        this.url = url;
    }

    public String getUrl(){return url;}
}
