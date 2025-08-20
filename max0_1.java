public class max0_1 {
    static int findMax(int arr[]){
        int max = 0;
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                cnt++;
            }
            else {
                max = Math.max(max, cnt);
                cnt = 1;
            }
        }
        return Math.max(max, cnt);
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0 ,0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0};
        System.out.println(findMax(arr));
    }
}
