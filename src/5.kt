fun main() {
    print("Элементы массива через запятую >>>")
    val input = readln().split(",").map { it.trim().toInt() }.sorted()
    val startTime = System.nanoTime()
    val result = findMissingNumber(input)
    val elapsedTime = System.nanoTime() - startTime
    println("Времени затраченное: ${elapsedTime / 1000000.0} мс")
    println("Результат: $result")
}

fun findMissingNumber(arr: List<Int>): Int {
    for (i in arr.indices) {
        if (i == arr.size - 1) {
            return i + 1
        }
        if (arr[i + 1] - arr[i] > 1) {
            return arr[i] + 1
        }
    }
    return -1
}