package lectures.part2oop

object EserciziPart2 extends App {

  val writer:    Writer = new Writer(firstName = "Michele",surname = "Falso", year = 1983)
  val impostore: Writer = new Writer(firstName = "Michele",surname = "Falso", year = 1960)
  println(writer.fullname)

  val novel     = new Novel(name = "Le avventure di Michele in Octotelematics", yearOfRelease = 2018, author = writer)
  val novel2018 = novel.copy(yearOfRelease = 2000)

  println(s"l'età dello scrittore ${writer.fullname} è di ${novel2018.authorAge} anni.")
  println(s"l'età dello scrittore ${writer.fullname} è di ${novel.authorAge} anni.")
  println("Il libro è stato scritto da Michele ?")
  println( if(novel.isWrittenBy(impostore)) "si" else "no" )

  val counter: Counter = new Counter
  counter.increment(10).decrement(9).printInc

}

class Writer(firstName: String, surname: String, val year: Int){
  def fullname: String = s"$firstName $surname"
}

class Novel(name: String, yearOfRelease: Int, var author: Writer){
  /*
  calcola l'età dell'autore rispetto alla data di release.
   */
  def authorAge: Int =  yearOfRelease - author.year
  /*
  Imposta l'autore del libro.
   */
  def isWrittenBy(author: Writer): Boolean = this.author == author
  /*
  clona il libro assegnando la nuova data di rilascio.
   */
  def copy(yearOfRelease: Int): Novel = new Novel(name,yearOfRelease,author)
}

class Counter(val count: Int = 0){

  def increment: Counter = new Counter(count+1)
  def decrement: Counter = new Counter(count-1)

  def increment(n: Int): Counter = {
    if ( n <= 0) this
    else increment.increment(n-1)
  }
  def decrement(n: Int): Counter = {
    if ( n <= 0) this
    else decrement.decrement(n-1)
  }

  def printInc = println(count)
}

