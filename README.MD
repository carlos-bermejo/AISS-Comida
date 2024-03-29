# MODELOS

- ALIMENTO  

| ATRIBUTO | TIPO | OBLIGATORIO | DERIVADA |  
| :---: | :---: | :---: | :---: |  
| Nombre | String | Si | No |  
| Calorías | Double | Si | No |  
| Categoría | Enumerado (Carne, Pescado, etc) | Si | No |  
| Tipo | Enumerado (Grasa, Proteina, HdC, SalMin, ViT) | Si | No |  
| Alergeno | Enumerado (Lechita) | Si | No |  
| Temporada | Enumerado<Estaciones> | No | No |  

- PLATO  
 
| ATRIBUTO | TIPO | OBLIGATORIO | DERIVADA |  
| :---: | :---: | :---: | :---: |  
| ListaAlergenos | List<Enumerado> | Si | Si |  
| Alimentos | Mapa<Alimento: Cantidad (gramos)> | Si | No |  
| Nombre | String | Si | No |  
| Calorias | Double | Si | Si |
| ProvinciaOrigen | String | No | No |
| CAOrigen | String | Si | No |
| Temporada | Enumerado<Estaciones> | No | No | 

- DIETA  
 
| ATRIBUTO | TIPO | OBLIGATORIO | DERIVADA |  
| :---: | :---: | :---: | :---: |   
| Nombre | String | Si | No |  
| Platos | List<Plato> | Si | No |  
| Descripción | String | No | No |  
| TipoDieta | Enumerado<(Veganos, Vegetarianos, Diabetico)> | No | No |  

# ENDPOINTS
 1. GET
   * CONSULTAR DE TODOS LOS MODELOS (PAGINADO {En alimentos} Y ORDENACION {Nombre y calorias, ASC y DESC en platos})
   * LISTA DE TODOS LOS ALERGENOS
   * LISTA DE TODOS LOS TIPOS DE ALIMENTO
   * DAR ALGO (POR NOMBRE) + QUERY (FILTRAR QUE QUIERES Y NO VER)
   * SACAR PLATOS O ALIMENTOS POR TEMPORADA / C.A. / TIPO DE DIETA (QUERY PARA INDICAR C.A, TEMPORADA, O TIPO DE DIETA)
 2. POST
   * DE CADA MODELO
 3. PUT
   * Alimentos de un plato
   * Descripción de Dieta y sus platos
 4. DELETE
   *  Eliminar un alimento que no estén en un plato
   *  Eliminar un plato que no esté en una dieta
   *  Eliminar una dieta

   
1. CARLOS:
	* CREAR MODELOS
	* POST DIETA
	* DELETE DIETA
2. ROCIO A:
	* SACAR ALIMENTOS Y PLATOS POR TEMPORADA ...
	* POST PLATO
	* DELETE PLATO
3. ROCIO L:
 	* SACAR ALIMENTOS Y PLATOS EN BASE A UN CARACTER
 	* PUT DE PLATO
 	* DELETE ALIMENTO 
4. DANIEL:
	* SACAR ALIMENTOS Y DIETAS (PRIMER GETTER)
	* POST ALIMENTO
	* GET TIPO ALIMENTO
5. FERNANDO:
	* GETTER DE PLATOS
	* PUT DE DIETA
	* GET ALERGENOS
