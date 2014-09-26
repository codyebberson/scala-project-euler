package euler

import java.util.Calendar

// Finds the number of Sundays on the first day of a month.
// The answer is 171.
object P19 extends App {
  var c = Calendar.getInstance()
  c.set(Calendar.YEAR, 1901)
  c.set(Calendar.MONTH, 1)
  c.set(Calendar.DATE, 1)

  var count = 0
  while (c.get(Calendar.YEAR) <= 2000) {
    if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY &&
        c.get(Calendar.DAY_OF_MONTH) == 1) {
      count = count + 1
    }
    c.add(Calendar.DATE, 1)
  }

  println(count)
}
