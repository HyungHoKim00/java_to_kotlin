
fun handleCountry(country: Country) {
    // enum 클래스에선 else 추가 안해도됨.
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

fun handleCar(car: HyundalCar) {
    // sealed 클래스에서도 else 추가 안해도됨
    when (car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}

// data: equals, hashcode, toString 메서드를 자동으로 만든다.
// record와 거의 동일
data class PersonDto(
    private val name: String,
    private val age: Int,
)

// enum: 클래스 앞에 선언
enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US")
}

// sealed class: 컴파일 시 하위 클래스 타입을 기억하고, 런타임에 클래스 타입이 추가될 수 없다
// 하위 클래스는 같은 패키지에 있어야 한다.
sealed class HyundalCar(
    val name: String,
    val price: Long
)

class Avante : HyundalCar("Avante", 1000)
class Sonata : HyundalCar("Sonata", 1000)
class Grandeur : HyundalCar("Grandeur", 1000)
