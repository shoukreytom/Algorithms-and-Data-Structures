public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 0, 1, 8, 5, 4, 7, 6};
        System.out.println("Array before sorting:");
        print(arr);
        sort(arr);
        System.out.println("Array after sorting:");
        print(arr);
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = (int) Math.floor((start+end)/2);
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int n_l = mid - start + 1;
        int n_r = end - mid;
        int[] left = new int[n_l];
        int[] right = new int[n_r];
        for(int i = 0; i < n_l; i++)
            left[i] = arr[start + i];
        for(int j = 0; j < n_r; j++)
            right[j] = arr[mid + 1 + j];
        int i = 0, j = 0;
        for(int k = start; k <= end; k++) {
            if((j >= n_r) || (i < n_l && left[i] <= right[j])) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
        }
    }

}
