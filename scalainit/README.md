# Scala Init

`scalainit` 配下のファイルは、内容ごとに次のように整理している。

## フォルダ構成

```text
scalainit/
├── 01-introduction/
│   └── scala-overview-and-jvm.md
├── 02-environment-setup/
│   ├── coursier-installation.md
│   └── cs
├── 03-coursier-toolchain-setup/
│   └── coursier-toolchain-setup.md
├── 04-sbt-basics/
│   ├── hello-world/
│   └── sbt-overview-and-basic-usage.md
├── 05-scala-repl-basics/
│   └── scala-repl-basics.md
└── README.md
```

- `01-introduction/`
  Scalaそのものの概要や、JVMとの関係をまとめた資料
- `02-environment-setup/`
  Scalaの開発環境を整えるための手順書と、環境構築で使うCoursier関連の実行ファイル
- `03-coursier-toolchain-setup/`
  Coursierを使ってJVMやScala関連ツールを個別にセットアップする手順
- `04-sbt-basics/`
  sbtの概要、基本操作、サンプルプロジェクトをまとめた資料
- `05-scala-repl-basics/`
  ScalaのREPLの使い方と基本的な動作をまとめた資料

## ファイル一覧

- [scala-overview-and-jvm.md](./01-introduction/scala-overview-and-jvm.md)
  Scalaの概要、Javaとの関係、JVMの仕組みを説明する資料
- [coursier-installation.md](./02-environment-setup/coursier-installation.md)
  Coursierを使ったScala開発環境のセットアップ手順
- `02-environment-setup/cs`
  Coursierの実行ファイル
- [coursier-toolchain-setup.md](./03-coursier-toolchain-setup/coursier-toolchain-setup.md)
  CoursierでJVM、Scala、sbt、ammonite、scalafmtを導入する手順
- [sbt-overview-and-basic-usage.md](./04-sbt-basics/sbt-overview-and-basic-usage.md)
  sbtとは何か、プロジェクト作成、実行方法を説明する資料
- `04-sbt-basics/hello-world/`
  sbtで作成したサンプルプロジェクト
- [scala-repl-basics.md](./05-scala-repl-basics/scala-repl-basics.md)
  Scala REPL の起動方法、`res0` の意味、型の見方、便利なコマンドを説明する資料
