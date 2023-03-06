# Crypto
Usé recyclerview para mostrar los elementos en pantalla.
Utilicé la api https://api.coinmarketcap.com/data-api/v3/cryptocurrency/listing?cmc_rank?start=1&limit=10
Los elementos que muestra la app son el logo, el nombre, la abreviación y su precio actual. Están ordenadas de acuerdo al valor total del mercado.

Posibles features a implementar:
  Botón con menú desplegable que haga la conversión del precio de compra de la criptomoneda a otra moneda que se elija.
  Al clickear se podría observar el historial de cambios para ver cuanto ha variado en las últimas semanas.
  Una categoría donde aparezcan las criptomonedas que más han subido de precio.
  

Bugs:
  La app solo actualiza los valores cuando se vuelve a abrir, por lo que se tendría que buscar la forma de actualizarlos automáticamente cada 60 segs.
  
  
Qué aprendí:
  Usar Apis y almacenar sus valores en variables para luego mostrarlas en pantalla.
  A usar de mejor manera el recyclerview y el viewbinding.
  Entendí de mejor manera el adapter y su contexto, al igual que el viewholder.
  A usar glide para mostrar imágenes variables.
  Pude resolver los errores que fueron saliendo durante la creación de la app.
  
  
Qué me costó:
  Al principio me costó entender cómo consumir la api.
  Tampoco entendía bien la lógica del viewholder y el adapter.
  
