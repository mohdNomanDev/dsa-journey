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

    int cs = 0, ms = 0;
    
    for (int i = 0; i < arr.length; i++) {
        cs += arr[i];
        if(cs < 0) cs = 0;
        ms = Math.max(ms, cs);
        
    }

    System.out.println("Max : "+ms);
}

    public static void trapWater(int[] height){
        int len = height.length;
        int[] ml = new int[len];
        int[] mr = new int[len];

        ml[0] = height[0];
        mr[len - 1] = height[len - 1];

        for (int i = 1; i < mr.length; i++) {
            ml[i] = Math.max(ml[i-1], height[i]);
            mr[len - 1 - i] = Math.max(mr[len - i], height[len -1 -i]);
        }

        int sum = 0;
        for (int i = 0; i < len; i++) {
            int waterTrapped = Math.min(ml[i],mr[i]) - height[i];
            sum += waterTrapped;
        }

        System.out.println("Total water trapped: "+sum);
    }
    
    public static void main(String[] args){
        int[] arr = {4, 2, 0, 3, 2, 5};
        
        trapWater(arr);
    }
}