# Happy Trip

El proyecto de Happy Trip consiste en una página web en la cual los usuarios de esta seran capaces de buscar hoteles y filtrar la busqueda basandose por algun criterio escogido por el usuario. Si el usuario encuentra un hotel de su agrado la página permite realizar una reservacion en una de la habitaciones de dicho hotel, para realizar la resevacion el usuario debera indicar el tiempo que desea hospedarse en el hotel, esto por medio del ingreso de un rango de fechas, luego para seguir con la reservación de la habitación el usuario ingresara su informacion personal(nombre, correo, fecha de nacimiento) y la de su tarjeta para que con esto la página realice la reservación.

## Componentes de la Arquitectura 📦

La arquitectura del proyecto esta compuesta por los siguientes componentes:

* Capa vista: Esta se encarga de mostrar al usuario de la pagina web todo lo referente al apartado visual de la misma,
es en esta capa donde se recibe la informacion solicitada por el usuario, la cual va hacer procesada por las demas capas, ademas 
esta se encarga de modelar la informacion provenientes de otras capas para ser mostrada de manera entendible para el usuario.

* Capa Conexión: Se encarga de gestionar los temas referentes al pool de conexiones de la base de datos, es en esta capa en donde se forman los querys y todo aquello con relacionado con las consultas, el trabajo principal de esta capa es la de conceder la conexion a la base y enviar las consultas que reciba de la capa de procesamiento hacia la base de datos, ademas de recibir el resultado de dichas consultas y regresar la informacion a la capa de procesamiento.

* Procesamiento: En esta capa se realizará el procesamiento de los datos, en esta capa se encuentra la funcion que cifrar los datos sensibles, ademas de realizar la validaciones de datos como la edad del usuario, su correo y la disponibulidad de las habitaciones en un cierto rango de fechas, aqui se mantiene las instancias de las otras capas necesarias para el buen funcionamiento del programa. 
Esta capa recibirá las consultas del usuario enviadas por la capa vista y las procesarlas, luego las enviará la capa conexión que las ejecutara. Igualmente recibe recibe el resultado de las consultas que son enviadas desde la capa conexión y las procesa y las envía a la capa modelo.

* Modelo: Se encarga de modelar los datos de la aplicacion web, esta los modela en un formato de orientacion a objetos, es en esta capa donde se formaranlos json para la comunicación con los servidores de la página web y la capa de vista, esta capa recibe los datos de la capa de conexión para ser modelada y enviada a la capa de procesamiento que se encarga del procesamiento de lso datos.

* Base de Datos: Esta capa se encuentra toda la información de la base de datos, además se contiene el diseño de la base de datos y sus tablas. Se mantiene la integridad de los datos restringiendo el tipo de dato para cada atributo, y se les agrega un valor por defecto. Esta capa se encargará de ejecutar las consultas recibidas y devolver el resultado de las consultas realizadas.
 

## Dependencias 🛠️ y Referencias 📄

* [Bootstrap](https://getbootstrap.com/) - El framework web usado
* [Hibernate](https://hibernate.org/) - Framework para el mapeo de los atributos de la base de datos
* [Gson](https://github.com/google/gson) - Biblioteca para la serializacion y deserializacion de objetos Java
* [Javax](https://mvnrepository.com/artifact/javax) - La API Javax es una colección de APIs para el parseo y tratamiento de documentos XML 

## Problemas conocidos ⚙️

*A la hora de la implementacion de la clase Filtrar que utilizaba servlets por alguna razon a la 
hora de importar las librerias de javax.servlets se presento problemas en las dependencias, lo que 
no nos permitio completar ciertas tareas del trabajo.




