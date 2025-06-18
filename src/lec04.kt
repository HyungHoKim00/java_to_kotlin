import util.JavaMoney
import util.Money

fun main() {
    //단항, 산술 연산자는 모두 같음

    // 비교 연산자는 모두 같음
    // 단, 자바와 다르게 객체를 비교할 때 compareTo를 자동으로 호출
    val money1 = JavaMoney(10)
    val money2 = JavaMoney(20)
    // money1.compareTo(money2) > 0
    if(money1 > money2) {
        println("이렇게 비교 가능")
    }

    // 동일성: 주소까지 같은가, 동등성: 값이 같은가
    // 자바: 동일성에 ==, 동등성에 equals
    // 코틀린: 동일성에 ===, 동등성에 ==
    val money3 = money1
    val money4 = JavaMoney(money1.amount)
    println(money1 === money3) // true
    println(money1 === money4) // false
    println(money1 == money4) // true

    // 논리 연산자는 모두 같음
    // 자바처럼 Lazy 연산 수행 (or 연산에서 앞이 참이면 뒤는 연산하지 않음)

    // in/!in: 컬렉션이나 범위에 포함되어 있다/포함되어 있지 않다
    // a..b: a부터 b까지의 범위 객체를 생성한다
    // a[i]: a에서 특정 인덱스 i의 값을 가져온다
    // a[i] = b: 특정 인덱스 i에 b를 삽입힌다.

    // 연산자 오버로딩(operator): 객체마다 연산자를 정의할 수 있다.
    val money5 = Money(10)
    val money6 = Money(20)
    println(money5 + money6)
}