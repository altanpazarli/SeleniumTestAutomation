name := "SeleniumTestAutomation"

version := "0.1"

scalaVersion := "2.12.6"

parallelExecution in Test := false

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test,
  "org.scalacheck" %% "scalacheck" % "1.14.0" % Test,
  "org.seleniumhq.selenium" % "selenium-java" % "3.141.59",
  "com.typesafe" % "config" % "1.3.3")