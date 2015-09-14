__author__ = 'alex'
class Solution(object):
    def isPalindrome(self, x):
        if x < 0:
            return False
        stack = []
        tempX = x
        while tempX > 0:
            stack.append(tempX % 10)
            tempX /= 10
        tempX = x
        for index in range(len(stack)):
            digit = tempX % 10
            tempX /= 10
            if digit != stack.pop():
                return False
        return True

solution = Solution()
print solution.isPalindrome(-121)
