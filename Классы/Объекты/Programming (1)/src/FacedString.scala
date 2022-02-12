import scala.io.StdIn

object FacedString {
  def apply(input: String) = s"*_*$input*_*"

  def unapply(arg: String): Option[String] = ???
}

object Main {
def main(args: Array[String]) {
   StdIn.readLine() match {
    case FacedString(str) => println(str)
    case _ => println("Could not recognize string")
  }
}}