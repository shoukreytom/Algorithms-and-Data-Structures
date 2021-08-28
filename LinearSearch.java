public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 0, 1, 8, 5, 4, 7, 6};
        int index = search(arr, 10);
        if(index == -1)
            System.out.println("the key is not found.");
        else
            System.out.println(arr[index] + " is found at " + index + " index.");
    }

    public static int search(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == key)
                return i;
        return -1;
    }

}
