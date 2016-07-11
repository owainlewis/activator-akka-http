# Akka HTTP

This project gives you a base template for creating microservices using Akka HTTP.
The aim is to give you enough boilerplate to get started without being too prescriptive or adding too much unwanted code.

The example project uses Guice for Dependency Injection. If you don't need it, just remove it.

## Quickstart

Assuming you have Typesafe activator to create a new microservice based on this template run the following,
replacing "hello-service" with the name of your service.

```
activator new hello-service akka-http-microservice-quickstart
```

## Starting the service

```
sbt run
```

## Packaging the service

See the SBT assembly plugin for more info. To package as zip file run

```
sbt universal:packageBin
```

## Running tests

```
sbt clean test
```
