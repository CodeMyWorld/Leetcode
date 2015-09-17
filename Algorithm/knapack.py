__author__ = 'alex'
class Solution(object):
    def knapace(self, value, weight, weight_limit):
        f = [[0 for j in range(weight_limit+1)] for i in range(len(value)+1)]
        for item in range(1, len(value)+1):
            item_index = item - 1
            for capacity in range(1, weight_limit+1):
                if weight[item_index] <= capacity:
                    with_out_value = f[item-1][capacity]
                    with_value = f[item-1][capacity-weight[item_index]] + value[item_index]
                    if with_out_value > with_value:
                        f[item][capacity] = with_out_value
                    else:
                        f[item][capacity] = with_value
                else:
                    f[item][capacity] = f[item-1][capacity]
        return f[len(value)][weight_limit]

solution = Solution()
value = [83, 14, 54, 79, 72, 52, 48, 62]
weight = [79, 58, 86, 11, 28, 62, 15, 68]
print solution.knapace(value, weight, 200)
