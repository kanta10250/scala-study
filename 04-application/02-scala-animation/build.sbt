scalaVersion := "3.3.1"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

val javafxPlatform: SettingKey[String] = SettingKey[String]("javafxPlatform")

javafxPlatform := {
  val osName = System.getProperty("os.name")
  val osArch = System.getProperty("os.arch")

  (osName, osArch) match {
    case (name, arch) if name.startsWith("Linux") && arch.contains("aarch64") => "linux-aarch64"
    case (name, _) if name.startsWith("Linux") => "linux"
    case (name, arch) if name.startsWith("Mac") && (arch == "aarch64" || arch == "arm64") => "mac-aarch64"
    case (name, _) if name.startsWith("Mac") => "mac"
    case (name, _) if name.startsWith("Windows") => "win"
    case _ => throw new Exception("Unknown platform!")
  }
}

libraryDependencies += "org.openjfx" % "javafx-base" % "21.0.1" classifier javafxPlatform.value
libraryDependencies += "org.openjfx" % "javafx-controls" % "21.0.1" classifier javafxPlatform.value
libraryDependencies += "org.openjfx" % "javafx-fxml" % "21.0.1" classifier javafxPlatform.value
libraryDependencies += "org.openjfx" % "javafx-graphics" % "21.0.1" classifier javafxPlatform.value
libraryDependencies += "org.openjfx" % "javafx-web" % "21.0.1" classifier javafxPlatform.value

ThisBuild / assemblyMergeStrategy := {
  case PathList(ps @ _*) if ps.last endsWith ".json" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".dylib" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".bss" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".class" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last == "resourcebundles" => MergeStrategy.first
  case "javafx-swt.jar" => MergeStrategy.first
  case x =>
    val oldStrategy = (ThisBuild / assemblyMergeStrategy).value
    oldStrategy(x)
}