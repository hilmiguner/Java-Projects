public class perfectNumber {
    public static void main(String[] args) {
        int number = 28;
        int total = 0;
        for(int i = 1 ; i < number ; i++) {
            if(number % i == 0) {
                total = total + i;
            }
        }
        if(number == total) {
            System.out.println(String.format("%s is a perfect number because total is %s", number, total));
        }
        else {
            System.out.println(String.format("%s is not a perfect number because total is %s", number, total));
        }
    }
}