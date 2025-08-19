class multipleOfThreeLargest {
     static int find(int arr[]){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;      
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second ) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third ) {
                third = arr[i];
            }
        }
        return first * second * third;
    }
    public static void main(String[] args) {
        int arr[] = {5, 9, 3, 2, 6, 8, 1};
        int result = find(arr);
        System.out.println("Third Largest No. : " + result);
    }
}
