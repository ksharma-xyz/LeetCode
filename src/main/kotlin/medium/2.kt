package medium

import easy.ListNode

fun addTwoNumbers(l1: ListNode?, l2: ListNode?) {

    var l1Head = l1
    var s = ""
    while (l1Head != null) {
        s += l1Head.value
        l1Head = l1Head.next
    }

    var l2Head = l2
    var s1 = ""
    while (l2Head != null) {
        s1 += l2Head.value
        l2Head = l2Head.next
    }

     s.toCharArray().reverse()
    s1.toCharArray().reverse()
    println("s: ${s.toLong()}")
    println("s1: ${s1.toLong()}")

    val sum = s.toLong() + s1.toLong()

    println("sum: $sum")
}