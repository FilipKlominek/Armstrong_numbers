import kotlin.math.pow

fun main() {
    val input = readLine()!!
    for (i in 0..input.toInt()) {
        if (isArmstrong(i.toString())) println(i)
    }
}
fun isArmstrong(input: String): Boolean {
    var sum = 0
    for (i in 0..input.length - 1) {
        sum += input[i].toString().toDouble().pow(input.length.toDouble()).toInt()
    }
    return sum == input.toInt()
}