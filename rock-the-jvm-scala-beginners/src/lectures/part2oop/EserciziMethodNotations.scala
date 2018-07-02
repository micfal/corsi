package lectures.part2oop

object EserciziMethodNotations extends App {

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
    *
    * 4. Overload the apply method
    *    mary.apply(2) => "Mary watched Inception 2 times"
    */

  class Person(val name: String, favoriteMovie: String, val age: Int = 0){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangsOut(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def learns(language: String): String = s"$name learns $language"
    def learnScala: String = this learns "Scala"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(alias: String): Person = new Person(s"$name (the rockstar)",favoriteMovie)
    def unary_! : String = s"$name, what the heck ?!"
    def unary_+ : Person = new Person(name,favoriteMovie,age+1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
  }

  val mary = new Person("Mary","inception",18)

  println((mary + "the rockstar")())
  println((+mary).age)
  println(mary learns "Scala")
  println(mary learnScala)
  println(mary(10))
}
