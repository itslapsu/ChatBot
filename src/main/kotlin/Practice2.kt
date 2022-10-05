fun main() {
    print("Enter number in decimal system: > ")
    val decimal = readln().toInt()
    print("Enter target base: > ")
    val target = readln().toInt()

    when(target) {
        2, 8, 16 -> System.out.printf("Conversion result: ${DecimalToTarget(decimal, target)}")
        else -> println("Error: Please type 2, 8 or 16.")
    }
}

fun DecimalToTarget(decimal: Int, target: Int): String {
    var n = decimal
    val value = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var out = ""

    while (n != 0) {
        val i = n % target
        out = value[i].toString() + out
        n /= target
    }

    return out
}