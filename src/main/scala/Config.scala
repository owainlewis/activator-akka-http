import com.typesafe.config.ConfigFactory

object Config {

  private val config = ConfigFactory.load()

  object Http {
    lazy val interface = config.getString("http.interface")
    lazy val port = config.getInt("http.port")
  }
}
