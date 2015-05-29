name := "nix-scala-parser"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.tpolecat" %% "atto-core" % "0.4.1"
)

scalacOptions in ThisBuild ++= Seq(
  "-feature",
  "-deprecation",
  "-Yno-adapted-args",
  "-Ywarn-value-discard",
  "-Ywarn-dead-code", // busted in 2.11 it seems
  "-Xlint",
  "-Xfatal-warnings",
  "-unchecked"
)

scalacOptions in compile ++= Seq(
  "-Yno-imports",
  "-Ywarn-numeric-widen"
)

resolvers += Resolver.bintrayRepo("tpolecat", "maven")
