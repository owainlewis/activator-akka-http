package io.forward.service

import akka.actor.ActorSystem
import akka.event.{ Logging, LoggingAdapter }
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.stream.ActorMaterializer

trait ServiceBase extends SprayJsonSupport {

  val system: ActorSystem

  val materializer: ActorMaterializer

  val logger: LoggingAdapter
}
