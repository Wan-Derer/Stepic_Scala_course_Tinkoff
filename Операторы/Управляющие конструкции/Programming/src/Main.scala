import scala.io.StdIn

object Main {
    def main(args: Array[String]): Unit = {
        val n: Int = StdIn.readInt()

        for (i <- Range(1, n)) {
            for (j <- Range(1, n)) {
                if (BigInt.int2bigInt(i).gcd(BigInt.int2bigInt(j)) == 1) println(i + " " + j)
            }
        }

//        for (i <- 1 until n; j <- 1 until n ) println(s"$i\t$j")


    }
}