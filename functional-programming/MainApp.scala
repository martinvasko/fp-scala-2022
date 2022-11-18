object MainApp {
    def main(args: Array[String]): Unit = {
        val movies = CSVReader.readCSV("imdb-data.csv")
        println(movies.length)
        movies.sortWith(_.getRevenue() > _.getRevenue()).foreach((movie) => println(movie.getTitle()))
    }
}