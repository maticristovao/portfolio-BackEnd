# Portfolio-BackEnd

Este es el repositorio del Back-End para mi portfolio personal. Proporciona una API para gestionar y mostrar información sobre mis proyectos, habilidades y experiencias.

## Características
- Implementado en Java con el framework Spring Boot.
- Utiliza Hibernate y JPA para la persistencia de datos.
- Proporciona endpoints RESTful para interactuar con la API.
- Base de datos MySQL alojada en Clever Cloud para almacenar la información.

## Elementos
En src/main se encuentran las clases creadas para este proyecto.

/controller 
Contiene las clases que reciben los requests y tratan con los servicios

/exceptions 
Contiene una clase de excepción para cuando no se encuentra un recurso

/model
Tiene todas las entidades que conforman las tablas en la base de datos

/repository
Contiene las clases que conforman la capa de persistencia

/service
constituye la lógica de negocio de la aplicación

## Requisitos previos
- Java Development Kit (JDK) 17 o superior.
- Un IDE de Java, como NetBeans o Eclipse.

## Configuración
1. Clona el repositorio: `git clone https://github.com/maticristovao/portfolio-BackEnd.git`
2. Navega hasta el directorio del proyecto: `cd portfolio-BackEnd`
3. Abre el proyecto en tu IDE.
4. Configura la conexión a la base de datos en el archivo `application.properties`.
5. Ejecuta la aplicación.
6. - La API se ejecuta en `http://localhost:8080`.
