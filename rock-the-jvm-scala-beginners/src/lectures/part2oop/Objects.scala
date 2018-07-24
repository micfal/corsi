package lectures.part2oop

object Objects extends App {

  //SCALA DOES NOT HAVE CLASS-LEVEL SCALA FUNCTIONALITY ( "static" )
  object Person { //type + its only instance

    //static / class - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person (val name: String ){
    //instance level functionality
    //factory method

  }
  // il fatto di avere oggetto e classe nella stesso scope è detto COMPANIONS.

  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john)

  //scala objects = singleton instance
  val person1 = Person
  val person2 = Person
  println(person1 == person2)
  println(Person.N_EYES)

  val bobbie = Person(mary,john)

}
