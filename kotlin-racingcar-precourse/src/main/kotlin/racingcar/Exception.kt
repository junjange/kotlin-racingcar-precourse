package racingcar

fun String.attemptsNumInputTypeException() {
    try {
        this.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("INPUT_TYPE_ERROR_MESSAGE")
    }
}