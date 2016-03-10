package io.forward

import akka.actor.ActorSystem
import akka.event.Logging
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.typesafe.config.ConfigFactory
import io.forward.service.healthcheck.HealthCheckService

object Main extends App with HealthCheckService {
  implicit val system = ActorSystem()
  implicit val executor = system.dispatcher
  implicit val materializer = ActorMaterializer()

  val logger = Logging(system, "demo-service")

  logger.info(s"Starting service on port ${Config.Http.port}")

  Http().bindAndHandle(routes, Config.Http.interface, Config.Http.port)
}
