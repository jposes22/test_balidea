# Getting Started

* Importar el proyecto con maven.
* Hacer mvn install
````
mvn install
````
* Lanzar docker compose con el ide o por consola:
```
docker-compose -f docker-compose.yml up -d
```
* http://localhost/demo-maven-docker-0.0.1-SNAPSHOT/

* El proyecto consta del fichero server.xml de configuración de liberty que es donde se ponen los datasource jndi etc ya está configurado para oracle solo hay que cambiar el nombre del jndi y los credenciales

