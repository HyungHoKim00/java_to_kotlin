
fun main() {
    // int[] array = {100,200}
    val array = arrayOf(100, 200)

    // for (int i = 0; i < array.length; i++)
    for(i in array.indices) {
        println("$i, $array[i]")
    }

    for((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    // 자바와 다르게 배열에 쉽게 값을 추가할 수 있음
    array.plus(300)

    // final List<Integer> numbers = List.of(100, 200)
    val numbers = listOf(100, 200)

    // final List<Integer> emptyList = List.of()
    val emptyList = emptyList<Int>()

    // 타입 추론 가능
    printNumbers(emptyList())

    // list.get(0)
    numbers[0]

    // for(int number : numbers)
    for(number in numbers) {
        println(number)
    }

    for((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    // 가변 리스트
    // 배열리스트가 기본 구현체
    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300)

    val set = setOf(100, 200)
    val mutableSet = mutableSetOf(100, 200)
    mutableSet.add(300)

    // final Map<Integer, String> map = Map.of(100, "100", 200, "200)
    val map = mapOf(100 to "100", 200 to "200")

    // Map<Integer, String> mutableMap = new LinkedHashMap<>()
    val mutableMap = mutableMapOf<Int, String>()
    // mutableMap.add(100, "100)
    mutableMap[100] = "100"
    mutableMap[200] = "200"

    for(key in mutableMap.keys) {
        println(key)
        println(mutableMap[key])
    }

    for((key, value) in mutableMap.entries) {
        println(key)
        println(value)
    }
}

private fun printNumbers(numbers: List<Int>) {

}
