class Album(val songs: List<Song>) : Music {

    fun getSongsByArtist(artist: String): List<Song> {
        return songs.filter { it.artist == artist }
    }

    override fun getPlayingTime(): Double {
        var total = 0.0

        songs.forEach {
            total += it.playingTime
        }

        return total
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }
}
