public class LinearSearch {
    
    /**
     * Linear search algorithm to find a target value in an array. O(n).
     * @param nums array of integers
     * @param target target value of array to search for
     * @return index of target, index = -1 if not found
     */
    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 5, 12, 44, 45, 92, 120, 123, 199, 2000, 2032, 2300, 4031, 9999};
        for (int i = 0; i < nums.length; i++) {
            if (linearSearch(nums, nums[i]) == i) {
                System.out.println("Yay!");
            } else {
                System.out.println("Failed for i = " + i + ", should have been " + i + " but was " + linearSearch(nums, i));
            }
        }
    }
}
