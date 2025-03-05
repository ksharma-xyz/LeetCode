package medium

// x + [(x - 2) until 1] x 2

fun coloredCells(n: Int): Long {
    var x:Long = n * 2L - 1L
    var answer:Long = x
    var half:Long = 0
    while (x != 1L) {
        half += x - 2
        x -= 2
    }

    answer += (half * 2)

    return answer
}