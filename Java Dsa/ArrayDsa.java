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

    public static void pairsInArray(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i]+","+arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void subArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i; j < arr.length; j++) {
                System.out.print('(');
                for (int k = i; k <= j; k++){
                    System.out.print(arr[k]);
                    System.out.print(',');
                }
                System.out.print(") \t");
                
            }
            System.out.println();
        }
    }

   public static void maxSubArray(int[] arr) {

    int[] prefix = new int[arr.length];

    int max = arr[0];

    // Create prefix array
    prefix[0] = arr[0];

    for (int i = 1; i < arr.length; i++) {
        prefix[i] = arr[i] + prefix[i - 1];
    }

    // Find maximum subarray sum
    for (int i = 0; i < arr.length; i++) {

        for (int j = i; j < arr.length; j++) {

            int sum;

            if (i == 0) {
                sum = prefix[j];
            } else {
                sum = prefix[j] - prefix[i - 1];
            }

            max = Math.max(max, sum);
        }
    }

    System.out.println("Maximum is " + max);
}
    
    public static void main(String[] args){
        int[] arr = {2, -1, 3, -2, 4};
        // int index = binarySearch( 90, arr);
        // System.out.println(index);
        
        maxSubArray(arr);
    }
}