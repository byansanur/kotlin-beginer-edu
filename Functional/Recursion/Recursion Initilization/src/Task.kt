fun main() {
    println("Factorial 20 is: ${factorial(20)}")
}

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}