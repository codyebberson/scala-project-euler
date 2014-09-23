package euler

// The answer is 4613732
object P2 extends App {
  var a = 1
  var b = 2
  var sum = 2
  while (b < 4000000) {
    var c = a + b
    if (c % 2 == 0 && c < 4000000) {
      sum += c
    }
    a = b
    b = c
  }
  println(sum)
}
