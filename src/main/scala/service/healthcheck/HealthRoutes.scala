package service.healthcheck

import java.lang.management.ManagementFactory

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

import scala.concurrent.duration._

trait HealthRoutes {

  def healthRoutes = pathPrefix("health") {
    path("ping") {
      get {
          complete("OK")
        }
      } ~ path("uptime") {
      get {
        val uptime = Duration(ManagementFactory.getRuntimeMXBean.getUptime, MILLISECONDS).toSeconds
        complete(uptime.toString)
      }
    }
  }
}
