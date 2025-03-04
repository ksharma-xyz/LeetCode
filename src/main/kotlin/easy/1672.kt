package easy

fun maximumWealth(accounts: Array<IntArray>): Int {
    var sl = 0

    for (account in accounts) {
        var sum = 0
        for (x in account.indices) {
            sum += account[x]
        }
        if (sum > sl) {
            sl = sum
        }
    }
    return sl
}