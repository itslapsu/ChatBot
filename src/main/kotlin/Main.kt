import java.util.Scanner

fun main(args: Array<String>) {
    /** Welcome **/

    print("Hello! My name is DICT_Bot.\n" +
        "Please, remind me your name.\n> ")

    val read = Scanner(System.`in`)
    val name = read.nextLine()

    println("What a great name you have, $name!")

    /** Guess age **/

    print("Let me guess your age.\n" +
        "Enter remainders of dividing your age by 3, 5 and 7.\n" +
        "> ")

    val rem1 = read.nextInt()
    print("> ")
    val rem2 = read.nextInt()
    print("> ")
    val rem3 = read.nextInt()

    val age = (rem1 * 70 + rem2 * 21 + rem3 * 15) % 105

    println("Your age is $age!")

    /** Number calculation **/

    println("Now I will prove to you that I can count to any number you want.")

    val number = read.nextInt()
    var i = 0

    while (i <= number) {
        println("$i!")
        i += 1
    }

    /** Knowledge **/

    print("Let's test your programming knowledge.\n" +
        "Why do we use methods?\n" +
        "1. To repeat a statement multiple times.\n" +
        "2. To decompose a program into several small subroutines.\n" +
        "3. To determine the execution time of a program.\n" +
        "4. To interrupt the execution of a program.\n")

    var answer = false

    while (!answer) {
        print("> ")
        val ans = read.nextInt()

        if (ans != 2) {
            println("Please, try again.")
            continue
        }
        else {
            println("Congratulations, have a nice day!")
            answer = true
        }
    }
}