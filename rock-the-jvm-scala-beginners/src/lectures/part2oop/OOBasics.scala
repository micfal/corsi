package lectures.part2oop

object OOBasics extends App{

  val person = new Person(name = "Michele", 34)
  println(person.age)
  println(person.x)
  person.greet("Daniel")
  person.greet()
}

//constructor.
class Person(name: String , val age: Int=0){
  //body
  val x = 2

  println( 1 + 3 )

  //method
  def greet(name: String): Unit = println(s"${this.name} says: 'Hi, ${name}'")
  //overloading.
  def greet(): Unit = println(s"Hi, $name")//in questo caso è come scrivere ${this.name}.

  //multiple constructor
  //def this(name: String) = this(name,0)
  def this()=this("Michele")
}

//class parameters are not fields , if add the keyword "val" then the field becomes field
