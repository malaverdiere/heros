name := "heros"

organization := "sable"

version := "20130920"

scalaVersion := "2.10.2"

javacOptions ++= Seq("-source", "1.6")

compileOrder in Compile := CompileOrder.Mixed

unmanagedSourceDirectories in Compile := Seq(baseDirectory.value / "src")

libraryDependencies += "com.google.guava" % "guava" % "14.0.1"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.5"

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.5" % "runtime"
