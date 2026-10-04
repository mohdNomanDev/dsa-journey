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

    public static void bubbleSort(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len - 1; i ++){
           for (int j = 0; j < len - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
           }

        }
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
                int swap = i;
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[swap] > arr[j]){
                        swap = j;
                    }
                }
                int temp = arr[swap];
                arr[swap] = arr[i];
                arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        for (int curr = 1; curr < arr.length; curr++) {
            int insert = arr[curr];
            int prev = curr-1;
            for (; prev >= 0 && insert < arr[prev]; prev--) {
                    arr[prev+1] = arr[prev];                                  
                                        
            }            
            
            arr[prev+1] = insert;
            
        }
    }

    public static void countingSort(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int[] count = new int[max+1];

        for (int i : arr) {
            count[i]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" = "+count[arr[i]]);
        }
    }

    public static void spiralMatrix(int[][] arr){
    

        int sr, sc, er , ec ;
        sr = sc = 0;
        er = arr.length-1;
        ec = arr[0].length-1;

        while (sr <= er && sc <= ec) {

            
            // first row
            for(int i = sc; i<= ec ; i++){
                System.out.print(arr[sr][i]+"\t");
            }

            // last coloumn
            for (int i = sr+1; i <= er; i++) {
                System.out.print(arr[i][ec]+"\t");
            }

            // last row
            for (int i = ec-1; i >= sc; i--) {
                System.out.print(arr[er][i]+"\t");
            }

            //first column
            for (int i = er-1; i >= sr+1; i--) {
                System.out.print(arr[i][sc]+"\t");
            }

            sr++; sc++;
            er--; ec--;
            
        }

        
    }

    public static void diagonalMatrix(int[][] arr){
        int pd = 0, sd = 0;
        for (int i = 0; i < arr.length; i++) {

            pd += arr[i][i];
            if(i != arr.length-1-i){
                sd += arr[arr.length - 1 -i][i];
            }
        }

        System.err.println("Diagonal Matrix is "+(pd+sd));
    }

    public static void searchMatrix(int[][] arr,int key){
                int c = arr.length-1, r = 0;
        while( c >= 0 && r < arr.length){
            if(key == arr[r][c]) {
                System.out.println("Key Found");
                return;
            }
            else{
                if(key > arr[r][c]) r++;
                else c--;
            }
        }

        System.out.println("Key Not Found");

    }

    
    
    
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        searchMatrix(arr, 17);
        String str = "Mom";      
    }
}