# Akka HTTP

This project gives you a base template for creating microservices using Akka HTTP. The aim is to give you enough boilerplate to get started
without being too prescriptive or adding too much unwanted code.

## Starting the service

```
sbt run
``

## Packaging the service

See the SBT assembly plugin for more info. To package as zip file run

```
sbt universal:packageBin
```

## Running tests

```
sbt clean test
```