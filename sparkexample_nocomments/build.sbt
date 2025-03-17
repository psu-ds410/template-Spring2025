// update this as described in the slides
lazy val root = (project in file("."))
   .settings(
       name := "word count",
       version := "1.0",
       scalaVersion := "2.12.18"
   )

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "3.5.2" % "provided",
    "org.apache.spark" %% "spark-sql" % "3.5.2" % "provided"
)
