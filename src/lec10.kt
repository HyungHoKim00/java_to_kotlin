
// final: override 불가, 기본 키워드
// open: override 가능
// abstract: override 필수
// override: 상위 타입 덮어쓰기
abstract class Animal(
    protected val species: String,
    // 프로퍼티를 override할 때 무조건 open을 붙여야 한다.
    // 상위 클래스를 설계할 때, 생성자 혹은 초기화 블록에 사용되는 프로퍼티에는 open을 피해야 한다.
    protected open val legCount: Int
) {
    abstract fun move()
}

// extends 대신 ':' 사용
// 상위 클래스의 생성자를 바로 사용
// override를 필수적으로 사용
class Cat(
    species: String
) : Animal(species, 4) {
    override fun move() {
        println("cat move")
    }
}

// implements 역시 ':' 사용
// super의 타입을 명시할 때 <> 활용.
class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {
    private val wingCount: Int = 2

    override fun move() {
        println("penguin move")
    }

    override val legCount: Int
        get() = wingCount + super.legCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}

interface Flyable{
    // default 키워드 없이 메서드 구현이 가능하다.
    fun act() {
        println("flying")
    }
}

interface Swimable{
    // 프로퍼티를 인터페이스에 만들 수 있다.
    val swimAbility: Int

    fun act() {
        println("swimming")
    }
}