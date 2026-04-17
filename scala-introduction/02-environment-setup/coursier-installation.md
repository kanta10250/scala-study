## Coursierとは
Coursierは、Scalaの開発環境を構築するために必要なツールをまとめてセットアップできるツールで、名前はフランス語で「配達員」を意味する。

Scalaを学んだり開発したりするには、JDK（Java Development Kit）、Scalaのコンパイラである`scalac`、そしてプロジェクト管理に使うビルドツール`sbt`などが必要になる。`scalac`は、ScalaのコードをJVM（Java Virtual Machine）で実行できる形式に変換するツールである。

これらを個別にインストールするのは手間がかかるうえ、バージョンの違いによって動作や学習手順が変わることもある。Coursierを使えば、必要なツールをまとめて導入し、バージョンもそろえやすくなるため、環境構築をスムーズに進めやすい。

Macシリコン環境では、次のコマンドを実行する。

```bash
curl -fL https://github.com/VirtusLab/coursier-m1/releases/latest/download/cs-aarch64-apple-darwin.gz | gzip -d > cs
chmod +x cs
./cs setup
```

実行中には、次のような表示が出ることがある。

```text
Checking if a JVM is installed
Found a JVM installed under /opt/homebrew/Cellar/openjdk@21/21.0.8/libexec/openjdk.jdk/Contents/Home.

Checking if ~/Library/Application Support/Coursier/bin is in PATH
Should we add ~/Library/Application Support/Coursier/bin to your PATH via ~/.profile, ~/.zprofile, ~/.bash_profile? [Y/n]
```

このように表示された場合は、`Y` を選択する。セットアップが完了すると、次のように必要なツールがインストールされたことが表示される。

```text
Checking if the standard Scala applications are installed
Installed ammonite
Installed cs
Installed coursier
Installed scala
Installed scalac
Installed scala-cli
Installed sbt
Installed sbtn
Installed scalafmt
```

ここまで表示されれば、セットアップは完了である。なお、JDKのインストールもCoursierのセットアップ時に自動的に行われる。

最後に、一度ターミナルを閉じてから再度開き、次のコマンドで確認する。

```bash
cs version
```

たとえば、次のようにバージョンが表示されれば問題ない。

```text
2.1.25-M24
```
