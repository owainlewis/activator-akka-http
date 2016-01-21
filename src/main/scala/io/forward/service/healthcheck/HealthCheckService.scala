package io.forward.service.healthcheck

import java.lang.management.ManagementFactory

import akka.event.Logging
import akka.http.scaladsl.server.Directives._
import io.forward.service.ServiceBase
import io.forward.service.healthcheck.models.Status

import scala.concurrent.duration._

trait HealthCheckService extends ServiceBase {

  private val pingRoute = path("ping") {
    get {
      logRequest("/ping", Logging.InfoLevel) {
        complete("PONG")
      }
    }
  }

  private val uptimeRoute = path("uptime") {
    get {
      logRequest("/uptime", Logging.InfoLevel) {
        val uptime = Duration(ManagementFactory.getRuntimeMXBean.getUptime, MILLISECONDS).toSeconds
        complete(Status(uptime))
      }
    }
  }

  val routes = pingRoute ~ uptimeRoute
}
