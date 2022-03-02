import scala.annotation.tailrec

//@tailrec
//def fibs(n: Int, currentNumber: Int = 1, f1: Long = 0, f2: Long = 1): Long = {
//    if (n == currentNumber)
//        f2
//    else {
//        //put your code here
//
//    }
//}

//println(fibs(n))


object Main extends App {

    println(fibs(100))

    @tailrec
    def fibs(n: Int, currentNumber: Int = 1, f1: BigInt = 0, f2: BigInt = 1): BigInt = {
        if (n == currentNumber)
            f2
        else {
            fibs(n, currentNumber + 1, f2, f1 + f2)
        }
    }


}


