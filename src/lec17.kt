
fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000),
    )

    // 코틀린에서는 익명함수를 변수에 할당할 수 있다.
    val isApple: (Fruit) -> Boolean = fun(fruit : Fruit) : Boolean {
        return fruit.name == "사과"
    }

    val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    // 익명함수 호출 방법
    isApple(fruits[0])
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)
    // 함수가 마지막 파라미터일 때, 중괄호를 바깥으로 뺄 수 있으며, 화살표를 it으로 대체 가능
    filterFruits(fruits) { it.name == "사과" }
}

// 함수를 파라미터로 받을 수 있다.
fun filterFruits(
    fruits : List<Fruit>,
    filter: (Fruit) -> Boolean
) : List<Fruit> {
    val result = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            result.add(fruit)
        }
    }
    return result
}

class Fruit(
    val name: String,
    val price: Int,
)