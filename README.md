# Spring Boot Deployment to Google Cloud Platform

This example project shows how to deploy a Spring Boot application to Google App Engine. Several blog posts explain the details:

- [Deploying Spring Boot Applications in the Google AppEngine Flex Environment](https://blog.codecentric.de/en/2018/02/appengine-flex-spring-boot-deployment/)
- [Cloud Launcher for MongoDB in the Google Compute Engine](https://blog.codecentric.de/en/2018/03/cloud-launcher-mongodb-google-compute-engine/)
- TBA

## MongoDB Setup
In order to run the application on your local machine you need a MongoDB server running on _localhost:27017_ and some data. You can manually install MongoDB or use the provided docker-compose.yml file:

```
$ docker-compose up
```
To import the database dump from the [data](data) folder run

```
docker-compose exec mongorestore /import/pois.bson
```

## Run & test the Application
To run the application, type

```
$ mvn spring-boot:run
```

To see if the REST API is up and running, type

```
$ curl http://localhost:8080/api/pois
```

