package service.users

import spray.json.DefaultJsonProtocol._

final case class User(firstName: String, lastName: String, email: String)

object User {
  implicit val format = jsonFormat3(User.apply)
}
