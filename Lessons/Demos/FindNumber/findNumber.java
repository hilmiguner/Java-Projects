public class findNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9, 0};
        int num = 5;

        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == num) {
                System.out.println(String.format("Index of %s in array is %s", num, i));
                return;
            }
        }
        System.out.println(String.format("%s is not in the array.", num));
    }
}