# language: es

  Característica: Yo como usuario administrador
                  deseo consultar el servicio de GOREST
                  Para validar el estado y la consulta de un usuario

    Esquema del escenario: Consultar servicio de GoRest
      Cuando consulte el servicio de GoRest con el token de acceso <token> y el correo <correo>
      Entonces el estado del servicio es <codigo>
      Y el id del usuario es <id>

      Ejemplos:
        |token                                | id | codigo | correo |
        |GQbsBgnYXocsSTOrrRU4P3jO2jXNi51OhVCh |445 | 200   |gerlach.keanu@example.net|