import util.JavaPerson

fun main() {
    val person = Person("김형호", 25)
    // 함수 호출이 아닌, 변수를 바로 가져와 getter, setter를 사용할 수 있음
    println(person.name)
    person.age = 26
    println(person.age)

    // 자바 코드의 getter, setter도 이와 같이 활용할 수 있다.
    val javaPerson = JavaPerson("김형호", 26)
    println(javaPerson.name)
    javaPerson.age = 26
    println(javaPerson.age)
}

// 클래스는 자바의 record 클래스와 비슷하게 만들 수 있다.
// getter와 setter를 필드를 통해 자동으로 만들고, 생성자는 클래스 옆에 작성하여 사용
// 이때, val, var가 붙어 있는 필드만 getter, setter를 자동으로 만든다.
class Person(
    name: String = "홍길동",
    var age: Int = 1
) {
    // 필드를 아래에 선언하여, getter도 커스터마이징할 수 있음
    // 클래스의 필드값은 항상 getter를 통해 불려오기 때문에, 무한루프를 막기 위해 field 키워드를 사용한다.
    var name = name
        get() = field.uppercase()
        set(value) {
            field = value.lowercase()
        }

    //init: 초기화
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 $age 일 수 없다.")
        }
        println("초기화 블록")
    }

    // constructor: 다른 생성자 생성. 최종적으로 주생성자(this)를 호출해야함
    // 코틀린에서는 default parameter 권장
    constructor(name: String) : this(name, 1) {
        println("부생성자 1")
    }

    fun isAdult(): Boolean {
        return age >= 20
    }

    // 함수 대신 프로퍼티처럼 만들 수 있음
    val isAdult: Boolean
        get() = age >= 20
}