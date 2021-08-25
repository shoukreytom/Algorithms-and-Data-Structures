public class BubbleSort {

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
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = (i+1); j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
