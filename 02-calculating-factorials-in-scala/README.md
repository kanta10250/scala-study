# Calculating Factorials in Scala

`02-calculating-factorials-in-scala` では、Scala のプログラムをファイルから実行する方法と、そのソースコードの読み方を確認する。

現時点の構成は次のとおりである。

```text
02-calculating-factorials-in-scala/
├── .gitignore
├── 01-run-scala-from-file/
│   ├── Main.scala
│   ├── build.sbt
│   └── run-scala-from-file.md
├── 02-understanding-a-scala-application/
│   └── understanding-a-scala-application.md
├── 03-running-in-the-sbt-shell/
│   └── running-in-the-sbt-shell.md
├── 04-distance-calculator/
│   ├── DistanceCalculator.scala
│   ├── build.sbt
│   ├── distance-calculator.md
│   └── project/
│       └── build.properties
├── 05-numeric-types-and-arithmetic/
│   └── numeric-types-and-arithmetic.md
└── README.md
```

## 学ぶ内容

- Scala のプログラムをファイルに保存して実行する方法
- `build.sbt` を使って Scala のバージョンを設定する方法
- `sbt run` でプログラムをビルドして実行する方法
- `sbt` を起動したまま `run` を実行する方法
- `Main.scala` に書かれた最小の Scala アプリケーションの読み方
- `@main`、`def`、`println` などの基本的な構文
- `lastGrep` を使って実行ログを確認する方法
- 別の題材を独立した sbt プロジェクトとして分ける方法
- 距離を計算する Scala プログラムの作成方法
- Scala の数値型と算術演算の基本
- 整数の割り算と浮動小数点数の誤差の違い

## ファイル一覧

- [run-scala-from-file.md](./01-run-scala-from-file/run-scala-from-file.md)
  Scala のプログラムをファイルから実行する手順をまとめた資料
- [Main.scala](./01-run-scala-from-file/Main.scala)
  `Hello World` を表示する最小の Scala プログラム
- [build.sbt](./01-run-scala-from-file/build.sbt)
  Scala のバージョンを指定する sbt の設定ファイル
- [understanding-a-scala-application.md](./02-understanding-a-scala-application/understanding-a-scala-application.md)
  `Main.scala` の内容を読みながら、Scala の基本構文を解説する資料
- [running-in-the-sbt-shell.md](./03-running-in-the-sbt-shell/running-in-the-sbt-shell.md)
  `sbt` を起動したまま `run` や `lastGrep` を使う方法を説明する資料
- [DistanceCalculator.scala](./04-distance-calculator/DistanceCalculator.scala)
  距離を計算する Scala のサンプルプログラム
- [build.sbt](./04-distance-calculator/build.sbt)
  `04` の Scala バージョンを指定する sbt の設定ファイル
- [project/build.properties](./04-distance-calculator/project/build.properties)
  `04` の sbt バージョンを指定する設定ファイル
- [distance-calculator.md](./04-distance-calculator/distance-calculator.md)
  距離を計算するプログラムの実装内容を説明する資料
- [numeric-types-and-arithmetic.md](./05-numeric-types-and-arithmetic/numeric-types-and-arithmetic.md)
  Scala の数値型、型変換、算術演算、浮動小数点数の誤差をまとめた資料

## 進め方

1. `01-run-scala-from-file` の資料を読み、`Main.scala` と `build.sbt` の役割を確認する
2. `sbt run` を実行して、`Hello World` が表示されることを確認する
3. `02-understanding-a-scala-application` の資料を読み、ソースコードの意味を理解する
4. `03-running-in-the-sbt-shell` の資料を読み、`sbt` の常駐モードで `run` やログ確認を試す
5. `04-distance-calculator` で別の sbt プロジェクトとして距離計算プログラムを動かす
6. `05-numeric-types-and-arithmetic` の資料を読み、数値型と計算結果の違いを確認する

## 最後

このディレクトリでは、Scala のプログラムをファイルとして扱う最初の流れを学べる。REPL だけでなく、ソースファイルと `sbt` を使った実行方法、別題材を独立した sbt プロジェクトとして分ける考え方、さらに数値型や算術演算の基礎まで確認できる。
