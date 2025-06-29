### lec01. 변수 다루기
 - 모든 변수는 var/val을 붙여 주어야 한다. 
   - var: 가변, val: 불변
 - 타입 추론이 가능하다.
 - 원시 타입과 참조 타입을 구분하지 않는다
 - nullable 변수는 타입 뒤에 ?를 붙여야 한다
 - 객체를 인스턴스화할 때 new를 붙이지 않는다.

### lec02. null 다루기
 - nullable 변수는 아예 다른 타입으로 간주된다.
   - 한번 null 검사를 하면 non-null임을 컴파일러가 파악한다.
 - null이 아닌 경우에만 호출하는 Safe call(?.)이 있다.
 - null인 경우에만 호출하는 Elvis 연산자(?:)가 있다.
 - null이 절대 아닐 때 사용할 수 있는 널 아님 단언(!!)이 있다.
 - 자바 코드를 사용할 때 플랫폼 타입 사용에 유의해야 한다.

### lec03. type 다루기
 - 변수는 초기값으로 타입을 추론한다
 - 기본 타입간의 변환은 명시적으로 이루어진다
 - is, !is, as, as?를 이용해 타입을 확인하고 캐스팅한다
 - Any: 자바의 Object
 - Unit: 자바의 void
 - Nothing: 비정상 함수 반환
 - 문자열 가공에서 ${}를 활용할 수 있다.
 - 문자열에서 문자를 가져올 때 자바의 배열처럼 활용 가능하다.

### lec04. 연산자 다루기
 - 단항, 산술, 산술대입 연산자는 Java와 같다
 - 비교 연산자도 Java와 같음
   - 단, compareTo 없이 비교 연산자로 수행 가능
 - in, !in, a..b, a[i], a[i] = b와 같은 연산자 존재
 - 객체끼리의 연산자를 정의할 수 있음

### lec05. 조건문 다루기
 - if문은 자바와 문법이 동일
 - 단, expression(값처럼 사용)이다
 - when: 자바의 switch

### lec06. 반복문 다루기
 - for-each 문에서 : 대신 in 사용
 - for 문에서 등차수열과 in 사용
 - while문은 자바와 동일

### lec07. 예외 다루기
 - try-catch-finally 구문은 동일하다
 - 단, expression이다.
 - 모든 예외는 unchecked이다
 - try-with-resources 구문이 없고, use를 활용

### lec08. 함수 다루기
 - 함수 문법은 자바와 다름
 - body가 하나의 값으로 간주되는 경우 block을 없애고 '='을 사용할 수 있다
   - block이 없는 경우 반환 타입을 생략할 수 있다.
 - 함수 파라미터에 기본값을 설정할 수 있다.
 - 함수를 호출할 때 특정 파라미터를 지정하여 넣을 수 있다.
 - 가변인자는 vararg 키워드를 사용하고, 인자를 ','로 구분하여 넣는다.
   - 가변인자 함수를 배열과 호출할 때는 스프레드 연산자(*)를 붙여야 한다.

### lec09. 클래스 다루기
 - 필드를 만들면 getter와 (val이 아닌 경우) setter가 자동으로 생긴다
   - 이를 프로퍼티라고 부른다.
 - 주생성자가 필수이다.
 - constructor 키워드를 통해 부생성자를 추가로 만들 수 있다.
   - 단, default parameter나 정적 팩토리 메서드를 추천한다.
 - 실제 메모리에 존재하는 것과 무관하게 custom getter, setter를 만들 수 있다.
 - custom getter, setter를 사용할 때 무한루프를 막기 위해 field 키워드를 사용한다.

### lec10. 상속 다루기
 - 상속 또는 구현에서는 ':'을 사용해야 한다
 - 상위 클래스 상속을 구현할 때 생성자를 반드시 호출해야 한다.
 - override를 필수로 붙여야 한다.
 - abstract 멤버가 아니면 기본적으로 오버라이드가 불가능하고, open 키워드를 사용해야 한다.
 - 상위 클래스의 생성자 또는 초기화 블록에서 open 프로퍼티를 사용하면 예기치 못한 버그가 생길 수 있다.

### lec11. 접근 제어 다루기
 - protected에서 자바와 다르게 같은 패키지는 접근이 불가능하다.
 - 자바의 default와 다르게 interanal 접근 제어자가 존재하고, 모듈간의 접근을 통제한다.
 - 생성자에 접근 제어자를 붙일 때는 constructor를 명시적으로 써주어야 한다
 - 유틸성 함수를 만들 때는 파일 최상단을 이용하면 편리하다.
 - 프로퍼티의 custom setter에 별도의 접근 제어자를 붙일 수 있다.
 - 자바-코틀린 변환에서 internal과 protected 사용에 주의해야 한다.

