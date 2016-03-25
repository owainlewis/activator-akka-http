package service

import akka.actor.ActorSystem
import akka.event.Logging
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.stream.ActorMaterializer

trait ServiceBase extends SprayJsonSupport {

  val system: ActorSystem

  val materializer: ActorMaterializer

  lazy val logger = Logging(system, "demo-service")
}
