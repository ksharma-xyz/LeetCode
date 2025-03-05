import easy.ListNode
import medium.addTwoNumbers
import medium.coloredCells

fun main() {

    // Create first linked list: 2 -> 4 -> 3
    val l1 = ListNode(2)
    l1.next = ListNode(4)
    l1.next?.next = ListNode(3)

    // Create second linked list: 5 -> 6 -> 4
    val l2 = ListNode(5)
    l2.next = ListNode(6)
    l2.next?.next = ListNode(4)

    val result = addTwoNumbers(l1, l2)
    println(result)
}