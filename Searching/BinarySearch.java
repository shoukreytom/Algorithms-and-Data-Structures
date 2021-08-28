public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 9, 22, 35, 50, 52};
        int index = search(arr, 22);
        if(index == -1)
            System.out.println("the key is not found.");
        else
            System.out.println(arr[index] + " is found at " + index + " index.");
    }

    public static int search(int[] arr, int key) {
        int start = 0;
        int last = arr.length;
        for(int i = 0; i < arr.length; i++) {
            int mid = (start+last)/2;
            if(arr[mid] == key)
                return mid;
            else if(key < arr[mid])
                last = mid;
            else
                start = mid;
        }
        return -1;
    }

}
