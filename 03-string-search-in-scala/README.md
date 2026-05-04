# Scalaで文字列探索

`03. Scalaで文字列探索` では、文字列を `Seq[Char]` として扱いながら、文字列検索アルゴリズムの実装を段階的に学ぶ。

現時点の構成は次のとおりである。

```text
03. Scalaで文字列探索/
└── 文字列検索のアルゴリズム/
    ├── SimpleSearch.scala
    ├── build.sbt
    ├── project/
    │   └── build.properties
    └── 文字列検索のアルゴリズム.md
```

## 学ぶ内容

- 文字列を `toSeq` で `Seq[Char]` に変換する方法
- `WrappedString` を通じて `String` をシーケンスとして扱う考え方
- 空のシーケンス `Seq()` を使った初期化
- `runMain simpleSearch` で Scala アプリケーションを実行する方法
- 文字列検索の出現位置を `matchIndexes` に集める実装の土台

## ファイル一覧

- [文字列検索のアルゴリズム.md](./文字列検索のアルゴリズム/文字列検索のアルゴリズム.md)
  文字列検索アプリケーションの導入と `toSeq`、`Seq[Char]` の考え方を説明する資料
- [SimpleSearch.scala](./文字列検索のアルゴリズム/SimpleSearch.scala)
  シンプルな文字列検索プログラムの出発点となる Scala ファイル
- [build.sbt](./文字列検索のアルゴリズム/build.sbt)
  Scala のバージョンとプロジェクト名を指定する sbt の設定ファイル
- [project/build.properties](./文字列検索のアルゴリズム/project/build.properties)
  sbt のバージョンを指定する設定ファイル

## 最後

このディレクトリでは、まず文字列をシーケンスとして扱う準備を行い、その上で文字列検索アルゴリズムを実装していく。
