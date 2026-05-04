# Scala Study

このリポジトリは、Scala の基礎を段階的に学ぶための学習用ノートとサンプルコードをまとめたものである。

## ディレクトリ構成

```text
.
├── 01-scala-introduction/
├── 02-calculating-factorials-in-scala/
└── 03. Scalaで文字列探索/
```

## 各ディレクトリの内容

- [01-scala-introduction](./01-scala-introduction/README.md)
  Scala の概要、JVM、環境構築、sbt、REPL などの入門内容をまとめた資料
- [02-calculating-factorials-in-scala](./02-calculating-factorials-in-scala/README.md)
  Scala のプログラムをファイルから実行する方法、作成したアプリケーションの読み方、sbt の常駐実行、数値型と算術演算、`BigInt` と再帰による階乗計算をまとめた資料
- [03. Scalaで文字列探索](./03.%20Scalaで文字列探索/README.md)
  文字列を `Seq[Char]` として扱う方法と、文字列検索アルゴリズムの実装を始めるための資料

## 最後

まずは `01-scala-introduction` で基礎を確認し、その後に `02-calculating-factorials-in-scala` でファイルを使った Scala プログラムの実行、読解、`sbt` の基本、数値型と計算の考え方、再帰による階乗計算に進む。続けて `03. Scalaで文字列探索` で、文字列をシーケンスとして扱いながら文字列検索アルゴリズムを実装していく。
