import kotlin.math.pow

fun main() {
    print("Число >>>")
    val num = readln().toInt()
    val startTime = System.nanoTime()
    var result = true;
    if (num <= 0) {
        result = false;
    } else {
        var length = 0
        var firstCopy = num
        while (firstCopy != 0) {
            firstCopy /= 10
            length++
        }
        for (i in 1..(length / 2 - 1)) {
            val first = (num / (10.0).pow(length - i) % 10).toInt()
            val last = (num % (10.0).pow(i) / (10.0).pow(i - 1)).toInt()
            if (first != last) {
                result = false
                break;
            }
        }
    }
    val elapsedTime = System.nanoTime() - startTime
    println("Времени затрачено: ${elapsedTime / 1000000.0} мс")
    println("Результат: $result")
}