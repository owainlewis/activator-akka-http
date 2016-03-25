package service.healthcheck

import java.lang.management.ManagementFactory

import akka.event.Logging
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives._
import service.ServiceBase

import scala.concurrent.duration._

final case class Uptime(value: Long)

object Uptime {
  import spray.json.DefaultJsonProtocol._
  implicit val format = jsonFormat1(Uptime.apply)
}

trait HealthRoutes extends ServiceBase {

  def routes = pathPrefix("health") {
    path("ping") {
      get {
        logRequest("/ping", Logging.InfoLevel) {
          complete(StatusCodes.OK, "OK")
        }
      }
    } ~ path("uptime") {
      get {
        logRequest("/uptime", Logging.InfoLevel) {
          val uptime = Duration(ManagementFactory.getRuntimeMXBean.getUptime, MILLISECONDS).toSeconds
          complete(StatusCodes.OK, Uptime(uptime))
        }
      }
    }
  }
}
