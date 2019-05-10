name := "sbt-elastic-beanstalk"
version := "0.5.3"
organization := "com.ovoenergy"
organizationName := "OVO Energy"
scalaVersion := "2.10.6"
sbtPlugin := true

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.5")

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-elasticbeanstalk" % "1.10.77",
  "com.amazonaws" % "aws-java-sdk-s3" % "1.10.77")

publishMavenStyle := true

resolvers ++= Seq(
  Resolver.bintrayRepo("ovotech", "maven"),
  "confluent" at "https://packages.confluent.io/maven"
)

pomIncludeRepository := { _ => false }
bintrayOrganization := Some("ovotech")
licenses := Seq("Apache 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
homepage := Some(url("http://www.ovoenergy.com"))
pomExtra := (
  <developers>
    <developer>
      <id>Ovo Energy</id>
      <name>Ovo Energy</name>
      <url>http://www.ovoenergy.com</url>
    </developer>
  </developers>)
