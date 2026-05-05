scalaVersion := "3.3.1"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

val osName: SettingKey[String] = SettingKey[String]("osName")

osName := (System.getProperty("os.name") match {
  case name if name.startsWith("Linux") => "linux"
  case name if name.startsWith("Mac") => "mac"
  case name if name.startsWith("Windows") => "win"
  case _ => throw new Exception("Unknown platform!")
})

libraryDependencies += "org.openjfx" % "javafx-base" % "21.0.1" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-controls" % "21.0.1" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-fxml" % "21.0.1" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-graphics" % "21.0.1" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-web" % "21.0.1" classifier osName.value