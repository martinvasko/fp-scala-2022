object CSVReader {
    def readCSV(filename: String): List[Movie] = {
        var movies = List[Movie]()
        val bufferedSource = io.Source.fromFile(filename)
        for(line <- bufferedSource.getLines.drop(1)) {
            val cols = line.split(",").map(_.trim)
            val movie = new Movie(cols(2), cols(4).toInt, cols(5).toInt, cols(6).toFloat, cols(7).toInt, cols(8).toFloat, cols(9).toFloat)
            movies = movies :+ movie
            println(cols(2))
        }
        bufferedSource.close
        movies
    }
}