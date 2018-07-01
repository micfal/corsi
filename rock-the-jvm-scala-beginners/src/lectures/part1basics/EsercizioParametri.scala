package lectures.part1basics

object EsercizioParametri extends App{

  def fattorialeTR(n: Int , acc: BigInt = 1): BigInt =
    if ( n <= 1 ) acc
    else fattorialeTR(n-1,n*acc)

  val fatt10 = fattorialeTR(10)
  println(fatt10)

  def saveImage(ext: String = "png", height: Int=800, weight: Int=600): Unit = println(ext+","+height+","+weight)

  saveImage()
  saveImage("bmp")
  saveImage(weight = 100, height = 100)
}
