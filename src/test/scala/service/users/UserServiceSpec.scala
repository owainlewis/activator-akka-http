package service.users

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{Matchers, _}

class UserServiceSpec extends WordSpecLike with Matchers with ScalatestRouteTest with SprayJsonSupport {

  import spray.json.DefaultJsonProtocol._

  "The UserService" should {

    val repository = new UserRepositoryImpl()

    "return a list of users" in {
      Get("/users") ~> new UserService(repository).userRoutes ~> check {
        status shouldEqual StatusCodes.OK
        responseAs[List[User]].length shouldBe 2
      }
    }
  }
}