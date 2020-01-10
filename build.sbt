val ScalatraVersion = "2.7.0-RC1"

organization := "kaskaz.dev"

name := "Golftour Scalatra"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.10"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.19.v20190610" % "compile;container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
   "org.scalatra" %% "scalatra-json" % ScalatraVersion,
  "org.json4s"   %% "json4s-jackson" % "3.5.2",

  "com.typesafe.slick" %% "slick" % "3.2.0",
  "com.h2database" % "h2" % "1.4.200",
  "com.mchange" % "c3p0" % "0.9.5.5"

)

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)
enablePlugins(JavaAppPackaging)
