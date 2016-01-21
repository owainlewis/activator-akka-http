# Akka HTTP

This project gives you a base template for creating microservices using Akka HTTP. The aim is to give you enough boilerplate to get started
without being too prescriptive or adding too much unwanted code.

## Quickstart

Assuming you have Typesafe activator to create a new microservice based on this template run

```
activator new
```

Type akka-http-microservice-quickstart for the template name and it will create a new project in your current directory.

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
