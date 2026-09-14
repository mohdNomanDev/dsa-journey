import java.util.ArrayList;

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

    public static int binarySearch(int target,int[] nums){
        int s = 0 , e = nums.length-1;

        while(e > s){
            int m = (s+e)/2;
            if(nums[m] == target) return m;
            else{
                if(target > nums[m]) s = m+1;
                else e = m-1;
            }
        }

        return -1;

    }

    public static void reverseArray(int[] arr){
        for (int left = 0,right = arr.length-1; left < right; left++,right--) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }
    }

    
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60};
        // int index = binarySearch( 90, arr);
        // System.out.println(index);
        reverseArray(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}