package euler

// The answer is 906609
object P4 extends App {
  var start = 100
  var end = 999
  var max = 0
  for (x <- start to end) {
    for (y <- start to end) {
      var z = x * y
      if (z > max) {
        var str = z.toString
        if (str.equals(str.reverse)) {
          max = z
        }
      }
    }
  }
  println(max)
}
