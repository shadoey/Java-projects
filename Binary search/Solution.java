public class Solution {
    public int Search(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int value = arr[mid];

            if (value < target)
                low = mid + 1;
            else if (value > target)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }

}
