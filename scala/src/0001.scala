object Euler0001 {
  def main(args: Array[String]): Unit = {
    val result = (1 until 1000).view filter { n => n % 3 == 0 || n % 5 == 0 } sum

    println(result)
  }
}
