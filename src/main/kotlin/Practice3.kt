fun main() {
    print("Enter source number: > ")
    val number = readln()
    print("Enter source base: > ")
    val base = readln().toInt()

    when(base) {
        2, 8, 16 -> System.out.printf("Conversion result: ${NumberToBase(number, base)}")
        else -> println("Error: Please type 2, 8 or 16.")
    }
}

fun NumberToBase(number: String, base: Int): String {
    val value = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var out = ""
    var n = 0

    for(a in number) {
        val i = value.indexOf(a.toUpperCase())
        n=n*base+i
    }

    while (n > 0) {
        val i = n % 10
        out = value[i].toString() + out
        n /= 10
    }

    return out
}