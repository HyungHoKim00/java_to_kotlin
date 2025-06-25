// asimport: 어떤 클래스의 함수를 임포트할 때 이름을 바꾸는 기능
import util.doNothing as doNothingUtil

fun main() {
    doNothingUtil()

    // 구조분해: 객체의 값을 한번에 할당
    // 프로퍼티의 순서에 따라 할당
    val person = PersonData("김형호", 26)
    val (name, age) = person
    println("$name, $age")

    val person2 = PersonNonData("김형호", 26)
    val (name2, age2) = person2
    println("$name2, $age2")

    // label: return, break, continue가 특정 라벨에 동작할 수 있게끔 할 수 있음
    abc@ for (i in 1..10) {
        for (j in 1..10) {
            if(j == 2) break@abc
        }
    }
}

// data class는 componentN 함수를 자동으로 만들어준다.
// componentN: n번째 컴포넌트를 호출
data class PersonData(val name: String, val age: Int)

// componentN 함수는 클래스에도 만들 수 있고, 연산자이기 때문에 operator를 붙여야 한다.
class PersonNonData(val name: String, val age: Int) {
    operator fun component1() = name
    operator fun component2() = age
}

// typealias: 타입에 별칭을 붙임
typealias FruitFilter = (Fruit) -> Boolean
fun filterFruits3(fruits: List<Fruit>, filter: FruitFilter) {

}

class UltraSuperGuardianTribe
typealias USGTMap = Map<String, UltraSuperGuardianTribe>

fun getNumberOrNull(number: Int): Int? {
    return if(number <= 0) {
        null
    } else {
        number
    }
}

// takeIf: 주어진 조건을 만족하면 그 값이, 아니라면 null 반환
fun getNumberOrNullTakeIf(number: Int): Int? {
    return number.takeIf { it > 0 }
}

// takeUnless: takeIf의 반대
fun getNumberOrNullTakeUnless(number: Int): Int? {
    return number.takeUnless { it <= 0 }
}
