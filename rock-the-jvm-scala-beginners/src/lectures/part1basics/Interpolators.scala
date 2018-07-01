package lectures.part1basics

object Interpolators extends App{
  val myFloat = 2.2f
  val name = "Michele"
  val age  = 34
  val myString = s"hello $name you are ${age + 1} yaers old !"

  println(myString)
  println(f"stampo il seguente float formattato $myFloat%2.2f")
  println(raw"voglio stampare il ritorno a capo \n .")
  val rawdata = "voglio stampare il ritorno a capo \n ."
  println(raw"$rawdata")
  val rawdata2 = raw"voglio stampare il ritorno a capo \n ."
  println(rawdata2)
}
