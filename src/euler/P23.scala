package euler

// Find the sum of all the positive integers which cannot be written as the
// sum of two abundant numbers.
//
// The answer is 4179871.
object P23 extends App {
  def isAbundant(n: Int): Boolean = P21.divisors(n).sum > n
  var precomputed = (0 to 28123).map(x => isAbundant(x)).toArray
  def isSumOfAbundants(n: Int): Boolean = {
    (12 to n).exists(x => precomputed(x) && precomputed(n - x))
  }
  println((1 to 28123).filter(x => !isSumOfAbundants(x)).sum)
}
