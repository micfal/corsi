package lectures.part1basics

object CalledByValuesNames extends App {

  def callByValue(x: Long): Unit = {
    println("called by value : " + x )
    println("called by value : " + x )
  }
  def callByName(x: => Long): Unit = {
    println("called by name : " + x )
    println("called by name : " + x )
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

}
