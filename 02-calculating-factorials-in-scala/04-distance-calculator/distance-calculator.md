## 距離を計算するプログラムを実装する

ここでは、`04-distance-calculator` を `01-run-scala-from-file` とは別の sbt プロジェクトとして扱い、距離を計算するプログラムを作成する。

このディレクトリには、次のような構成を用意する。

```text
.
├── DistanceCalculator.scala
├── build.sbt
└── project/
    └── build.properties
```

`build.sbt` の内容は、次のようにする。

```scala
name := "distance-calculator"
scalaVersion := "3.3.1"
```

また、`project/build.properties` では sbt のバージョンを指定する。

```text
sbt.version=1.9.6
```

この設定により、`04-distance-calculator` は `01-run-scala-from-file` とは独立した sbt プロジェクトとして実行できる。

まずは、`DistanceCalculator.scala` を次のように書いて動きを確認する。

```scala
@main def distance =
  val kilometersPerHours = 11
  val minutes = 100
  val distance = kilometersPerHours * minutes / 60

  println(s"走った距離は${distance}キロメートル")
```

このコードは、Scala のアプリケーションとして `distance` という関数を定義している。その後、`=` の右側に関数の中身を書いている。Scala 3 では Python と同様にインデントで処理のまとまりを表現できる。なお、一行でそのまま `=` の後に定義することも可能である。

このコードでは、スペース2つでインデントされている4行が関数の中身の処理になっている。

val は、Scalaにおける定数宣言です。
JavaScriptのES6における、const と似た性質をもっています。
また、再代入可能なものに var というものがありますが、可読性・保守性の観点から基本使うことは良しとされません。

```scala
val kilometersPerHours = 11
val minutes = 100
```

これは、速度が毎時 11 キロメートル、走った時間が 100 分であることを表している。

そして、

```scala
val distance = kilometersPerHours * minutes / 60
```

ここでは「速さ」かける「時間」を行っている。
分数で時間が渡されているため、60で割って時間に換算しています。

```scala
println(s"走った距離は${distance}キロメートル")
```

これは、Scalaにおける文字列の中で変数を利用する記述の仕方である。
ES6では ` (バッククオート) を利用してこのString interpolationの機能を実現していました。
Scalaは文字列のリテラル[1]の前に s を記述することで、${変数} で変数を文字列の中で読み出すことができます。

## プログラムを実行する

距離を計算するプログラムを実行するときは、このディレクトリへ移動して `sbt` を起動する。

```bash
cd 02-calculating-factorials-in-scala/04-distance-calculator
sbt
```

その後、次を実行する。

```text
run
```

`04-distance-calculator` が `01-run-scala-from-file` と独立した sbt プロジェクトになっていれば、`hello` と競合せず `distance` だけを実行できる。

実行すると、次のように表示される。

```text
[info] running distance 
走った距離は18キロメートル
[success] Total time: 0 s, completed 2023/10/16 15:51:20
```

本来は、11かける100 ÷ 60なので18.333...のような答えが表示されるはずですが、小数点以下が省略されてしまいました。

これは、Scalaにおける割り算 / 演算子による計算は、余りを無視するためです。

これを回避するために、あらかじめすべての値を浮動小数点数で与えておく必要がある。
最終的には、`DistanceCalculator.scala` を次のように修正する。

```scala
@main def distance =
  val kilometersPerHours = 11.0
  val minutes = 100.0
  val distance = kilometersPerHours * minutes / 60.0
  println(s"走った距離は${distance}キロメートルです")
```

以上のように記述することで、割り算も浮動小数点数の計算となる。

編集後、再度 `run` を実行すると次のようになる。

```text
[info] running distance 
走った距離は18.333333333333332キロメートルです
[success] Total time: 0 s, completed 2023/10/16 15:52:33
```

このように表示され、Scala の持つ浮動小数点数の精度で答えが表示される。

※ここでは余り（小数以下の部分）に誤差が生じています、この理由については次に説明します。

## まとめ

- `04-distance-calculator` に `build.sbt` と `project/build.properties` を置くことで、`01-run-scala-from-file` とは別の sbt プロジェクトとして扱える
- Scala の `val` は不変の値を宣言するために使う
- 文字列内で変数を使うときは `s"${変数}"` のように文字列補間を使える
- 整数同士の割り算では小数部分が失われる
- 浮動小数点数で計算すると、小数を含む結果を得られる
