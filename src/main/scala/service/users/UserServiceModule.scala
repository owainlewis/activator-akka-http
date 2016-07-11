package service.users

import com.google.inject.AbstractModule

/**
  * Example showing use of Guice for DI. Remove if not required
  */
object UserServiceModule extends AbstractModule {
  override def configure() {
    bind(classOf[UserRepository]).to(classOf[UserRepositoryImpl])
  }
}
