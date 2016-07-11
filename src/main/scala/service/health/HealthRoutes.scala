package service.health

import java.lang.management.ManagementFactory

import akka.http.scaladsl.server.Directives._

import scala.concurrent.duration._

trait HealthRoutes {

  def healthRoutes = pathPrefix("health") {
    path("ping") {
      get {
          complete("OK")
        }
      } ~ path("uptime") {
      get {
        complete(getUptime.toString)
      }
    }
  }
  
  private def getUptime = Duration(ManagementFactory.getRuntimeMXBean.getUptime, MILLISECONDS).toSeconds
}
