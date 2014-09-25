package euler

// Finds the sum of all primes below two million.
// The answer is 1179908154.
object P10 extends App {
  println((1 to 2000000).filter(x => P3.isPrime(x)).sum)
}
