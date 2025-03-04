package easy

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * */
class ListNode(var value: Int) {
    var next: ListNode? = null
}

class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var current = head
        val list = mutableListOf<ListNode>()

        while(current != null){
            list.add(current)
            current = current.next
        }
        return list[list.size / 2]
    }
}
