object MainApp {
  def main(args: Array[String]): Unit = {
    // higherOrderSamples()
    // curryingSamples()
    // functionalMovies()
    furtherHigherOrderSamples()
  }

  def higherOrderSamples() = {
    def calcAnything(number: Int, calcFunction: Int => Int): Int = calcFunction(
      number
    )

    def calcSquare(num: Int): Int = num * num

    def calcCube(num: Int): Int = num * num * num

    val squareCalculated = calcAnything(2, calcSquare)
    assert(squareCalculated == 4)
    println(squareCalculated)

    val cubeCalculated = calcAnything(3, calcCube)
    assert(cubeCalculated == 27)
    println(cubeCalculated)
  }

  def curryingSamples() = {
    val multiplication: (Int, Int) => Int = (x, y) => x * y
    val curriedMultiplication: Int => Int => Int = x => y => x * y

    val multiplicationResult = multiplication(3, 5)
    println(multiplicationResult)
    val curriedMultiplicationResult = curriedMultiplication(3)(5)
    println(curriedMultiplicationResult)
    assert(multiplicationResult == curriedMultiplicationResult)
  }

  def functionalMovies() = {
    val movies = CSVReader.readCSV("imdb-data.csv")
    val moviesWithRevenue = movies.filter(_.getRevenue() > 0)
    val moviesWithRevenueSorted =
      moviesWithRevenue.sortWith(_.getRevenue() > _.getRevenue())
    val moviesWithRevenueSortedTop10 = moviesWithRevenueSorted.take(10)

    // Movies sorted by revenue
    moviesWithRevenueSorted.foreach((movie) =>
      println(movie.getTitle() + " " + movie.getRevenue())
    );

    // Top 10 movies with the highest revenue
    println("--- TOP 10 MOVIES ---")
    moviesWithRevenueSortedTop10.foreach((movie) =>
      println(movie.getTitle() + " " + movie.getRevenue())
    );
  }

  def furtherHigherOrderSamples() = {

    val col1 = List(1, 3, 2, 5, 4, 7, 6)
    val res1 = col1.reduce((x, y) => x max y)
    println("Max: " + res1)

    val col2 = List(1, 2, 3, 4, 5, 6, 7)
    val new_col2 = col2.map((x) => (x,1))
    val res2 = new_col2.reduce((x, y) => (x._1 + y._1, x._2 + y._2))
    println("Sum: " + res2._1)
    println("Avg: " + res2._2)
  }
}
