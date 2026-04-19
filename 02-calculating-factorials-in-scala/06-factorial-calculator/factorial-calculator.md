# 階乗を計算するプログラム

ここでは、`06-factorial-calculator` を独立した sbt プロジェクトとして扱い、階乗を計算する Scala プログラムを作成する。
階乗は、`n! = n × (n - 1) × ... × 1` で表される。たとえば、`5!` は `5 × 4 × 3 × 2 × 1 = 120` である。

## ディレクトリ構成

```text
.
├── FactorialCalculator.scala
├── build.sbt
└── project/
    └── build.properties
```

## sbt の設定

`build.sbt` には、プロジェクト名と Scala のバージョンを書く。

```scala
name := "factorial-calculator"

scalaVersion := "3.3.1"
```

`project/build.properties` には、sbt のバージョンを書く。

```text
sbt.version=1.9.6
```

この設定により、`06-factorial-calculator` は他の章とは独立した Scala 3 の sbt プロジェクトとして実行できる。

## プログラム

`FactorialCalculator.scala` は次のように書く。

```scala
import scala.math.BigInt

@main def factorial1000 = println(factorial(1000))

def factorial(i: BigInt): BigInt =
  if i == 0 then 1 else i * factorial(i - 1)
```

## コードのポイント

### `@main`

```scala
@main def factorial1000 = println(factorial(1000))
```

`@main` を付けると、この関数がアプリケーションの入口になる。
ここでは `factorial(1000)` を呼び出して、その結果を `println` で表示している。

### `BigInt`

```scala
import scala.math.BigInt
```

階乗は値が急激に大きくなるため、`Int` や `Long` ではすぐに表現しきれなくなる。
そのため、非常に大きな整数を扱える `BigInt` を使う。

### 再帰による階乗の定義

```scala
def factorial(i: BigInt): BigInt =
  if i == 0 then 1 else i * factorial(i - 1)
```

この関数は再帰を使って階乗を求めている。

- `i == 0` のときは `1` を返す
- それ以外では `i * factorial(i - 1)` を返す

この `i == 0` の部分を基底条件という。基底条件がないと、関数が終わらずに呼び出され続けてしまう。

たとえば `5!` は次のように計算される。

```text
factorial(5)
= 5 * factorial(4)
= 5 * 4 * factorial(3)
= 5 * 4 * 3 * factorial(2)
= 5 * 4 * 3 * 2 * factorial(1)
= 5 * 4 * 3 * 2 * 1 * factorial(0)
= 5 * 4 * 3 * 2 * 1 * 1
= 120
```

## 実行方法

このプログラムを実行するときは、`06-factorial-calculator` に移動して `sbt` を起動する。

```bash
cd 02-calculating-factorials-in-scala/06-factorial-calculator
sbt
```

その後、次を実行する。

```text
run
```

`build.sbt` を追加した直後で、すでに `sbt` を起動していた場合は、先に次を実行する。

```text
reload
```

## 実行結果

実行すると、`1000!` の非常に大きな整数が表示される。

```text
[info] running factorial1000
4023872600...
```

結果が非常に長いのは、階乗が急激に大きくなるためである。

## まとめ

- `06-factorial-calculator` は Scala 3 の独立した sbt プロジェクトとして扱える
- 階乗は `n × (n - 1) × ... × 1` で表される
- `factorial` 関数は再帰を使って階乗を求めている
- `i == 0` は処理を止めるための基底条件である
- 階乗はすぐに大きな数になるため、`BigInt` を使うのが適している
