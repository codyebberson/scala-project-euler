package euler

// The answer is 6857
object P3 extends App {

  def isPrime(n: Long): Boolean = {
    for (x <- 2L to Math.sqrt(n).toLong) {
      if (n % x == 0) {
        return false
      }
    }
    return true
  }

  def maxPrimeFactor(n: Long): Long = {
    for (x <- Math.sqrt(n).toLong to 1L by -1L) {
      if (n % x == 0 && isPrime(x)) {
        return x
      }
    }
    return 1L
  }

  println(maxPrimeFactor(600851475143L))
}