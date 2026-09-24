# jump_game2
Problem

Given an array nums, where nums[i] represents the maximum jump length from index i, find the minimum number of jumps required to reach the last index.

**Example**
Input: nums = [2,3,1,1,4]
Output: 2

We can reach the last index in 2 jumps:

0 → 1 → 4
**Approach**

We use a Greedy approach.

jump stores the number of jumps.
curr_end stores the boundary of the current jump.
max stores the farthest index we can reach.
When i == curr_end, the current range is completed, so we take another jump and update curr_end.
      
**Complexity**
Time Complexity: O(n)
Space Complexity: O(1)
