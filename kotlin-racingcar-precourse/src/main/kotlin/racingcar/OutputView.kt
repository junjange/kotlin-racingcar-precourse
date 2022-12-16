package racingcar

class OutputView {
    fun getCarNamePrint() = println(Constant.getCarNameMessage)
    fun getAttemptsNumPrint() = println(Constant.getAttemptsNumMessage)
    fun carRaceResultPrint(car: Car) = println(Constant.carRaceResultMessage.format(car.getName(), car.raceRecord))
    fun carRaceFinalResultPrint(winner: String) = println(Constant.carRaceFinalResultMessage.format(winner))

}