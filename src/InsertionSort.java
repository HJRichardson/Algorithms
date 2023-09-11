public class InsertionSort {
    
    /** 
     * @param nums[] array to be sorted
     * @return void: sorts the array in place, O(n^2)
     */
    public static void insertionSort(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            int val = nums[i];
            int index = i - 1;
            while (index >= 0 && nums[index] > val) {
                nums[index+1] = nums[index];
                index--;
            }
            nums[index+1] = val;
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {2, 4, 1, 4, 9, 2, 3};
        int[] sorted = new int[] {1, 2, 2, 3, 4, 4, 9};
        insertionSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i = " + i);
            System.out.println("nums[" + i + "] = " + nums[i]);
            System.out.println("sorted[" + i + "] = " + sorted[i]);
        }
    }
}
