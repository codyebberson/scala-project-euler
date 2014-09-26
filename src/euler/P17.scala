package euler

// Finds the number of characters in the words for 1-1000.
// The answer is 21124.
object P17 extends App {
  var ONES = Array(
    "", "one", "two", "three", "four",
    "five", "six", "seven", "eight", "nine",
    "ten", "eleven", "twelve", "thirteen", "fourteen",
    "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")

  var TENS = Array(
    "", "", "twenty", "thirty", "forty",
    "fifty", "sixty", "seventy", "eighty", "ninety")

  def getHundreds(n: Int): String = {
    if (n < 100) {
      return ""
    }
    return ONES(n / 100) + " hundred"
  }

  def getTens(n: Int): String = {
    if (n < 20) {
      return ONES(n)
    }
    if (n % 10 == 0) {
      return TENS(n / 10)
    }
    return TENS(n / 10) + "-" + ONES(n % 10)
  }

  def getWords(n: Int): String = {
    if (n == 1000) {
      return "one thousand"
    }
    if (n < 100) {
      return getTens(n % 100)
    }
    if (n % 100 == 0) {
      return getHundreds(n)
    }
    return getHundreds(n) + " and " + getTens(n % 100)
  }

  var sum = 0
  for (x <- 1 to 1000) {
    println(x + ": " + getWords(x))
    sum = sum + getWords(x).replaceAll("[- ]", "").length()
  }
  println(sum)
}
