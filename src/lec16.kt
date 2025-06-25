import util.JavaPerson

fun main() {
    val str = "ABC"
    val last = str.lastChar()
    println(last)

    // false
    val train = Train()
    println(train.isExpensive())

    // false (Train의 확장함수. 내장함수의 경우 true로 나옴.)
    // 해당 변수의 현재 타입에 의해 어떤
    val srt1 : Train = Srt()
    println(srt1.isExpensive())

    // true
    val srt2 : Srt = Srt()
    println(srt2.isExpensive())

    3.add(4)
    3 add2 4
}

// 확장함수: 어떤 클래스 안에 있는 메소드처럼 호출할 수 있지만, 함수는 클래스 밖에 있음
fun String.lastChar(): Char {
    return this[this.length - 1]
}

// 캡슐화를 위해 private, protected 멤버를 가져올 수 없음
class Age(private val age : Int)
// error => fun Age.add() : Int = this.age + 1

// 확장 프로퍼티를 만들 수 있음.
val String.firstChar: Char
    get() = this[0]

// 확장함수와 멤버함수의 시그니처가 동일하면, 멤버함수가 호출된다.
fun JavaPerson.nextYearAge(): Int {
    return this.age + 1
}

open class Train(val name: String = "train")

class Srt : Train("srt")

fun Train.isExpensive() = false

fun Srt.isExpensive() = true

fun Int.add(other: Int) : Int {
    return this + other
}

// 중위함수
infix fun Int.add2(other: Int) : Int {
    return this + other
}

// inline 함수: 함수의 로직 자체를 복사해서 사용. 사용할 때 주의해야 한다.
inline fun Int.add3(other: Int) : Int {
    return this + other
}

class TwoName(firstName : String, secondName : String) {
    init {
        // 지역함수: 함수 안에 함수를 만든다.
        fun validateName(name : String) {
            if(name.isEmpty()) {
                throw IllegalArgumentException("Name cannot be empty")
            }
        }

        validateName(firstName)
        validateName(secondName)
    }
}