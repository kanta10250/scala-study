## JVM のセットアップ

JDKには、Oracle社が提供しているOracle JDKのほか、同じくOracleが提供しオープンに開発されているOpenJDK、それをベースにしてGoogleやMicrosoft、Red Hat、HUAWEI、IBMなどのベンダーやコミュニティが提供しているAdoptOpenJDK、OpenJDKの有力貢献企業であるBellsoftが提供するLiberica JDKなどがある。

今回は、OpenFXなどのGUIライブラリが同梱されている`Liberica JDK Full`をインストールする。

`Liberica JDK Full 21.0.0` をインストールするために、以下のコマンドを実行する。

```bash
cs setup --jvm liberica-full:21.0.0
```

上記を実行すると、次のような表示が出ることがある。

```text
Should we update ~/.profile, ~/.zprofile, ~/.bash_profile? [Y/n]
```

これは設定ファイルを更新するかを確認しているので、`Y` を選択する。

セットアップが成功すると、次のように表示される。

```text
Found ammonite
Found cs
Found coursier
Found scala
Found scalac
Found scala-cli
Found sbt
Found sbtn
Found scalafmt
```

最後に、以下のコマンドを実行する。

```bash
cs java --jvm liberica-full:21.0.0 --setup
```

その後、一度ターミナルを閉じて、再び開いてから以下のコマンドを実行する。

```bash
cs java --version
```

たとえば、次のように表示されれば、Coursierに対して指定したバージョンのJVMがインストールされていることを確認できる。

```text
openjdk 21.0.8 2025-07-15
OpenJDK Runtime Environment Homebrew (build 21.0.8)
OpenJDK 64-Bit Server VM Homebrew (build 21.0.8, mixed mode, sharing)
```

## Scala のセットアップ

次に、Scalaのセットアップを行う。Scalaのバージョンは `3.3.1` に固定してインストールする。

Scalaの実行ツールである`scala`、ScalaのコードをJVMで実行可能な形式にコンパイルする`scalac`、そしてコマンドラインでScalaを実行する`scala-cli`をインストールする。

```bash
cs install scala:3.3.1
cs install scalac:3.3.1
cs install scala-cli:1.0.4
```

インストール後、以下のコマンドでバージョンを確認する。

```bash
scala --version
```

```text
Scala code runner version 3.3.1 -- Copyright 2002-2023, LAMP/EPFL
```

次に、以下を実行する。

```bash
scalac --version
```

```text
Scala compiler version 3.3.1 -- Copyright 2002-2023, LAMP/EPFL
```

続いて、以下を実行する。

```bash
scala-cli --version
```

```text
Scala CLI version: 1.0.4
Scala version (default): 3.3.0
Your Scala CLI version is outdated. The newest version is 1.13.0
It is recommended that you update Scala CLI through the same tool or method you used for its initial installation for avoiding the creation of outdated duplicates.
```

このように表示され、`scala-cli` が `1.0.4` であることを確認できれば、Scalaのインストールは完了である。

## sbt のセットアップ

`sbt` は、Scalaで作られたプロジェクトを管理するためのツールである。Scalaのアプリケーションに必要なライブラリを自動的にダウンロードしたり、実行可能なアプリケーションを作成したりできる。

ここでは、`sbt 1.9.6` をインストールする。

```bash
cs install sbt:1.9.6
```

インストール後、以下を実行する。

```bash
sbt --version
```

```text
sbt version in this project: 1.9.6
sbt script version: 1.9.6
```

`1.9.6` が表示されれば成功である。

## ammonite のセットアップ

`ammonite` は、ScalaのREPL（対話実行環境）を提供したり、Scalaのスクリプトを実行したりするためのツールである。ここでは、`3.0.0-M0-56-1bcbe7f6` をインストールする。

```bash
cs install ammonite:3.0.0-M0-56-1bcbe7f6
```

実行後、次のコマンドでバージョンを確認する。

```bash
amm --version
```

```text
Ammonite REPL & Script-Runner, 3.0.0-M0-56-1bcbe7f6
```

このバージョンが表示されれば成功である。

## scalafmt のセットアップ

`scalafmt` は、Scalaのコードを自動的に整形するためのツールである。これにより、誰が書いても同じ形式のコードにそろえやすくなり、保守性を高めやすくなる。

最近の言語では、Go言語の`gofmt`やRust言語の`rustfmt`のように、コードフォーマットツールを使って形式を統一することが一般的になっている。

ここでは、`scalafmt 3.7.14` をインストールする。

```bash
cs install scalafmt:3.7.14
```

インストール後、以下を実行する。

```bash
scalafmt --version
```

```text
scalafmt 3.7.14
```

バージョン `3.7.14` が表示されれば成功。

## 最後
JVMはJava Virtual Machineの略で、Javaのソースコードが変換された後の中間形式であるクラスファイルを実行する役割を持つ仮想マシン
