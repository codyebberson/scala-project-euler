package euler

// Finds the sum of scored names in the associated text file.
// The answer is 871198282.
object P22 extends App {
  def score(name: String): Long = {
    name.toCharArray().map(x => (x - 'A' + 1)).sum
  }

  var names = io.Source.fromFile("data/p022_names.txt").mkString
    .split(",")
    .map(x => x.replaceAll("\"", ""))
    .sortWith(_ < _)

  print(names.zipWithIndex.map { case (name, i) => score(name) * (i + 1) }.sum)
}
