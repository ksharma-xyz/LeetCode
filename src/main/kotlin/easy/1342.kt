fun numberOfSteps(num: Int): Int {
    var target = num
    var step = 0
    while (target != 0) {
        if (target % 2 == 0) target /= 2
        else target--
        step++
    }
    return step
}