__author__ = 'alex'

class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        carry = 0
        result = None
        result_cursor = None
        while not (l1 is None) or not (l2 is None):
            if l1 is None:
                digit1 = 0
            else:
                digit1 = l1.val
            if l2 is None:
                digit2 = 0
            else:
                digit2 = l2.val
            sum = digit1 + digit2 + carry
            carry = sum / 10
            if result is None:
                result = ListNode(sum % 10)
                result_cursor = result
            else:
                result_cursor.next = ListNode(sum % 10)
                result_cursor = result_cursor.next
            if not (l1 is None):
                l1 = l1.next
            if not (l2 is None):
                l2 = l2.next

        if carry != 0:
            result_cursor.next = ListNode(carry)
        return result

node1 = ListNode(2)
node1.next = ListNode(4)
node1.next.next = ListNode(3)

node2 = ListNode(5)
node2.next = ListNode(6)
node2.next.next = ListNode(4)
node2.next.next.next = ListNode(7)

node3 = ListNode(0)
solution = Solution()
result = solution.addTwoNumbers(node1, node3)

while not(result is None):
    print result.val
    result = result.next

