object Euler0002 {
  def main(args: Array[String]) = {
    lazy val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }
    val result = fibs.view takeWhile { _ < 4000000 } filter { _ % 2 == 0 } sum

    println(result)
  }
}

