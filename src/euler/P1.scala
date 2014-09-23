package euler

// The answer is 233168
object P1 extends App {
  println((1 to 999).filter(x => x % 3 == 0 || x % 5 == 0).sum)
}
