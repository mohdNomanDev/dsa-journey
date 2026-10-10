

public class Divide_Conquer{

    public static void mergeSort(int[] arr,int s, int e){
        if(s>=e) return;

        int mid = (s+e)/2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);

        merge(arr,s,mid,e);
        print(arr, s, e);
    }

    public static void merge(int[] arr,int s, int m, int e){
        int[] temp = new int[e - s + 1];
        int k = 0;

        int i = s, j = m+1;

        while (i <= m && j <= e) { 
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;    
        }

        while(i <= m){
            temp[k] = arr[i];
            i++; k++;
        }

        while(j<= e){
            temp[k] = arr[j];
            j++; k++;            
        }

        for (k = 0, i = s; k < temp.length && i <= e; k++, i++) {
            arr[i] = temp[k];
        }
        
    }

    public static void quickSort(int[] arr, int s, int e){
        if(s >= e){
            return;
        }

        // pivot index find
        int pi = partition(arr, s,e);
        quickSort(arr, s, pi-1);
        quickSort(arr, pi+1, e);
    }

    public static int partition(int[] arr, int s, int e){
        int pi = e;
        int j = -1;

        for (int i = 0; i < pi; i++) {

            if(arr[i] < arr[pi]){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        j++;
        int temp = arr[pi];
        arr[pi] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void print(int[] arr, int s, int e) {
        for(int i = s; i <= e; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int serachInRotatedArray(int[] arr,int key, int si, int ei){
        if(si > ei) return -1;
        int mid = (si+ei)/2;
        if(arr[mid] == key){
            return mid;
        }

        
        if(arr[si] <= key && key <= arr[mid]){
            // search in line 1
            return serachInRotatedArray(arr, key, si, mid-1);  
        }
        else{
            // search in line 2
            return serachInRotatedArray(arr, key, mid+1, ei);

        }        
    }
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 1, 2, 3, 4, 5};
        int index = serachInRotatedArray(arr, 2, 0, arr.length-1);

        System.out.println(index);
        
    }
}