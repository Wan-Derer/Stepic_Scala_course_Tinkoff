import scala.io.StdIn.readInt

object Main {
  def main(args: Array[String]) {
    var value: Int = readInt()
    var count: Int = 0

    while (value != 0){
      if ((value & 1) == 1) {
        count = count + 1
      }
      value = value >> 1
    }

    println(count)

  }
}
