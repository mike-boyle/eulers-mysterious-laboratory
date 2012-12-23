object Euler0003{
  def main(args: Array[String]) = {
var initial = 600851475143L
while(initial != 1) {
  val div = Prime.primes.filter { initial % _ == 0 }.head
  initial = initial / div
  println(div)
}
  }
}

