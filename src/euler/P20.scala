package euler

import scala.BigInt

// Finds the sum of the digits of 100!.
// The answer is 648.
object P20 extends App {
  def factorial(n: BigInt): BigInt = {
    return (BigInt(1) to n).reduce(_ * _)
  }

  println(factorial(BigInt(100)).toString.toCharArray.map(x => x.asDigit).sum)
}
