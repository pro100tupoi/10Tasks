import kotlin.math.pow

fun main() {
    print("Элементы массива через запятую >>>")
    val nums = readln().split(",").map { s -> s.toInt() }
    print("k >>>")
    val k = readln().toInt()
    val startTime = System.nanoTime()
    var result = false
    for (i in 0..<(nums.count() - 1 )) {
        for (j in (i + 1)..<nums.count()) {
            if (j - i > k) {
                break;
            }
            if (nums[i] == nums[j]) {
                result = true;
            }
        }
        if (result) {
            break;
        }
    }
    val elapsedTime = System.nanoTime() - startTime
    println("Времени затрачено: ${elapsedTime / 1000000.0} мс")
    println("Результат: $result")
}