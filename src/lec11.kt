
// 접근 제어
// public: 모든 곳에서 접근 가능, 기본 접근 제어자
// protected: 선언된 클래스 또는 하위 클래스에서만 접근 가능
// internal: 같은 모듈에서만 접근 가능, 자바에서는 public으로 변환됨
// private: 선언된 클래스 내에서만 접근 가능
fun main() {

}

// 생성자에 접근 제어를 하기 위해선 constructor를 명시해야함.
class Dog private constructor() {

}

// 유틸성 정적 메서드는 파일 최상단에 직접 작성하는 것이 더 편함.
fun isDirectoryPath(path: String): Boolean = path.endsWith("/")

// 프로퍼티에는 getter, setter에 한번에 접근 제어를 설정하거나, 따로 설정할 수 있음
class Car(
    internal val name: String,
    private var owner: String,
    price: Int
) {
    var price = price
        private set
}