/**
 * 1480. Running Sum of 1d Array
 */

fun runningSum(nums: IntArray): IntArray {

    val runningSum = mutableListOf<Int>()

    for (i in nums.indices) {
        var sum = 0
        var z = i
        while (z >= 0) {
            sum += nums[z]
            z--
        }
        runningSum.add(sum)
    }
    return runningSum.toIntArray()
}