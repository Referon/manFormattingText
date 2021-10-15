fun main() {
    val likes = 211
    val outputLastDigit = likes % 10
    val output2Digit = likes % 100
    val result = if (outputLastDigit == 1 && output2Digit != 11 ) {
        "Понравилось $likes человеку"
    } else {
        "Понравилось $likes людям"
    }
    println(result)
}