package racingcar

import java.io.Console


class InputView {
    fun getCarName(): List<String> {
        while (true) {
            val carNames = readLine()!!
            kotlin.runCatching {
                carNames.carNameInputTypeException()
            }.onSuccess { return carNames.trim().split(",") }.onFailure {
                println(it.message)
                OutputView().getCarNamePrint()
            }
        }
    }

    fun getAttemptsNum(): Int {
        while (true) {
            val attemptsNum = readLine()!!
            kotlin.runCatching {
                attemptsNum.attemptsNumInputTypeException()
            }.onSuccess { return attemptsNum.toInt() }.onFailure {
                it.message
                OutputView().getAttemptsNumPrint()
            }
        }
    }
}