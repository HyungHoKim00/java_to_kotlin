import util.Person

fun main() {
    val str: String? = "ABC"
    // str.length 바로 호출 불가
    // Safe call: nullable 변수 뒤에 ?를 붙여서 null이 아닌 경우에만 호출한다.
    // null인 경우 값 자체가 null이 됨. 아래의 경우 null출력
    println(str?.length)
    // println(str.length)

    // Elvis 연산자 (?:): 앞의 결과가 null이면 뒤의 값을 사용
    str?.length ?: 0

    // null에 대한 어노테이션 정보에 따라 처리함.
    // @Nullable, @Notnull 어노테이션을 통해 파악
    // 어노테이션이 없는 경우, nullable 유무를 파악할 수 없기 때문에 runtime에러 발생 가능(플랫폼 타입)
    val person = Person("harry");
    startsWithA(person.name)
    // startsWithA(person.nullableName)
}

fun startsWithA(str: String) : Boolean {
    return str.startsWith("A")
}

// public boolean startsWithA1(String str)
fun startsWithA1(str: String?) : Boolean {
//    if(str == null) {
//        throw IllegalArgumentException()
//    }
//    return str.startsWith("A")
    return str?.startsWith("A") ?: throw IllegalArgumentException()
}

// public Boolean startsWithA2(String str)
fun startsWithA2(str: String?) : Boolean? {
//    if(str == null) {
//        return null
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
}

// null이 들어갈 수 있는 경우에 대해서 바로 함수호출을 할 수 없음.
// null체크를 하지 않으면 오류 발생
fun startsWithA3(str: String?) : Boolean {
//    if(str == null) {
//        return false
//    }
//    return str.startsWith("A")
    return str?.startsWith("A") ?: false
}

// null아님 단언 (!!): 어떤 경우에도 null이 아니라고 컴파일러에 선언
// null인 경우, npe가 발생하기 때문에 조심해서 사용
fun startsWithA4(str: String?) : Boolean {
    return str!!.startsWith("A")
}
