package service.healthcheck

import akka.http.scaladsl.model.{ContentTypes, StatusCodes}
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest._

class HealthRoutesSpec extends HealthRoutes with WordSpecLike with Matchers with ScalatestRouteTest {

  "The health service" should {

    "return HTTP success for the ping route" in {
      Get("/health/ping") ~> routes ~> check {
        status shouldEqual StatusCodes.OK
      }
    }

    "return HTTP success for the uptime route" in {
      Get("/health/uptime") ~> routes ~> check {
        status shouldEqual StatusCodes.OK
        contentType shouldEqual ContentTypes.`application/json`
      }
    }
  }
}
