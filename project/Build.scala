import sbt._
import Keys._

object Lab1Build extends Build {
  lazy val root = Project(id = "lab3",
                          base = file("."))

  lazy val grader = Project(id = "Lab3Grader",
                            base = file("grader")) dependsOn(root)
}
