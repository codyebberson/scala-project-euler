package euler

// Finds the number of paths through a 20x20 grid.
// The answer is 137846528820.
object P15 extends App {
  var SIZE = 20
  var cache: Array[Long] = new Array[Long]((SIZE + 1) * (SIZE + 1))

  def count(x: Int, y: Int): Long = {
    if (x > SIZE || y > SIZE) {
      return 0
    }

    if (x == SIZE && y == SIZE) {
      return 1
    }

    var index = y * (SIZE + 1) + x
    var result = cache(index)
    if (result == 0) {
      result = count(x + 1, y) + count(x, y + 1)
      cache(index) = result
    }
    return result
  }

  println(count(0, 0))
}
