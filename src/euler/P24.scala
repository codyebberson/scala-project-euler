package euler

// Finds the millionth lexographically sorted permutation of 0-9.
// The answer is 2783915460.
object P24 extends App {
  var N = 9
  var count = 0

  def gen(target: Int, s: String = ""): Unit = {
    if (s.length() == N + 1) {
      count = count + 1
      if (count == target) {
        println(s)
      }
    } else {
      for (i <- 0 to N) {
        if (!s.contains(Integer.toString(i))) {
          gen(target, s + i)
        }
      }
    }
  }

  gen(1000000)
}
