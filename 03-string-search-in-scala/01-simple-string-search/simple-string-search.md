## シンプルな文字列検索のアプリケーションの作成

ここでは、`文字列検索のアルゴリズム` を独立した sbt プロジェクトとして扱い、シンプルな文字列検索のプログラムを作成する。

このディレクトリには、次のような構成を用意する。

```text
.
├── SimpleSearch.scala
├── build.sbt
├── project/
│   └── build.properties
└── 文字列検索のアルゴリズム.md
```

`build.sbt` の内容は次のようにする。

```scala
name := "simple-search"

scalaVersion := "3.3.1"
```

また、`project/build.properties` では sbt のバージョンを指定する。

```text
sbt.version=1.9.6
```

この設定により、`文字列検索のアルゴリズム` は他の章とは独立した Scala 3 の sbt プロジェクトとして実行できる。

## プログラム

`SimpleSearch.scala` は、まず次のように書く。

```scala
@main def simpleSearch =
  val text = "カワカドカドカドドワンゴカドカドンゴドワドワンゴドワカワカドンゴドワ".toSeq
  val pattern = "ドワンゴ".toSeq
  val matchIndexes = Seq()

  println(s"出現場所: ${matchIndexes}")
```

検索対象の文書が `text` で、検索するパターンが `pattern` である。
ここではまだ探索処理は書かず、`matchIndexes` には仮の答えとして空のシーケンスを入れている。

## `toSeq` で `Seq[Char]` に変換する

`text` と `pattern` では、それぞれ文字列に対して `toSeq` メソッドを呼び出している。

```scala
val text = "...".toSeq
val pattern = "ドワンゴ".toSeq
```

この `toSeq` により、`String` を `Seq[Char]` として扱えるようにしている。
`Seq[Char]` は、文字の並びを表現する型である。

どのような値になるのかは、REPL で次のように確認できる。

```text
scala> "ドワンゴ".toSeq
val res0: scala.collection.immutable.WrappedString = ドワンゴ
```

このように、内部的には `scala.collection.immutable.WrappedString` として扱われる。
`WrappedString` は `String` を `Seq[Char]` のように扱うためのクラスであり、その結果として文字列に対して添字アクセスや長さ取得など、シーケンスとしての操作を行える。

`Seq[A]` の `A` は型パラメータであり、`Seq[Char]` のほかにも `Seq[Int]` や `Seq[String]` のように使える。
ここでは、一旦「文字の列として扱うために `toSeq` している」と理解しておけば十分である。

## 空のシーケンス

`matchIndexes` には、まず空のシーケンスを入れている。

```scala
val matchIndexes = Seq()
```

`Seq()` と書くことで空のシーケンスを作れる。
この段階ではまだ探索の実装をしていないため、出現位置は空のままである。

## 実行方法

このプログラムを実行するときは、`文字列検索のアルゴリズム` ディレクトリへ移動して `sbt` を起動する。

```bash
cd "03. Scalaで文字列探索/文字列検索のアルゴリズム"
sbt
```

その後、次を実行する。

```text
runMain simpleSearch
```

`build.sbt` を追加した直後で、すでに `sbt` を起動していた場合は、先に次を実行する。

```text
reload
```

## 実行結果

実行すると、次のように表示される。

```text
[info] running simpleSearch
出現場所: List()
```

もちろんまだ実装は何もしていないため、`println(s"出現場所: ${matchIndexes}")` で表示されるリストの中身は空になる。

このように、最終的には `matchIndexes` にパターンが出現する場所のインデックスが入るように実装していく。

## まとめ

- `SimpleSearch.scala` を用意すると、文字列検索のプログラムを独立した sbt プロジェクトとして実行できる
- `toSeq` により `String` を `Seq[Char]` として扱える
- `toSeq` の結果は内部的には `WrappedString` として表現される
- `Seq[A]` の `A` には任意の型を指定でき、`Seq[Char]` は文字の並びを表す
- `Seq()` を使うと空のシーケンスを作れる
- この段階では `matchIndexes` は空なので、実行結果は `List()` になる
