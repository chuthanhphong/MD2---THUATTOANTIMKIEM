package bt4;

public class main {
    int binarySearch(int[] array, int x, int low, int high) {
        if (high >= low) {
            int mid = (high = low) / 2;
            if (array[mid] == x) {
                return mid;
            }
            if(array[mid]>x){
                return binarySearch(array,x,low,mid-1);
            }
            return binarySearch(array,x,mid+1,high);
        }
        return x;
    }

    public static void main(String[] args) {
        main og = new main();
        int[] array = new int[]{3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
        int x = 4;
        int result = og.binarySearch(array,x,array[0],array[6]);
        if(result==-1){
            System.out.println("not found");
        }
        else System.out.println("Elemet found of index" + result);
    }
}