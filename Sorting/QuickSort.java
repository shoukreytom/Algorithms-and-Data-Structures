public class QuickSort {

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
        quickSort(arr, 0, arr.length-1);
    }

    public static void quickSort(int[] arr, int p, int r) {
        if(p < r) {
            int q = partion(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }
    }

    public static int partion(int[] arr, int p, int r) {
        int x = arr[r];
        int i = p - 1;
        for(int j = p; j < r; j++) {
            if(arr[j] <= x) {
                i++;
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
            }
        }
        int temp2 = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp2;
        return (i+1);
    }

}
