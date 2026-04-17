## sbt とは

`sbt`（えすびーてぃー）は、Scalaで書いたコードをコンパイルし、実行やテスト、パッケージ化などを支援するビルドツールである。

ScalaやJavaには、ソースコードをそのまま実行するのではなく、いったんバイトコードに変換する「コンパイル」の段階がある。バイトコードはクラスファイルとも呼ばれ、この変換の過程でソースコードのチェックも行われる。

このように、複数のソースコードをコンパイルして動作可能な状態にまとめることを「ビルド」という。`sbt` は、このビルドをサポートするためのツールである。

Javaの世界には、`ant`、`maven`、`gradle` などのビルドツールもあるが、Scalaでは `sbt` がよく使われる。`sbt` を使うと、Scalaのバージョン管理や必要なライブラリの自動ダウンロードなどを行える。

## sbt を動かしてみる

ターミナルで、次のコマンドを実行する。

```bash
sbt new scala/scala3.g8
```

これで、Scala 3 のプロジェクトテンプレートを作成できる。

実行すると、次のようにプロジェクト名を聞かれる。

```text
name [Scala 3 Project Template]:
```

ここでは、`hello-world` とする。

その後、作成されたプロジェクトに移動する。

```bash
cd hello-world
```

## プロジェクトのディレクトリ構成

作成直後のディレクトリ構成は、次のようになっている。

```text
.
├── build.sbt
├── project
│   └── build.properties
├── README.md
└── src
    ├── main
    │   └── scala
    │       └── Main.scala
    └── test
        └── scala
            └── MySuite.scala
```

主なファイルの役割は、次のとおりである。

| ファイル名 | 内容 |
| --- | --- |
| `README.md` | プロジェクトの説明を書くマークダウン形式のドキュメント |
| `build.sbt` | ビルドの設定ファイル |
| `project/build.properties` | `sbt` のバージョンを指定するファイル |
| `src/main/scala/Main.scala` | Scalaのメインのソースコード |
| `src/test/scala/MySuite.scala` | Scalaのテストコード |

`Main.scala` の中身は、次のようになっている。

```scala
@main def hello: Unit =
  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3. :)"
```

これは、次のメッセージを表示するためのプログラムである。

```text
Hello world!
I was compiled by Scala 3. :)
```

## プロジェクトを実行する

次のコマンドを実行すると、プロジェクトを動かせる。

```bash
sbt run
```

たとえば、次のように表示される。

```text
[info] running hello
Hello world!
I was compiled by Scala 3. :)
```

`sbt run` を実行すると、`sbt` が自動的にソースコードをコンパイルし、そのまま実行してくれる。

## sbt の常駐モード

`sbt` は、一度起動すると常駐した状態で、コンパイルやテスト、実行などのコマンドを受け付けられる。

たとえば、次のように操作できる。

```text
$ sbt
sbt:hello-world> compile
sbt:hello-world> run
sbt:hello-world> exit
```

これは、まとめて `sbt run` を実行するのと同じような流れである。ここでの `sbt:hello-world>` は、`sbt` が常駐している状態のプロンプトを表している。

## target フォルダについて

`target` フォルダの中には、コンパイルによって生成されたバイトコードや各種ビルド成果物が出力される。

Scalaでは、ソースコードからこのようなビルド済みファイルが多く生成されるため、それらを手動で管理するのではなく、`sbt` のようなビルドツールに任せることが重要になる。

また、`sbt` には、アプリケーションのテストや、配布しやすい形へのパッケージ化を支援する機能も用意されている。

## 最後

`sbt` は、ScalaやJavaのソースコードをコンパイルし、ビルドを行うための基本的なツールである。
