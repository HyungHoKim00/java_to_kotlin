
fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom = LivingRoom(10.0)
) {
    // 바깥 클래스에 대한 참조를 가지고 있지 않음
    class LivingRoom(
        private val area: Double,
    )

    // 바깥 클래스에 대한 참조를 가지고 있음
    inner class LivingRoom2(
        private val area: Double,
    ) {
        val address: String
            get() = this@House.address
    }
}