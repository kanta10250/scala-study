## Scala のプログラムをファイルから実行する

REPL のようにその場でコードを試すだけでなく、Scala ではソースコードをファイルに保存して実行することもできる。ここでは、`Main.scala` と `build.sbt` を用意し、`sbt run` でプログラムを実行する流れを確認する。

## 用意するファイル

作業フォルダに、次の 2 つのファイルを作成する。

```text
.
├── Main.scala
└── build.sbt
```

`Main.scala` の内容は次のようにする。

```scala
@main def hello = println("Hello World")
```

このプログラムは、実行すると `Hello World` と表示する。

`build.sbt` の内容は次のようにする。

```scala
scalaVersion := "3.3.1"
```

`build.sbt` は、`sbt` で使うビルド設定ファイルであり、ここでは Scala のバージョンを `3.3.1` に設定している。

## VS Code

次のコマンドを入力する。

```text
ext install scala
```

検索結果が表示されたら、`Scala Syntax (official)` と `Scala (Metals)` の拡張機能をインストールする。

インストール後に再読み込みを行うと、Scala のシンタックスハイライトや補完、デバッグ支援などを使えるようになる。

## プログラムを実行する

次のコマンドを実行する。

```bash
sbt run
```

このコマンドは、プログラムをビルドして実行するためのものである。

たとえば、正常に動作すると次のように表示される。

```text
[info] running hello
Hello World
[success] Total time: 1 s, completed 2026-04-19
```

必要なライブラリのダウンロードやビルドが完了し、最終的に `Hello World` と表示されれば成功である。

## 補足

この `01-run-scala-from-file` は、`build.sbt` を持つ独立した小さな sbt プロジェクトである。そのため、ほかの章の Scala ファイルとは分かれて実行できる。

## 最後

Scala では、REPL だけでなく、ソースコードをファイルとして保存して実行する方法も使える。`Main.scala` にプログラムを書き、`build.sbt` で設定を行い、`sbt run` を実行することで、ファイルから Scala のプログラムを動かせる。
