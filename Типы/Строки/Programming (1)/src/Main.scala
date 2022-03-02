import scala.io.StdIn

object Main {
  def main(args: Array[String]) {
    val inStr:String = StdIn.readLine()

    println(inStr.matches("[a-z]+(_[a-z]+)*"))

  }
}