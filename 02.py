class ListNode:
	def __init__(self,x):
		self.val = x
		self.next = None


#Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
#Output: 7 -> 0 -> 8

def buildList(nums):
	def build(lastNode):
		node = ListNode
	list = None
	for num in nums:
		node = ListNode(num)

node1 = ListNode(2)
node2 = ListNode(4)
node3 = ListNode(3)
node1.next = node2
node2.next = node3

node4 = ListNode(5)
node5 = ListNode(6)
node6 = ListNode(4)
node4.next = node5
node5.next = node6

class Solution:
    # @param {ListNode} l1
    # @param {ListNode} l2
    # @return {ListNode}
    def addTwoNumbers(self, l1, l2):
    	stack1 = []
    	stack2 = []
    	result = None
    	result2 = None
    	while l1:
    		stack1.append(l1.val)
    		l1 = l1.next
    	while l2:
    		stack2.append(l2.val)
    		l2 = l2.next
    	if(len(stack1) >= len(stack2)):
    		digAdd = None
    		for i in range(len(stack2)):
    			dig1 = stack1.pop()
    			dig2 = stack2.pop()
    			#print "dig1: %d dig2: %d" %(dig1,dig2)
    			if digAdd != None:
    				digSum = (dig1 + dig2) % 10 + digAdd
    			else:
    				digSum = (dig1 + dig2) % 10
    			digAdd = (int)((dig1 + dig2) / 10)
    			#print "result %d" %digSum

    			if result == None:
    				result = ListNode(digSum)
    				result2 = result
    			else:
    				result.next = ListNode(digSum)
    				result = result.next
    		else:
    			if digAdd != 0 and digAdd != None:
    				result.next = ListNode(digAdd)

    	return result2
    			

#sdf

test = Solution()
result = test.addTwoNumbers(node1,node4)
while result != None:    	
	print result.val
	result = result.next

