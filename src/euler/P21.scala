package euler

// Finds the sum of amicable numbers under 10000.
// The answer is 31626.
object P21 extends App {
  def divisors(n: Int): Seq[Int] = (1 to n/2).filter(x => n % x == 0)
  def d(n: Int): Int = divisors(n).sum
  def amicable(a: Int): Boolean = d(d(a)) == a && d(a) != a
  print((1 to 10000).filter(x => amicable(x)).sum)
}
