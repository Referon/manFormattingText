fun main() {
    val likes = 482
    val outputLastDigit = likes % 10
    val result = if (outputLastDigit == 1) {
        "Понравилось $likes человеку"
    } else {
        "Понравилось $likes людям"
    }
    println(result)
}