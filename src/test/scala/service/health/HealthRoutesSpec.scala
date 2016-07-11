package service.health

import akka.http.scaladsl.model.{ContentTypes, StatusCodes}
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{Matchers, _}

class HealthRoutesSpec extends HealthRoutes with WordSpecLike with Matchers with ScalatestRouteTest {

  "The HealthRoutes" should {

    "return HTTP success for GET /health/ping" in {
      Get("/health/ping") ~> healthRoutes ~> check {
        status shouldEqual StatusCodes.OK
      }
    }
    "return HTTP success for GET /health/uptime" in {
      Get("/health/uptime") ~> healthRoutes ~> check {
        status shouldEqual StatusCodes.OK
      }
    }
  }
}
