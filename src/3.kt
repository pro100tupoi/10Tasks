fun main() {
    // Ввод массива
    print("Введите массив целых чисел через запятую: ")
    val nums = readLine()?.split(',')?.map { it.trim().toInt() } ?: return

    // Ввод целевого числа
    print("Введите целевое число: ")
    val target = readLine()!!.toInt()

    val startTime = System.nanoTime()

    // Вызов функции поиска индексов
    val result = findTwoSumIndices(nums.toIntArray(), target)

    val elapsedTime = System.nanoTime() - startTime
    println("Времени затрачено: ${elapsedTime / 1000000.0} мс")
    // Проверка наличия решения
    if (result[0] == -1 && result[1] == -1) {
        println("К сожалению, нет пары чисел в массиве, сумма которых равна целевому значению.")
    } else {
        println("Индексы двух чисел: ${result[0]} и ${result[1]}")
    }
}

fun findTwoSumIndices(nums: IntArray, target: Int): IntArray {
    val length = nums.size
    for (i in 0 until length - 1) {
        for (j in i + 1 until length) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf(-1, -1) // Возвращаем (-1, -1), если нет решения
}