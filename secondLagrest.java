
import java.util.Arrays;

class secondLagrest { 

    static int find(int arr[]) {
        Arrays.sort(arr);
        int size = arr.length;

        for (int i = size-2; i >= 0; i--) {
            if (arr[i] != arr[size-1]) {
                return arr[i];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {5, 7, 9, 3, 9, 6, 1, 7};
        int result = find(arr);
        System.out.println(result);
    }
}