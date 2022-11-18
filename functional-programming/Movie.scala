class Movie(title: String, year: Int, runtime: Int, rating: Float, votes: Int, revenue: Float, metascore: Float) {
    def getTitle(): String = {
        title
    }
    def getYear(): Int = {
        year
    }
    def getRuntime(): Int = {
        runtime
    }
    def getRating(): Float = {
        rating
    }
    def getVotes(): Int = {
        votes
    }
    def getRevenue(): Float = {
        revenue
    }
    def getMetascore(): Float = {
        metascore
    }
}