

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

    public static void print(int[] arr, int s, int e) {
        for(int i = s; i <= e; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}