__author__ = 'alex'
import  sys
class Solution(object):
    def reverse(self, x):
        result = 0
        tempData = x
        if tempData == 0:
            return result
        elif tempData < 0:
            tempData *= -1
        while tempData > 0:
            temp = tempData % 10
            result = result * 10 + temp
            tempData /= 10
        if result > sys.maxint or result < -1 * sys.maxint - 1:
            return 0
        if x < 0:
            return -1 * result
        else:
            return result

solution = Solution()
print solution.reverse(1534236469)
print sys.maxint



