def isCapital(word: String, pos: Int): Boolean = {
  // your code here
  val c: Char = word.charAt(pos)
  c >= 'A' && c <= 'Z'
}