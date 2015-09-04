__author__ = 'alex'
class Solution(object):
    def convert(self, s, numRows):
        result = []
        if numRows == 1:
            return s
        for index_row in range(numRows):
            result.append([])
        for index in range(len(s)):
            row = index % (numRows + numRows - 2)
            if row < numRows:
                result[row].append(s[index])
            else:
                result[numRows - 1 - (row - numRows + 1)].append(s[index])
        result_str = ""
        for index_row in range(numRows):
            for index_inner in range(len(result[index_row])):
                result_str += result[index_row][index_inner]
        return result_str
solution = Solution()
print solution.convert("PAYPALISHIRING", 1)

