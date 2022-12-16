package racingcar

import kotlin.random.Random

class RacingCarGame {

    fun start() {
        OutputView().getCarNamePrint()
        val carNames = InputView().getCarName()
        OutputView().getAttemptsNumPrint()
        val attemptsNum = InputView().getAttemptsNum()
        println()
        raceStart(makeCar(carNames), attemptsNum)
    }

    fun raceStart(cars: List<Car>, attemptsNum: Int) {
        println("실행 결과")
        for (i in 0 until attemptsNum) {
            cars.forEach {
                if (carRace()) it.move()
                OutputView().carRaceResultPrint(it)
            }
            println()
        }
        OutputView().carRaceFinalResultPrint(cars)
    }

    fun makeCar(cars: List<String>): List<Car> {
        return cars.map {
            Car(it.trim())
        }
    }

    fun carRace(): Boolean = (0..9).random() >= 4
}