import RandomJoke.*
import songs.*
//import kotlinx.serialization.json.*
import kotlinx.cinterop.*

fun main(args: Array<String>) {
    println(getJoke()?.toKString())
   	printSong()
}
