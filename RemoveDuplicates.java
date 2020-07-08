/*
Remove Duplicates from Sorted Array

Given a sorted array nums, remove the dipluicates in place sucj that each element appear
only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array
in place with O(1) extra memory.

Ex. 1:
Fiven nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums being 1 and 2, respectively.
It doesn't matter what you leave beyond returned length.

Ex. 2:
Given nums = [0,0,1,1,1,2,2,3,3,4],
Your function should return length = 5, with the first five elemets of nums being odified to 
0, 1, 2, 3, and 4 respectively.

Confused why the returned value is an integer but your answer is an array?
Note that the input arrayu is passed in by reference, which means modification to the input array
will be known to the caller as well.

Internally you can think this:
// nums is passed in by reference. (i.e. without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements
for(int i = 0; i < len; i++){
	print(nums[i]);
}
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }
}