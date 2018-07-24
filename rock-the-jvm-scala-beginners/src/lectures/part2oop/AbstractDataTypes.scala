package lectures.part2oop

object AbstractDataTypes extends App {
  //abstract
  abstract class Animal {
    val creatureTypes: String
    def eat:Unit
  }

  class Dog extends Animal{
    override val creatureTypes: String = "canine"

    override def eat: Unit = println("crunch crunch")
  }

}
