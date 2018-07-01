package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorialTailRecursive(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int , accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //TAIL RECURSION = use recursive call as the LAST expression
    }
    factHelper(n, accumulator = 1 )
  }

  print(factorialTailRecursive(20000))

}
