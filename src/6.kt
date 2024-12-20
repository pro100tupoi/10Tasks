fun main() {
    print("Элементы массива через запятую >>>")
    val nums = readln().split(",").map { s -> s.toInt() }
    val startTime = System.nanoTime()
    var result = 0
    for (num in nums.distinct()) {
        if (nums.count {n -> n == num} > nums.count() / 2) {
            result = num;
            break;
        }
    }
    val elapsedTime = System.nanoTime() - startTime
    println("Времени затрачено: ${elapsedTime / 1000000.0} мс")
    println("Результат: $result")
}