package lectures.part2oop

object AbstractDataTypes extends App {
  //abstract
  abstract class Animal {
    val creatureTypes: String = "wild" //membro non astratto.
    def eat(): Unit //membro astratto
  }

  /**
    * Override non è obbligatoria per sovrascrivere le funzioni
    * di una classe astratta
    */
  class Dog extends Animal{
    override val creatureTypes: String = "canine"

    //override def eat: Unit = println("crunch crunch")
    def eat(): Unit = println("crunch crunch")
  }

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit //membro astratto
    val preferredMeal: String = "fresh meat" //membro non astratti
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureTypes: String = "croc"

    override def eat(): Unit = println("nomnomnom")

    override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureTypes}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)
  //traits vs abstract class
  //1 - traits non hanno parametri nel costruttore.
  //2 - posso estendere 1 sola classe ma piu traits.
  //3 - traits = behaviour, abstract = tipo di oggetto

}
