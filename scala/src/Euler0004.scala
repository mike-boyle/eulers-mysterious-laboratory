object Euler0004 {
  def main(args: Array[String]) = {
    val range = 100 to 999
    val result = range flatMap { n => (n to 999) map { n * } } filter { isPalindrome } max

    println(result)
  }

  def isPalindrome(n: Int) = n.toString.reverse == n.toString
}
