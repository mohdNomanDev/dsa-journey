public class ArrayDsa {

    public static int linearSearch(int search, int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if (search == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int largestInArray(int[] nums){
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > largest){
                largest = nums[i];
            }
        }

        return largest;
    }

    
    public static void main(String[] args){
        int[] arr = {5, 12, 8, 20, 3, 15};
        int index = largestInArray( arr);
        System.out.println(index);
    }
}