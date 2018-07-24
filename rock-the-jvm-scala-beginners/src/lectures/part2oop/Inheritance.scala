package lectures.part2oop

object InheritanceAndTraits extends App {

  //moficatore di accesso pubblico ha visibilita anche all'esterno delle classi ( no modifier );
  //modificatore di accesso protected ha visibilita soltanto all'interno della classe e delle classi che la estendono;
  //modificatore di accesso private ha visibilità soltanto dentro la classe stessa.
  sealed class Animal {
    val creatureTypes = "wild"

    def eat: Unit = println("nom nom")

    //private def eat : Unit = println("nom nom")
    //protected def eat : Unit = println("nom nom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  //constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  /*Person(name,age)*/

  /*class Dog extends Animal {
    //override val creatureTypes: String = "Domestic"
    override def eat = println("crunch crunch")
  }*/

  /* OVVERRIDE FIELD DIRETTAMENTE NEL COSTRUTTORE
  class Dog(override val creatureTypes: String) extends Animal{
    override def eat = println("crunch crunch")
  }*/

  class Dog(dogTypes: String) extends Animal {
    override val creatureTypes = dogTypes

    override def eat: Unit = {
      super.eat
      println("crunch crunch")
    }
  }

  val dog = new Dog("Test")
  //dog.eat
  println(dog.creatureTypes)

  //type substitution ( broad: polymorphism )
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  //overriding e overloading.
  //super
  //preventing override
  //1- use final on member.
  //2- use final on the entire class.
  //3- seal the class = extend class in THIS FILE, prevent extension in other files

}
