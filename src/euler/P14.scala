package euler

// Finds the number under one million that produces the longest chain.
// The answer is 837799.
// The length of the chain is 525.
object P14 extends App {
  def next(n: Long): Long = {
    if (n % 2 == 0) {
      return n / 2;
    } else {
      return 3 * n + 1;
    }
  }

  def count(n: Long): Long = {
    var x = n
    var c = 1
    while (x != 1) {
      x = next(x)
      c = c + 1
    }
    return c
  }

  var maxValue = 1L
  var maxCount = 0L

  for (n <- 1 to 1000000) {
    var c = count(n)
    if (c > maxCount) {
      maxCount = c
      maxValue = n
    }
  }

  println("maxCount = " + maxCount)
  println("maxValue = " + maxValue)
}
