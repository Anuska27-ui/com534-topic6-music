fun main() {

    val song1 = Song("Hello", "Adele", 295.0)
    val song2 = Song("Someone Like You", "Adele", 285.0)
    val song3 = Song("Shape of You", "ED Sheeran", 234.0)
    val single = Single(song1, song2)
    val album = Album(listOf(song1, song2, song3))

    val musicList: List<Music> = listOf(single, album)

    musicList.forEach { music ->
        println("Playing time: ${music.getPlayingTime()} seconds")
        println("Songs: ${music.getAllSongs()}")
        println()
    }

    val player = RecordPlayer()

    println("Playing the single:")
    player.play(single)

    println()

    println("Playing the album:")
    player.play(album)

}