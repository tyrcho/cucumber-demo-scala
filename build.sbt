import java.io.File

import sbt.Keys._
import sbt._

import scala.util.Try
organization := "com.github.writethemfirst"
scalaVersion := "2.12.10"
libraryDependencies ++= Seq(
  "io.cucumber"              %% "cucumber-scala"  % "4.7.1"  % Test,
  "org.scalatest"            %% "scalatest"       % "3.1.0"  % Test
)

lazy val cucumber = taskKey[Unit]("Run Test Class")

cucumber := Try {
  val classPath: List[String] = (fullClasspath in Test).map(_.toList.map(_.data.toString)).value
  val fork                    = new Fork("java", None)
  val args                    = Vector("-cp", classPath.mkString(File.pathSeparator))
  Fork.java(ForkOptions().withRunJVMOptions(args), Seq("com.demo.RunCucumber"))
}.recover {
  case t: Throwable =>
    println(s"[CucumberPlugin] Caught exception: ${t.getMessage}")
    -1
}.get
