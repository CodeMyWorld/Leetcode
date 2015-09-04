__author__ = 'alex'
MAX, MIN = 2147483647, -2147483648
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
        if result > MAX or result < MIN:
            return 0
        if x < 0:
            return -1 * result
        else:
            return result

solution = Solution()
print solution.reverse(1534236469)




