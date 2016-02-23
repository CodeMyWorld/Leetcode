__author__ = 'alex'

class Solution(object):
    def myAtoi(self, str):
        result = 0
        is_nagetive = False
        space_end = False
        sign_end = False

        for index in range(0, len(str)):
            if str[index].isdigit():
                result = result * 10 + (ord(str[index]) - 48)
                space_end = True
            elif str[index] == " " and not space_end:
                continue
            elif str[index] == "+" and not sign_end:
                sign_end = True
                space_end = True
            elif str[index] == "-" and not sign_end:
                sign_end = True
                space_end = True
                is_nagetive = True
            else:
                break

        if is_nagetive:
            result *= -1
        if result > 2147483647:
            result = 2147483647
        if result < -2147483648:
            result = -2147483648
        return result


solution = Solution()
print solution.myAtoi("     +004500")
