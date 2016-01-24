name := "processing-scala-template"

version := "0.1.0"

scalaVersion := "2.11.7"

mainClass in (Compile, run) := Some("com.company.app.Driver")

libraryDependencies ++= Seq(
  "org.processing" % "core" % "3.0.+",
  "com.typesafe" % "config" % "1.3.+",
  "ch.qos.logback" % "logback-core" % "1.1.+",
  "ch.qos.logback" % "logback-classic" % "1.1.+",
  "org.slf4j" % "slf4j-api" % "1.7.+"
)