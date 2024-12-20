fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val sortedNums = nums.sorted()
    val result = IntArray(nums.size)

    for (i in nums.indices) {
        // находим индекс nums[i] в отсортированном массиве
        var index = 0
        for (j in sortedNums.indices) {
            if (sortedNums[j] < nums[i]) {
                index++
            }
        }
        result[i] = index
    }
    return result
}

fun main() {
    print("Введите массив, разделенный запятыми: ")
    val input = readLine()!!

    val nums = input.split(",").map { it.trim().toInt() }.toIntArray()

    val result = smallerNumbersThanCurrent(nums)

    println("Количество чисел меньше каждого числа в массиве:")
    for (i in nums.indices) {
        println("Для ${nums[i]} количество чисел меньше: ${result[i]}")
    }
    println("Результат в виде массива:")
    println(result.joinToString())
}