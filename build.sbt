enablePlugins(JavaAppPackaging)

organization := "io.forward"

name := "activator-akka-http"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV       = "2.4.4"
  val akkaStreamV = "2.0.4"
  val scalaTestV  = "2.2.5"
  Seq(
    "com.typesafe"       % "config"                               % "1.3.0",
    "com.typesafe.akka" %% "akka-actor"                           % akkaV,
    "com.typesafe.akka" %% "akka-stream"                          % akkaV,
    "com.typesafe.akka" %% "akka-http-core-experimental"          % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-experimental"               % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental"    % akkaStreamV,
    "com.typesafe.akka" %% "akka-http-testkit-experimental"       % akkaStreamV,
    "com.typesafe.akka" %% "akka-slf4j"                           % akkaV,
    "org.scalatest"     %% "scalatest"                            % scalaTestV % "test"
  )
}
