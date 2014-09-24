package euler

// Finds the 10001st prime number.
// The answer is 104743.
object P7 extends App {
  var i = 2
  var count = 1
  while (count < 10001) {
    i = i + 1
    if (P3.isPrime(i)) {
      count = count + 1
    }
  }
  println(i)
}
