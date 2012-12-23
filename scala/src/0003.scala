object Euler0003{
  def main(args: Array[String]) = {
    val n = 600851475143L
    val largest = Prime.primes.takeWhile { _ < math.sqrt(n) } filter { n % _ == 0 } last

    println(largest)
  }
}

