class RecordPlayer {

    fun play(music: Music) {
        println("Playing time: ${music.getPlayingTime()} seconds")

        music.getAllSongs().forEach { song ->
            println("Title: ${song.title}")
            println("Artist: ${song.artist}")
            println("Duration: ${song.playingTime} seconds")
        }
    }
}

