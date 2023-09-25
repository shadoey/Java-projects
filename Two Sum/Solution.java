public class Solution {
    public void sort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            // int j = i+1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        /*
         * for (int i = 0; i < nums.length; i++) {
         * System.out.println(nums[i]);
         * }
         */

    }

    public void two_sum(int[] arr, int target) {
        int s = arr.length;
        int sum;
        int startindex = 0;
        int endindex = 0;
        boolean twoSum = false;
        for (int i = 0; i < s; i++) {
            for (int j = i + 1; j < s; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    twoSum = true;
                    startindex = i;
                    endindex = j;
                    break;
                }
            }
        }
        System.out.println(twoSum);
        System.out.println(startindex);
        System.out.println(endindex);

    }
}
