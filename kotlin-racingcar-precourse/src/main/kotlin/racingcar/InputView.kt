package racingcar

import java.io.Console

class InputView {
    fun getCarName(): List<String> = readLine()!!.split(",")

    fun getAttemptsNum(): Int {
        while (true) {
            val attemptsNum = readLine()!!
            kotlin.runCatching {
                attemptsNum.attemptsNumInputTypeException()
            }.onSuccess { return attemptsNum.toInt() }
                .onFailure { it.message }
        }
    }


}