package lectures.part1basics

object ValuesVariablesTypes extends App {
//val x: Int = 42 --> 1) posso specificare il tipo
  val x = 42 // 2) posso non specificare il tipo di valore , il compilatore inferisce il tipo.
  print(x)

//x=2 VALS ARE IMMUTABLE ( la riassegnazione di una variabile non è permessa ).
//compiler can infer types.

  val aString: String = "hello"; val anotherString = "goodbye"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 5455555555555534535L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //variabili
  var aVariable: Int = 4
  aVariable = 5 // side effects. cambiare il valore di una variabile viene detto side effect.

}
