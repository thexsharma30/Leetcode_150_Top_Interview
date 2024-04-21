//Question 88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[a] = nums1[i];
                i--;
            } else {
                nums1[a] = nums2[j];
                j--;
            }
            a--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        while (j >= 0) {
            nums1[a] = nums2[j];
            j--;
            a--;
        }

        // You don't need to sort again with Arrays.sort

        for (int k = 0; k < m + n; k++) {
            System.out.print(nums1[k]);
        }
    }
}