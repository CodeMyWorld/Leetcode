class Solution:
    # @param {integer[]} nums
    # @param {integer} target
    # @return {integer[]}
   #2 7 11 15 9
    def twoSum(self, nums, target):
    	for i in range(0,len(nums)):
    		for j in range(i+1,len(nums)):
    			if(nums[i] + nums[j] == target):
    				print "index1= %d,index2=%d" %(i+1,j+1)
    				break
    		else: continue
    		break

object = Solution()
nums = [50,25,6]
target = 31
object.twoSum(nums,target)		

