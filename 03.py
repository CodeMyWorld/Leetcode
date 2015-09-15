__author__ = 'alex'
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        if s == "":
            return 0
        posi_dict = dict()
        start_position = 0
        current_longest_length = 0
        posi = 0
        for index in range(len(s)):
            if not s[index] in posi_dict:
                posi_dict[s[index]] = index
                if index == len(s) - 1:
                    if index - start_position + 1 > current_longest_length:
                        print start_position
                        return index - start_position + 1
            else:
                if start_position == posi_dict[s[index]]:
                    current_length = index - start_position
                    if current_length > current_longest_length:
                        current_longest_length = current_length
                        posi = start_position
                else:
                    current_length = index - start_position
                    if current_length > current_longest_length:
                        current_longest_length = current_length
                        posi = start_position
                start_position = posi_dict[s[index]] + 1
                posi_dict.clear()
                for i in range(start_position, index+1):
                    posi_dict[s[i]] = i
        print "last: %s" % posi
        return current_longest_length

solution = Solution()
print solution.lengthOfLongestSubstring("db!@#$%^&acbvv")

