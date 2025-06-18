
fun main() {
    val numbers = listOf(1L, 2L, 3L)

    // 향상된 for문: 자바에서는 :, 코틀린에선 in.
    for(number in numbers) {
        println(numbers)
    }

    // for: in을 활용하여 범위를 나타냄
    for(i in 1..3) {
        println(i)
    }

    // downTo: 범위를 아래로 내려감
    for(i in 3 downTo 1) {
        println(i)
    }

    // step n: n의 배수로 올라감
    for(i in 1..5 step 2) {
        println(i)
    }

    // downTo, step도 함수이다.

    // while: 자바와 동일
    var i = 1
    while(i <= 3) {
        println(i)
        i++
    }
}

