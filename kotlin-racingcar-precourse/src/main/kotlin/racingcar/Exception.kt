package racingcar

fun String.carNameInputTypeException() {
    try {
        this.trim().split(",").forEach{
            if (it.length !in 1..5) throw IllegalArgumentException("INPUT_TYPE_ERROR_MESSAGE")
        }
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("INPUT_TYPE_ERROR_MESSAGE")
    }
}

fun String.attemptsNumInputTypeException() {
    try {
        this.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("INPUT_TYPE_ERROR_MESSAGE")
    }
}