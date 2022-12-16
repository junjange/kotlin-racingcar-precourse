package racingcar

class Car(private val name: String) {
    private var position = 0

    private var _raceRecord = String()
    val raceRecord get() = _raceRecord

    fun move() {
        position++
        _raceRecord += "-"
    }


    fun getName() = name

}