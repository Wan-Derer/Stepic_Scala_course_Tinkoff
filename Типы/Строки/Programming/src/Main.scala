import scala.io.StdIn

object Main {
  def main(args: Array[String]) {

    val line1: Array[String] = StdIn.readLine().split(" ")
    val start: Int = line1(0).toInt
    val end: Int = line1(1).toInt

    val line2: String = StdIn.readLine()

    print(line2.substring(0, start))

    val mid: Array[Char] = line2.substring(start, end + 1).toCharArray
    for (i <- mid.length - 1 to 0 by -1) {
      print(mid(i))
    }

    println(line2.substring(end + 1))

  }
}