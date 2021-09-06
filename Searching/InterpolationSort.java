public class InterpolationSort {

	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 8, 9, 22, 35, 50, 52};
		for(int i = 0; i < arr.length; i++) {
	        int index = search(arr, arr[i]);
	        if(index == -1)
	            System.out.println("the key is not found.");
	        else
	            System.out.println(arr[index] + " is found at " + index + " index.");
	    }
	}

	// time complixity is o(log(log(n)))
	public static int search(int[] arr, int key) {
		int lo = 0, hi = arr.length-1;
		for(int i = 0; i < arr.length; i++) {
			int mid = lo + ((hi - lo) / arr[hi]) * (key - arr[lo]);
			if(arr[mid] == key)
				return mid;
			else if(key < arr[mid])
				hi = mid-1;
			else
				lo = mid+1;
		}
		return -1;
	}

}
