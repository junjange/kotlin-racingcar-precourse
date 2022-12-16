package racingcar

interface RacingCarGameImpl {
    fun start()
    fun raceStart(cars: List<Car>, attemptsNum: Int)
    fun raceResult(cars: List<Car>): String
    fun makeCar(cars: List<String>): List<Car>
    fun carRace(): Boolean
}

