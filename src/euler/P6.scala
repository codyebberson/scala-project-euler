package euler

// The answer is 25164150
object P6 extends App {
  def sumOfSquares(n: Long): Long = {
    return (1L to n).map(x => x * x).sum
  }

  def squareOfSum(n: Long): Long = {
    return Math.pow((1L to n).sum, 2).toLong
  }

  var n = 100
  println(squareOfSum(n) - sumOfSquares(n))
}
