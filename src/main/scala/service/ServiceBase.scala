package service

import akka.actor.ActorSystem
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.stream.ActorMaterializer

trait ServiceBase extends SprayJsonSupport {

  val system: ActorSystem

  val materializer: ActorMaterializer
}
