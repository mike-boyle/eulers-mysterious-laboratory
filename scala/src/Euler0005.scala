object Euler0005 {
  def main(args: Array[String]) = {
    val range = 20 to 1 by -1
    val result = 20 to Int.MaxValue by 20 find { n => range forall { n % _ == 0 } }
    println(result.get)
  }
}
