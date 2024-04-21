//Question 169. Majority Element


class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Verify if the candidate appears more than n/2 times
        int occurrenceCount = 0;
        for (int num : nums) {
            if (num == candidate) {
                occurrenceCount++;
            }
        }

        if (occurrenceCount > nums.length / 2) {
            return candidate;
        } else {
            return -1; // No majority element found
        }
    }
}
