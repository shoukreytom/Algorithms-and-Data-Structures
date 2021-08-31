/** Counting sort algorithm
 *
 * counting sort algorithm is used when we already know the range of
 * array element (e.g: 0 to 10).
 */
public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {3, 10, 2, 4, 2, 6, 9, 5, 7, 2, 8, 10, 3, 9};
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
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            temp[arr[i]] = temp[arr[i]]+1;
        int pos = 0;
        for(int j = 0; j < temp.length; j++) {
            for(int k = 0; k < temp[j]; k++) {
                arr[pos] = j;
                pos++;
            }
        }
    }

}
