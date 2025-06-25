
fun main() {
    val fruits = listOf(
        Fruit2(1, "사과", 1000, 2000),
        Fruit2(1, "사과", 1000, 2000),
        Fruit2(1, "사과", 1000, 2000),
        Fruit2(1, "사과", 1000, 2000),
    )

    val apples = fruits.filter { fruit -> fruit.name == "사과" }
    val apples2 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }
    val applePrices2 = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.currentPrice
        }
    val values = fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit }

    // allMatch, noneMatch, anyMatch
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }
    val isNoneApple = fruits.none { fruit -> fruit.name == "사과" }
    val isAnyApple = fruits.any { fruit -> fruit.name == "사과" }

    val fruitCount = fruits.count()
    val sortedAscFruit = fruits.sortedBy { fruit -> fruit.currentPrice }
    val sortedDescFruit = fruits.sortedByDescending { fruit -> fruit.currentPrice }
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    val firstFruit = fruits.first()
    val firstNullableFruit = fruits.firstOrNull()
    val lastFruit = fruits.last()
    val lastNullableFruit = fruits.lastOrNull()

    val fruitsMap: Map<String, List<Fruit2>> = fruits.groupBy { fruit -> fruit.name }
    val fruitsMap2: Map<Long, Fruit2> = fruits.associateBy { fruit -> fruit.id }
    val fruitsMap3: Map<String, List<Long>> = fruits
        .groupBy({ fruit -> fruit.name }, { fruit -> fruit.factoryPrice })
    val fruitsMap4: Map<Long, Long> = fruits
        .associateBy({ fruit -> fruit.id }, { fruit -> fruit.factoryPrice })
    val fruitsMap5 = fruitsMap.filter { (key, value) -> key == "사과" }

    val fruitsInList: List<List<Fruit2>> = listOf(
        listOf(
            Fruit2(1, "사과", 1000, 2000),
        )
    )

    val samePriceList = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }
    val samePriceList2 = fruitsInList.flatMap{list -> list.samePriceFilter}
    val flatList = fruitsInList.flatten()
}

private fun filterFruits2(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}

data class Fruit2(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
) {
    val isSamePrice: Boolean
        get() = currentPrice == factoryPrice
}

val List<Fruit2>.samePriceFilter: List<Fruit2>
    get() = this.filter(Fruit2::isSamePrice)