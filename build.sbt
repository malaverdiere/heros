name := "heros"

organization := "sable"

version := "20130806"

scalaVersion := "2.10.2"

javacOptions ++= Seq("-source", "1.6")

compileOrder in Compile := CompileOrder.Mixed

unmanagedSourceDirectories in Compile := Seq(file("src"))

libraryDependencies += "com.google.guava" % "guava" % "13.0.1"

