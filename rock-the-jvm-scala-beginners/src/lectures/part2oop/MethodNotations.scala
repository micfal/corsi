package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangsOut(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck ?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary","inception")
  println(mary.likes("inception"))//equivalent
  println(mary likes "inception")//infix notation = operator notation (syntactic sugar)

  //"operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))
  println(1+2)
  println(1.+(2))

  //ALL OPERATORS ARE METHODS
  //Akka actors have ! ?

  //prefix notation
  val x = -1 //equivalent with 1.unary_-
  val y = 1.unary_-
  //unary: prefix only works with - + ! tilde
  println(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary isAlive)
  println(mary.isAlive)

  //apply
  println(mary.apply())
  println(mary())//equivalent

  /**
    * esercizi:
    * 1. Overload the + operator
    *    mary + "the rockstar" => new person "Mary (the rockstar)"
    *
    * 2. Add an age to the Person class
    *    add a unary + operator => new person with the age + 1
    *    +mary => mary with the age incrementer
    *
    * 3. Add a "learns" method in the Person class => "Mary learns Scala"
    *    Add a learnScala method, calls learns method with "Scala"
    *    Use it in postfix notation
    * 4. Overload the apply method
    *    mary.apply(2) => "Mary watched Inception 2 times"
    */
}
