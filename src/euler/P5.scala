package euler

// The answer is 232792560
object P5 extends App {
  def isDivisible(x: Int, max: Int): Boolean = {
    for (y <- 11 to max) {
      if (x % y != 0) {
        return false
      }
    }
    return true
  }

  var x = 2520
  while (!isDivisible(x, 20)) {
    x = x + 2520
  }
  println(x)
}
