class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k % l;
        if (k == 0) {
            return;
        }
        int[] temp = new int[l];
        for (int i = 0; i < l; i++) {
            temp[i] = nums[(i + l - k) % l];
        }
        for (int i = 0; i < l; i++) {
            nums[i] = temp[i];
        }
    }
}
