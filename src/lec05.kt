
fun main() {

}

// if문은 자바와 동일함
fun validateScore(score: Int) {
    // if(score >= 0 && score <= 100)
    if(score in 0..100) {
        return
    }
    throw IllegalArgumentException()
}

// 하지만, if-else문을 하나의 값으로 취급할 수 있음 (Expression)
fun getPassOrFail(score: Int): String {
    return if(score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if(score >= 90) {
        "A"
    } else if(score >= 80) {
        "B"
    } else {
        "C"
    }
}

// when: 자바의 switch
fun getGradeWithSwitch(score: Int): String {
    return when(score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when(score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("1")
        else -> println("2")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("0")
        number == 1 -> println("1")
        else -> println("2")
    }
}
