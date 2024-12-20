import kotlin.math.pow

fun main() {
    print("Строка >>>")
    val nums = readln()
    val startTime = System.nanoTime()
    var result = 0
    var count = 0
    val substr = mutableListOf<Char>()
    val strlen = nums.length
    var i = 0
    while (i < strlen) {
        if (substr.contains(nums[i])) {
            if (count > result) {
                result = count
            }
            count = 0
            substr.clear()
        }
        substr.add(nums[i])
        i++
        count++
    }
    if (count > result) {
        result = count
    }
    val elapsedTime = System.nanoTime() - startTime
    println("Времени затрачено: ${elapsedTime / 1000000.0} мс")
    println("Результат: $result")
}