# Crypto
Usé recyclerview para mostrar los elementos en pantalla.
Utilicé la api https://api.coinmarketcap.com/data-api/v3/cryptocurrency/listing?cmc_rank?start=1&limit=10
Los elementos que muestra la app son el logo, el nombre, la abreviación y su precio actual. Están ordenadas de acuerdo al valor total del mercado.

Posibles features a implementar:
  Botón con menú desplegable que haga la conversión del precio de compra de la criptomoneda a otra moneda que se elija
  Al clickear se podría observar el historial de cambios para ver cuanto ha variado en las últimas semanas
  Una categoría donde aparezcan las criptomonedas que más han subido de precio
  

Bugs:
  La app solo actualiza los valores cuando se vuelve a abrir, por lo que se tendría que buscar la forma de actualizarlos automáticamente cada 60 segs
