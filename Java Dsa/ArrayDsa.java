public class ArrayDsa {

    public static int linearSearch(int search, int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if (search == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    
    public static void main(String[] args){
        int[] arr = {5, 12, 8, 20, 3, 15};
        int index = linearSearch(20, arr);
        System.out.println(index);
    }
}