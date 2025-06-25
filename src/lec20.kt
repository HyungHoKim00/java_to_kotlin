
fun main() {
    val person = Person()

    // scope function: 람다를 사용해 일시적인 영역을 만들어 사용하는 함수
    val val1: Int = person.let{ it.age }
    val val2: Int = person.run{ this.age }
    val val3: Person = person.also{ it.age }
    val val4: Person = person.apply{ this.age }
    val val5: Unit = with(person) {
        println(name)
        println(this.age)
    }

    // let: 하나 이상의 함수를 call chain 결과로 호출할 때
    val strings = listOf("apple", "car")
    strings.map { it.length }
        .filter { it > 3 }
        .let(::println)
    // non null 값에 대해서만 code block을 실행시킬 때
    var str: String? = "apple"
    val length = str?.let {
        println(it.uppercase())
        it.length
    }
    // 일회성으로 제한된 영역에 지역변수를 만들 때
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let{ firstItem ->
            if(firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem)

    // run: 객체 초기화와 반환 값의 계산을 동시에 해야 할 때
    val personRepository = PersonRepository()
    val savedPerson = Person("김형호").run(personRepository::save)

    // also: 객체 설정을 할 때 객체를 수정하는 로직이 call chain 중간에 필요할 때
    mutableListOf("one", "two", "three", "four")
        .also { println(it) }
        .add("five")
}

// apply: 객체 설정을 할 때 객체를 수정하는 로직이 call chain 중간에 필요할 때
fun createPerson(
    name: String,
    age: Int,
) : Person {
    return Person(name)
        .apply { this.age = age }
}

// with: 특정 객체를 다른 객체로 변환해야 하는데, 모듈 간에 의존성에 의해 어려울 때
fun toPersonDto(person: Person): PersonDto {
    return with(person) {
        PersonDto(
            name = name,
            age = age,
        )
    }
}

class PersonRepository {
    fun save(person: Person) : Person {
        println("Saving ${person.name}")
        return person
    }
}
