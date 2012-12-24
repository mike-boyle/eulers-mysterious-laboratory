object Euler0010 {
  def main(args: Array[String]) = {
    val result = Prime.primes takeWhile { _ < 2000000} sum

    println(result)
  }
}
