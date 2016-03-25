import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import service.healthcheck._

object Bootstrap extends App with HealthRoutes {

  implicit val system = ActorSystem()

  implicit val executor = system.dispatcher

  implicit val materializer = ActorMaterializer()

  val settings = Settings(system)

  logger.info(s"Starting service on port ${settings.Http.port}")

  Http().bindAndHandle(routes, settings.Http.interface, settings.Http.port)
}
