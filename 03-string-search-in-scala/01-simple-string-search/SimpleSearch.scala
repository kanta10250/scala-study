@main def simpleSearch =
  val text = "カワカドカドカドドワンゴカドカドンゴドワドワンゴドワカワカドンゴドワ".toSeq
  val pattern = "ドワンゴ".toSeq

  def isMatch(textPart: Seq[Char], pattern: Seq[Char]): Boolean =
    var matched = true
    for i <- 0 to pattern.length - 1 do
      if textPart.length < pattern.length || textPart(i) != pattern(i) then
        matched = false
    matched

  def search(text: Seq[Char], pattern: Seq[Char]): Seq[Int] =
    var matchIndexes = Seq[Int]()
    for i <- 0 to text.length - 1 do
      val partText = text.slice(i, i + pattern.length)
      if isMatch(partText, pattern) then
        matchIndexes = matchIndexes :+ i
    matchIndexes

  val matchIndexes = search(text, pattern)

  println(s"出現場所: ${matchIndexes}")
