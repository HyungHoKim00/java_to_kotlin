import util.JavaPerson

fun main() {
    // 타입 추론
    val number1 = 10 // Int
    val number2 = 10L // Long
    val number3 = 3.0f // Float
    val number4 = 3.0 // Double

    // 코틀린은 암시적 타입 변경이 불가능하다
    val number5 = 4
    val number6: Long = number5.toLong()
    // val number6: Long = number5

    val number7 = 3
    val number8 = 5
    val result = number7 / number8.toDouble()

    // 명시적 타입 변경에도 null처리 필요
    val number9: Int? = 3
    val number10: Long = number9?.toLong() ?: 0L

    // Any: 자바의 Object 클래스
    val obj: Any

    // Unit: 자바의 void, 타입 추론으로 생략 가능
    // 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미

    // Nothing: 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
    // 무조건 예외를 반환하는 함수, 무한루프 등

    // String 가공
    val person = JavaPerson("김형호", 26)
    val name = person.name
    println("제 이름은 ${person.name} 입니다.")
    println("제 이름은 $name 입니다.")

    """
        가나다라
        마바사
        $name
        등등..
    """.trimIndent()

    // String 인덱싱
    val str = "ABC"
    val iWantSecond = str[2]
}

fun printNameIfPerson(obj: Any) {
    // is: 자바의 instanceof
    if (obj is JavaPerson) {
        // Person person = (Person) obj
        // val person = obj as person
        // 스마트 캐스트: if에서 타입 추론을 완료했을 때 캐스팅 생략 가능
        println(obj.name)
    }
}

fun printNameIfPerson2(obj: Any?) {
    // !instanceof 가능
    if(obj !is JavaPerson) {
        return
    }
    // as: 캐스팅 대상 클래스가 일치하지 않을 경우, 에러 발생
    // as?: 캐스팅 대상이 null인 경우, 그대로 null로 전달됨
    // as?: 캐스팅 대상 클래스가 일치하지 않을 경우, null 발생
    val person = obj as? JavaPerson
    println(person?.name)
}