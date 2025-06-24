import util.JavaPerson

fun main() {
    // Long number1 = 10;
    // 원시형/참조형 구분 없음
    var number1 : Long = 10L;

    // System.out 생략 가능
    println(number1)

    // final Long number2 = 20;
    // final = val
    val number2 = 20
    // number2++;

    // 타입 지정 없이 변수만을 할당할 수는 없다.
    var number3 : Long
    // var number3

    // 불변변수 val도 할당 한 적이 없는 경우, 최초 한번은 할당 가능하다
    val number4 : Long
    number4 = 30

    // tip: 모든 변수는 우선 val로 만들고 필요한 경우에만 var로 변경하자.

    // 코틀린의 nullable: ?
    var number5 : Long? = null

    // 객체의 인스턴스화: new 사용 x
    var person = JavaPerson("harry", 26);
}