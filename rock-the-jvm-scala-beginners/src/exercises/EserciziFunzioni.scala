package exercises

object EserciziFunzioni extends App {

  //1. una funzione che dati (name,age) => "Hi, my name is $name and I am $age years old."
  def fPresentati(name: String, age: Int): String = "Hi, my name is " + name + " and I am " + age + " years old."
  println(fPresentati(name = "Michele",age = 34))

  //2. Factorial function 1 * 2 * 3 * ... * n
  def fFattoriale(n: Int ): Int = {
    if(n <= 0 ) 1
    else n * fFattoriale( n - 1 )
  }

  println(fFattoriale(9))//OK

  //3. Fibonacci
  // f(1) = 1
  // f(2) = 1
  // f(n) = f(n-1) + f(n-2)
  def fFibonacci(n: Int): Int = {
    if   ( n <= 2 ) 1
    else fFibonacci(n - 1) + fFibonacci(n - 2)
  }

  println(fFibonacci(10))//OK

  //4. testare se un numero è primo
  def isPrimo(n: Int): Boolean = {

    def isPrimoFinoA(x: Int): Boolean = {
      if ( x <= 1) true
      else n % x != 0 && isPrimoFinoA(x-1)
    }

    isPrimoFinoA(n-1)//l'istruttore ha fatto n / 2 mah.
  }

  println(isPrimo(37 * 17))

}
