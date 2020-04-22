# language: es

  Característica: Yo como usuario frecuente de PROMART
                  deseo seleccionar un articulo y agregarlo al carro de compras
                  para validar que se agregue correctamete

  Esquema del escenario: Agregar al carro de compras articulo de PROMART
    Dado que busco el articulo <Nombre del articulo> en la pagina de PROMART
    Cuando agrego el articulo <Nombre del articulo> encontrado al carro de compras
    Entonces verifico que el articulo <Nombre del articulo> se encuentra en el carro de compras sea el mismo que seleccione
    Ejemplos:
      | Nombre del articulo |
      |Smarphone SAMSUNG Galaxy A10S Azul|
