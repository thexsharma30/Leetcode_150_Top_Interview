// Question 26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len==0) {
            return len;
        }

        int a = 1; // Counter for unique elements
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }
}