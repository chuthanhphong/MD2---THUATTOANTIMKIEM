package practice1;

public class binarySearch {
    static int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};


    static int tttimkiem(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key == arr[mid]) {
                return mid;
            } else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(tttimkiem(arr, 2));
        System.out.println(tttimkiem(arr, 11));
        System.out.println(tttimkiem(arr, 79));
        System.out.println(tttimkiem(arr, 1));
        System.out.println(tttimkiem(arr, 5));
        System.out.println(tttimkiem(arr, 80));
    }
}
