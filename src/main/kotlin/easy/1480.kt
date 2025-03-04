/**
 * 1480. Running Sum of 1d Array
 */

fun runningSum(nums: IntArray): IntArray {

    val runningSum = IntArray(nums.size)

    runningSum[0] = nums[0]
    for (i in 1 until nums.size) {
        runningSum[i] = runningSum[i - 1] + nums[i]
    }

    return runningSum

}