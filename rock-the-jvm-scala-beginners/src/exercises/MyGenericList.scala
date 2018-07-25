package exercises

/**
  * Versione generica di MyList
  */
abstract class MyGenericList[+A] {
  def head: A
  def tail: MyGenericList[A]
  def isEmpty: Boolean
  def add[B >: A](element: B): MyGenericList[B]
  def printElements: String
  //polymorphic call
  override def toString: String = "[" + printElements + "]"
}

object EmptyElement extends MyGenericList[Nothing] {
  def head: Nothing  = throw new NoSuchElementException
  def tail: MyGenericList[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](element: B): MyGenericList[B] = new ConsElement(element,EmptyElement)
  def printElements: String = ""
}

class ConsElement[+A](h: A, t: MyGenericList[A] ) extends MyGenericList[A] {
  def head: A = h
  def tail: MyGenericList[A] = t
  def isEmpty: Boolean = false
  def add[B >: A](element: B): MyGenericList[B] = new ConsElement(element,this)
  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
}

object GenericListTest extends App {
  val listOfIntegers: MyGenericList[Int] = new ConsElement(1,new ConsElement(2,new ConsElement(3,EmptyElement)))
  val listOfStrings: MyGenericList[String] = new ConsElement("Hello", new ConsElement("Scala",EmptyElement))
  println(listOfIntegers)
}