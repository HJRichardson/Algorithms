public class BinarySearch {
    
    /**
     * Linear search algorithm to find a target value in an array. O(log(n)).
     * @param nums array of integers
     * @param target target value of array to search for
     * @return index of target, index = -1 if not found
     */
    public static int binarySearch(int[] nums, int target) {
        int left = 0; // left side of array
        int right = nums.length - 1; // right side of array

        // loop until left moves past right
        while (left <= right) {
            int middle = (left + right)/2; // calculating the middle index from left and right endpoints

            // if we have found the target, we return the index
            if (nums[middle] == target) {
                return middle;
            } 
            
            // if the value at the middle index is smaller than the target,
            // then the target cannot be a value with an index smaller than
            // middle, so we update left to one past middle
            else if (nums[middle] < target) {
                left = middle + 1;
            } 
            
            // if the value at the middle index is greater than the target,
            // then the target cannot be a value with an index greater than
            // middle, so we update right to one before middle
            else {
                right = middle - 1;
            }
        }
        return -1; // if not found, return -1
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 5, 12, 44, 45, 92, 120, 123, 199, 2000, 2032, 2300, 4031, 9999};
        for (int i = 0; i < nums.length; i++) {
            if (binarySearch(nums, nums[i]) == i) {
                System.out.println("Yay!");
            } else {
                System.out.println("Failed for i = " + i + ", should have been " + i + " but was " + binarySearch(nums, i));
            }
        }
    }
}
