//Question 27. Remove Element

class Solution {
    public int removeElement(int[] nums, int val) {
        int l = nums.length;
        int a = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] == val) {
                continue;
            } else {
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }
}