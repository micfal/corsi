package lectures.part2oop

object EserciziPart2 extends App{

}

class Writer(firstName: String, surname: String, val year: Int){
  def fullname(): String = s"$firstName $surname"
}

class Novel(name: String, yearOfRelease: Int, var author: Writer){
  def authorAge(): Int =  yearOfRelease - author.year
  def isWrittenBy(author: Writer): Unit = this.author = author
}