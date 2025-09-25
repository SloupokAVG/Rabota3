fun main() {
    println("Введите натуральное число:")
    val input = readlnOrNull() ?: ""

    val number = input.toIntOrNull()

    if (number == null || number < 0) {
        println("Ошибка: введите корректное натуральное число!")
        return
    }
    if (number == 0) {
        println("Двоичное представление: 0")
        return
    }

    var currentNumber = number
    val binaryDigits = mutableMapOf<Int>()

    while (currentNumber > 0) {
        val remainder = currentNumber % 2
        binaryDigits.add(remainder)
        currentNumber = currentNumber / 2

    }
}