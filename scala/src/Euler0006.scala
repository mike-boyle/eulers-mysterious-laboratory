object Euler0006 {
  def main(args: Array[String]) = {
    val squareSum = 1 to 100 map { n => n * n } sum
    val sum = (1 to 100).sum
    println(sum * sum - squareSum)
  }
}
