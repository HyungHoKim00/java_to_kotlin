import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {

}

// try-catch: 자바와 동일
fun parseIntOrThrow(str: String): Int {
    try {
        // Integer.parseInt(str), 기본 타입 사이에는 to.. 사용
        return str.toInt()
    } catch (e : NumberFormatException) {
        throw IllegalArgumentException("$str is not a valid integer")
    }
}

// if와 동일하게, try-catch도 expression
fun parseIntOrThrow2(str: String): Int? {
    return try {
        // Integer.parseInt(str), 기본 타입 사이에는 to.. 사용하여 변환
        str.toInt()
    } catch (e : NumberFormatException) {
        null
    }
}

// checkedException이 존재하지 않음
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "./a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

// try-with-resources -> 사라지고 use를 사용
fun readFile2(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}