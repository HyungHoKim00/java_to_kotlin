
fun main() {
    val man = Man.newBaby("asd")
    Man.move()

    // 싱글톤 클래스는 바로 호출할 수 있음.
    println(Singleton.a)

    // 익명 클래스 사용 -> object : 타입이름
    moveSomething(object : Movable {
        override fun move() {
            println("move")
        }
    })
}

class Man private constructor(
    var name: String,
    var age: Int,
) {
    // 코틀린은 static이 없음, 대신 companion object를 사용
    // companion object도 객체이기에, 이름을 정하거나 인터페이스를 구현할 수 있음
    // 기본 이름은 Companion
    companion object Factory : Movable {
        // const: 컴파일 시에 변수가 할당된다. 상수에 사용하기 위한 용도
        private const val MIN_AGE = 1

        // @JvmStatic: 바로 접근할 수 있음
        @JvmStatic
        fun newBaby(name: String) = Man(name, MIN_AGE)

        override fun move() {

        }
    }
}

interface Movable {
    fun move()
}

// object: 싱글톤 클래스 생성
object Singleton {
    var a: Int = 1
}

private fun moveSomething(movable :Movable) {
    movable.move()
}