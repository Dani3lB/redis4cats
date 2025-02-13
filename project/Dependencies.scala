import sbt._

object Dependencies {

  object V {
    val cats       = "2.10.0"
    val catsEffect = "3.5.2"
    val circe      = "0.14.6"
    val fs2        = "3.9.2"
    val log4cats   = "2.6.0"

    val lettuce = "6.2.6.RELEASE"
    val logback = "1.4.11"

    val kindProjector = "0.13.2"

    val munit = "0.7.29"
  }

  object Libraries {
    def cats(artifact: String): ModuleID     = "org.typelevel" %% s"cats-$artifact"     % V.cats
    def log4cats(artifact: String): ModuleID = "org.typelevel" %% s"log4cats-$artifact" % V.log4cats

    val catsEffectKernel = "org.typelevel" %% "cats-effect-kernel" % V.catsEffect
    val fs2Core          = "co.fs2"        %% "fs2-core"           % V.fs2

    val log4CatsCore = log4cats("core")

    val redisClient = "io.lettuce" % "lettuce-core" % V.lettuce

    // Examples libraries
    val catsEffect    = "org.typelevel" %% "cats-effect" % V.catsEffect
    val circeCore     = "io.circe" %% "circe-core" % V.circe
    val circeGeneric  = "io.circe" %% "circe-generic" % V.circe
    val circeParser   = "io.circe" %% "circe-parser" % V.circe
    val log4CatsSlf4j = log4cats("slf4j")
    val logback       = "ch.qos.logback" % "logback-classic" % V.logback

    // Testing libraries
    val catsLaws        = cats("core")
    val catsTestKit     = cats("testkit")
    val munitCore       = "org.scalameta" %% "munit" % V.munit
    val munitScalacheck = "org.scalameta" %% "munit-scalacheck" % V.munit
  }

  object CompilerPlugins {
    val kindProjector = compilerPlugin(
      "org.typelevel" % "kind-projector" % V.kindProjector cross CrossVersion.full
    )
  }

}
