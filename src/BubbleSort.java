public class BubbleSort {
    
    
    /** 
     * @param nums[] array to be sorted
     * @return void: sorts the array in place, O(n^2)
     */
    public static void bubbleSort(int nums[]) {
        int length = nums.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 4, 1, 4, 9, 2, 3};
        int[] sorted = new int[] {1, 2, 2, 3, 4, 4, 9};
        bubbleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i = " + i);
            System.out.println("nums[" + i + "] = " + nums[i]);
            System.out.println("sorted[" + i + "] = " + sorted[i]);
        }
    }
}
