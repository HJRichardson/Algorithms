public class MergeSort {
    
    /** 
     * @param nums[] array to be sorted
     * @return void: sorts the array in place, O(nlog(n))
     */
    public static void mergeSort(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        sort(nums, left, right);
    }
    
    public static void sort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right)/2;

            sort(nums, left, mid);
            sort(nums, mid+1, right);
            merge(nums, left, mid, right);
        }
    }
    
    public static void merge(int[] nums, int left, int mid, int right) {
        int leftSubLen = mid - left + 1;
        int rightSubLen = right  - mid;

        int[] leftSub = new int[leftSubLen];
        int[] rightSub = new int[rightSubLen];

        for (int i = 0; i < leftSubLen; i++) {
            leftSub[i] = nums[left + i];
        }

        for (int i = 0; i < rightSubLen; i++) {
            rightSub[i] = nums[mid+i+1];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftSubLen && j < rightSubLen) {
            if (leftSub[i] <= rightSub[j]) {
                nums[k] = leftSub[i];
                i++;
            } else {
                nums[k] = rightSub[j];
                j++;
            }
            k++;
        }

        while (i < leftSubLen) {
            nums[k] = leftSub[i];
            i++;
            k++;
        }

        while (j < rightSubLen) {
            nums[k] = rightSub[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 1, 4};
        int[] sorted = new int[] {1, 2, 3, 4};
        mergeSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i = " + i);
            System.out.println("nums[" + i + "] = " + nums[i]);
            System.out.println("sorted[" + i + "] = " + sorted[i]);
        }
    }
}
