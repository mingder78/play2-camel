import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play2-camel-samplels"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
	"play2-camel" % "play2-camel_2.9.1" % "1.0-SNAPSHOT"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
 	resolvers += "Local Play Repository" at "/Users/mingderwang/play-2.0.2/repository/local"
    )

}
