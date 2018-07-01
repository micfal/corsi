package exercises

import scala.annotation.tailrec

object EserciziTailRecursion extends App {
  //1. concatenazione stringa n volte.
  def concatenaStringa(token: String, nVolte: Int): String = {
    @tailrec
    def concatenaHelper(n: Int, accumulator: String ): String = {
      if( n <= 1) accumulator
      else concatenaHelper(n-1,accumulator + ";" + token)
    }
    concatenaHelper(nVolte,token)
  }

  //println(concatenaStringa(token = "MikeFake",nVolte = 20000))

  def isPrimo(n: Int): Boolean = {
    @tailrec
    def isPrimoFinoA(x: Int): Boolean = {
      if ( x <= 1) true
      else n % x != 0 && isPrimoFinoA(x-1)
    }

    isPrimoFinoA(n-1)
  }

  //println(isPrimo(20000000))

  //3. Fibonacci
  // f(1) = 1
  // f(2) = 1
  // f(n) = f(n-1) + f(n-2)
  def fFibonacci(n: Int): Int = {
    if   ( n <= 2 ) 1
    else fFibonacci(n - 1) + fFibonacci(n - 2)
  }

  println(fFibonacci(10))//OK

  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciTailRec(x: Int, last: Int, nextToLast: Int): Int = {
      if (x >= n) last
      else fibonacciTailRec(x + 1, last + nextToLast, last)
    }

    if(n <= 2) 1
    else fibonacciTailRec(2,last = 1,nextToLast = 1)

  }

  println(fibonacci(10))

}
