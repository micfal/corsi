package lectures.part1basics

object Expression extends App {

  val x = 1 + 2 //EXPRESSION
  println(x)

  println(2 + 3 * 4)
  //+ - * / & | ^ << >> >>> ( quest'ultimo esiste soltanto in scala e si chiama
  //right shift with zero extension ).

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x ))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // funziona anche con -= *= /= ...... side effects
  println(aVariable)

  // Instruction (DO) vs Expressions (VALUE)
  //IF EXPRESSION --> in scala l'istruzione if restituisce un valore quindi
  //è una espressione !

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition)5 else 3)
  println(1+3)

  var i = 0

  val aWhile = while( i < 10 ) {
    println(i)
    i+=1
  }

  //NEVER WRITE THIS AGAIN. ( stile java ).

  //ogni cosa in scala è una espressione !

  val aWeirdValue = ( aVariable = 3 ) //Unit === void ( non restituisce nulla di significativo )
  print(aWeirdValue)

  // side effects: println(), whiles, reassigning.
  // code blocks

  val aCodeBlock = {
    val y=2
    val z=y+1

    if(z > 2) "hello" else "goodbye"
  }

  //val anotherValue = z +1
  //1. difference between "hello world" vs println("hello world") ?
  //2.

  val someValue = {
    2 < 3
  }

  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  println(someOtherValue)

}
