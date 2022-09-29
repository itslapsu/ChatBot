fun main() {
    print("Enter number in decimal system: > ")
    val decimal = readln().toInt()
    print("Enter target base: > ")
    val target = readln().toInt()

    when(target) {
        2, 8, 16 -> System.out.printf("Conversion result: %d", DecimalToTarget(decimal, target))
        else -> println("Error: Please type 2, 8 or 16.")
    }
}

fun DecimalToTarget(decimal: Int, target: Int): Long {
    var n = decimal
    var number: Long = 0
    var remainder: Int
    var i = 1

    while (n != 0) {
        remainder = n % target
        n /= target
        number += (remainder * i).toLong()
        i *= 10
    }
    return number
}