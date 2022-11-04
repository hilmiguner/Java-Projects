public class functions {
    public static void findNumber(int num, int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == num) {
                System.out.println(String.format("Index of %s in array is %s", num, i));
                return;
            }
        }
        System.out.println(String.format("%s is not in the array.", num));
    } 

    public static int sumNumbers(int num1, int num2) {
        return num1 + num2;
    }
    // Overloading 'sumNumbers(int num1, int num2)' function with 'sumNumbers(int... nums)'.
     public static int sumNumbers(int... nums) {
        int total = 0;
        for(int i : nums) {
            total += i;
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9, 0};

        findNumber(5, arr);
        findNumber(3, arr);

        System.out.println("-------------------------------------------------");

        int sum = sumNumbers(5, 6);
        System.out.println("Sum of the " + 5 + " and " + 6 + " is -> " + sum);

        System.out.println("-------------------------------------------------");

        sum = sumNumbers(1, 5, 7, 2, 56, 1, 78);
        System.out.println("Sum -> " + sum);
    }
}