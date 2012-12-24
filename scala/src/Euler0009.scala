object Euler0009 {
  def main(args: Array[String]) = {
    val limit = (1 to 1000) find { x => x + math.sqrt(x) > 1000 } get

    for {
      a <- (1 to limit)
      b <- (a to limit)
      c = 1000 - a - b
      if a * a + b * b == c * c
    } {
      println(a * b * c)
    }
  }
}
