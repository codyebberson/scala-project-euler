package euler

import scala.BigInt

// Finds the sum of the digits of 2^1000.
// The answer is 1366.
object P16 extends App {
  println(BigInt(2).pow(1000).toString.toCharArray.map(x => x.asDigit).sum)
}
