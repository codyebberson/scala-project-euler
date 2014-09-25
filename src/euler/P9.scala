package euler

// Finds the Pythagorean triplet that sums to 1000.
// The answer is 31875000.
object P9 extends App {
  for (a <- 1 to 1000) {
    for (b <- a to 1000) {
      var c = 1000 - a - b
      if (a * a + b * b == c * c) {
        println(a * b * c)
      }
    }
  }
}