### lec12. object 키워드 다루기
 - companion object: 자바의 스태틱 변수와 함수 생성
 - companion object도 하나의 객체로 간주되기 때문에, 이름을 붙이고 상속받을 수 있음
 - 싱글톤 클래스를 만들 때 object 키워드를 사용한다
 - 익명 클래스를 만들 때 object : 타입을 사용한다

### lec13: 중첩 클래스 다루기
 - 바깥 클래스를 참조하지 않는 중첩 클래스가 권장된다
 - 클래스 안에 기본 클래스를 사용하면 바깥 클래스에 대한 참조가 없다
 - 바깥 클래스를 참조하고 싶다면, inner 키워드를 붙여야 한다
   - 바깥 클래스를 참조할 때 this@바깥클래스를 사용해야 한다.

### lec14: 다양한 클래스 다루기
 - data class: equals, hashcode, toString 자동 생성
 - enum class: 자바의 enum과 동일
 - sealed class: 하위 클래스가 런타임에 생성되는 것을 제한함.

### lec15: 배열과 컬렉션 다루기
 - 컬렉션을 만들 때 불변, 가변을 지정해야 한다
 - list, set, map에 대한 사용법이 변경, 확장되었다
 - 자바와 코틀린 코드를 섞어 컬렉션을 사용할 때는 주의해야 한다
   - 자바에서 코틀린 컬렉션을 가져갈 때는 불변 컬렉션이 수정될 수 있다.
   - 자바에서 코틀린 컬렉션을 가져갈 때는 non-nullable 컬렉션에 null을 넣을 수 있다.
   - 코틀린에서 자바 컬렉션을 가져갈 때는 플랫폼 타입(nullable 맥락)을 주의해야 한다.

### lec16: 다양한 함수 다루기
 - 확장함수: 자바 코드가 있는 상황에서, 코틀린 코드로 추가 기능을 개발하기 위해 등장
   - 원본 클래스의 private, protected 멤버 접근이 되지 않음
   - 멤버함수, 확장함수 중 멤버함수에 우선권이 있음
   - 현재 타입을 기준으로 호출됨
   - 자바에서는 static을 활용하는 것 처럼 확장함수를 호출할 수 있음
 - infix 함수: 파라미터가 하나일 때, 함수 호출 방식을 바꿈
   - '변수' '함수' '파라미터' 형식
 - inline 함수: 함수 자체를 선언된 곳에 복사 붙여넣기 함
 - 지역함수: 함수 안에 선언한 함수

### lec17: 람다 다루기
 - 함수는 1급시민이다.
   - 함수 자체를 변수에 넣을 수 있고, 파라미터로 전달할 수 있다.
 - 함수 타입은 '(파라미터 타입,...) -> 반환타입' 꼴로 작성된다.
 - 코틀린에서 람다는 두 가지 방법으로 만들 수 있고, {} 방법이 선호된다.
 - 함수를 호출하며, 마지막 파라미터인 람다를 쓸 때는 소괄호 밖으로 뺄 수 있다.
   - 파라미터가 한개인 람다에서는 파라미터를 it을 통해 접근할 수 있다.
 - 람다의 마지막 expression 결과는 람다의 반환값이다. return 작성할 필요 없다
 - closure 라는 개념으로 non-final 변수도 람다에서 사용할 수 있다.

### lec18: 컬렉션을 함수형으로 다루기
 - 많은 기능이 있으므로, 코드 참조

### lec19: 이모저모
 - typealias: 타입에 대한 별칭 설정
 - as import: import 당시 별칭 설정
 - 구조분해: 객체 내부의 변수를 한 번에 선언할 수 있음
   - componentN 함수가 존재해야 함, data class에는 기본적으로 존재
 - for, while문과 다르게 forEach에서는 break, continue 사용 불가
 - takeIf: 조건이 맞다면 값을 가져오고, 아니면 null
 - takeUnless: takeIf의 반대

### lec20: scope function
 - scope function: 일시적인 영역을 만들어 코드를 더 간결하게 하거나, 메서드 체이닝에 활용된다
   - let, run, also, apply, with
 - 사람에 따라 가독성을 다르게 느끼기 때문에, 컨벤션을 잘 따라야 한다.
