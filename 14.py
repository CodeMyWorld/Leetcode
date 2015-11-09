__author__ = 'alex'
class Solution(object):
    def longestCommonPrefix(self, strs):
        result = ""
        if len(strs) == 0:
            return result
        for index in range(0, len(strs[0])):
            temp = strs[0][index]
            for value in strs:
                if index >= len(value):
                    return result
                elif not temp == value[index]:
                    return result
            result += temp
        return result

solution = Solution()
strs = []
result = solution.longestCommonPrefix(strs)
print result