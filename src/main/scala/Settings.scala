import akka.actor.{ExtendedActorSystem, ExtensionIdProvider, ExtensionId, Extension}
import com.typesafe.config._

class SettingsImpl(config: Config) extends Extension {

  object Http {
    /**
      * The HTTP host name
      */
    lazy val interface = config.getString("http.interface")

    /**
      * The HTTP port to run on
      */
    lazy val port = config.getInt("http.port")
  }
}

object Settings extends ExtensionId[SettingsImpl] with ExtensionIdProvider {

  override def lookup = Settings

  override def createExtension(system: ExtendedActorSystem) =
    new SettingsImpl(system.settings.config)
}
