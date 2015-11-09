__author__ = 'alex'
class Solution(object):
    def maxArea(self, height):
        max_area = 0
        left_border = 0
        right_border = len(height) - 1
        while left_border <= right_border:
            area = min(height[left_border], height[right_border]) * (right_border - left_border)
            if area >= max_area:
                max_area = area
            if height[right_border] > height[left_border]:
                    left_border += 1
            else:
                    right_border -= 1
        return max_area
solution = Solution()
print solution.maxArea([4, 3, 2, 1])
