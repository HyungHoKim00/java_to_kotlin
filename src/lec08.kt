
fun main() {
    repeat("hi")
    repeat("hi", 3)
    repeat("hi", 3, true)

    //named parameter: 파라미터에 이름을 사용하여 어떤 파라미터인지 명시할 수 있음
    repeat("hi", useNewLine = false)

    // builder와 같은 장점을 누릴 수 있음
    // 자바 함수를 가져와 사용할 때는 namedArgument를 사용할 수 없음
    printNameAndGender(
        gender = "male",
        name = "harry"
    )

    // 가변 인자 함수 사용
    printAll("A", "B", "C")

    // 배열을 바로 넣지 않고, 스프레드 연산자(*)를 사용해야 한다
    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

// public은 생략 가능하다
// 바로 return을 하는 경우, 중괄호를 '='로 대체하고 return 생략 가능
// '='을 활용하면서, 반환 타입이 확실하면 반환 타입 생략 가능
fun max(a: Int, b: Int) = if (a > b) a else b

// default parameter: parameter에 기본값을 설정 가능
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for(i in 1..num) {
        if(useNewLine) println(str) else print(str)
    }
}

fun printNameAndGender(name: String, gender: String) {
    println("$name, $gender")
}

// vararg: 가변 인자
fun printAll(vararg strings: String) {
    for(str in strings) {
        println(str)
    }
}