package euler

// Finds the first triangle number with more than 500 divisors.
// The answer is 76576500.
// The answer has 576 divisors.
object P12 extends App {

  def countDivisors(n: Long): Int = {
    if (n == 1) {
      return 1
    }
    var count = 0
    for (i <- 1L to Math.sqrt(n).toLong) {
      if (n % i == 0) {
        count = count + 1
      }
    }
    return count * 2
  }


  var i = 1
  var n = 1
  while (true) {
    if (countDivisors(n) > 500) {
      println(n + ": " + countDivisors(n))
      System.exit(0)
    }
    i = i + 1
    n = n + i
  }
}
